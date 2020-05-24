object TotalCost{

	def main(args:Array[String])={
		println("Total wholesale cost for 60 copies = "+calculateTotalCost(24.95,60))
	}


	def calculateTotalCost(price:Double,copies:Int):Double={
		var Tot=0.0
		if(copies>50){
			Tot =price*60.0/100.0*copies+50*3.0+(copies-50)*0.75
		}
		else{	
			Tot =price*60.0/100.0*copies+copies*3.0
		}
		return Tot
	}

}