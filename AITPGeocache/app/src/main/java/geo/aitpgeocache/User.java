package geo.aitpgeocache;
import java.lang.reflect.Array;
import java.util.ArrayList;
/**
 * Created by Ryan on 4/8/2016.
 */
public class User {

    private long id;
    private String userName;
    private ArrayList<String> password;
    private ArrayList<String> wishList;
    private ArrayList<String> favoriteCaches;
    private ArrayList<String> history;

    public User(long id, String username, ArrayList<String> pass)
    {
        this.id = id;
        userName = username;
        password = pass;
        wishList = new ArrayList<String>();
        favoriteCaches = new ArrayList<String>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ArrayList<String> getPassword() {
        return password;
    }

    public void setPassword(ArrayList<String> password) {
        this.password = password;
    }

    public ArrayList<String> getWishList() {
        return wishList;
    }

    public void setWishList(ArrayList<String> wishList) {
        this.wishList = wishList;
    }

    public ArrayList<String> getFavoriteCaches() {
        return favoriteCaches;
    }

    public void setFavoriteCaches(ArrayList<String> favoriteCaches) {
        this.favoriteCaches = favoriteCaches;
    }

    public ArrayList<String> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<String> history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password=" + password +
                ", wishList=" + wishList +
                ", favoriteCaches=" + favoriteCaches +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (!getUserName().equals(user.getUserName())) return false;
        if (!getPassword().equals(user.getPassword())) return false;
        if (getWishList() != null ? !getWishList().equals(user.getWishList()) : user.getWishList() != null)
            return false;
        return !(getFavoriteCaches() != null ? !getFavoriteCaches().equals(user.getFavoriteCaches()) : user.getFavoriteCaches() != null);

    }

    @Override
    public int hashCode() {
        int result = getUserName().hashCode();
        result = 31 * result + getPassword().hashCode();
        result = 31 * result + (getWishList() != null ? getWishList().hashCode() : 0);
        result = 31 * result + (getFavoriteCaches() != null ? getFavoriteCaches().hashCode() : 0);
        return result;
    }
}
