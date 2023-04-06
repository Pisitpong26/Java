public class BMI {
    private String name;
    private int age;
    private double weight;
    private double feet;
    private double inches;

    public BMI(String name,int age,double weight,double feet,double inches){
        this.name = name;

        if (age > 0){
            this.age  = age;
        }
        else { System.out.println("Error please enter age more than 0");}

        if (weight > 0){
            this.weight = weight;
        }
        else {System.out.println("Error please enter weight more than 0");}

        if (feet > 0){
            this.feet = feet;
        }
        else {System.out.println("Error please enter feet more than 0");}
        
        if (inches > 0 && inches < 12){
            this.inches = inches;
        }
        else {System.out.println("Error please enter inches more than 0");}
        
    }

    public double getBMI(double weight,double inches){
        double newBMI = 0;
        if (age > 0 && weight > 0 && feet > 0 && inches > 0 && inches < 12){
        newBMI = (weight*0.45359237)/(((inches+feet*12)*0.0254)*((inches+feet*12)*0.0254));}
        else {newBMI = 0;}
        return newBMI;
    }

    public String getInterpretation(double newBMI){
        String interpretation = "";

        if (newBMI > 0){
            if (newBMI < 18.5){
                interpretation = "Underweight";
            }
            else if (newBMI >= 18.5 && newBMI < 25.0){
                interpretation = "Normal";
            }
            else if (newBMI >= 25.0 && newBMI < 30.0){
                interpretation = "Overweight";
            }
            else {interpretation = "Obese";}
        }
        else {interpretation = "Error";}

        return interpretation;

    }
}
