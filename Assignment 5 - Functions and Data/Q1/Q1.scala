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

	override def toString = s"$numer/$denom"
};

object Q1{
	def main(args:Array[String])={
		println("Example rational number : 7/12")
		val rationalNumber = new Rational(7,12)
		val negativeRationalNumber=rationalNumber.neg
		println("Negative number : "+negativeRationalNumber)

	}
}