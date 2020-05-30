object EvenSum{

	def main(args:Array[String])={
		printf("Enter a number: ")
		val in = scala.io.StdIn.readInt()
		println("Sum of even numbers from 1 to "+in+" : "+evenSum(in))
	}


	def evenSum(n:Int):Int={
		if(n==0){
			return 0
		}
		else{	
			if(isEven(n)){
				return n+evenSum(n-1)
			}
			else{
				return evenSum(n-1)
			}
		}
	}

	def isEven(n:Int):Boolean={
		if(n==0){
			return true
		}
		else{
			isOdd(n-1)
		}
	}

	def isOdd(n:Int):Boolean = !(isEven(n))

}