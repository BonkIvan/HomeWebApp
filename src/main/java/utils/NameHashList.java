package utils;

import java.util.HashSet;
import java.util.Set;

public class NameHashList {

    private Set<String> names = new HashSet<>();

    public NameHashList() {
        names.add("Masha");
        names.add("Sasha");
        names.add("Ivan");
    }

    public Set<String> getNames() {
        return names;
    }

    public void setNames(Set<String> names) {
        this.names = names;
    }

    public boolean SetName(String name){
        return names.add(name);
    }

    public void init() {
        names.add("Masha");
        names.add("Sasha");
        names.add("Ivan");

    }

    public boolean isName(String name) {
        boolean x = false;
        for (String isName : names)
        {
            if (isName.equals(name))
            {
                x = true;
                break;
            }
        }
        return x;
    }


}
