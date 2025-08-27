import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Baca input string A dan B
        String A = sc.nextLine();  
        String B = sc.nextLine();  

        // 1. Hitung jumlah panjang string A dan B
        // A.length() -> panjang string A
        // B.length() -> panjang string B
        System.out.println(A.length() + B.length());

        // 2. Bandingkan string A dan B secara leksikografis (kamus)
        // compareTo() -> mengembalikan nilai:
        // > 0  jika A lebih besar (Yes)
        // = 0  jika A sama dengan B
        // < 0  jika A lebih kecil (No)
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Kapitalisasi huruf pertama A dan B
        // substring(0,1) -> ambil huruf pertama
        // toUpperCase()  -> ubah huruf pertama jadi huruf besar
        // substring(1)   -> ambil sisa string setelah huruf pertama
        String capA = A.substring(0,1).toUpperCase() + A.substring(1);
        String capB = B.substring(0,1).toUpperCase() + B.substring(1);

        // Cetak hasil kapitalisasi
        System.out.println(capA + " " + capB);

        sc.close(); // Tutup scanner
    }
}
