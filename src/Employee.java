import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.WordUtils;

import java.util.Objects;

public class Employee {
    private  String employeeName;
    private int department;
    private int salary;
    private static int idCounter = 0;
    private final int id;

    public Employee() {
        this.id = ++idCounter;
    }

    public Employee(String employeeName, int department, int salary) {
        if (StringUtils.isAnyEmpty(employeeName) || StringUtils.containsAny(employeeName, "1234567890")) {
            throw new ExceptionBadRequest();
        } else {
            this.employeeName = WordUtils.capitalizeFully(employeeName, ' ');
        }
        this.department = department;
        this.salary = salary;
        this.id = ++idCounter;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() { return salary;}

    public int getId() { return id; }


    public static int getIdCounter() {
        return idCounter;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Ф.И.О. сотрудника: " + employeeName  +
                ", отдел: " + department +
                ", заработаная плата - " + salary +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && id == employee.id && employeeName.equals(employee.employeeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeName, department, salary, id);
    }





}
