import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public  class EmployeeBook extends Employee {
    public static Employee employees[] = new Employee[10];



    public void setPersons() {
        employees[0] = new Employee("бирюков Евгений Евгеньевич", 1, 23234);
        employees[1] = new Employee("Дылдин Алексей Валерьевич", 1, 46866);
        employees[2] = new Employee("Угаров Виктор Михайлович", 2, 36478);
        employees[3] = new Employee("Карсева Полина Алексеевна", 2, 25987);
        employees[4] = new Employee("Апоян Давид Сасунович", 3, 56987);
        employees[5] = new Employee("Логинова Галина Васильевна", 3, 33852);
        employees[6] = new Employee("Рыбас Роман Владиславович ", 4, 78654);
        employees[7] = new Employee("Беляев Михаил Викторович", 4, 85642);
        employees[8] = new Employee("Шутова Марина Витальевна", 5, 55666);
        employees[9] = new Employee("Оленников Михаил Константинович ", 5, 34568);

    }



    //метод для получения списка всех сотрудников со всеми данными
    public static void printEmployee(Employee[] employee) {
        for (Employee employee1 : employee) {
            if (employee1 != null) {
                System.out.println(employee1.toString());
            }
        }
    }
    //метод для получения списка сотрудников в формате Ф.И.О.
    public static void printListEmployee(Employee[] employee) {
        for (Employee employee1 : employee) {
            if (employee1 != null) {
                System.out.println(employee1.getEmployeeName());
            }
        }
    }



    //сумма затрат за месяц
    public static void totalSalary(Employee[] employee) {
        int totalSalary = 0;
        for (Employee sal :
                employee) {
            totalSalary += sal.getSalary();
        }
        System.out.println("Сумма затрат на заработаную плату: " +
                totalSalary);
    }

    //Минимальная зарплата
    public static void minSalary(Employee[] employee) {
        int minSalary = Integer.MAX_VALUE;
        String minSalaryEmployee = "";
        for (Employee i :
                employee) {
            if (i.getSalary() < minSalary)
                minSalary = i.getSalary();
            if (minSalary == i.getSalary()) {
                minSalaryEmployee = i.getEmployeeName();
            }
        }
        System.out.println("Минимальная зарплата в " + minSalary + " рублей, у сотрудника - " +
                minSalaryEmployee);
    }

    //    Максимальная зарплата
    public static void maxSalary(Employee[] employee) {
        int maxSalary = Integer.MIN_VALUE;
        String maxSalaryEmployee = "";
        for (Employee i :
                employee) {
            if (i.getSalary() > maxSalary)
                maxSalary = i.getSalary();
            if (maxSalary == i.getSalary()) {
                maxSalaryEmployee = i.getEmployeeName();
            }
        }
        System.out.println("Максимальная зарплата: " + maxSalary + " рублей, у сотрудника " + maxSalaryEmployee);
    }

    public static void averageSalary(Employee[] employee) {
        int averSalary = 0;
        for (Employee sal :
                employee) {
            averSalary += sal.getSalary();
        }
        averSalary /= employee.length;
        System.out.println("Среднее значение зарплат составила " + averSalary);
    }
}
