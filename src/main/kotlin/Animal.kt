class Animal(var name: String, var age: Int) {
    var listA = mutableListOf<Animal>()
    fun addAnimal(name: String, age: Int) {
        var animal = Animal("",0)
            animal.name = name
            animal.age = age
        listA.add(animal)
    }


}