package methods;

public class Main {

    public static void main(String[] args){
          sayiBulmaca(); //Method çağırma
    }
    public static void sayiBulmaca()  {

        int[] sayilar = new int []{1,2,5,7,9};
        int aranacak =6;
        boolean varMi= false;

        for(int sayi: sayilar){
            if(sayi == aranacak){
                varMi= true;
                break;
            }
        }
        if(varMi){
            mesajVer(aranacak);
            System.out.println("Sayı mevcuttur :"+aranacak);
        }else{
            System.out.println("Sayı mevcut değildir :" +aranacak);

        }
    }  
    public static void mesajVer(int aranacak){ // Yukardaki fonksiyondaki " aranacak" buraya gönderdik
        System.out.println("Sayı mevcut : "+ aranacak);
    }

}
