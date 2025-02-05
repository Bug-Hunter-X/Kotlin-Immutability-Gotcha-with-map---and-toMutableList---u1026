fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)
    //this will print [2,4,6,8,10]

    val doubledList2 = list.map { it * 2 }.toMutableList()
    doubledList2.add(12)
    println(doubledList2)
    //this will print [2,4,6,8,10,12]

    val doubledList3 = list.map { it * 2 }.toMutableList()
    doubledList3[0] = 100
    println(doubledList3)
    //this will print [100,4,6,8,10]
}