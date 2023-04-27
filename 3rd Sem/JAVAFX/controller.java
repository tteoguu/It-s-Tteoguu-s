import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class controller {
    
    @FXML

    private Circle myCircle;

    private double y;

    public void up(ActionEvent event) {
        myCircle.setCenterY( y = y - 20);
    }
    public void down(ActionEvent event) {
        myCircle.setCenterY( y = y + 20);
    }
    public void left(ActionEvent event) {
        myCircle.setCenterX( y = y - 20);
    }
    public void right(ActionEvent event) {
        myCircle.setCenterX( y = y + 20);
    }

}
