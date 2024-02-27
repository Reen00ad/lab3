import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // book done

        Book b1=new Book("life","Mohammed","1122",50,2,
                new ArrayList<Review>());
        Review r1=new Review("reen",5,"great book");
        Review r11=new Review("reetaj",4.5,"nice book");
        Review r111=new Review("nouf",3,"i dont like this book");
        b1.addReview(r1);
        b1.addReview(r11);
        b1.addReview(r111);
        System.out.println(b1.getMediaType());
        System.out.println(b1.toString());
        System.out.println(" average rating : "+b1.getAverageRating());

        Book b2=new Book("you","noura","11111",70,6,
                new ArrayList<Review>());
        Review r2=new Review("lana",3.5,"bad book");
        b2.addReview(r2);
        System.out.println(b2.getMediaType());
        System.out.println(b2.toString());
        System.out.println("average rating : "+b2.getAverageRating());
//
        // music done
        Music m1=new Music("mom","lana","22",100,"taylor");
        System.out.println(m1.getMediaType()+m1.toString());
        System.out.println("-------------------------------------");
        Music m2=new Music("happy","sara","55",5,"john");
        System.out.println(m2.getMediaType()+m2.toString());
//
//      //  movie done
        Movie mo1=new Movie("war","james","77",50,150);
        System.out.println(mo1.getMediaType()+mo1.toString());
        System.out.println("------------------------------------");

        Movie mo2=new Movie("city","sara","898",300,100);
        System.out.println(mo2.getMediaType()+mo2.toString());

        //novel done
        Novel n1=new Novel("world","sara","8877",43,1,
                new ArrayList<Review>(),"fantasy");
        Review r3=new Review("fahad",5,"great novel ");
        Review r33=new Review("khalid",8,"excellent novel ");
           n1.addReview(r3);
           n1.addReview(r33);
        System.out.println(n1.getMediaType());
        System.out.println(n1.toString());
        System.out.println("average rating : "+n1.getAverageRating());

        //academic book done
        AcademicBook a1=new AcademicBook("world","sara","8877",43,1,
                new ArrayList<Review>(),"fantasy");
        Review r4=new Review("turkey",8.5,"great academic book ");
        Review r44=new Review("haya",9,"nice academic book  ");
        a1.addReview(r4);
        a1.addReview(r44);
        System.out.println(a1.getMediaType());
        System.out.println(a1.toString());
        System.out.println("average rating : "+a1.getAverageRating());


    }
}
