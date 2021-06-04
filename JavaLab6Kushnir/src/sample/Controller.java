package sample;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField aField;

    @FXML
    private TextField bField;

    @FXML
    private TextField cField;

    @FXML
    private Button changeButton;

    @FXML
    private Label labelRes;

    @FXML
    private Button monthButton;

    @FXML
    private TextField monthField;

    @FXML
    private Label monthLabel;

    @FXML
    void ChangeButtonClick(MouseEvent event) {

            labelRes.setText("A = " + bField.getText() + " | B = " + cField.getText() + " | C = " + aField.getText());

    }

    @FXML
    void monthButtonClick(MouseEvent event) {
        try
        {
            int index = Integer.parseInt(monthField.getText());
            switch (index)
            {
                case 1: monthLabel.setText("Січень"); break;
                case 2: monthLabel.setText("Лютий"); break;
                case 3: monthLabel.setText("Березень"); break;
                case 4: monthLabel.setText("Квітень"); break;
                case 5: monthLabel.setText("Травень"); break;
                case 6: monthLabel.setText("Червень"); break;
                case 7: monthLabel.setText("Липень"); break;
                case 8: monthLabel.setText("Серпень"); break;
                case 9: monthLabel.setText("Вересень"); break;
                case 10: monthLabel.setText("Жовтень"); break;
                case 11: monthLabel.setText("Листопад"); break;
                case 12: monthLabel.setText("Грудень"); break;
                default: monthLabel.setText("Не вірні дані");break;
            }
        }
        catch (NumberFormatException e)
        {
            monthLabel.setText("///Помилка///");
        }
    }
    @FXML
    void initialize() {

    }
}
