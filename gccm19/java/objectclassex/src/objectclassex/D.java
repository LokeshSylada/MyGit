package objectclassex;

public class D extends C implements I1,I2{
	public void run() {
		System.out.println("Lokesh");
	}
	public void jump() {
		System.out.println("Gopi");
	}
	public void move() {
		System.out.println("Sai");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I1 obj = new D();
		((I2)obj).jump();

	}

}
