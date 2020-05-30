object Prime{

	def main(args:Array[String])={
		printf("Enter a number: ")
		val in = scala.io.StdIn.readInt()
		if(prime(in)==true){
			println(""+in+" is a prime")		
		}
		else{
			println(""+in+" is not a prime")	
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