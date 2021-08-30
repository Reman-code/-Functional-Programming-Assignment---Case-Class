object  MyApp extends App
{
    val poin1=Point(10,13)
    val poin2=Point(51,62)
    val poin3=poin1.move(2,13)
    val poin4=poin2.move(5,12)
    
    println(poin1)
    println(poin2)
    println(poin3)
    println(poin4)
}
case class Point(a:Int,b:Int)
{
    def x:Int = a
    def y:Int = b

    def move(xm:Int,ym:Int)=Point(this.x+xm,this.y+ym)
    
}