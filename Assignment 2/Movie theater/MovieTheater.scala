object MovieTheater{

	def main(args:Array[String])={
		println("Best ticket price = Rs."+calculateBestTicketPrice())
	}
	
	def people(price:Double):Double=120 - (price-15)/5*20
	
	def profit(price:Double):Double=people(price)*price-500-3.0*people(price)

	def calculateBestTicketPrice():Double={
		var bestPrice=0
		var price=0
		while(true){
			price=price+5
			if(people(price)==0){
				return bestPrice
			}
			if(profit(price)>profit(bestPrice)){
				bestPrice=price
			}
		}
		return bestPrice
	}

}