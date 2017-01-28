package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt alguse ja lõpu x-y kordinaadid ning joonista talle joon.
 * Akna võime limiteerida 500x500 piksli peale.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Joon extends Application {
    public void start (Stage primaryStage) throws Exception {
        StackPane stack = new StackPane();
        Scene scene = new Scene(stack, 500, 500);
        primaryStage.setScene(scene);

        TextField xa = new TextField();
        xa.setPromptText("Alguse x-koordinaat");
        TextField ya = new TextField();
        ya.setPromptText("Alguse y-koordinaat");
        TextField xl = new TextField();
        xl.setPromptText("Lõpu x-koordinaat");
        TextField yl = new TextField();
        yl.setPromptText("Lõpu y-koordinaat");
        Button joonista = new Button("Joonista");

        xa.setTranslateY(-200);
        ya.setTranslateY(-160);
        xl.setTranslateY(-120);
        yl.setTranslateY(-80);
        joonista.setTranslateY(-40);

        primaryStage.show();
        stack.getChildren().addAll(xa, ya, xl, yl, joonista);


        joonista.setOnAction(event -> {
            int Xalg = Integer.parseInt(xa.getText());
            int Yalg = Integer.parseInt(ya.getText());
            int Xlopp = Integer.parseInt(xl.getText());
            int Ylopp = Integer.parseInt(yl.getText());

            stack.getChildren().removeAll(xa, ya, xl, yl, joonista);

            Line joon = new Line();
            joon.setStartX(Xalg);
            joon.setStartY(Yalg);
            joon.setEndX(Xlopp);
            joon.setEndY(Ylopp);

            stack.getChildren().addAll(joon);
        });

    }

}
