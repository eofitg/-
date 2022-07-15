package ReadMemory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class JudgeCategoryName { // 检测数据是否是类别名的类

    public static String getCategoryName (String Data) throws FileNotFoundException{

        String fileName = "\\MemoryUnit\\CategoryName.txt";
        
        try (Scanner sc = new Scanner(new FileReader(fileName))){
            
            while (sc.hasNextLine()){ 
                String line = sc.nextLine();
                if (Data.indexOf(line) >= 0) {
                    return line;
                }
            }

        }

        return "-1";

    }

}
