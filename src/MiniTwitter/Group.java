
package MiniTwitter;

import java.util.ArrayList;

public class Group {
    private String id;
    
    private int usrSize;
    
    private int grpSize;
    
    private ArrayList<User> u;
    
    private ArrayList<Group> g;
    
    Group() {
        this.id = "";
        this.usrSize = 0;
        this.grpSize = 0;
        this.u = new ArrayList();
        this.g = new ArrayList();
    }
    
    Group(String id) {
        this.id = id;
        this.usrSize = 0;
        this.grpSize = 0;
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
    
    public int getUsrSize() {
        return this.usrSize;
    }
    
    public int getGrpSize() {
        return this.grpSize;
    }
    
    public void setID(String id) {
        this.id = id;
    }
    
    public void addUser(User usr) {
        this.u.add(usr);
        usrSize = this.u.size();
    }
    
    public void addGroup(Group g) {
        this.g.add(g);
        grpSize = this.g.size();
    }
}
