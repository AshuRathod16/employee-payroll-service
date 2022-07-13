package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollService {

    ArrayList<EmployeePayrollData> employeePayrollData = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    // Main Method
    public static void main(String[] args) {
        System.out.println("Welcome to employee payroll service");
        EmployeePayrollService employeePayroll = new EmployeePayrollService();
        employeePayroll.readData();
        employeePayroll.WriteData();

    }

    // Method to read data from console
    public void readData() {
        EmployeePayrollData employeePayroll = new EmployeePayrollData();
        System.out.println("Enter Employee Id:");
        employeePayroll.setId(scanner.nextInt());
        System.out.println("Enter Employee Name");
        employeePayroll.setName(scanner.next());
        System.out.println("Enter Employee Salary");
        employeePayroll.setSalary(scanner.nextDouble());
        employeePayrollData.add(employeePayroll);

    }

    // Method to write data
    public void WriteData() {
        System.out.println(employeePayrollData);
    }

}
