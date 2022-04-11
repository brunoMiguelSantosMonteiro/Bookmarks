import java.util.ArrayList;
import java.util.List;

public class User {

    private String nomeUser;
    private List<Bookmark> listBookmark;

    public User(String nomeUser, List<Bookmark> listBookmark) {
        this.nomeUser = nomeUser;
        this.listBookmark = new ArrayList<Bookmark>();
    }

    public String toString(){
        return String.format("Username: %s\nBookmarks: %s", nomeUser, listBookmark);
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public List<Bookmark> getListBookmark() {
        return listBookmark;
    }

    public void setListBookmark(List<Bookmark> listBookmark) {
        this.listBookmark = listBookmark;
    }
}
