package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public enum IOService {CONSOLE_IO, FILE_IO, DB_IO, REST_ID}

    private List<EmployeePayrollData> employeePayrollList;

    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    // Main Method
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Payroll Problem");
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        Scanner scanner = new Scanner(System.in);
        employeePayrollService.readEmployeePayRollData(scanner);
        employeePayrollService.writeEmployeePayrollData(IOService.CONSOLE_IO);
    }

    // Method to read data from console
    public void readEmployeePayRollData(Scanner scanner) {
        System.out.println("Enter employee id");
        int id = scanner.nextInt();
        System.out.println("Enter employee name");
        String name = scanner.next();
        System.out.println("Employee salary");
        double salary = scanner.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id, name, salary));

    }

    // method to write data
    public void writeEmployeePayrollData(IOService ioService) {
        if (ioService.equals(IOService.CONSOLE_IO))
            System.out.println("\n Writing Employee Payroll Data \n" + employeePayrollList);
        else if (ioService.equals(IOService.FILE_IO))
            new EmployeePayrollFileIOService().writeData(employeePayrollList);
    }

    // Method to count no of entries
    public long countEntries(IOService ioService) {
        if (ioService.equals(IOService.FILE_IO))
            return new EmployeePayrollFileIOService().countEntries();
        return 0;
    }

    // Method to print data
    public void printData(IOService ioService) {
        if (ioService.equals(IOService.FILE_IO)) {
            new EmployeePayrollFileIOService().printData();
        }
    }
}
