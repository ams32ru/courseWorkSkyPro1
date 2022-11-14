import java.util.stream.Stream;

public  class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        EmployeeBook.employees[0] = new Employee("бирюков евгений евгеньевич", 1, 23234);
        EmployeeBook.employees[1] = new Employee("Дылдин Алексей Валерьевич", 1, 46866);
        EmployeeBook.employees[2] = new Employee("Угаров Виктор Михайлович", 2, 36478);
        EmployeeBook.employees[3] = new Employee("Карсева Полина Алексеевна", 2, 25987);
        EmployeeBook.employees[4] = new Employee("Апоян Давид Сасунович", 3, 56987);
        EmployeeBook.employees[5] = new Employee("Логинова Галина Васильевна", 3, 33852);
        EmployeeBook.employees[6] = new Employee("Рыбас Роман Владиславович ", 4, 78654);
        EmployeeBook.employees[7] = new Employee("Беляев Михаил Викторович", 4, 85642);
        EmployeeBook.employees[8] = new Employee("Шутова Марина Витальевна", 5, 55666);
        EmployeeBook.employees[9] = new Employee("Оленников Михаил Константинович", 5, 34568);



//
        EmployeeBook.printEmployee(EmployeeBook.employees);
//        EmployeeBook.printListEmployee(EmployeeBook.employees);
//        EmployeeBook.totalSalary(EmployeeBook.employees);
//        EmployeeBook.minSalary(EmployeeBook.employees);
//        EmployeeBook.maxSalary(EmployeeBook.employees);
//        EmployeeBook.averageSalary(EmployeeBook.employees);
  }

}