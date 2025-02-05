fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    // Correct approach: Create a mutable copy using toMutableList()
    val mutableDoubledList = list.map { it * 2 }.toMutableList()
    mutableDoubledList.add(12) // Modification allowed
    println(mutableDoubledList) // Output: [2, 4, 6, 8, 10, 12]

    val mutableDoubledList2 = list.map { it * 2 }.toMutableList()
    mutableDoubledList2[0] = 100 // Modification allowed
    println(mutableDoubledList2) // Output: [100, 4, 6, 8, 10]

    // Incorrect approach: Attempting to modify an immutable list directly
    // val immutableDoubledList = list.map { it * 2 } 
    // immutableDoubledList.add(12) //This will throw an error
    // immutableDoubledList[0] = 100 //This will throw an error
} 