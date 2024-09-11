import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Реализация справочника сотрудников
class EmployeeDirectory implements EmployeeInterface {
    private List<Employee> employees;

    public EmployeeDirectory() {
        this.employees = new ArrayList<>();
    }

    // Метод добавления нового сотрудника
    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Метод поиска сотрудников по стажу
    @Override
    public List<Employee> findEmployeesByExperience(int experience) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getExperience() == experience) {
                result.add(employee);
            }
        }
        return result;
    }

    // Метод поиска номеров телефона по имени сотрудника
    @Override
    public List<String> findPhoneNumbersByName(String name) {
        List<String> phoneNumbers = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                phoneNumbers.add(employee.getPhoneNumber());
            }
        }
        return phoneNumbers;
    }

    // Метод поиска сотрудника по табельному номеру
    @Override
    public Optional<Employee> findEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return Optional.of(employee);
            }
        }
        return Optional.empty();
    }
}