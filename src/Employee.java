import java.util.Objects;

/**1. Создать класс Employee, который содержит информацию о Ф.И.О., отделе и зарплате сотрудника. Отделы для простоты должны быть названы от 1 до 5.
 2. Добавить статическую переменную-счетчик, которая будет отвечать за id.
 3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.*/

public class Employee {
    public int id;
    private static int counter = 0;
    private final String name;
    private int salary;
    private int department;

    public Employee(String name, int salary, int department) {
        this.name = name;
        this.salary = salary;
        this.department = validateDepartment(department);
        this.id = counter++;
    }
    /** Добавить возможность получать значения полей из Employee (геттеры) для всех полей. */

    public int getId() {

        return id;
    }
    public static int getCounter() {

        return counter;
    }
    public String getName() {

        return name;
    }
    public int getSalary() {

        return salary;
    }
    public int getDepartment() {
        return department;
    }
    /** Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).*/
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return
                "id:" + id +
                        "; Сотрудник " + name +
                        "; Зарплата " + salary +
                        "; Отдел " + department +
                        ';';
    }
    private int validateDepartment (int department){

        return department < 1 || department > 5 ? 1: department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && department == employee.department && name.equals(employee.name);
    }
    @Override
    public int hashCode() {

        return Objects.hash(id, name, salary, department);
    }
}
