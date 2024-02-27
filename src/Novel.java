import java.util.ArrayList;

public class Novel extends Book{
    private String genre;


    public Novel(String title, String auteur, String ISBN, double price, int stock, ArrayList<Review> reviews, String genre) {
        super(title, auteur, ISBN, price, stock, reviews);
        this.genre = genre;
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String getMediaType() {
//        return super.getMediaType();
        if(getAverageRating()>4.5)
            return "Bestselling Novel";
        else
            return "Novel";
    }

    @Override
    public String toString() {
        return " Novel title = "+getTitle()+" book auter : "+getAuteur()+
                " book stock : " + getStock() +" genre = " + genre+
               " reviews= " + getReviews()
               ;
    }
}
