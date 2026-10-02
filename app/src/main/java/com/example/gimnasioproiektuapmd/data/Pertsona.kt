package com.example.gimnasioproiektuapmd.data

open class Pertsona(
    val nan: String,
    var izen_abizenak: String,
    var generoa: String? // ? balio nuluak izan ahal direlako
) {
    var kontaktua: String = "" //no es obligatorio por eso va fuera

    // toString
    open fun bistaratu(): String {
        return "Nan: $nan" + "Abizena: $izen_abizenak" + "Generoa: $generoa"
    }
}