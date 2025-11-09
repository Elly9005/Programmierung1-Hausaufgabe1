public class Programmieraufgabe3 {
	public static void main(String[] args) {
		Stern();
		System.out.println();
		Punkt();
		System.out.println();
		Stern();
		System.out.println();
		Punkt();
	}
	public static void Stern() {
		for (int x=1; x<=7; x++) {
			System.out.print("*");
		}
	}
	public static void Punkt(){
		for (int y=1; y<=7; y++) {
			System.out.print(".");
		}
	}
}
