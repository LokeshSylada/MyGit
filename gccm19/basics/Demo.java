class Demo{
	public static void main(String[] args) {
		int a=12 ;
		if(a%3==0 && a%4==0)
			System.out.println("Good morning");
		else if(a%3==0)
			System.out.println("Good afternoon");
		else if(a%4==0)
			System.out.println("Good evening");
		else {
			System.out.println("Good night"); 
		}
	}
}