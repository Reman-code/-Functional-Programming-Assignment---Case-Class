object  MyApp extends App
{
    val poin1=Point(0,3)
    val poin2=Point(5,6)
   
    println(poin1)
    println(poin1.invert())
    
    println(poin2)
    println(poin2.invert())
}
case class Point(a:Int,b:Int)
{
    def x:Int = a
    def y:Int = b

    def invert()=Point(y,x)
    
}