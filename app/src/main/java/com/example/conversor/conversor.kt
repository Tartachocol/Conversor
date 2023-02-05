package com.example.conversor

class conversor() {
    /**
     * Millas   a   KM
     * Litros   a   Galones
     * Kilos    a   Libras
     * Dolares  a   Euros
     * Metros   a   Pies
     */


    val km: Double = 0.62137
    val litros: Double = 3.785411784
    val kl: Double = 2.2046
    val euros: Double = 1.02335
    val metro: Double = 3.2808
    var numero: Double = 0.0

    fun KilometrosAMillas(num: Double): Double {
        numero = num * km
        return numero
    }

    fun MillasAKilometros(num: Double): Double {
        numero = num / km
        return numero
    }

    fun litrosAGalones(num: Double): Double {
        numero = num / litros
        return numero
    }

    fun GalonesALitros(num: Double): Double {
        numero = num * litros
        return numero
    }

    fun KilosALibras(num: Double): Double {
        numero = num * kl
        return numero
    }

    fun LibrasAKilos(num: Double): Double {
        numero = num / kl
        return numero
    }

    fun EurosADolares(num: Double): Double {
        numero = num / euros
        return numero
    }

    fun DolaresAEuros(num: Double): Double {
        numero = num * euros
        return numero
    }

    fun MetrosAPieas(num: Double): Double {
        numero = num * metro
        return numero
    }

    fun PiesAMetros(num: Double): Double {
        numero = num / metro
        return numero
    }
}