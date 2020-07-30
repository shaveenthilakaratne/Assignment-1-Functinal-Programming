class Account(idIn:String,accountNumberIn:Int,balanceIn:Double){
	var nic:String=idIn
	var accountNumber:Int=accountNumberIn
	var balance:Double=balanceIn

	def withdraw(m:Double)=this.balance=this.balance-m
	
	def deposit(m:Double)=this.balance=this.balance+m
	
	def transfer(a:Account,m:Double)={
		this.withdraw(m)
		a.deposit(m)
	}
}

object Q3{
	def main(args:Array[String])={
		val accountOne=new Account("981892488V",123456,280000.00)
		println("Account one balance before tranfer : Rs."+ accountOne.balance)
		val accountTwo=new Account("972435527V",987654,105000.00)
		println("Account two balance before tranfer : Rs."+ accountTwo.balance)
		println("\nTransfering Rs.15000.00\n")
		accountOne.transfer(accountTwo,15000.00)
		println("Account one balance after tranfer : Rs."+ accountOne.balance)
		println("Account two balance after tranfer : Rs."+ accountTwo.balance)

	}
}