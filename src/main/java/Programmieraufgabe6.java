public class Programmieraufgabe6 {
    public static void main(String[] args) {

        for (int x = 1; x <= 9; x++) {           // 9 Zeilen
            if (x % 2 == 1) {                    // ungerade Zeile
                System.out.println("*.*.*.*.*");
            } else {                         
                System.out.println(".*.*.*.*.");
            }
        }
    }
}

