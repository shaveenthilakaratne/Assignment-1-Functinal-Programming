import scala.math.sqrt
case class Point(x:Int, y:Int){

     def +(p:Point)=Point(this.x+p.x, this.y+p.y);
     def move(dx:Int, dy:Int)=Point(this.x+dx, this.y+dy);
     def distance(p:Point)=sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y));
     def invert=Point(this.y, this.x);
     override def toString = "(" + x + "," + y + ")";
}
object Point extends App{
    val p = Point(10,7);
    val q = Point(5,21);
    val dx = 3;
    val dy = 7;

    println("The two points are "+p.toString+","+q.toString); 
    println("\nAdding two points: "+p.toString+"+"+q.toString+" = "+(p+q));
    println("\nMoving "+p+" by a distance of "+"("+dx+","+dy+") = "+p.move(dx,dy));
    println("\nDistance between "+p+" and "+q+" = "+p.distance(q));
    println("\nInverting "+p+" = "+p.invert);
  
    
    
}