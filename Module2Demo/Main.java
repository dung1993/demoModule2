package Module2Demo;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Viết hàm thêm 1 sản phẩm (ID, NAME, PRICE) mới:

        ArrayList<Product> list = getListProducts();
        printProduct(list);



        int id = 6;
        String name= "Trà Sữa";
        double price = 30000.0;
        Product pNew = new Product(id,name,price);
        ArrayList<Product> listProduct = getListProducts();
        listProduct.add(pNew);

        saveListProducts(listProduct);
    }


    private static ArrayList<Product> getListProducts() {
        ArrayList<Product> listProduct = new ArrayList<>();
        File file = new File("product.txt");
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while((line = bufferedReader.readLine())!=null){
                String[] arr = line.split(",");
                String sId = arr[0];
                String sName = arr[1];
                String sPrice = arr[2];

                int id = Integer.parseInt(sId);
                double price = Double.parseDouble(sPrice);
                Product product = new Product(id,sName,price);
                listProduct.add(product);
            }
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return listProduct;
    }
    private static void printProduct(ArrayList<Product> listProduct) {
        for(Product p : listProduct){
            System.out.printf("%d   %s   %f \n", p.getIdProduct(), p.getName(), p.getPrice());
        }
    }

    private static void saveListProducts(ArrayList<Product> list){
        File file = new File("product.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(convertToString(list));
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static String convertToString(ArrayList<Product> listProduct){
        String str = "";
        for (int i=0;i<listProduct.size();i++){
            //1,Cafe Đen,12000
            str += listProduct.get(i).getIdProduct() + "," +
                    listProduct.get(i).getName() + "," +
                    listProduct.get(i).getPrice() + "\n";
        }
        return str;
    }

}
