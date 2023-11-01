import java.util.Scanner;

public class soalDua {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int total = A + B;

        String hasil = convertToWords(total);
        System.out.println(hasil);
    }

    public static String convertToWords(int number) {
        int ratusan = number / 100;
        int puluhan = (number % 100) / 10;
        int satuan = number % 10;

        String hasil = "";

        switch (ratusan) {
            case 1:
                hasil += "seratus ";
                break;
            case 2:
                hasil += "dua ratus ";
                break;
            case 3:
                hasil += "tiga ratus ";
                break;
            case 4:
                hasil += "empat ratus ";
                break;
            case 5:
                hasil += "lima ratus ";
                break;
            case 6:
                hasil += "enam ratus ";
                break;
            case 7:
                hasil += "tujuh ratus ";
                break;
            case 8:
                hasil += "delapan ratus ";
                break;
            case 9:
                hasil += "sembilan ratus ";
                break;
        }

        if (puluhan == 1) {
            switch (satuan) {
                case 0:
                    hasil += "sepuluh ";
                    break;
                case 1:
                    hasil += "sebelas ";
                    break;
                case 2:
                    hasil += "dua belas ";
                    break;
                case 3:
                    hasil += "tiga belas ";
                    break;
                case 4:
                    hasil += "empat belas ";
                    break;
                case 5:
                    hasil += "lima belas ";
                    break;
                case 6:
                    hasil += "enam belas ";
                    break;
                case 7:
                    hasil += "tujuh belas ";
                    break;
                case 8:
                    hasil += "delapan belas ";
                    break;
                case 9:
                    hasil += "sembilan belas ";
                    break;
            }
        } else {
            switch (puluhan) {
                case 2:
                    hasil += "dua puluh ";
                    break;
                case 3:
                    hasil += "tiga puluh ";
                    break;
                case 4:
                    hasil += "empat puluh ";
                    break;
                case 5:
                    hasil += "lima puluh ";
                    break;
                case 6:
                    hasil += "enam puluh ";
                    break;
                case 7:
                    hasil += "tujuh puluh ";
                    break;
                case 8:
                    hasil += "delapan puluh ";
                    break;
                case 9:
                    hasil += "sembilan puluh ";
                    break;
            }

            switch (satuan) {
                case 1:
                    hasil += "satu ";
                    break;
                case 2:
                    hasil += "dua ";
                    break;
                case 3:
                    hasil += "tiga ";
                    break;
                case 4:
                    hasil += "empat ";
                    break;
                case 5:
                    hasil += "lima ";
                    break;
                case 6:
                    hasil += "enam ";
                    break;
                case 7:
                    hasil += "tujuh ";
                    break;
                case 8:
                    hasil += "delapan ";
                    break;
                case 9:
                    hasil += "sembilan ";
                    break;
            }
        }

        return hasil;
    }
}
