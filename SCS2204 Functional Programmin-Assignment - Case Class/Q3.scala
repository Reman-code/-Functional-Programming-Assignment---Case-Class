import scala.math.pow

object  MyApp extends App
{
    val poin1=Point(3,2)
    val poin2=Point(7,8)
    val poin3=Point(3,5)
    def distance(a:Point,b:Point)=math.sqrt((math.pow(a.x-b.x , 2))+(math.pow(a.y-b.y, 2)))
   
    println(poin1)
    println(poin2)
    println(poin3)
    println(distance(poin1, poin2))
    println(distance(poin1,poin3))   
}

case class Point(a:Int,b:Int)
{
    def x:Int = a
    def y:Int = b
}
