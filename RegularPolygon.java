public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;
    RegularPolygon(){
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }
    RegularPolygon(int newN,double newSide){
        if (newN>=3){
        n = newN;
        }
        else {System.out.println("n must more than 2");}

        if (newSide>0){
            side = newSide;
        }
        else {System.out.println("side must more than 0");}
        
        x = 0;
        y = 0;
    }
    RegularPolygon(int newN,double newSide,double newX,double newY){
        if (newN>=3){
        n = newN;
        }
        else {System.out.println("n must more than 2");}
        
        if (newSide>0){
            side = newSide;
        }
        else {System.out.println("side must more than 0");}

        x = newX;
        y = newY;
    }

    public void setN(int newN){
        if (newN>=3){
            n = newN;
            }
        else {System.out.println("n must more than 2");
        }
    }

    public int getN(){
        return n;
    }

    public void setSide(Double newSide){
        if (newSide>0){
            side = newSide;
        }
        else {System.out.println("side must more than 0");}
    }

    public double getSide(){
        return side;
    }

    public void setX(Double newX){
        x = newX;
    }

    public double getX(){
        return x;
    }

    public void setY(Double newY){
        y= newY;
    }

    public double getY(){
        return y;
    }

    public double getPerimeter(){
        return n*side;
    }

    public double getArea(){
        return (n*side*side)/(4*Math.tan(Math.PI/n));
    }
}
