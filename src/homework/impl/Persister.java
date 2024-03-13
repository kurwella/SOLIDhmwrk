package homework.impl;

import homework.User;

import java.util.HashMap;

public class Persister<E extends User>{
    private final E user;
    private final HashMap<Integer, E> users;
    private int count;

    public Persister(E user){
        this.user = user;
        this.count = 1;
        this.users = new HashMap<>();
    }

    public void save(E user){
        users.put(count, user);
        count++;
        System.out.println("Save user: " + user.getName());
    }
    public HashMap<Integer, E> getUsers(){
        return users;
    }
}
