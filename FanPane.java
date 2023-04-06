import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class FanPane extends StackPane {
    private double angle = 15;
    private Timeline animation;
    private Pane blade = getBlade();
    private ObservableList<Node> list = blade.getChildren();

    public FanPane(){
        getChildren().addAll(getCircle(),blade);
        animation = new Timeline(new KeyFrame(Duration.millis(50), e-> spinFan()));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
    }

    protected void spinFan(){
        for (int i = 0 ; i < list.size();i++){
            Arc a = (Arc)list.get(i);
            a.setStartAngle(a.getStartAngle()+angle);
        }
    }

    public void pause(){
        animation.pause();
    }

    public void play(){
        animation.play();
    }

    protected void reverse(){
        angle *= -1;
    }

    public DoubleProperty speed(){
        return animation.rateProperty();
    }

    private Pane getBlade(){
        Pane pane = new Pane();
        double newAngle = 0;
        for (int i = 0;i < 4;i++){
            Arc arc = new Arc(125,115,90,90,newAngle + 90,50);
            arc.centerXProperty().bind(widthProperty().divide(2));
			arc.centerYProperty().bind(heightProperty().divide(2));
            arc.setFill(Color.BLACK);
            arc.setType(ArcType.ROUND);
            pane.getChildren().add(arc);
            newAngle += 90;
        }
        return pane;
    }

    private Circle getCircle(){
        Circle c = new Circle();
        c.setRadius(100);
        c.setStroke(Color.BLACK);
        c.setFill(Color.WHITE);
        return c;
    }
}
