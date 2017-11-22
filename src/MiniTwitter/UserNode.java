
package MiniTwitter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.tree.DefaultMutableTreeNode;

public class UserNode extends DefaultMutableTreeNode implements User{
    private String id;
    
    private String createTime;
    
    private String lastUpdate;
    
    private DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    
    private ArrayList<String> followers;
    
    private ArrayList<String> followings;
    
    private ArrayList<String> messages;
    
    public UserNode(String id) {
        super(id, false);
        this.id = id;
        Calendar c = Calendar.getInstance();
        this.createTime = df.format(c.getTime());
        this.followers = new ArrayList();
        this.followings = new ArrayList();
        this.messages = new ArrayList();
    }
    
    public UserNode(String id, boolean ac) {
        super(id, ac);
        this.id = User.id;
        this.id = id;
    }
    
    public String getID() {
        return this.id;
    }
    
    public void setID(String id) {
        this.id = id;
    }
    
    public String getCreateTime() {
        return this.createTime;
    }
    
    public String getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Calendar c) {
        this.lastUpdate = df.format(c.getTime());
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
