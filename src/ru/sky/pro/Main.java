package ru.sky.pro;

public class Main {

    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        addEmployee(new Employee("Ivanov", "Ivan", "Ivanovoch", 1, 100_000));
        addEmployee(new Employee("Sidorov", "Sidor", "Sidorovicn", 2, 200_000));
        addEmployee(new Employee("Petrov", "Petr", "Petrovich", 3, 300_000));
        printEmployees();
        System.out.println("Фонд заработной платы: " + countSalaryTotal());
        System.out.println("Сотрудник с минимальной заработной платой: " + findEmployeeSalaryMin());
        System.out.println("Сотрудник с максимальной заработной платой: " + findEmployeeSalaryMax());
        System.out.println("Средняя заработная плата: " + countAverageSalary());
        printFullNames();




    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public static float countSalaryTotal() {
        float sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee findEmployeeSalaryMin() {
        Employee result = null;
        float salaryMin = Float.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salaryMin) {
                salaryMin = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findEmployeeSalaryMax() {
        Employee result = null;
        float salaryMax = Float.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > salaryMax) {
                salaryMax = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float countAverageSalary() {
        int countRealEmployee = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                countRealEmployee++;
            }
        }
        return countSalaryTotal()/countRealEmployee;
    }

    public static void printFullNames() {
        for (Employee employee : employees) {
            if (employee !=null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    private static boolean addEmployee(Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return true;
            }
        }
        return false;
    }

}
