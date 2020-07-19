object CeaserCipher extends App{
	def move(letter:Char,shiftIn:Int):Char={
		val shift=shiftIn%26
		if(letter.isUpper){
			if(shift>=0){
				if(letter.toInt+shift<='Z'.toInt){
					(letter.toInt+shift).toChar
				}
				else{
					('A'.toInt+(shift-'Z'.toInt+letter.toInt-1)).toChar
				}
			}
			else{
				if(letter.toInt+shift>='A'.toInt){
					(letter.toInt+shift).toChar
				}
				else{
					('Z'.toInt+(shift-'A'.toInt+letter.toInt+1)).toChar
				}
			}
		}
		else{
			if(shift>=0){
				if(letter.toInt+shift<='z'.toInt){
					(letter.toInt+shift).toChar
				}
				else{
					('a'.toInt+(shift-'z'.toInt+letter.toInt-1)).toChar
				}
			}
			else{
				if(letter.toInt+shift>='a'.toInt){
					(letter.toInt+shift).toChar
				}
				else{
					('z'.toInt+(shift-'a'.toInt+letter.toInt+1)).toChar
				}
			}
		}
	}

	val encrypt=(message:String,shiftIn:Int)=>message.map(move(_,shiftIn))
	val decrypt=(message:String,shiftIn:Int)=>message.map(move(_,-1*shiftIn))
	val cipher =(algo:(String,Int)=>String,message:String,shiftIn:Int)=>algo(message,shiftIn)
	println(cipher(encrypt,"coNfidenTialxZx",7))
	println(cipher(decrypt,"jvUmpkluAphseGe",7))



}	