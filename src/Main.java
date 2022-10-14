import java.util.Arrays;

public class Main {
    public static Employee[] empStore = new Employee[10];

    public static void main(String[] args) {
        empStore[0]= new Employee("Name1 Surname1 Patronymic1",1,100000);
        empStore[1] = new Employee("Name2 Surname2 Patronymic2",2,120000);
        empStore[2] = new Employee("Name3 Surname3 Patronymic3",5,190000);
        empStore[3] = new Employee("Name4 Surname4 Patronymic4",4,170000);
        empStore[4] = new Employee("Name5 Surname5 Patronymic5",3,150000);
        printEmpList(empStore);
        System.out.println("Сумма затрат на зарплаты в месяц: " + salaryCosts(empStore) + " рублей.");
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalaryEmp(empStore).toString());
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalaryEmp(empStore).toString());
        System.out.println("Среднее значение зарплат: " + averageSalary(empStore));
        printFullName(empStore);
    }

    // Получить список всех сотрудников со всеми имеющимися по ним данными
    public static void printEmpList(Employee[] empList){
        for (int i = 0; i < empList.length; i++){
            if (empList[i] != null) {
                System.out.println(empList[i].toString());
            }
        }
    }

    // Посчитать сумму затрат на зарплаты в месяц
    public static int salaryCosts(Employee[] empList) {
        int totalSalary = 0;
        for (int i = 0; i < empList.length; i++) {
            if (empList[i] != null) {
                totalSalary = totalSalary + empList[i].getSalary();
            }
        }
        return totalSalary;
    }

    // Найти сотрудника с минимальной зарплатой
    public static Employee minSalaryEmp(Employee[] empList) {
        Employee employeeWithMinSalary = null;
        for (Employee employee : empList) {
            if (employee != null) {
                if (employeeWithMinSalary == null
                        || employeeWithMinSalary.getSalary() > employee.getSalary()) {
                    employeeWithMinSalary = employee;
                }
            }
        }
        return employeeWithMinSalary;
    }
    // Найти сотрудника с максимальной зарплатой
    public static Employee maxSalaryEmp(Employee[] empList) {
        Employee employeeWithMaxSalary = null;
        for (Employee employee : empList) {
            if (employee != null) {
                if (employeeWithMaxSalary == null
                        || employeeWithMaxSalary.getSalary() < employee.getSalary()) {
                    employeeWithMaxSalary = employee;
                }
            }
        }
        return employeeWithMaxSalary;
    }

    // Подсчитать среднее значение зарплат
    public static int averageSalary(Employee[] empList) {
        int totalSalary = 0;
        int totalCnt = 0;
        for (int i = 0; i < empList.length; i++) {
            if (empList[i] != null) {
                totalSalary = totalSalary + empList[i].getSalary();
                totalCnt++;
            }
        }
        return totalSalary/totalCnt;
    }

    // Получить Ф. И. О. всех сотрудников
    public static void printFullName(Employee[] empList) {
        for (int i = 0; i < empList.length; i++){
            if (empList[i] != null) {
                System.out.println(empList[i].getFullName());
            }
        }
    }
}