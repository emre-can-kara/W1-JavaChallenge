package org.example;
import org.example.enums.Plan;

public class Healthplan {
    private int id;
    private String name;
    private Plan plan;

    public Healthplan(int id, String name, Plan plan) { // Constructor is used for setting three instance variables!
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "Healthplan{id=" + id + ", owner='" + name + "', plan=" +  plan + "'}";
}
}
