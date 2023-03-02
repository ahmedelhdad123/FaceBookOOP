package model;

import gender.Genders;

import java.util.List;

public class User  extends BasicEntity{
     private String full_name;
    private String email;
    private int phone;
    private int password;
    private List<Role> role;
    private Genders gender;
    private List<Friend> friends;
    private List<Chat> chats;
    private List<Message> messages;
    private List<FriendshipRequest> friendshipRequests;

    public List<FriendshipRequest> getFriendshipRequests() {
        return friendshipRequests;
    }

    public void setFriendshipRequests(List<FriendshipRequest> friendshipRequests) {
        this.friendshipRequests = friendshipRequests;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<Friend> getFriends() {
        return friends;
    }

    public List<Chat> getChats() {
        return chats;
    }

    public void setChats(List<Chat> chats) {
        this.chats = chats;
    }

    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    private List<Post> posts;
    private List<Comment> comments;
    private List<Like> likes;
    public List<Role> getRole() {
        return role;
    }
    public void setRole(List<Role> role) {
        this.role = role;
    }

    public Genders getGender() {
        return gender;
    }

    public void setGender(Genders gender) {
        this.gender = gender;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "full_name='" + full_name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", password=" + password +
                ", role=" + role +
                ", gender=" + gender +
                ", friends=" + friends +
                ", chats=" + chats +
                ", messages=" + messages +
                ", friendshipRequests=" + friendshipRequests +
                ", posts=" + posts +
                ", comments=" + comments +
                ", likes=" + likes +
                '}';
    }
}
