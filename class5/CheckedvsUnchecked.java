package class5;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedvsUnchecked {
    public static void main(String[] args) {
        try{
            int a=10;
            int b=0;
            int res=a/b;
        }
        catch (ArithmeticException ob){
            System.out.println(ob);
        }
        try{
            String str=null;
            System.out.println(str.length());
        }
        catch (NullPointerException ob){
            System.out.println(ob);
        }
        try{
            File f=new File("sample.txt");
            FileReader fr=new FileReader(f);

            System.out.println("File opened successfully");
            fr.close();
    }    
        catch (IOException ob){
            System.out.println(ob);
        }
        try{
            readFile();
        }
        catch (IOException ob){
            System.out.println(ob);
        }
    }

    private static void readFile() throws IOException{
        File f=new File("anothersample.txt");
        FileReader fr=new FileReader(f);
        System.out.println("file read successfully");
        fr.close();
    }
}
