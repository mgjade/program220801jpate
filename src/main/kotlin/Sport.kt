class Sport(var sport: String, var stadiumlocation: String) {
    var listS = mutableListOf<Sport>()
    fun addSport(sport: String, stadiumlocation: String) {
        var sports = Sport("","")
        sports.sport = sport
        sports.stadiumlocation = stadiumlocation
        listS.add(sports)
    }
}