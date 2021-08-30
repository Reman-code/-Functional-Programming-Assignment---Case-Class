object  MyApp extends App{
    val poin1=Point(3,6)
    val poin2=Point(10,11)
    val poin3=poin1+poin2
    println(poin1)
    println(poin2)
    println(poin3)
}

case class Point(a:Int,b:Int){
    def x:Int = a
    def y:Int = b

    def + (that:Point)= Point(this.x+ that.x,this.y+that.y)
}