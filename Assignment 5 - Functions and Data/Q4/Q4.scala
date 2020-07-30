class Account(idIn:String,accountNumberIn:Int,balanceIn:Double){
	var nic:String=idIn
	var accountNumber:Int=accountNumberIn
	var balance:Double=balanceIn

	val overdraft=(b:List[Account])=> b.filter(a=>a.balance<0)
	val totalBalance=(b:List[Account])=>b.reduce((a,b)=>(new Account("Total",0,a.balance+b.balance)))
	val interest=(b:List[Account])=>b.map(a=>{ if(a.balance<0) (new Account(a.nic,a.accountNumber,a.balance*1.05)) else(new Account(a.nic,a.accountNumber,a.balance*1.1))})
	override def toString="[ "+nic+" | "+accountNumber+" | Rs."+((balance * 100).round / 100.toDouble)+" ]"
	
}



object Q4{

def main(args:Array[String])={
	val defaultAccount=new Account("980000000V",000000,0.00)
	val bank:List[Account]=List(
		new Account("980000001V",000001,513510.00),
		new Account("980000002V",000002,6631.00),
		new Account("980000003V",000003,-45465.00),
		new Account("980000004V",000004,-6544115.00),
		new Account("980000005V",000005,45541.00),
		new Account("980000006V",000006,4244.00),
		new Account("980000007V",000007,-66446.00),
		new Account("980000008V",000008,161464.00),
		new Account("980000009V",000009,-4461.00),
		new Account("980000010V",000010,10.00),
	)

	println(" 1. List of Accounts with negative balances : \n")
	for(element<-defaultAccount.overdraft(bank))  
        {  
            println(element)  
        } 
	println("\n\n 2. The sum of all account balances Rs.: "+defaultAccount.totalBalance(bank).balance)
	println("\n\n 3. the final balances of all accounts after applying the interest : \n")
	for(element<-defaultAccount.interest(bank))  
        {  
            println(element)  
        }
}
}






