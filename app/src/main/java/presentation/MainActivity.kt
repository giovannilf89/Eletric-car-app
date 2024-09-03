package presentation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.eletric_car_app.R
import presentation.adapter.CarAdapter

class MainActivity : AppCompatActivity() {
    // declaracao das variaveis
    lateinit var btnCalcular: Button // lateinit inicia var posteriormente
    lateinit var listaCarros: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main) // começa aqui e passa pelas funcoes
        // chamada da funcao
        setupView()
        setupListeners()
        setupList()

    }

    // pegar valor da view
    fun setupView() {
        btnCalcular = findViewById(R.id.btn_calcular)
        listaCarros = findViewById(R.id.rv_lista_carros)
    }

    fun setupList() {
        var dados = arrayOf(
            "Cupcake",
            "Donut",
            "Froyo",
            "Gingerbread",
            "Honeycomb",
            "Ice Cream Sandwich",
            "JellyBean"
        )
       val adapter = CarAdapter(dados)
        listaCarros.adapter = adapter
    }

    // recuperar valor do botão
    fun setupListeners() {
        btnCalcular.setOnClickListener {
            //calcular()
            startActivity(
                Intent(
                    this,
                    CalcularAutonomiaActivity::class.java
                )
            ) // cria uma intenção para mover para outra activity
        }
    }


}

