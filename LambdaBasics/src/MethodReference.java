@FunctionalInterface
interface Calculator{
	void add(int num1, int num2);
}

class CalC{
	public static void adding(int num1, int num2) {
		System.out.println(num1+" and " +num2 +" addition is: " +(num1+num2));
	}
}

public class MethodReference {

	public static void main(String[] args) {
		//Reference to static method using lambda expression
		
				Calculator cref= CalC::adding;   //this is the method reference
				cref.add(11, 8);

	}

}
