import scala.math.Pi

object Volume{

	def main(args:Array[String])={
		println("Volume = "+calculateVolume(5))
	}


	def calculateVolume(r:Double):Double={
		var vol=(4.0/3.0)*Pi*r*r*r
		return vol
	}

}