package model;

import java.util.List;

public class FriendshipRequest extends PersonalData{
    private String image;
    private List<User> users;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
