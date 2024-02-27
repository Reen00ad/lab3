import java.util.ArrayList;

public class AcademicBook extends Book{
    private String subject;

    public AcademicBook(String title, String auteur, String ISBN, double price, int stock, ArrayList<Review> reviews, String subject) {
        super(title, auteur, ISBN, price, stock, reviews);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getMediaType() {
//        return super.getMediaType();
        if(getAverageRating()>4.5)
            return " Bestselling AcademicBook";
        else
            return" AcademicBook";
    }

    @Override
    public String toString() {
        return " AcademicBook title  = "+getTitle()+" book auter : "+getAuteur()+
                " book stock : " + getStock() +" subject = " + subject+
                " reviews= " + getReviews()
                ;
    }
}
