package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

public class EmployeePayrollServiceTest {
    @Test
    public void given3EmployeeWhenWrittenToFileShouldMatchEmployeeEntries() {
        EmployeePayrollData[] arrayOfEmp = {
                new EmployeePayrollData(1, "Ashu", 10000),
                new EmployeePayrollData(2, "Vishu", 20000),
                new EmployeePayrollData(3, "Akanksha", 30000),
        };
        EmployeePayrollService employeePayrollService;
        employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmp));
        employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
        employeePayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
        long entries = employeePayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
        Assert.assertEquals(3, entries);
        employeePayrollService.printData(EmployeePayrollService.IOService.FILE_IO);
    }
}
