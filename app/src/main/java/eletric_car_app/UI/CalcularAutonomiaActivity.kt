package eletric_car_app.UI

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.eletric_car_app.R

class CalcularAutonomiaActivity : AppCompatActivity() { // classe esta herdando do pai o que precisa para printar os dados na tela

    lateinit var preco: EditText
    lateinit var kmPercorrido: EditText
    lateinit var resultado: TextView
    lateinit var btnCalcular: Button // lateinit inicia var posteriormente
    lateinit var btnClose: ImageView

    override fun onCreate(savedInstanceState: Bundle?) { // vai ser passado quando a tela for criada
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcular_autonomia) // setar o xml (R de resource)
        setupView()
        setupListeners()

    }

    fun setupView() {
        preco = findViewById(R.id.et_preco_kwh)
        btnCalcular = findViewById(R.id.btn_calcular)
        kmPercorrido = findViewById(R.id.et_km_percorrido)
        resultado = findViewById(R.id.tv_resultado)
        btnCalcular = findViewById(R.id.btn_calcular)
        btnClose = findViewById(R.id.iv_close)
    }
    // recuperar valor do botão
    fun setupListeners() {
        btnCalcular.setOnClickListener {
            calcular()
        }
        btnClose.setOnClickListener { // encerra a tela
            finish()
        }
    }

    fun calcular() {
        val preco = preco.text.toString().toFloat()
        val km = kmPercorrido.text.toString().toFloat()
        val result = preco / km

        resultado.text = result.toString()
    }

}