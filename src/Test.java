import java.util.Arrays;

public class Test {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees = new Employee[]{
                new Employee("Егоров Кирил Александрович", 25_600, 1),
                new Employee("Строков Андрей Иванович", 24_600, 1),
                new Employee("Ким Анна Дмитриевна", 27_600, 2),
                new Employee("Товт Дмитрий Михойлович", 25_800, 2),
                new Employee("Вяземская Елизавета Алексеевна", 29_200, 3),
                new Employee("Бекетова София Сергеевна", 29_600, 3),
                new Employee("Жуковская Людмила Степановна", 28_600, 4),
                new Employee("Ткачёв Степан Николаевич", 23_600, 4),
                new Employee("Коротков Николай Иванович", 26_600, 5),
                new Employee("Иавнов Пётр Васильевич", 24_800, 5),
        };
        employees[0] =  new Employee("Егоров Кирил Александрович", 25_600, 1);
        printEmployees();
        printCalculateTotalSalary();
        printFindEmployeeMinSalary();
        printFindEmployeeMaxSalary();
        printCalculateAverageValueOfSalaryes();
        printFullName();
    }

    private static void printCalculateAverageValueOfSalaryes() {
        System.out.println("Cреднее значение зарплат: " + calculateAverageValueOfSalaryes());
    }
    private static void printFindEmployeeMaxSalary() {
        System.out.println("Cотрудник с максимальной зарплатой: " + findEmployeeMaxSalary());
    }
    private static void printFindEmployeeMinSalary() {
        System.out.println("Cотрудник с минимальной зарплатой: " + findEmployeeMinSalary());
    }
    private static void printCalculateTotalSalary() {
        System.out.println("Сумма затрат на зарплаты в месяц: " + calculateTotalSalary());
    }

    /** Получить Ф. И. О. всех сотрудников (вывести в консоль).*/
    public static void printFullName() {
        for (Employee employee : employees){
            if (employee != null){
                System.out.println("Имя сотрудника: " + employee.getName());
            }
        }
    }
    public static void printEmployees(){
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println("Сотрудник: " + employee);
            }
        }
    }
    /**Посчитать сумму затрат на зарплаты в месяц.*/
    public static int calculateTotalSalary(){
        int sum =0;
        for (Employee employee : employees){
            if (employee != null){
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    /** Найти сотрудника с минимальной зарплатой. */
    public static Employee findEmployeeMinSalary(){
        Employee result = employees[0];
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : employees){
            if ( employee != null && employee.getSalary() < minSalary){
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    /** Найти сотрудника с максимальной зарплатой. */
    public static Employee findEmployeeMaxSalary(){
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees){
            if ( employee != null && employee.getSalary() > maxSalary){
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    /** Подсчитать среднее значение зарплат*/
    public static float calculateAverageValueOfSalaryes(){return calculateTotalSalary() / Employee.getCounter();}

}

