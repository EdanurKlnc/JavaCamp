package method2;

public class Main {
    public static void main (String [] argsa)
{
    String mesaj = "Bugün hava çok güzel";
    String yeniMesaj = mesaj.substring(0,2); // Harf olarak sayacak 1-2. harfleri ekrana yazdıracak çıktı : "Bu"
    System.out.println(yeniMesaj);

    int sayi= topla(5,7);
    System.out.println(sayi);

    int toplam = topla2(2,3,4,5,4,8,8);
    System.out.println(toplam);


    ekle();

}   
public static void ekle(){
    System.out.println("Eklendi");

} 
public static void sil(){
        System.out.println("Silindi");


}
public static void guncelle(){
    System.out.println("Güncellendi");


}
    public static int topla(int sayi1, int sayi2){
    
        return sayi1+sayi2;
    }


    public static int topla2(int...sayilar){
    
        int toplam=0;
        for(int sayi:sayilar){ // sayilardaki her bir sayi için ne olacağını yazıyoruz
            toplam+= sayi;
    
    
        }
        return toplam;


    }
}
