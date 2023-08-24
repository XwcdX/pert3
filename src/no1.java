import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class no1 {
    public static String story;

    public static void main(String[] args) {
        story = magicText();

        File cerita = new File("cerita.txt");
        try {
            if(cerita.createNewFile()){
                System.out.println("Successfully wrote to the file.");
            }
            else {
                System.out.println("Successfully wrote to the file.");
            }

            writeToFile(cerita);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        readFromFile(story);
    }

    public static String magicText(){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan teks: ");
        String text = in.nextLine();
        System.out.print("kata ganti: ");
        String kataGanti = in.next();
        String result = text.replace("istri", kataGanti);
        return "Alkisah-" + result;
    }

    public static void writeToFile(File cerita){
        try {
            FileWriter myWritter = new FileWriter(cerita);
            myWritter.write(story);
            myWritter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void readFromFile(String hasilAkhir){
        System.out.println(hasilAkhir);
    }
}
