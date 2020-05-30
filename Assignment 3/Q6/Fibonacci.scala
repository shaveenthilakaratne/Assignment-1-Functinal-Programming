object Fibonacci{

	def main(args:Array[String])={
		printf("Enter a number: ")
		val in = scala.io.StdIn.readInt()
		println("First "+in+" Fibonacci numbers : ")
		fibonacciSequence(in-1)
	}

	def fibonacciSequence(n:Int):Unit= {
		if(n>=0){
			fibonacciSequence(n-1)
			println(fibonacci(n))
		}
	}


	def fibonacci(n:Int):Int=n match{
		case m if m==0 => 0
		case m if m==1 => 1
		case m => fibonacci(n-1)+fibonacci(n-2)
	}

}