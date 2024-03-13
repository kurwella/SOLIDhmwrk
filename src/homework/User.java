package homework;

import homework.impl.Persister;
import homework.impl.Report;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class User implements Report {
    private final String name;
    private HashMap<Integer, String> reports;
    int count = 1;

    public User(String name){
        this.name = name;
        this.reports = new HashMap<>();
    }

    public String getName(){
        return name;
    }

//    public void save(){
//        Persister persister = new Persister(this);
//        persister.save();
//    }

    @Override
    public void report(String msg) {
        reports.put(count, msg);
        System.out.println("User " + getName() + " reported a problem: index " + count);
        count++;
    }

    @Override
    public void getReportLog() {
        System.out.println(reports);
    }
}
