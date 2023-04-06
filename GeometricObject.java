import java.util.Date;

public abstract class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject(){
        color = "black";
        filled = true;
        dateCreated = new Date();
    }

    protected GeometricObject(String color,Boolean filled){
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFillColor(){
        return filled;
    }

    public void setFillColor(boolean filled){
        this.filled = filled;
    }

    public Date getDateCreate(){
        return dateCreated;
    }
    
    public String toString(){
        return "Color : " + getColor() +"\nFill : " + isFillColor()+ "\nDate create : " + getDateCreate().toString();
    }

    public abstract double getArea();
    public abstract double getPerimeter();

}
