import java.net.URL;
import java.util.ArrayList;

public class Bookmark {

    private URL bookmarkURL;

    private boolean bookmarkPrivate;

    private ArrayList<Tag> listaTags;

    private ArrayList<User> listaUsersComAcesso;

    public Bookmark(URL bookmarkURL, boolean bookmarkPrivate) {
        this.bookmarkURL = bookmarkURL;
        this.bookmarkPrivate = bookmarkPrivate;
        listaTags = new ArrayList<>();
        listaUsersComAcesso = new ArrayList<>();
    }

    public URL getBookmarkURL() {
        return bookmarkURL;
    }

    public boolean isBookmarkPrivate() {
        return bookmarkPrivate;
    }

    public ArrayList<Tag> getListaTags() {
        return listaTags;
    }

    public ArrayList<User> getListaUsersComAcesso() {
        return listaUsersComAcesso;
    }

    public void setBookmarkURL(URL bookmarkURL) {
        this.bookmarkURL = bookmarkURL;
    }

    public void setBookmarkPrivate(boolean bookmarkPrivate) {
        this.bookmarkPrivate = bookmarkPrivate;
    }

    public void setListaTags(ArrayList<Tag> listaTags) {
        this.listaTags = listaTags;
    }

    public void setListaUsersComAcesso(ArrayList<User> listaUsersComAcesso) {
        this.listaUsersComAcesso = listaUsersComAcesso;
    }

    @Override
    public String toString() {
        return String.format("URL: %s\nPrivado: %s\nTags: %s\nUsers com Acesso: %s", bookmarkURL, bookmarkPrivate, listaTags, listaUsersComAcesso);
    }
}
