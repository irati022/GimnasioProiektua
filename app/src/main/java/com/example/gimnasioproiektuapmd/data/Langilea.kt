package com.example.gimnasioproiektuapmd.data

class Langilea(
    nan: String,
    izen_abizenak: String,
    generoa: String?,
    val erabiltzailea: String,
    var pasahitza: String,
) : Pertsona(nan, izen_abizenak, generoa) {
    var eguneko_orduak: Int = 0
    var lanpostua: Kargua = Kargua.Zuzendaria

//to string + herencia con pertsona
    override fun bistaratu(): String {
        return super.bistaratu() + "Erabiltzaile: $erabiltzailea" + "Pasahitza: $pasahitza" + "Eguneko orduak: $eguneko_orduak" + "Lanpostua: $lanpostua"
    }
}