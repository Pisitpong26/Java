import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;


public class CarPane extends Pane {
    private double x = 0;
    private double y =100;
    private double raduis = 5;
    private Rectangle rectangle;
    private Polygon polygon;
    private Circle circle1;
    private Circle circle2;
    private Timeline animation;

    public CarPane(){
        drawCar();
        animation = new Timeline(new KeyFrame(javafx.util.Duration.millis(50), e -> moveCar()));        
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
    }

    public void drawCar(){
        getChildren().clear();
        rectangle = new Rectangle(x, y-20,50,10);
        polygon = new Polygon(x+10,y-20,x+20,y-30,x+30,
                y - 30,x+40,y-20);
        circle1 = new Circle(x+15,y-5,raduis);
        circle2 = new Circle(x+35,y-5,raduis);
        getChildren().addAll(rectangle,circle1,circle2,polygon);

    }   

    public void pause(){
        animation.pause();
    }

    public void play(){
        animation.play();
    }

    public void increaseSpeed(){
        animation.setRate(animation.getRate()+1);
    }

    public void decreaseSpeed(){
        if (animation.getRate() > 0){
            animation.setRate(animation.getRate()-1);}
        else if (animation.getRate() == 0){
            animation.setRate(0);
        }
    }

    protected void moveCar(){
        if (x <= getWidth()){
            x += 1;
        }
        else
            x = 0;
        drawCar();
    }

}
