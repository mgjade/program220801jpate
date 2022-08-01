class Location (var location: String, var country: String) {
    var listL = mutableListOf<Location>()
    fun addLocation(location: String, country: String) {
        var locations = Location("","")
        locations.location = location
        locations.country = country
        listL.add(locations)
    }
}