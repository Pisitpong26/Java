public class Lab8Pro2_64010609 {
    public static void main(String[] args) {
        GeometricObject[] square = {new Square(-4),new Square(5),new Square(5.5),new Square(10),new Square(10.1)};

        for(int i = 0;i< square.length;i++){
            System.out.println(square[i].toString());
            ((Square)square[i]).howToColor();
            System.out.println();
        }
    }
}
