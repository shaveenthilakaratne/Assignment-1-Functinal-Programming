class Rational(x:Int,y:Int){
	private def gcd(a:Int,b:Int):Int=
	if(b==0) a else gcd(b,a%b)
	require(y!=0, "denominator can't be zero")
	var yn=1     
	var xn=x
	if(y<0){
		yn=(-1)*y
		xn=(-1)*x
	}
	else if(y>0){
		yn=y
		xn=x
	}
	
	val gcdVal=if(xn<0) gcd(-xn,yn) else gcd(xn,yn)
	val numer = xn/gcdVal
	val denom = yn/gcdVal

	def neg = new Rational(-numer,denom)
	def +(r:Rational)=new Rational(this.numer*r.denom+r.numer*this.denom,denom*r.denom)
	def -(r:Rational)=this+r.neg

	override def toString = s"$numer/$denom"
};	

object Q2{
	def main(args:Array[String])={
		val x = new Rational(3,4)
		val y = new Rational(5,8)
		val z = new Rational(2,7)
		val result = x-y-z
		println("Result of 3/4-5/8-2/7 is : "+result)
	}
}