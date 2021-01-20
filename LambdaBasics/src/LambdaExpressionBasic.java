@FunctionalInterface
interface Cab{
	void bookCab();
}

//class Uberx implements Cab{
//	public void bookCab() {
//		System.out.println("Uberx booked!!, Arriving soon");
//	}
//}

public class LambdaExpressionBasic {

	public static void main(String[] args) {
		//using lambda expression with no parameters
				Cab cab= ()->{
					System.out.println("Uber booked, Arriving soon!!");
				};
				cab.bookCab();
	}

}
