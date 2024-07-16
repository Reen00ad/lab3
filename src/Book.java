import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book extends Media{
    private int stock;
    private ArrayList<Review> reviews;

    public Book(int stock, ArrayList<Review> reviews) {
        this.stock = stock;
        this.reviews = reviews;
    }

    public Book(String title, String auteur, String ISBN, double price, int stock, ArrayList<Review> reviews) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.reviews = reviews;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }
    public void addReview (Review r){
      this.reviews.add(r);

    }
    public double getAverageRating(){
       double avg = 0;
       for(Review review : reviews){
           avg+=review.getRating();
       }
        return rate/reviews.size();
    }
    public void purchase(User user){
        if(stock > 0){
            user.addToCart(this);
            stock--;
        }
    }
    public boolean isBestseller(){
        return getAverageRating() >= 4.5;
    }
    public void restock(int quantity){
    this.stock +=quantity;
        System.out.println("Book restooked , new quantity : "+stock);
    }

    @Override
    public String getMediaType() {
        if(getAverageRating()>=4.5)
            return " Bestselling book";
        else
            return " Book";
    }

    @Override
    public String toString() {
        return " Book title ="+getTitle()+" book auter : "+getAuteur()+" book stock : " + stock +
                " reviews=" + reviews
                ;
    }
}
