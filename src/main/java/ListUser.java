import java.util.ArrayList;
import java.util.List;

public class ListUser {

    private List<User> listUser;

    public ListUser() {
        this.listUser = new ArrayList<User>();
    }

    public List<User> getListUser() {
        return listUser;
    }

    public void setListUser(List<User> listUser) {
        this.listUser = listUser;
    }

    public void addUsertoList(User user) {
        listUser.add(user);
    }

    public void removeUsertoList(User user) {
        listUser.remove(user);
    }

    public void apresentarListaUsers() {
        Utils.apresentaLista(listUser, "Lista de utilizadores:");
    }

    public void apresentarListaUsersESeleciona() {
        Utils.apresentaLista(listUser, "Lista de utilizadores, selecione um:");
    }
}
