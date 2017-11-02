
package MiniTwitter;

import javax.swing.Icon;
import javax.swing.tree.DefaultMutableTreeNode;

public class Group extends DefaultMutableTreeNode{
    protected Icon icon;
    
    private String id;
    
    Group() {
        this(null);
    }
    
    Group(String id) {
        super(id, true);
        this.id = id;
    }
    
    Group(String id, boolean allowChildren) {
        super(id, allowChildren);
        this.id = id;
    }
    
    Group(String id, Icon icon){
        super(id, true);
        this.id = id;
        this.icon = icon;
    }
    
    public String getID() {
        return this.id;
    }
}
