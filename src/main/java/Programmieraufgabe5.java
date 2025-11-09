public class Programmieraufgabe5 {
    public static void main(String[] args) {
	    Stern1();
	    Stern2();
    }
    public static void Stern1() {
	    for (int x=1;x<=5;x++){
		    for (int y=1; y<=x;y++){
			    System.out.print("*");
		    }
		    System.out.println();
	    }
    }
    public static void Stern2() {
	    for (int x=4; x>=0; x--){
		    for (int y=1; y<=x; y++) {
			    System.out.print("*");
		    }
		    System.out.println();
	    }
    }
}
