public class Programmieraufgabe4 {

    public static void main(String[] args) {
        Stern1();
        Punkt1();
        System.out.println();
        Stern2();
    }

    public static void Stern1() {
        for (int x = 7; x >= 6; x--) {
            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Punkt1() {
        for (int x = 1; x <= 5; x++)
            System.out.print(".");
    }

    public static void Stern2() {
        for (int x = 4; x >= 1; x--) {
            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

