package Module2Demo;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Viết hàm thêm 1 sản phẩm (ID, NAME, PRICE) mới:


        addListProduct();








    }
    private static void addListProduct(){
        System.out.println("Input new Id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input new Name:");
        String name = scanner.nextLine();
        System.out.println("Input new Price:");
        double price = scanner.nextDouble();
        Product pNew = new Product(id,name,price);
        try{
            FileWriter fileWriter = new FileWriter("product.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Product product: getListProducts() ) {
                bufferedWriter.write(product.getIdProduct());
                bufferedWriter.write(product.getName());
                bufferedWriter.write((int) product.getPrice());
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
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

    public static void editProductNameView(){
        System.out.println("Input Id you need edit");
        int id = Main.scanner.nextInt();
        System.out.println("Input new Name");
        String name = Main.scanner.nextLine();
        editProductName(id,name);

    }

    public static void editProdictPriceView(){
        System.out.println("Input Id you need edit");
        int id = Main.scanner.nextInt();
        System.out.println("Input new Name");
        double price = Main.scanner.nextDouble();
        editProductPrice(id,price);
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
            str += listProduct.get(i).getIdProduct() + "," +
                    listProduct.get(i).getName() + "," +
                    listProduct.get(i).getPrice() + "\n";
        }
        return str;
    }

    private static void editProductName(int id, String name){
        ArrayList<Product> list = getListProducts();
        for (int i = 0; i < list.size(); i++) {
            if (getListProducts().get(i).getIdProduct() == id){
                getListProducts().get(i).setName(name);
            }
        }
        saveListProducts(list);
    }

    private static void editProductPrice(int id, double price){
        ArrayList<Product> list = getListProducts();
        for (int i = 0; i < list.size(); i++) {
            if (getListProducts().get(i).getIdProduct() == id){
                getListProducts().get(i).setPrice(price);
            }
        }
        saveListProducts(list);
    }

    private void removeProductById(int id){
        ArrayList<Product> list = getListProducts();
    }

}
