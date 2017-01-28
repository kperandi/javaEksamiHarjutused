package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

/**
 * Loo JavaFXis koristaja mäng.
 * 1. Ekraan (näiteks 500x500) on paksult ringe täis. Nii, et läbi ei näe.
 * 2. Ringile hiirega vastu minnes kaob ring ära.
 * 3. Ringide all on peidus sõnum (näiteks Labeliga), mida kasutaja lõpuks näeb.
 */
public class Koristaja extends Application {
    public void start (Stage primaryStage) throws Exception {
        StackPane stack = new StackPane();
        Scene scene = new Scene(stack, 500, 500);
        primaryStage.setScene(scene);

        Label sõnum = new Label("Tere, mina olen Kersti");
        stack.getChildren().addAll(sõnum);

        for (int i = 1; i < 100; i++) {

            Circle ring = new Circle(50);
            int a = new Random().nextInt(400) - 200;
            int b = new Random().nextInt(400) - 200;
            ring.setTranslateX(a);
            ring.setTranslateY(b);
            ring.setFill(Color.BLACK);


            primaryStage.show();

            stack.getChildren().addAll(ring);

            ring.setOnMouseClicked(event -> {
                ring.setRadius(0);
            });
        }
    }
}
