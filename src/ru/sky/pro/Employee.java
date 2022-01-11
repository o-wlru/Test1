package ru.sky.pro;

import java.util.Objects;

public class Employee {
    private static int counter = 1;

    private int id;
    private final String firstName;
    private final String patronymic;
    private final String secondName;
    private int department;
    private float salary;



    public Employee(String secondName, String firstName, String patronymic, int department, float salary) {
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.secondName = secondName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public String getFullName() {
        return secondName + " " + firstName + " " + patronymic;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object other) {
    if (this.getClass() != other.getClass()) {
    return false;
        }
    Employee employee = (Employee) other;
    return id == employee.id && department == employee.department && salary == employee.salary && Objects.equals(secondName, employee.secondName) && Objects.equals(firstName, employee.firstName) && Objects.equals(patronymic, employee.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, secondName, firstName, patronymic, department, salary);
    }
    @Override
    public String toString() {
        return "Employee: " + "id=" + id + " secondname=" + secondName + " firstname=" + firstName + " patronymic=" + patronymic + " department=" + department + " salary=" + salary;
    }

}
