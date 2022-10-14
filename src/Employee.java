public class Employee {
    private final String fullName;
    private int department;
    private int salary;
    private final int empId;
    private static int id;

    public Employee(String fullName, int department, int salary) {
        id++;
        this.empId = id;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getEmpId() {
        return this.empId;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void getEmpList() {
        System.out.println(this.empId);
    }

    public String toString() {
        return "id: " + empId + " ФИО: " + fullName + " Отдел: " + department + " Зарплата: " + salary;
    }
}
