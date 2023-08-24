import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static String q;

    public static void main(String[] args) {
         q = yu();
         String[] name = q.split(" ",2);
         String frst = name[0];
         String other = name[1];
         x(q);
    }

    public static String yu(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nama user: ");
        return in.nextLine();
    }
    public static void x (String q1){
        File lol = new File("lol.txt");
        try {
            if (lol.createNewFile()){
                System.out.println("File Created");
            }
            else {
                System.out.println("File alredy created");
            }

            FileWriter popo = new FileWriter(lol, true);
            popo.write("Nama user: " + q1);
            popo.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void read(    ){

    }
}