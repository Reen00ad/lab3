import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {
    private ArrayList<User> users;
    private ArrayList<Media> medias;

    public Store(ArrayList<User> users, ArrayList<Media> medias) {
        this.users = users;
        this.medias = medias;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Media> getMedias() {
        return medias;
    }

    public void setMedias(ArrayList<Media> medias) {
        this.medias = medias;
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public ArrayList<User> displayUsers() {
       return users;
    }

        public void addMedia (Media media){

        this.medias.add(media);
        }


        public ArrayList<Media> displayMedia() {
            return medias;
        }
//        public Book searchBook (String title){
//
//        }



    @Override
    public String toString() {
        return "Store{" +
                "users=" + users +
                ", medias=" + medias +
                '}';
    }
}
