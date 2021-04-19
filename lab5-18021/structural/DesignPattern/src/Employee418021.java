import java.util.ArrayList;
import java.util.List;
public class Employee418021 {
    private String name;
    private String dept;
    private int salary;
    private List<Employee418021> subordinates;
    public Employee418021(String name, String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee418021>();
    }
    public void add(Employee418021 e) {
        subordinates.add(e);
    }
    public void remove(Employee418021 e) {
        subordinates.remove(e);
    }
    public List<Employee418021> getSubordinates() {
        return subordinates;
    }
    public String toString() {
        return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary + " ]");
    }
}