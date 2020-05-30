object Salary{

	def main(args:Array[String])={
		println("Take home salary of an employee = Rs."+calculateTakeHomeSalary(40,20))
	}


	def calculateTakeHomeSalary(normal:Int,ot:Int):Double=(normal*150.0+ot*75.0)*90.0/100.0

}