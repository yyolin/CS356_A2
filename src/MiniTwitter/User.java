
package MiniTwitter;

import java.util.ArrayList;

/**
 *
 * @author yyan
 */
public class User {
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
        this.id = id;
        this.followers = new ArrayList();
        this.followings = new ArrayList();
        this.messages = new ArrayList();
    }
    
    public String getID() {
        return this.id;
    }
    
    public ArrayList getFollowers() {
        return this.followers;
    }
    
    public ArrayList getFollowings() {
        return this.followings;
    }
    
    public ArrayList getMessages() {
        return this.messages;
    }
    
    public void setID(String id) {
        this.id = id;
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
