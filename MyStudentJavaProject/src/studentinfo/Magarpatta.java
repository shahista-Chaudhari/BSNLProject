package studentinfo;

public class Magarpatta {
	public static void main(String[] args) {
		System.out.println("Welcome to Magarpatta city");
		
		Awing objA = new Awing();
		System.out.println(objA.Secretary);
		objA.flat1();
		
		Bwing objB = new Bwing();
		System.out.println(objB.Secretary);
		objB.flat1();
	}
}
class Awing{
	String Secretary = "Mr Sharma";
	public static void flat1() {
		System.out.println("Welcome to Awing FLAT1");
	}
	public static void flat2() {
		System.out.println("Welcome to Awing FLAT2");
	}
}
class Bwing{
	String Secretary = "***The B wing secretary is Mr.Ahuja***";
	public static void flat1() {
		System.out.println("Welcome to Bwing FLAT1");
	}
	public static void flat2() {
		System.out.println("Welcome to Bwing Flat2");
	}
	public static void flat3() {
		System.out.println("Welcome to Bwing Flat3");
	}
}

