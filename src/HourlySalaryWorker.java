public class HourlySalaryWorker implements Comparable <HourlySalaryWorker> {

    private int id;
    private String name;
    private String lastName;
    private double perHourSalary;

    //private int amountOfHours;

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

    public double getCalculatedSalary(int amountOfHours, double ratePerHour) {
        double perHourSalary = ratePerHour * amountOfHours * 21;
        return perHourSalary;
        //System.out.println(perHourSalary);
    }

    HourlySalaryWorker(){

    };

    HourlySalaryWorker(int id, String name, String lastName, double perHourSalary) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.perHourSalary = perHourSalary;
    }

    @Override
    public String toString() {
        return "[ id=" + id + ", name=" + name + ", Last Name=" + lastName + ", Salary="+ perHourSalary +"]";
    }

    @Override
    public int compareTo(HourlySalaryWorker workersTo) {
        if (this.perHourSalary == workersTo.perHourSalary) {
            return this.lastName.compareTo(workersTo.lastName);
        } else if (this.perHourSalary > workersTo.perHourSalary) {
            return 1;
        } else {
            return -1;
        }
    }

}
