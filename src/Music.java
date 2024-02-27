import java.util.ArrayList;
import java.util.List;

public class Music extends Media{
    private String artist;

    public Music(String artist) {
        this.artist = artist;
    }

    public Music(String title, String auteur, String ISBN, double price, String artist) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void listen(User user){
      user.addToCart(this);
    }
    public ArrayList<Music> generatePlaylist(ArrayList<Music> musicCatolog){
       List<Music> playlist=new ArrayList<>();
       for(Music m : musicCatolog){
           if(m.getAuteur().equals(getAuteur()) && !m.getTitle().equals(getTitle())){
               playlist.add(m);
           }
       }
        return musicCatolog;
    }

    @Override
    public String getMediaType() {
//        return super.getMediaType();
        if(getPrice()>=10)
            return " Premium music";
        else
            return " music";
    }

    @Override
    public String toString() {
        return "  Music artist = " + artist + " title = " +getTitle();
    }
}
