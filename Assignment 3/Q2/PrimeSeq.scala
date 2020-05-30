object PrimeSeq{

	def main(args:Array[String]) :Unit={
		printf("Enter a number: ")
		val in = scala.io.StdIn.readInt()
		println("Prime numbers less than "+in+" :")
		primeSeq(in)
	}


	def primeSeq(n:Int,i:Int=1):Int={
		if(i>=n){
			return 0
		}
		else{
			if(prime(i)==true){
				println(i)				
			}
			primeSeq(n,i+1)
		}
		
	

	}


	def prime(n:Int,i:Int=2):Boolean={
		if(i==n){
			return true
		}
		else{
			if(n%i==0){
				return false
			}
			else{
				return prime(n,i+1)
			}
		}
	}

}