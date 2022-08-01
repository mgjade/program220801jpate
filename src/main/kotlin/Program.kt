fun main() {
    var animal = mutableListOf<Animal>(
        Animal("Pablo", 5),
        Animal("Luna", 7),
        Animal("Bettie", 15),
        Animal("Barnie", 11),
        Animal("Ollie", 30),
    )
    animal.add(Animal("Dottie", 6))
    for (a in animal)
        println("${a.name} is exactly ${a.age} years old")

    var sports = mutableListOf<Sport>(
        Sport(
            "Formula 1", "Melbourne"
        ),
        Sport("Big Bash Cricket", "Sydney"),
        Sport("Test Cricket", "Melbourne"),
        Sport("A-League Mens", "Newcastle"),
    )

    sports.add(Sport("Boules", "Brisbane"))
    for (s in sports)
        println("${s.sport} is located in ${s.stadiumlocation}")

    var person = mutableListOf<Person>(
        Person("Jade Pate", 25, "Newcastle", "Female"),
        Person("Wombie Womberthon", 1, "Newcastle", "Male"),
        Person("Bay Whale", 700, "Melbourne", "Non Binary"),
        Person("Teddy Womberthon", 8, "Newcastle", "Male"),
    )
    person.add(Person("BLAHAJ", 22, "Malmo", "Male"))
    for (p in person) {
        println("${p.name} is a ${p.age} year old ${p.gender} who lives in ${p.location}")

    }
}

//This test program is intended to practice the following: Bi-Directional, Sorting, Lists, Classes, For Loops, Getters,
//Setters, if else, and API (temperature). The intended way for this to work is that Person can talk to all other classes.
//Location and Sport can talk to each other via where the stadium is located, it would also return the current temp, and talk to person.
//Animal and Food can only talk to person, so you can assign a pet to one or multiple people, and calculate the cost of food.
//You are able to add as part of the main function to any of these classes. Ideally I would like to add the ability to throw custom errors,
//for example if a negative age was entered, or a string contained characters that where not meant to be contained, however I would want to ensure
//that non english characters, such as Æ, æ, ø and Ø are still accepted, as in theory this could be used overseas. Additionally, someone visiting, or
//immigrating to australia, could still run into the same issue, if only english (US) or english (UK) is accepted, for example Australia, has immigrants from,
//a diverse set of countries, such as China, Vietnam, South Sudan etc that may not use the latin alphabet, in order for data to be accurate,
//we need to account for these edge cases.
//I would also like the ability for a customer to not have to fill in certain fields, if they do not wish to disclose
//certain information, such as gender. In this field it could accept an empty string, unlike other fields such as name.
//this may require importing of languages, will need to check google to see if possible