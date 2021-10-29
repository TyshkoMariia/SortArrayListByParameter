import java.util.Comparator;

public class FixedSalaryWorker implements Comparable <FixedSalaryWorker>{

    private int id;
    private String name;
    private String lastName;
    private double salary;

    FixedSalaryWorker(int id, String name, String lastName, double salary){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getName (){
        return name;
    }

    public void setLastName (String lastName){
        this.lastName = lastName;
    }

    public String getLastName (){
        return lastName;
    }

    public void setId (int id){
        this.id = id;
    }

    public int getId (){
        return id;
    }

    public void setSalary (double salary){
        this.salary = salary;
    }

    public double getSalary () {
        return salary;
    }

    @Override
    public String toString() {
        return "[ id=" + id + ", name=" + name + ", Last Name=" + lastName + ", Salary="+ salary +"]";
    }

    @Override
    public int compareTo(FixedSalaryWorker workersTo) {
        if (this.salary == workersTo.getSalary()) {
            return 0;
        } else if (this.salary > workersTo.getSalary()) {
            return 1;
        } else {
            return -1;
        }
    }

}
