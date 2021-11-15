//wap to print the number from A1a to Z26z?
class Demo7{
	public static void main(String[] args) {
		char ch ='A' ;
		int i = 1;
		char ch1='a';
		while(ch<='Z' ) // ch1<='z' is not mandatory because of ch.
		           System.out.println(ch++ +""+  i++ + ch1++);	           
	}
}