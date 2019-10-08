
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JavaFXSliderExample extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label lblYear = new Label("Year");
        Label lblSelectedYear = new Label("2000");
        Slider sliderYear = new Slider(2000, 2019, 2000);
        sliderYear.setBlockIncrement(1000);

        // year slider change listener
        sliderYear.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                lblSelectedYear.setText(newValue.intValue() + "");
            }
        });

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(30);
        root.setVgap(10);

        // Adding all items to root GridPane
        root.addRow(2, lblYear, sliderYear, lblSelectedYear);

        // Add GridPane to Scene
        Scene scene = new Scene(root, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Slider Example");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
