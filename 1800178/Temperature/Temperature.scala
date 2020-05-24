object Temperature{

	def main(args:Array[String])={
		println("Temperature in Fahrenheit = "+convertTemperature(35)+" F")
	}


	def convertTemperature(c:Double):Double={
		var f=c*1.8000+32.00
		return f
	}

}