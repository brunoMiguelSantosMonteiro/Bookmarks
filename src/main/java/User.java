import java.util.ArrayList;
import java.util.List;


public class User {

    private String nomeUser;
    private List<Bookmark> listBookmark;

    public User(String nomeUser, ListUser listUser) {
        this.nomeUser = nomeUser;
        listBookmark = new ArrayList<Bookmark>();
        listUser.addUsertoList(this);
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

    public String toString() {
        return String.format("Username: %s\nBookmarks: %s", nomeUser, listBookmark);
    }

    public void criarNovoUser(String novoUtilizador, ListUser listUser) {
        User user1 = new User(novoUtilizador, listUser);
    }
}
