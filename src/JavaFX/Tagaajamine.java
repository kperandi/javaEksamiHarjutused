package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

/**
 * Joonista 500x500 ekraanile ring. Kui hiir ringile vastu läheb, leiab ring omale
 * uue koha. Ei pea animeerima ega midagi fäänsit. Lihtsalt ilmub uues kohas ja kõik.
 * Ehk hiirega saab ringi taga ajada. Kordan - ring leiab uue koha juba hiire puudutusest,
 * mitte klikist. Aga alustada võid muidugi klikist.
 */
public class Tagaajamine extends Application{
    public void start (Stage primaryStage) throws Exception {
        StackPane stack = new StackPane();
        Scene scene = new Scene( stack, 500,500);
        primaryStage.setScene(scene);

        Circle ring = new Circle(50);
        int a = new Random().nextInt(400)-200;
        int b = new Random().nextInt(400)-200;
        ring.setTranslateX(a);
        ring.setTranslateY(b);
        ring.setFill(Color.BLACK);


        primaryStage.show();

        stack.getChildren().addAll(ring);

        ring.setOnMouseMoved(event -> {
            int c = new Random().nextInt(400)-200;
            int d = new Random().nextInt(400)-200;
            ring.setTranslateX(c);
            ring.setTranslateY(d);

            });
        }


    }
