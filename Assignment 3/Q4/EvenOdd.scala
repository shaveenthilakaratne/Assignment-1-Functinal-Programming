object EvenOdd{

	def main(args:Array[String])={
		printf("Enter a number: ")
		val in = scala.io.StdIn.readInt()
		if(isEven(in)==true){
			println(in.toString+" is even")		
		}
		else{
			println(in.toString+" is odd")	
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