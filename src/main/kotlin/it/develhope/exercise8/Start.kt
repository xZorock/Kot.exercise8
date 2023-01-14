package it.develhope.exercise8

fun main(){
    val values: List<Int> = listOf(1,3,5,7,9,11,13,999,600,501)
    values.filterSmaller().print()
}
fun List<Int>.print(){
    this.forEach{println(it)}
}

fun List<Int>.filterSmaller(): List<Int>{
    return this.filter {it < 500}
}

/*Write an extension method that filters a list by value (e.g. smaller than 500). Write an extension method that prints list
values. Then create a list that that has at least 10 members, filter them and then print the values that pass the filter.*/



