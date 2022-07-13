package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static com.bridgelabz.EmployeePayrollService.IOService.FILE_IO;

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
        employeePayrollService.writeEmployeePayrollData(FILE_IO);
        employeePayrollService.countEntries(FILE_IO);
        long entries = employeePayrollService.countEntries(FILE_IO);
        Assert.assertEquals(3, entries);
    }
}
