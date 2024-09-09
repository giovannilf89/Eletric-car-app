package eletric_car_app.UI.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.eletric_car_app.R
import eletric_car_app.domain.Carro
import org.w3c.dom.Text

class CarAdapter(private val carros: List<Carro>) :
    RecyclerView.Adapter<CarAdapter.ViewHolder>() {  // Alteração no tipo de Adapter

    // Cria uma nova view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.carro_item, parent, false)
        return ViewHolder(view)
    }

    // Vincula os dados do carro à view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.preco.text = carros[position].preco
        holder.bateria.text = carros[position].bateria
        holder.potencia.text = carros[position].potencia
        holder.recarga.text = carros[position].recarga

    }

    // Retorna a quantidade de itens (carros) na lista
    override fun getItemCount(): Int = carros.size

    // ViewHolder que detém as referências para as views de cada item
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val preco: TextView
        val bateria: TextView
        val potencia: TextView
        val recarga: TextView

        init {
            view.apply { // substitui os view.findView
                preco = findViewById(R.id.tv_preco_value)
                bateria = findViewById(R.id.tv_bateria_value)
                potencia = findViewById(R.id.tv_potencia_value)
                recarga = findViewById(R.id.tv_recarga_value)
            }

        }
    }
}