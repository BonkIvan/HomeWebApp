package by.homeWebApp.model;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapUsernames {


   private  Map<String, String> users =new ConcurrentHashMap<>();

    public MapUsernames() {
        users.put("Masha", "123");
        users.put("Sasha", "456");
        users.put("Vanya", "789");
    }

    public Map<String, String> getUsers() {
        return users;
    }

    public void setUsers(HashMap<String, String> users) {
        this.users = users;
    }
    public void setUser(String user, String password) {
       users.put(user, password);
    }


    public boolean isUser(String user, String  password) {
        boolean x = false;
        for (Map.Entry<String, String> entry : users.entrySet())
        {
            if (entry.getKey().equals(user))
            {
                if (entry.getValue().equals(password))
                x = true;
                break;
            }
        }
        return x;
    }


}
