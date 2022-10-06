package Demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DemoBufferedWriter {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("DemoBuf.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("TanDungIt xin chào các bạn");
            bufferedWriter.close();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
