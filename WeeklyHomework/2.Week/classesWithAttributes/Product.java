
package classesWithAttributes;

//Ürünün hangi özelliklerinin olduğuunun belirtildiği yer
public class Product{ 

    public  Product(/*Aşağıdaki gibi tek tek yazmak yerine ürünün özelliklerini burada belitebiliriz */
                     int _id,String _name, String _description, double _price,  int _stockAmount
                     /* Bunlarıda Product product= new Product( parantes içine yukarıdaki sıra ile yazmalıyız) */
    ){
        System.out.println("Yapıcı blok çalıştı");
        this._id= _id;
        this._name= _name;
        this._description= _description;
        this._price = _price;
        this._stockAmount = _stockAmount;
        


    }


    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;


/* Private yaptığımız değerleri kullanıcının 
okuyabilmesi için "get" kullanıyoruz */
    public int getId(){

        return _id;

    }
    
    public String getName(){

        return _name;

    }
    public String getDescription(){

        return _description;

    } 
     public double getPrice(){

        return _price;

    }  
    public int getStockAmount(){
    
        return _stockAmount;

    }

    // Kullanıcıdan istediğimiz
    public void setId(int id){
        //this= içinde bulunduğumuz classı temsil eder
        this._id= id; 
    }
    public void setName(String name){
       
        this._name= name;

    }
    public void setDescription(String description){
        
        this._description= description;

    }  
    public void setPrice(double price){
    
        this._price= price;

    } 
     public void setStockAmount(int stockAmount){
    
        this._stockAmount= stockAmount;

    }

}