package Controllers;

import Model.DBConnect;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

//implements means that is a interface//
public class PhoneCreatorViewController implements Initializable {

    @FXML
    private ChoiceBox<String> makeChoiceBox;

    @FXML
    private ChoiceBox<String> osChoiceBox;

    @FXML
    private ChoiceBox<String> screenSizeChoiceBox;

    @FXML
    private ChoiceBox<String> memoryChoiceBox;

    @FXML
    private ChoiceBox<String> frontCameraChoiceBox;

    @FXML
    private ChoiceBox<String> rearCameraChoiceBox;

    @FXML
    private TextField ModelTextField;

    @FXML
    private TextField priceTextField;

    @FXML
    private Button saveButton;

        @Override
        public void initialize(URL location, ResourceBundle resources) {

            try {
                makeChoiceBox.getItems().addAll(DBConnect.getPhoneManufacturers());
                osChoiceBox.getItems().addAll(DBConnect.getOSs());
            } catch (SQLException e) {
                e.printStackTrace();
            }

            makeChoiceBox.getSelectionModel().selectedItemProperty().addListener(
                    //this is our custom listener code
                    (observable, oldValue, newValue) -> {
                        osChoiceBox.setValue(DBConnect.getOSForManufacturer(newValue));
                    }
            );
        }
    }
