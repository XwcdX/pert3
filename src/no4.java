import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        System.out.println("INPUT");
        String nrp = nrp();
        String nama = nama();
        String jurusan = jurusan();
        String ipk = ipk();

        System.out.println("NRP    : " + nrp);
        System.out.println("Nama   : " + nama);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK    : " + ipk);
    }
    public static String nrp(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static String nama(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static String jurusan(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static String ipk(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
