import java.util.Comparator;

public class FixedSalaryWorker implements Comparable {

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
    public double compareTo(FixedSalaryWorker comparestu) {
        double compareSalary = ((FixedSalaryWorker) comparestu).getSalary();
        /* For Ascending order*/
        return this.salary - compareSalary;
    }

    @Override
    public String toString() {
        return "[ id=" + id + ", name=" + name + ", Last Name=" + lastName + ", Salary="+ salary +"]";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
