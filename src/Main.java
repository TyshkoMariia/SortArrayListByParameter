import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<FixedSalaryWorker> fixedSalaryWorkerList = new ArrayList<FixedSalaryWorker>();

        FixedSalaryWorker ann = new FixedSalaryWorker(1, "Ann", "Fisher", 3700);
        FixedSalaryWorker ben = new FixedSalaryWorker(2, "Ben", "Claud", 2650.25);
        FixedSalaryWorker lucie = new FixedSalaryWorker(3, "Lucie", "Tom", 4929.43);
        FixedSalaryWorker zet = new FixedSalaryWorker(4, "Zet", "Johnson", 7200.5);
        FixedSalaryWorker natan = new FixedSalaryWorker(5, "Natan", "Bread", 6140.15);
        FixedSalaryWorker owen = new FixedSalaryWorker(6, "Owen", "Settleberry",7200.49);
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

        Collections.sort(fixedSalaryWorkerList);

        for(FixedSalaryWorker sortedList: fixedSalaryWorkerList){
            System.out.println(sortedList);
        }

    }
}