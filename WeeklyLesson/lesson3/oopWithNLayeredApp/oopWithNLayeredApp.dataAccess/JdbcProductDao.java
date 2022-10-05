package WeeklyLesson.lesson3.oopWithNLayeredApp.oopWithNLayeredApp.dataAccess;

import WeeklyLesson.lesson3.oopWithNLayeredApp.oopWithNLayeredApp.entities.Product;

public class JdbcProductDao {
    // veritabanına erişim işlemlerini gerçekleştiriyoruz
    public void add(Product product){
       // sadece veritabanı erişim kodları buraya yazılır...SQL
        System.out.println(" Jdbc ile Veritabanına eklendi");

    }
}
