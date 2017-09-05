package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Controller {
    public TextField num1;
    public TextField num2;
    public TextField result;

    public void calculate(ActionEvent actionEvent) {

        try {
            double num1=Double.parseDouble(this.num1.getText());
            double num2=Double.parseDouble(this.num1.getText());

            double result = num1 + num2;
            this.result.setText(String.valueOf(result));
        }
        catch (Exception e){
            this.result.setText("Error");
        }



    }
}
