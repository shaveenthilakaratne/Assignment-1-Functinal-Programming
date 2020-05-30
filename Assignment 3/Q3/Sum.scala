object Sum{

	def main(args:Array[String])={
		printf("Enter a number: ")
		val in = scala.io.StdIn.readInt()
		println("Sum of numbers from 1 to "+in+" : "+sum(in))
	}


	def sum(n:Int):Int={
		if(n==0){
			return 0
		}
		else{
			return n+sum(n-1)
		}
	}

}