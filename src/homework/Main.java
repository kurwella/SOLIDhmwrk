package homework;

import homework.impl.Persister;

import java.util.HashMap;

public class Main{
    public static void main(String[] args){
        User user1 = new User("Bob");
        user1.report("Problem");
        user1.report("Problem2");
        Persister.save(user1);
        user1.getReportLog();
        User user2 = new User("Anna");
        user2.report("Problem3");
        user2.report("Problem4");
        Persister.save(user2);
        user2.getReportLog();
        Persister.getUsers();
    }
}