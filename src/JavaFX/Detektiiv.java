package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

/**
 * Tee JavaFXiga detektiivi mäng, kus kasutaja saab nähtamatuid ringe otsida.
 * 1. Ekraanil (näiteks 500x500) on suvalistes kohtades 3 ringi, mida näha ei ole.
 * 2. Hiirega ringile vastu minnes tuleb ring nähtavale.
 */
public class Detektiiv extends Application{
    public void start (Stage primaryStage) throws Exception {
        StackPane stack = new StackPane();
        Scene scene = new Scene( stack, 500,500);
        primaryStage.setScene(scene);

        for (int i =1; i< 4; i++){

            Circle ring = new Circle(50);
            int a = new Random().nextInt(400)-200;
            int b = new Random().nextInt(400)-200;
            ring.setTranslateX(a);
            ring.setTranslateY(b);
            ring.setFill(Color.TRANSPARENT);


            primaryStage.show();

            stack.getChildren().addAll(ring);

            ring.setOnMouseClicked(event -> {
                ring.setFill(Color.BLACK);
            });
        }
        

    }

}
