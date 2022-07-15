import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    public static void Welcome () {
        System.out.println("Hi! Friend!");
    }
    public static String Read () {
        try (Scanner sc = new Scanner(System.in)) {
            String UserInput = sc.next();
            return UserInput;
        }
    }
    public static void TranslateSystem () {

    }
    public static void ParaphraseSystem () {

    }
    public void NewSystem () {

    }
    public static void main (String args[]) throws FileNotFoundException {
        
        System.out.println("Hello, World!");

        Welcome();

        String TypedData = Read();
        
        if (JudgeString.conformTranslate(TypedData)) {
            TranslateSystem();
        } else if (JudgeString.conformParaphrase(TypedData)) {
            ParaphraseSystem();
        }

    }

    public static int toInt(String x){
        return Integer.parseInt(x);
    }

}