public class Lab1Pro2_64010609 {
    public static void main(String[] args) {
        double a = 3.4,b = 50.2,c = 2.1,d = 0.55,e = 44.5,f = 5.9;
        double x = (e*d-b*f)/(a*d-b*c);
        double y = (a*f-e*c)/(a*d-b*c);
        System.out.println(a+"x + " +b +"y = "+e);
        System.out.println(c+"x + " +d +"y = "+f);
        System.out.println("x = "+x);
        System.out.print("y = "+y);
    }
}
