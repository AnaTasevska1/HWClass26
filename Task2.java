package HWClass26;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<String, Double> emplSalary = new HashMap<>();

        emplSalary.put("Niko Nikic", 2000.0);
        emplSalary.put("Mila Milic", 8000.0);
        emplSalary.put("Nala Savic", 11000.0);
        emplSalary.put("Riko Rikic", 13000.0);

        String hPEmployee = "";
        double highestSalary = 0.0;

        for (Map.Entry<String, Double> entry : emplSalary.entrySet()) {
            String employeeName = entry.getKey();
            double salary = entry.getValue();

            if (salary > highestSalary) {
                highestSalary = salary;
                hPEmployee = employeeName;
            }
        }
        System.out.println(hPEmployee+"=$"+highestSalary);
    }
}

/*
Create a Map that will store Employee name and salary.
Write a logic to retrieve an employee who gets the highest salary.
Output should be in the below format:
John Smith=$100000
 */
