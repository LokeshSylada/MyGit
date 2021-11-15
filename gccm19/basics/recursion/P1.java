class P1 {
	public static void main(String[] args){
		int a=0, b=1;
		fibonacci(a,b);
	}
	public static void fibonacci(int a,int b){
		int c=a+b;
		if(c<100){
		System.out.println(c);
		}
		else{
			return;
		}
		fibonacci(b,c);
	}
}

