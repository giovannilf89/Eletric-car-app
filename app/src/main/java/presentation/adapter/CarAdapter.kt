package presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.eletric_car_app.R

class CarAdapter(private val carros: Array<String>) :
    RecyclerView.Adapter<CarAdapter.ViewHolder>() {  // Alteração no tipo de Adapter

    // Cria uma nova view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.carro_item, parent, false)
        return ViewHolder(view)
    }

    // Vincula os dados do carro à view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = carros[position]
    }

    // Retorna a quantidade de itens (carros) na lista
    override fun getItemCount(): Int = carros.size

    // ViewHolder que detém as referências para as views de cada item
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.tv_preco_value)
    }
}