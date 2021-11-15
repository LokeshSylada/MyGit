package inheritance;

public class Rider {
	public static void main(String[] args) {
		Vehicle obj = new Bike();
		if(obj instanceof Car)
			((Car)obj).move();
		else
			((Bike)obj).move();
	}

}
