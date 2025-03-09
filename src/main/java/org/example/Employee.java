package org.example;

public class Employee {
    private long id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(long id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String addHealthPlan(int index, String name) {
        if (healthPlans[index] == null) {
            return healthPlans[index] = name;
        } else {
            System.out.println("The index is full.");
        }
        return "ERROR";
    }
    @Override
    public String toString() {
        return "Employee{id=" + id + ", owner='" + fullName + "', email=" +  email + "' password = " + password + "' Health plans= " + healthPlans + "' }";
}
}
