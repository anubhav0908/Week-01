import java.util.Random;

public class EmployeeBonus {

    // Method to generate salary and years of service for employees
    public static double[][] generateEmployeeData(int numEmployees) {
        Random rand = new Random();
        double[][] employeeData = new double[numEmployees][2]; // 2D array to store salary and years of service
        
        for (int i = 0; i < numEmployees; i++) {
            // Random salary between 10000 and 99999
            employeeData[i][0] = 10000 + rand.nextInt(90000);
            // Random years of service between 1 and 15 years
            employeeData[i][1] = 1 + rand.nextInt(15);
        }
        
        return employeeData;
    }

    // Method to calculate the bonus and new salary
    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3]; // 2D array to store old salary, new salary, and bonus
        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonus = 0;

            // Determine the bonus based on years of service
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05; // 5% bonus
            } else {
                bonus = oldSalary * 0.02; // 2% bonus
            }

            // Calculate new salary
            double newSalary = oldSalary + bonus;

            // Store old salary, new salary, and bonus
            updatedData[i][0] = oldSalary;
            updatedData[i][1] = newSalary;
            updatedData[i][2] = bonus;
        }
        
        return updatedData;
    }

    // Method to calculate total sum of old salaries, new salaries, and total bonus
    public static double[] calculateTotalAmount(double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
        
        for (int i = 0; i < updatedData.length; i++) {
            totalOldSalary += updatedData[i][0];
            totalNewSalary += updatedData[i][1];
            totalBonus += updatedData[i][2];
        }
        
        return new double[]{totalOldSalary, totalNewSalary, totalBonus};
    }

    // Method to display the results in tabular format
    public static void displayResults(double[][] updatedData, double[] totals) {
        System.out.println("------------------------------------------------------");
        System.out.println("Employee No. | Old Salary | New Salary | Bonus Amount");
        System.out.println("------------------------------------------------------");
        
        for (int i = 0; i < updatedData.length; i++) {
            System.out.printf("%12d | %10.2f | %10.2f | %12.2f\n", i + 1, updatedData[i][0], updatedData[i][1], updatedData[i][2]);
        }
        
        System.out.println("------------------------------------------------------");
        System.out.printf("Total Amount  | %.2f | %.2f | %.2f\n", totals[0], totals[1], totals[2]);
        System.out.println("------------------------------------------------------");
    }

    public static void main(String[] args) {
        int numEmployees = 10; // Number of employees
        
        // Generate employee data: salary and years of service
        double[][] employeeData = generateEmployeeData(numEmployees);
        
        // Calculate bonus and new salary for each employee
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
        
        // Calculate the total old salary, new salary, and total bonus amount
        double[] totals = calculateTotalAmount(updatedData);
        
        // Display the results
        displayResults(updatedData, totals);
    }
}
