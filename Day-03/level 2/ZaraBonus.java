import java.util.Scanner;

public class ZaraBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] old_salary = new double[10];

        double[] year_of_service = new double[10];

        int index=0;

        while(index<10){
            System.out.println("Enter year of service :");
            double yoe = sc.nextDouble();
            System.out.println("Enter current salary :");
            double salary = sc.nextDouble();
            
            if(yoe>=0&&salary>=0){
                old_salary[index] = salary;
                year_of_service[index] = yoe;
                index++;
            }
            else System.out.println("Invalid Input");

        }

        double[] bonus = new double[10];
        
        for(int i=0;i<10;i++){
            if(year_of_service[i]>5)bonus[i] = 0.05;
            else bonus[i] = 0.02;
        }

        double[] new_salary = new double[10];

        for(int i=0;i<10;i++){
            new_salary[i] = old_salary[i]*(bonus[i]+(double)1);
        }

        for(int i=0;i<10;i++){
            System.out.println("Old Salary of Employee "+(i+1)+" is "+old_salary[i]+" new salary is "+new_salary[i]);
        }

    }
}
