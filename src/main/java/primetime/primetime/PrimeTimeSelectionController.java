package primetime.primetime;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.time.LocalTime;
import java.util.ResourceBundle;

public class PrimeTimeSelectionController implements Initializable {

    @FXML
    private RadioButton abcRB;

    @FXML
    private RadioButton cbsRB;

    @FXML
    private RadioButton foxRB;

    @FXML
    private RadioButton nbcRB;

    @FXML
    private RadioButton allRB;

    @FXML
    private RadioButton

    @FXML
    private ComboBox<String> dayCB;


    @FXML
    private Button submitBtn;

    @FXML
    private ToggleGroup choicesTG;

    @FXML
    private ComboBox<String> timeCB;

    protected static String day;
    protected static String time;
    protected static String channel;

    public void radioSelected(ActionEvent e){
        if(e.getSource()==abcRB){
            channel = "ABC";
        }
        else if(e.getSource()==cbsRB){
            channel = "CBS";
        }
        else if(e.getSource()==nbcRB){
            channel = "NBC";
        }
        else if (e.getSource()==foxRB){
            channel = "FOX";
        }
        else if (e.getSource()==allRB){
            channel = "ALL";
        }
        else{
            channel = null;
        }
    }

    public void daySelected(ActionEvent e){
        if (dayCB.getSelecte)
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> days = FXCollections.observableArrayList("MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY");
        ObservableList<String> times = FXCollections.observableArrayList("7:00","7:30","8:00","8:30","9:00","9:30","10:00","10:30");

        timeCB.setItems(times);
        dayCB.setItems(days);
    }



}