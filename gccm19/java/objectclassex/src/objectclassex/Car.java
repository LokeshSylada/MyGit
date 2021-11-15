package objectclassex;

public class Car {
	String brandName = "Audi";

	@Override
	public String toString() {
		return "Car [brandName=" + this.brandName + "]";
	}
	public static void main(String[] args) {
		Car obj = new Car();
		System.out.println(obj);
		System.out.println(obj.toString());
		Object obj1 = new Object();
		System.out.println(obj1);
	}
	

}
