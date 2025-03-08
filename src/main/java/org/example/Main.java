package org.example;
import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {

        Company company = new Company(1, "John", 13, null);
        Employee employee = new Employee(2,"Jane Doe", "Doe@email.com", "123456", null);
        Healthplan healthplan = new Healthplan(3, "Mark", null);

    }
}