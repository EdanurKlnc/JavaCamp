public class Main {
    public static void main(String [] args){

        
    Product product1 = new Product(); //class değişkeni oluştuurma

        product1.name="Eda";
        product1.unitPrice=7500;
        product1.discount=7;
        product1.unitInStock= 3;
        product1.imageUrl= ".jpg" ;
       
    Product product2 = new Product(); //class değişkeni oluştuurma

        product2.name="Kılınç";
        product2.unitPrice=500;
        product2.discount=7;
        product2.unitInStock= 2;
        product2.imageUrl= ".jpg" ;

 Product[] products = {product1,product2} ;
 for(Product product: products){
    System.out.println(product.name);
 }     
     }
} 