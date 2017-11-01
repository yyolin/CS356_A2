
package MiniTwitter;

import java.util.ArrayList;

public class Group {
    private String id;
    
    private ArrayList<User> u;
    
    private ArrayList<Group> g;
    
    Group() {
        this.id = "";
        this.u = new ArrayList();
        this.g = new ArrayList();
    }
    
    Group(String id) {
        this.id = id;
        this.u = new ArrayList();
        this.g = new ArrayList();
    }
    
    public String getID() {
        return this.id;
    }
    
    public ArrayList<User> getUser() {
        return this.u;
    }
    
    public ArrayList<Group> getGroup() {
        return this.g;
    }
    
    public void setID(String id) {
        this.id = id;
    }
    
    public void addUser(User usr) {
        this.u.add(usr);
    }
    
    public void addGroup(Group g) {
        this.g.add(g);
    }
}
