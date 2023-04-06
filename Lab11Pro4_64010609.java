import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab11Pro4_64010609 {
    public static void main(String[] args) {
    ArrayList<Double> assistant = new ArrayList<>();
    ArrayList<Double> associate = new ArrayList<>();
    ArrayList<Double> full = new ArrayList<>();

    try {
        File file = new File("salary.txt");
        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            String[] line = (input.nextLine()).split(" ");
            total(assistant, associate, full, line[2], Double.parseDouble(line[3]));
        }
    }
    catch (FileNotFoundException e) {
    System.out.println("wrong file path!!!");
    System.exit(0);
    }


    double totalAssistant = getTotal(assistant);
    double totalAssociate = getTotal(associate);
    double totalFull = getTotal(full);
    double totalFaculty = totalAssistant + totalAssociate + totalFull;

    System.out.println("Total Salary");
    System.out.printf("Assistant professor : %.2f\n", totalAssistant);
    System.out.printf("Associate professor : %.2f\n", totalAssociate);
    System.out.printf("Full professor : %.2f\n", totalFull);
    System.out.printf("All faculty : %.2f\n", totalFaculty);
    System.out.println("");
    System.out.println("Average salary");
    System.out.printf("Assistant professor : %.2f\n", totalAssistant / assistant.size());
    System.out.printf("Associate professor : %.2f\n", totalAssociate / associate.size());
    System.out.printf("Full professor : %.2f\n", totalFull / full.size());
    System.out.printf("All faculty : %.2f\n", totalFaculty/ (assistant.size() + associate.size() + full.size()));

    }

    public static double getTotal(ArrayList<Double> list){
        double total = 0;
        for (int i = 0 ; i < list.size() ; i++){
            total += list.get(i);
        }
        return total;
    }
    
    public static void total(ArrayList<Double> a, ArrayList<Double> b, ArrayList<Double> c, String rank, double salary) {
        if (rank.equals("assistant")){
            a.add(salary); 
        }
        else if (rank.equals("associate")){
            b.add(salary);
        }
        else if (rank.equals("full")){
            c.add(salary);
        }
    }

}
