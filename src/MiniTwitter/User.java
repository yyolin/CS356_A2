/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiniTwitter;

import java.util.ArrayList;

public interface User {
    public String id = null;
    
    public ArrayList<String> followers = new ArrayList();
    
    public ArrayList<String> followings = new ArrayList();
    
    public ArrayList<String> messages = new ArrayList();
    
    public String getID();
    
    public void setID(String id);
}
