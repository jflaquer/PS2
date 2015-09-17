
package MainPackage;

public class MyInteger {
	
	
	private int value;

	public int getValue() {
		return value;
	}
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	//The isEven Methods
	
	public boolean isEven() {
		if (this.getValue() % 2 == 0){
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isEven(int value){
		if (value % 2 == 0){
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isEven(MyInteger myInt){
		if (myInt.getValue() % 2 == 0){
			return true;
		}
		else {
			return false;
		}
	}
	
	//The isOdd methods
	
	public boolean isOdd() {
		if (this.getValue() % 2 == 1){
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isOdd(int value){
		if (value % 2 == 1){
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isOdd(MyInteger myInt){
		if (myInt.getValue() % 2 == 1){
			return true;
		}
		else {
			return false;
		}
	}
	
	//The isPrime methods
	
	public boolean isPrime(){
		if (this.getValue()%2==0)
			return false;
		for (int i=3;i*i<=this.getValue();i+=2) {
			if (this.getValue()%i==0)
				return false;
		}
		return true;
		}

	public boolean isPrime(int value){
		if (value%2==0)
			return false;
		for (int i=3;i*i<=value;i+=2) {
			if (value%i==0)
				return false;
		}
		return true;
		}
	
	public boolean isPrime(MyInteger myInt){
		if (myInt.getValue()%2==0)
			return false;
		for (int i=3;i*i<=myInt.getValue();i+=2) {
			if (myInt.getValue()%i==0)
				return false;
		}
		return true;
		}
	
	//The equal methods (This still didn't make any sense to me)
	
	//The parseInt method (I still don't understand how to do this one.)
}
