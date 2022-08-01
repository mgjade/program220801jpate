class Shopping(var food: String, var quantity: Int, var itemPrice: Double) {
    var listST = mutableListOf<Shopping>()
    fun addShopping(food: String, quantity: Int, itemPrice: Double) {
        var shops = Shopping("", 0, 0.0)
        shops.food = food
        shops.quantity = quantity
        shops.itemPrice = itemPrice
        listST.add(shops)
    }


}