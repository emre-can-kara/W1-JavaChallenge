package org.example;

public class Company {
    private long id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(long id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerNames = developerNames;

        if (giro < 0) {
            this.giro = 0;
        }
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public String addEmployee(int index, String name) {
        if (developerNames[index] == null) {
            return developerNames[index] = name;
        } else {
            return (index + "is full.");
        }


    }

    @Override
    public String toString() {
        return "Company{id=" + id + ", owner='" + name + "', giro=" + giro + ", developer Names='" + developerNames + "'}";
    }
}
