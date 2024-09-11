
// Класс для хранения информации о сотруднике
class Employee {
    private int id;
    private String phoneNumber;
    private String name;
    private int experience;

    public Employee(int id, String phoneNumber, String name, int experience) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Сотрудник: " +
                "табельный = " + id +
                ", name = '" + name + '\'' +
                ", phoneNumber = '" + phoneNumber + '\'' +
                ", стаж = " + experience +
                ';';
    }
}
