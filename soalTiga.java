import java.util.Scanner;

public class soalTiga {

    public static void main(String[] args) {
        Scanner siuu = new Scanner(System.in);
        String gender = siuu.nextLine();
        double berat = siuu.nextDouble();
        double tinggi = siuu.nextDouble();

        gender(gender, berat, tinggi);

    }

    public static String gender(String gender, double berat, double tinggiCm) {
        double tinggi = tinggiCm / 100;
        double rumus = berat / (tinggi * tinggi);
        switch (gender) {
            case "Pria":
                if (rumus < 20.50) {
                    System.out.println("Kurus");
                    ;
                } else if (rumus >= 20.50 && rumus <= 26.99) {
                    System.out.println("Ideal");
                } else {
                    System.out.println("Gemuk");
                }
                break;

            case "Wanita":

                if (rumus < 18.50) {
                    System.out.println("Kurus");
                } else if (rumus >= 18.50 && rumus <= 24.99) {
                    System.out.println("Ideal");
                } else {
                    System.out.println("Gemuk");
                }

        }
        return gender + "";

    }

}