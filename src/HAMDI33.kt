fun main() {
    collage()
    intro("Abdullahi",22)
    home()
    me("Hamdi","Hamdi")
}
fun collage () {
    var c ="akirachix"
    println(c[0])
    println(c[3])
    println(c[4])



}
fun intro(x:String,y:Int) {
    println("Hi my name is $x $y years old")


}
fun home() {
    var home="Nairobi"
    println(home.length)

}
fun me(name:String,nameX:String) {
    if (name==nameX){
        println("that is me")

}
else{
    println("i dont know who that is")
}
}