class Person(var name: String, var age: Int, var location: String, var gender: String) {
    var listP = mutableListOf<Person>()
    fun addPerson(name: String, age: Int, location: String, gender: String) {
        var persons = Person("", 0, "", "")
        persons.name = name
        persons.age = age
        persons.location = location
        persons.gender = gender
        listP.add(persons)
    }
}