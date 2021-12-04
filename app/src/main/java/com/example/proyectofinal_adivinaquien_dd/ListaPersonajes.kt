package com.example.proyectofinal_adivinaquien_dd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectofinal_adivinaquien_dd.adapters.HeroAdapter
import com.example.proyectofinal_adivinaquien_dd.objects.SuperHero

class ListaPersonajes : AppCompatActivity() {

    val superheros: List<SuperHero> = listOf(
        SuperHero("Malzahar", R.drawable.avatar01, "Como vidente fanático dedicado a la unificación de toda la vida, Malzahar realmente cree que el recién emergido Vacío es el camino a la salvación."),
        SuperHero("Darius", R.drawable.avatar02, "No hay símbolo más grande del poder noxiano que Darius, el líder más temido y con más experiencia en la guerra."),
        SuperHero("Kindred", R.drawable.avatar03, "Separados, pero nunca divididos, los Kindred representan las esencias hermanas de la muerte."),
        SuperHero("Rell", R.drawable.avatar04, "Producto de brutales experimentos realizados por la Rosa Negra, Rell es un arma viviente rebelde con la firme determinación de acabar con Noxus."),
        SuperHero("Jinx", R.drawable.avatar05, "Jinx, una maniática e impulsiva criminal de Zaun, vive para sembrar el caos sin pararse a pensar en las consecuencias."),
        SuperHero("Gangplank", R.drawable.avatar06, "Tan impredecible como brutal, el saqueador y rey destronado Gangplank es temido por todo el mundo."),
        SuperHero("Janna", R.drawable.avatar07, "Janna es un poderoso y misterioso espíritu del viento que protege a los desvalidos de Zaun con la tempestad de Runaterra."),
        SuperHero("Braum", R.drawable.avatar08, "Dotado de bíceps masivos y un corazón aún más grande, Braum es un querido héroe de Fréljord. Todas las tabernas al norte de Frostheld brindan por su fuerza legendaria."),
        SuperHero("Viktor", R.drawable.avatar09, "Como heraldo de una nueva era tecnológica, Viktor ha dedicado su vida al progreso de la humanidad. Es un idealista que busca elevar a la gente de Zaun a un nuevo nivel de comprensión."),
        SuperHero("Senna", R.drawable.avatar10, "Condenada desde la infancia a ser acechada por la sobrenatural Niebla Negra, Senna se unió a una orden sagrada conocida como los Centinelas de la Luz y luchó salvajemente contra ella."),
        SuperHero("Lucian", R.drawable.avatar11, "Lucian es un Centinela de la Luz y un sombrío cazador de espíritus inmortales, a los que persigue incansablemente y aniquila con sus dos pistolas reliquia."),
        SuperHero("Kayle", R.drawable.avatar12, "Nacida de un Aspecto targoniano durante el punto culminante de las Guerras Rúnicas, Kayle honra el legado de su madre al pelear por la justicia con sus alas de fuego divino."),
        SuperHero("Ekko", R.drawable.avatar13, "Ekko, un prodigio surgido de las duras calles de Zaun, es capaz de manipular el tiempo para su propio beneficio. Usando una máquina de su invención llamada Pulsar-Z, explora las distintas posibilidades de la realidad."),
        SuperHero("VI", R.drawable.avatar14, "Vi es una antigua criminal de las calles de Zaun impulsiva e imponente con un respeto hacia las autoridades casi nulo."),
        SuperHero("Viego", R.drawable.avatar15, "Otrora gobernante de un reino perdido en el tiempo, Viego falleció hace mas de mil años cuando su intento de regresar a su esposa de la muerte desencadenó la catástrofe mágica conocida como la Ruina."),
        SuperHero("Twitch", R.drawable.avatar16, "Twitch no tiene miedo de ensuciarse las patas. Apunta una ballesta potenciada con químicos hacia el centro de Piltóver."),
        SuperHero("Lissandra", R.drawable.avatar17, "La magia de Lissandra transforma el poder del hielo en algo oscuro y terrible. Con la fuerza de su hielo negro, además de congelar a aquellos que la enfrentan."),
        SuperHero("Caytlin", R.drawable.avatar18, "Reconocida como la mejor pacificadora, Caitlyn también es la mejor oportunidad de Piltóver para deshacerse de los elementos criminales elusivos de su ciudad."),
        SuperHero("Jayce", R.drawable.avatar19, "Jayce es un brillante inventor que comprometió su vida a la defensa de Piltóver y a su firme búsqueda del progreso. Con su martillo hextech transformable en mano, Jayce protege su ciudad natal."),
        SuperHero("Sona", R.drawable.avatar20, "Sona es la virtuosa demaciana más destacada del encordado etwahl. Habla solo a través de sus agraciados acordes y vibrantes arias."),
        SuperHero("Poppy", R.drawable.avatar21, "A Runaterra no le hacen falta campeones valientes, pero pocos son tan tenaces como Poppy."),
        SuperHero("Urgot", R.drawable.avatar22, "Urgot, quien fue alguna vez un poderoso verdugo noxiano, había sido traicionado por el imperio que lo hizo matar a tantos en su nombre."),
        SuperHero("Leona", R.drawable.avatar24, "Leona es una guerrera imbuida con fuego solar y templaria de los Solari que defiende el Monte Targón con la Espada del Cénit y el Escudo del Amanecer.")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_personajes)
        // Fijamos la orientación de la pantalla en modo horizontal y fullscreen
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        initRecycler()

        findViewById<Button>(R.id.btnRegresar).setOnClickListener {
            val intent = Intent(this, MenuPrincipal::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun initRecycler(){
        val reciclador = findViewById<RecyclerView>(R.id.SuperHero)
        val adaptador = HeroAdapter(superheros)
        reciclador.setHasFixedSize(true)
        reciclador.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        reciclador.adapter = adaptador
    }
}