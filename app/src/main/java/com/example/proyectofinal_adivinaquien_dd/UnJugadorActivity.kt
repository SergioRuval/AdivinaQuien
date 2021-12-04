package com.example.proyectofinal_adivinaquien_dd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.example.proyectofinal_adivinaquien_dd.data.ListaAvatares
import com.example.proyectofinal_adivinaquien_dd.fragments.CategoriasFragment
import com.example.proyectofinal_adivinaquien_dd.fragments.FinPartidaFragment
import com.example.proyectofinal_adivinaquien_dd.objects.Avatar
import com.example.proyectofinal_adivinaquien_dd.objects.Caracteristica
import com.example.proyectofinal_adivinaquien_dd.viewmodels.PreguntaViewModel

class UnJugadorActivity : AppCompatActivity() {
    private val imgVwIds : Array<Int> = arrayOf(R.id.tab_avtr_01, R.id.tab_avtr_02, R.id.tab_avtr_03, R.id.tab_avtr_04,
        R.id.tab_avtr_05, R.id.tab_avtr_06, R.id.tab_avtr_7, R.id.tab_avtr_8, R.id.tab_avtr_9, R.id.tab_avtr_10,
        R.id.tab_avtr_11, R.id.tab_avtr_12, R.id.tab_avtr_13, R.id.tab_avtr_14, R.id.tab_avtr_15, R.id.tab_avtr_16,
        R.id.tab_avtr_17, R.id.tab_avtr_18, R.id.tab_avtr_19, R.id.tab_avtr_20, R.id.tab_avtr_21, R.id.tab_avtr_22,
        R.id.tab_avtr_23, R.id.tab_avtr_24)

    private var imgViews : MutableList<ImageView> = mutableListOf()

    private lateinit var btnSalir : Button
    private lateinit var imgBtnAdivinar : ImageView
    private lateinit var btnPreguntar : Button
    private lateinit var txtScore : TextView
    private lateinit var txtMovimientos : TextView

    private lateinit var avatarEncontrar : Avatar

    private var movimientos : Int = 0
    private var score : Int = 0

    private val viewModel : PreguntaViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_un_jugador)
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)

        val maxPos = ListaAvatares.arrayAvatares.size - 1
        val posRand = (0..maxPos).random()

        avatarEncontrar = ListaAvatares.arrayAvatares.get(posRand)

        imgVwIds.forEach {
            imgViews.add(findViewById( it ))
        }

        var i = 0

        imgViews.forEach{
            var img : Int = ListaAvatares.arrayAvatares.get(i).getImgSource()
            it.tag = "adelante"

            Glide.with(this)
                .load(img)
                .into(it)

            it.setOnClickListener {
                var imgView : ImageView = it as ImageView

                var position = imgVwIds.indexOf(imgView.id)

                if (imgView.tag != "adelante"){
                    Glide.with(this)
                        .load(ListaAvatares.arrayAvatares.get(position).getImgSource())
                        .into(imgView)
                    it.tag = "adelante"
                }else{
                    Glide.with(this)
                        .load(R.drawable.partetrasera)
                        .into(imgView)
                    imgView.tag = "atras"
                }
            }
            i++
        }

        imgBtnAdivinar = findViewById(R.id.imgBtnAdivinar)
        Glide.with(this)
            .load(R.drawable.partetrasera)
            .into(imgBtnAdivinar)

        btnPreguntar = findViewById(R.id.btnPreguntar)
        btnPreguntar.setOnClickListener {
            val f = supportFragmentManager.findFragmentByTag("Fragmento")
            if(f == null){
                supportFragmentManager.beginTransaction()
                    .setCustomAnimations(
                        R.anim.slide_in,
                        R.anim.slide_out,
                        R.anim.slide_in,
                        R.anim.slide_out
                    )
                    .add(R.id.linearLayoutForFragment, CategoriasFragment.newInstance(), "Fragmento")
                    .commit()
            }else{
                supportFragmentManager.beginTransaction()
                    .remove(f)
                    .commit()
            }
        }

        btnSalir = findViewById(R.id.btnSalir)
        btnSalir.setOnClickListener {
            val intent = Intent(this, MenuPrincipal::class.java)
            startActivity(intent)
            finish()
        }

        viewModel.preguntaSelected.observe(this, Observer { item ->
            Toast.makeText(this, item.toString(), Toast.LENGTH_LONG).show()
            compararRandom(item)
            val f = supportFragmentManager.findFragmentByTag("Preguntas")
            if(f != null){
                supportFragmentManager.beginTransaction()
                    .remove(f)
                    .commit()
            }
        })

        txtScore = findViewById(R.id.txtScore)
        txtScore.text = score.toString()
        txtMovimientos = findViewById(R.id.txtMovimientos)
        txtMovimientos.text = movimientos.toString()

    }

    fun compararRandom(caracteristica: Caracteristica){
        if (avatarEncontrar.getAtributos().isCaracteristica(caracteristica)){
            compararCaracteristicas(caracteristica)
            score += 50
        }else{
            voltearDiferentes(caracteristica)
            score -= 5
        }
        movimientos++
        isGanar()
    }

    fun voltearDiferentes(caracteristica: Caracteristica){
        imgViews.forEach{
            if(it.tag != "atras"){
                val pos = imgViews.indexOf(it)
                if(ListaAvatares.arrayAvatares.get(pos).getAtributos().isCaracteristica(caracteristica)){
                    Glide.with(this)
                        .load(R.drawable.partetrasera)
                        .into(it)
                    it.tag = "atras"
                }
            }
        }
    }

    fun compararCaracteristicas(caracteristica: Caracteristica){
        ListaAvatares.arrayAvatares.forEach{
            if(!it.getAtributos().isCaracteristica(caracteristica)){
                val pos = ListaAvatares.arrayAvatares.indexOf(it)
                val imgVw = imgViews.get(pos)

                Glide.with(this)
                    .load(R.drawable.partetrasera)
                    .into(imgVw)
                imgVw.tag = "atras"
            }
        }
    }

    fun isGanar(){
        txtScore.text = score.toString()
        txtMovimientos.text = movimientos.toString()

        var count = imgViews.size
        imgViews.forEach{
            if(it.tag == "atras"){
                count--
            }
        }

        if (count == 1){
            Glide.with(this)
                .load(avatarEncontrar.getImgSource())
                .into(imgBtnAdivinar)
            finPartida()
        }
    }

    fun finPartida(){
        FinPartidaFragment(this,"¡Ganaste!", score, movimientos).show()
    }
}