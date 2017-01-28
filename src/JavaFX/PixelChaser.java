package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

/**
 * Joonista ekraanile hunnik ristkülikuid, suvalistel positsioonidel. Ühe korra kastile klikates
 * muutub ta 2x väiksemaks. Teist korda klikates kaob ta sootuks.
 */
public class PixelChaser extends Application{
    public void start (Stage primaryStage) throws Exception {
        StackPane stack = new StackPane();
        Scene scene = new Scene(stack, 500, 500);
        primaryStage.setScene(scene);

        for (int i = 0; i < 100; i++) {

            int a = new Random().nextInt(150);
            int b = new Random().nextInt(150);
            Rectangle ristkülik = new Rectangle(a, b);
            int c = new Random().nextInt(400) - 200;
            int d = new Random().nextInt(400) - 200;
            ristkülik.setTranslateX(c);
            ristkülik.setTranslateY(d);

            primaryStage.show();

            stack.getChildren().addAll(ristkülik);

            ristkülik.setOnMouseClicked(event -> {
                ristkülik.setWidth(a/2);
                ristkülik.setHeight(b/2);
                ristkülik.setOnMouseClicked(event1 -> {
                    ristkülik.setWidth(0);
                    ristkülik.setHeight(0);
                });
            });
        }
    }

}
