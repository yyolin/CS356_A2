
package MiniTwitter;

import java.util.ArrayList;

public class User extends Group {
    private String id;
    
    private ArrayList<String> followers;
    
    private ArrayList<String> followings;
    
    private ArrayList<String> messages;
    
    public User() {
        this.id = "";
        this.followers = new ArrayList();
        this.followings = new ArrayList();
        this.messages = new ArrayList();
    }
    
    public User(String id) {
        super(id, false);
        this.id = id;
        this.followers = new ArrayList();
        this.followings = new ArrayList();
        this.messages = new ArrayList();
    }
    
    public String getID() {
        return this.id;
    }
    
    public void setID(String id) {
        this.id = id;
    }
    
    public ArrayList getFollowers() {
        return this.followers;
    }
    
    public void setFollowers(ArrayList<String> f) {
        this.followers = f;
    }
    
    public ArrayList getFollowings() {
        return this.followings;
    }
    
    public void setFollowings(ArrayList<String> f) {
        this.followings = f;
    }
    
    public ArrayList getMessage() {
        return this.messages;
    }
    
    public void setMessage(ArrayList<String> m) {
        this.messages = m;
    }
    
    public void addFollower(String f) {
        this.followers.add(f);
    }
    
    public void addFollowing(String f) {
        this.followings.add(f);
    }
    
    public void addMessage(String m) {
        this.messages.add(m);
    }
}
