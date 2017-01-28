package JavaFX;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

/**
 * Joonista 500x500 ekraanile hunnikuga punaseid ringe.
 * Kui hiir ringile vastu läheb, muutub ring roheliseks.
 * Kordan - ring muudab värvi juba hiire puudutusest, mitte klikist.
 */
public class FooridUnenaos extends Application {
    public void start (Stage primaryStage) throws Exception {
        StackPane stack = new StackPane();
        Scene scene = new Scene( stack, 500,500);
        primaryStage.setScene(scene);

        for (int i =1; i< 10; i++){

            Circle ring = new Circle(50);
            int a = new Random().nextInt(400)-200;
            int b = new Random().nextInt(400)-200;
            ring.setTranslateX(a);
            ring.setTranslateY(b);
            ring.setFill(Color.RED);


            primaryStage.show();

            stack.getChildren().addAll(ring);

            ring.setOnMouseMoved(event -> {
                ring.setFill(Color.GREEN);
            });
        }


    }
}
