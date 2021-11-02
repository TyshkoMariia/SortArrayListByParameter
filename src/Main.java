import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<FixedSalaryWorker> fixedSalaryWorkerList = new ArrayList<FixedSalaryWorker>();

        FixedSalaryWorker ann = new FixedSalaryWorker(1, "Ann", "Fisher", 3700);
        FixedSalaryWorker ben = new FixedSalaryWorker(2, "Ben", "Claud", 2650.25);
        FixedSalaryWorker lucie = new FixedSalaryWorker(3, "Lucie", "Tom", 4929.43);
        FixedSalaryWorker zet = new FixedSalaryWorker(4, "Zet", "Johnson", 7200.5);
        FixedSalaryWorker natan = new FixedSalaryWorker(5, "Natan", "Bread", 2650.25);
        FixedSalaryWorker owen = new FixedSalaryWorker(6, "Owen", "Settleberry",7200.5);
        FixedSalaryWorker piter = new FixedSalaryWorker(7, "Piter", "Pen", 8729.11);
        FixedSalaryWorker conan = new FixedSalaryWorker(8, "Conan", "Zigmund", 12730.3);
        FixedSalaryWorker den = new FixedSalaryWorker(9, "Den", "Martin", 15600.34);
        FixedSalaryWorker frank = new FixedSalaryWorker(10, "Frank", "Polo", 2650.25);

        fixedSalaryWorkerList.add(ann);
        fixedSalaryWorkerList.add(ben);
        fixedSalaryWorkerList.add(lucie);
        fixedSalaryWorkerList.add(zet);
        fixedSalaryWorkerList.add(natan);
        fixedSalaryWorkerList.add(owen);
        fixedSalaryWorkerList.add(piter);
        fixedSalaryWorkerList.add(conan);
        fixedSalaryWorkerList.add(den);
        fixedSalaryWorkerList.add(frank);

        Collections.sort(fixedSalaryWorkerList);/*, new Comparator() {

                public int compare(Object o1, Object o2) {

                Double salaryOne = ((FixedSalaryWorker) o1).getSalary();
                Double salaryTwo = ((FixedSalaryWorker) o2).getSalary();
                int salaryComparison = salaryOne.compareTo(salaryTwo);

                if (salaryComparison != 0) {
                    return salaryComparison;
                }

                String lastNameOne = ((FixedSalaryWorker) o1).getLastName();
                String lastNameTwo = ((FixedSalaryWorker) o2).getLastName();
                return lastNameOne.compareTo(lastNameTwo);
            }
        });*/

        System.out.println("Sorted list of fixed salary workers by salary and last name descending");
        System.out.println();
        fixedSalaryWorkerList.stream().forEach(result -> System.out.println(result));
        System.out.println();
        System.out.println("The first five workers from the list");
        for (int i=0; i< fixedSalaryWorkerList.size()-5; i++){
            System.out.println(fixedSalaryWorkerList.get(i));
        }

        System.out.println();
        System.out.println("The last three workers IDs from the list");

        for (int j=fixedSalaryWorkerList.size()-3; j<=fixedSalaryWorkerList.size()-1; j++){
            System.out.println(fixedSalaryWorkerList.get(j).getId());
        }
        System.out.println();

        //Hourly rate worker implementation

        System.out.println("Sorted list of hourly salary workers by salary and last name descending");
        System.out.println();

        HourlySalaryWorker calculateHourlySalary = new HourlySalaryWorker();
        List<HourlySalaryWorker> hourlySalaryWorkerList = new ArrayList<HourlySalaryWorker>();

        HourlySalaryWorker rob = new HourlySalaryWorker(20, "Rob", "Roy", calculateHourlySalary.getCalculatedSalary(6, 122.15));
        HourlySalaryWorker kalin = new HourlySalaryWorker(18, "Kalin", "Johnson",calculateHourlySalary.getCalculatedSalary(3, 140));
        HourlySalaryWorker melvin = new HourlySalaryWorker(19, "Melvin", "Prestly", calculateHourlySalary.getCalculatedSalary(6, 122.15));
        HourlySalaryWorker joshua = new HourlySalaryWorker(14, "Joshua", "Robinson", calculateHourlySalary.getCalculatedSalary(8, 240.56));
        HourlySalaryWorker emma = new HourlySalaryWorker(17, "Emma", "White", calculateHourlySalary.getCalculatedSalary(10, 122.15));
        HourlySalaryWorker lenny = new HourlySalaryWorker(11, "Lenny", "Krawitch",calculateHourlySalary.getCalculatedSalary(8, 240.56));
        HourlySalaryWorker orwell = new HourlySalaryWorker(13, "Orwell", "McKinley", calculateHourlySalary.getCalculatedSalary(8, 240.56));
        HourlySalaryWorker sunny = new HourlySalaryWorker(12, "Sunny", "Lane", calculateHourlySalary.getCalculatedSalary(10, 122.15));
        HourlySalaryWorker ronald = new HourlySalaryWorker(15, "Ronald", "Quack", calculateHourlySalary.getCalculatedSalary(10, 122.15));
        HourlySalaryWorker donald = new HourlySalaryWorker(16, "Donald", "Duck", calculateHourlySalary.getCalculatedSalary(6, 122.15));

        hourlySalaryWorkerList.add(rob);
        hourlySalaryWorkerList.add(kalin);
        hourlySalaryWorkerList.add(melvin);
        hourlySalaryWorkerList.add(joshua);
        hourlySalaryWorkerList.add(emma);
        hourlySalaryWorkerList.add(lenny);
        hourlySalaryWorkerList.add(orwell);
        hourlySalaryWorkerList.add(sunny);
        hourlySalaryWorkerList.add(ronald);
        hourlySalaryWorkerList.add(donald);

        Collections.sort(hourlySalaryWorkerList);

        hourlySalaryWorkerList.stream().forEach(result -> System.out.println(result));
    }
}