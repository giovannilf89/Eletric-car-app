package eletric_car_app.data

import eletric_car_app.domain.Carro

object CarFactory {
    val list = listOf(
        Carro(
            id = 1,
            preco = "R$ 300.000,00",
            bateria = "300kvh",
            potencia = "200cv",
            recarga = "30 min",
            urlPhoto = "www.google.com.br"

        ),
        Carro(
            id = 1,
            preco = "R$ 200.000,00",
            bateria = "200kvh",
            potencia = "150cv",
            recarga = "40 min",
            urlPhoto = "www.google.com.br"
        )
    )
}