import java.io.FileNotFoundException;
import java.util.ArrayList;

import ReadMemory.GetMemory;

public class JudgeString { // 辨别用户输入了哪种类型句子的类
   
    public static boolean conformTranslate (String Data) throws FileNotFoundException {
        
        GetMemory.StoredData storedData =  GetMemory.getStoredData("Translate");

        int columnDataSize = storedData.data.size();

        for (int i=0;i<columnDataSize;i++) {

            int rowDataSize = storedData.data.get(i).size();
            int check = 0;

            for (int j=0;j<rowDataSize;j++) {
                
                int start = 0;
                String data = storedData.data.get(i).get(j);
                int seek = Data.indexOf(data, start);

                if (seek >= 0) { // 该单一数据可以在Data中检索到
                    check++;
                    start = seek;
                }

            }

            if (check == rowDataSize) {
                return true;
            }

        }

        return false;

    }

    public static boolean conformParaphrase (String Data) throws FileNotFoundException {

        return false;

    }

    public static KeyData findKey (String Data, KeyData key, String categoryName) {

        KeyData returnKey = new KeyData();

        switch(categoryName){
            case "Paraphrase":{

            }
            case "Translate":{

            }
        }

        return returnKey;

    }

    public static class KeyData {
        ArrayList<String> keyData = new ArrayList<>();
    }

}
