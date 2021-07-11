package com.bridgelabz;

public class EmployeePayrollData {

    public int id;
    public String name;
    public double salary;

    public EmployeePayrollData(Integer id, String name, Double salary) { }

    @Override
    public String toString() {
        return "EmployeePayrollData {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
