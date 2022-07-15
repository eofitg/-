package ReadMemory;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class GetMemory { // 调出类别下已存储数据的类

    public static StoredData getStoredData (String categoryName) throws FileNotFoundException {

        String fileName = "\\MemoryUnit\\Memory\\" + categoryName + ".txt";
        StoredData returnData = new StoredData();
        
        try (Scanner sc = new Scanner(new FileReader(fileName))) {
            
            while (sc.hasNextLine()) { 
                
                String line = sc.nextLine();
                String temp[] = line.split(" ");
                ArrayList<String> Data = new ArrayList<>();
                
                for (int i=0;i<temp.length;i++) {
                    Data.add(temp[i]);
                }

                returnData.data.add(Data);

            }

        }

        return returnData;

    }

    public static class StoredData {
        public ArrayList<ArrayList<String>> data = new ArrayList<>();
    }

}
