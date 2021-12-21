package primetime.primetime;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
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

    public String radioSelected(ActionEvent e){
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
        return channel;
    }

    public String daySelected(ActionEvent e){
        if (dayCB.getSelectionModel().getSelectedItem() == "MONDAY"){
            day = "MONDAY";
        }
        else if (dayCB.getSelectionModel().getSelectedItem() == "TUESDAY"){
            day = "TUESDAY";
        }
        else if (dayCB.getSelectionModel().getSelectedItem() == "WEDNESDAY"){
            day = "WEDNESDAY";
        }
        else if (dayCB.getSelectionModel().getSelectedItem() == "THURSDAY"){
            day = "THURSDAY";
        }
        else if (dayCB.getSelectionModel().getSelectedItem() == "FRIDAY"){
            day = "FRIDAY";
        }
        else if (dayCB.getSelectionModel().getSelectedItem() == "SATURDAY"){
            day = "SATURDAY";
        }
        else if (dayCB.getSelectionModel().getSelectedItem() == "SUNDAY"){
            day = "SUNDAY";
        }
        else{
            day = null;
        }
        return day;
    }

    public String timeSelected(ActionEvent e){
        if (timeCB.getSelectionModel().getSelectedItem()=="7:00"){
            time="7:00";
        }
        else if (timeCB.getSelectionModel().getSelectedItem() == "7:30"){
            time = "7:30";
        }
        else if (timeCB.getSelectionModel().getSelectedItem() == "8:00"){
            time = "8:00";
        }
        else if (timeCB.getSelectionModel().getSelectedItem() == "8:30"){
            time = "8:30";
        }
        else if (timeCB.getSelectionModel().getSelectedItem() == "9:00"){
            time = "9:00";
        }
        else if (timeCB.getSelectionModel().getSelectedItem() == "9:30"){
            time = "9:30";
        }
        else if (timeCB.getSelectionModel().getSelectedItem() == "10:00"){
            time = "10:00";
        }
        else if (timeCB.getSelectionModel().getSelectedItem() == "10:30"){
            time = "10:30";
        }
        else {
            time = null;
        }
        return time;
    }

    public void submitBtnOnAction(ActionEvent e) throws IOException {
        results();

    }

    private void results() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PrimeTimeApp.class.getResource("Results.fxml"));
        Stage resultsStage = new Stage();
        Scene resultsScene = new Scene(fxmlLoader.load(),600,600);
        resultsStage.setScene(resultsScene);
        resultsStage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> days = FXCollections.observableArrayList("MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY");
        ObservableList<String> times = FXCollections.observableArrayList("7:00","7:30","8:00","8:30","9:00","9:30","10:00","10:30");

        timeCB.setItems(times);
        dayCB.setItems(days);
    }



}