package utils;

import java.util.HashMap;
import java.util.Map;

public class HashMapUsernames {

   private HashMap<String, String> users = new HashMap<>();

    public HashMapUsernames() {
        users.put("Masha", "123");
        users.put("Sasha", "456");
        users.put("Vanya", "789");
    }

    public HashMap<String, String> getUsers() {
        return users;
    }

    public void setUsers(HashMap<String, String> users) {
        this.users = users;
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
