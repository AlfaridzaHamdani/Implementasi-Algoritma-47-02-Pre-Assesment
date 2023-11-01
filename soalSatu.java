import java.util.Scanner;

public class soalSatu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Input:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.println(enkripsi(num1));
        System.out.println(enkripsi(num2));
        System.out.println(enkripsi(num3));
    }

    public static String enkripsi(int num) {
        // Mendapatkan angka satu per satu
        int ribuan = num / 1000;
        int ratusan = (num % 1000) / 100;
        int puluhan = (num % 100) / 10;
        int satuan = num % 10;

        // Melakukan penjumlahan
        ribuan = (ribuan + 5) % 10;
        ratusan = (ratusan + 5) % 10;
        puluhan = (puluhan + 5) % 10;
        satuan = (satuan + 5) % 10;

        // Menukar bilangan kedua dan keempat
        int temp = ratusan;
        ratusan = satuan;
        satuan = temp;

        return "" + ribuan + ratusan + puluhan + satuan;
    }
}
