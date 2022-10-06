package Demo;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class DemoWriteFile {
    public static void main(String[] args) {
        try{

            /**
//            FileWriter fileWriter = new FileWriter("DemoWriter.txt");
           OutputStreamWriter fileWriter = new FileWriter("DemoWriter.txt");
           char[] chars = {'c','7','2','2','g','1'};
//           fileWriter.write(chars,2,3);
           fileWriter.write(99);
            fileWriter.close();


            FileReader fileReader = new FileReader("DemoReader.txt");
            System.out.println(fileReader.read());

             **/
            FileReader fileReader = new FileReader("DemoReader.txt");

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            ArrayList<String> list = new ArrayList<>();
            String str = null;
            while ((str = bufferedReader.readLine())!=null){
                list.add(str);
            }
            System.out.println(list);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

}
