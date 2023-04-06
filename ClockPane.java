import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class ClockPane extends Pane{

    private int hour;
    private int minute;
    private int second;
    private boolean hourHandVisible;
    private boolean minuteHandVisible;
    private boolean secondHandVisible;

    private double w = 250, h= 250;

    public ClockPane(int hour,int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        hourHandVisible = minuteHandVisible = secondHandVisible = true;
        drawClock();
    }

    public void setHour(int hour){
        this.hour = hour;
        drawClock();
    }

    public int getHour(){
        return hour;
    }

    public void setMinute(int minute){
        this.minute = minute;
        drawClock();
    }

    public int getMinute(){
        return minute;
    }

    public void setSecond(int second) {
		this.second = second;
		drawClock();
	}

    public int getSecond() {
		return second;
	}

    public void setW (double w){
        this.w = w;
        drawClock();
    }

    public double getW(){
        return w;
    }

    public void setH(double h){
        this.h = h;
        drawClock();
    }

    public double getH(){
        return h;
    }

    public boolean isHourHandVisible() {
		return hourHandVisible;
	}

	public void setHourHandVisible(boolean hourHandVisible) {
		this.hourHandVisible = hourHandVisible;
		drawClock();
	}

	public boolean isMinuteHandVisible() {
		return minuteHandVisible;
	}

	public void setMinuteHandVisible(boolean minuteHandVisible) {
		this.minuteHandVisible = minuteHandVisible;
		drawClock(); 
	}

    public boolean isSecondHandVisible() {
		return secondHandVisible;
	}

	public void setSecondHandVisible(boolean secondHandVisible) {
		this.secondHandVisible = secondHandVisible;
		drawClock(); 
	}

    protected void drawClock(){

        double raduis = Math.min(w,h) * 0.8 * 0.5;
        double centerX = w/2;
        double centerY = h/2;

        Circle circle = new Circle(centerX,centerY,raduis);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        Text t1 = new Text(centerX - 5,centerY - raduis + 12,"12");
        Text t2 = new Text(centerX - raduis + 3,centerY + 5,"9");
        Text t3 = new Text(centerX + raduis - 10,centerY +3,"3");
        Text t4 = new Text(centerX - 3,centerY + raduis - 3,"6");

        double sLength = raduis * 0.8;
		double secondX = centerX + sLength *
			Math.sin(second * (2 * Math.PI / 60));
		double secondY = centerY - sLength *
			Math.cos(second * (2 * Math.PI / 60));
		Line sLine = new Line(centerX, centerY, secondX, secondY);
		sLine.setStroke(Color.RED);

        double mLength = raduis * 0.65;
		double xMinute = centerX + mLength *
			Math.sin(minute * (2 * Math.PI / 60));
		double minuteY = centerY - mLength *
			Math.cos(minute * (2 * Math.PI / 60));
		Line mLine = new Line(centerX, centerY, xMinute, minuteY);
		mLine.setStroke(Color.BLUE);
 
		double hLength = raduis * 0.5;
		double hourX = centerX + hLength *
			Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
		double hourY = centerY - hLength * 
			Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
		Line hLine = new Line(centerX, centerY, hourX, hourY);
		hLine.setStroke(Color.GREEN);

        getChildren().clear();
        getChildren().addAll(circle,t1,t2,t3,t4);

        if (secondHandVisible){
			getChildren().add(sLine);
        }
        if (minuteHandVisible){
			getChildren().add(mLine);
        }
        if (hourHandVisible){
            getChildren().add(hLine);
        }

        
    }

}
