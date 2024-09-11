import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        EmployeeDirectory directory = new EmployeeDirectory();

        // Добавляем сотрудников
        directory.addEmployee(new Employee(1, "+1234567890", "Василий", 5));
        directory.addEmployee(new Employee(2, "+123456890", "Владимир", 5));
        directory.addEmployee(new Employee(3, "+0987654321", "Иван", 3));
        directory.addEmployee(new Employee(4, "+1234598765", "Петр", 2));
        directory.addEmployee(new Employee(5, "+1234598765", "Сидр", 2));

        // Ищем сотрудника по стажу
        List<Employee> employeesWith5YearsExperience = directory.findEmployeesByExperience(5);
        System.out.println("Сотрудники со стажем 5 лет: " + employeesWith5YearsExperience);

        // Ищем номера телефонов по имени
        List<String> phoneNumbers = directory.findPhoneNumbersByName("Петр");
        System.out.println("Номера телефонов: " + phoneNumbers);

        // Ищем сотрудника по табельному номеру
        Optional<Employee> employee = directory.findEmployeeById(1);
        employee.ifPresent(emp -> System.out.println("Найден сотрудник с табельным номером 1: " + emp.getName()));
    }
}