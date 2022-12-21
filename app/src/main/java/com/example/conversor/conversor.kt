package com.example.conversor

class conversor(arg1: Boolean) {


    fun KilometrosAMillas(num: Double): Double {
        var num = num
        num *= 0.62137
        return num
    }

    fun MillasAKilometros(num: Double): Double {
        var num = num
        num /= 0.62137
        return num
    }

    fun litrosAGalones(num: Double): Double {
        var num = num
        num /= 3.785411784
        return num
    }

    fun GalonesALitros(num: Double): Double {
        var num = num
        num *= 3.785411784
        return num
    }

    fun KilosALibras(num: Double): Double {
        var num = num
        num *= 2.2046
        return num
    }

    fun LibrasAKilos(num: Double): Double {
        var num = num
        num /= 2.2046
        return num
    }

    fun EurosADolares(num: Double): Double {
        var num = num
        num /= 1.02335
        return num
    }

    fun DolaresAEuros(num: Double): Double {
        var num = num
        num *= 1.02335
        return num
    }

    fun MetrosAPieas(num: Double): Double {
        var num = num
        num *= 3.2808
        return num
    }

    fun PiesAMetros(num: Double): Double {
        var num = num
        num /= 3.2808
        return num
    }
}