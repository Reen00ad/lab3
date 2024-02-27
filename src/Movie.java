import java.util.ArrayList;
import java.util.List;

public class Movie extends Media{
    private int duration;

    public Movie(int duration) {
        this.duration = duration;
    }

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void watch(User user){
   user.addToCart(this);
    }
    public ArrayList<Movie> recommendaSimilarMovies (ArrayList<Movie> movieCatalog){
    List<Movie> similar=new ArrayList<>();
    for(Movie mm : movieCatalog){
        if(mm.getAuteur().equals(getAuteur()) && !mm.getTitle().equals(getTitle())){
            similar.add(mm);
        }
    }
        return movieCatalog;
    }

    @Override
    public String getMediaType() {
//        return super.getMediaType();
        if(getDuration()>=120)
            return " Long movie ";
        else
            return " Movie";
    }

    @Override
    public String toString() {
        return " Movie name = "+getTitle()+" duration : " + duration +" minute";

    }
}
