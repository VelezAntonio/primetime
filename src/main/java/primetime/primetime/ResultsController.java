package primetime.primetime;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ResultsController extends  PrimeTimeSelectionController implements Initializable {
    @FXML private TableColumn<Show,String>colDay;
    @FXML private TableColumn<Show,String>colShow;
    @FXML private TableColumn<Show,String>colTime;
    @FXML private TableView<Show>showTbl;


    //ABC
    ObservableList<String> ABCMondayShows = FXCollections.observableArrayList("Dancing with the Stars","Castle");
    ObservableList<String> ABCTuesdayShows = FXCollections.observableArrayList("Marvels Agents of S.H.I.L.D.","The Goldbegrs","Trophy Wife","Lucky 7");
    ObservableList<String> ABCWednesdayShows = FXCollections.observableArrayList("The Middle", "Back in the Game","Modern Family","Super Fun Night", "NashVille");
    ObservableList<String> ABCThursdayShows = FXCollections.observableArrayList("Once Upon a Time in Wonderland", "Greys Anatomy","Scandal");
    ObservableList<String> ABCFridayShows = FXCollections.observableArrayList("Last Man Standing","The Neighbors","Shark Tank", "20/20");
    ObservableList<String> ABCSaturdayShows = FXCollections.observableArrayList("ABC Saturday Night College Football");
    ObservableList<String> ABCSundayShows = FXCollections.observableArrayList("America's Funniest Home Videos", "Once Upon a Time", "Revenge","Betrayal");

    //CBS
    ObservableList<String> CBSMondayShows = FXCollections.observableArrayList("How I Met Your Mother", "We Are Men","2 Broke Girls","Mom","Hostages");
    ObservableList<String> CBSTuesdayShows = FXCollections.observableArrayList("NCIS","NCIS: Los Angeles","Person of Interest");
    ObservableList<String> CBSWednesdayShows = FXCollections.observableArrayList("Survivor", "Criminal Minds","CSI");
    ObservableList<String> CBSThursdayShows = FXCollections.observableArrayList("Big Bang Theory", "The Millers","The Crazy Ones", "Two and a Half Men", "Elementary");
    ObservableList<String> CBSFridayShows = FXCollections.observableArrayList("Undercover Boss","Hawaii Five-0","Blue Bloods");
    ObservableList<String> CBSSaturdayShows = FXCollections.observableArrayList("Comedytime Saturday", "Comedytime Saturday", "Crimetime Saturday","48 Hours");
    ObservableList<String> CBSSundayShows = FXCollections.observableArrayList("60 Minutes", "Amazing Race", "The Good Wife","The Mentalist");

    //NBC
    ObservableList<String> NBCMondayShows = FXCollections.observableArrayList("The Voice","The Blacklist");
    ObservableList<String> NBCTuesdayShows = FXCollections.observableArrayList("The Biggest Loser", "The Voice","Chicago Fire");
    ObservableList<String> NBCWednesdayShows = FXCollections.observableArrayList("Revolution","Law & Order: SVU", "Ironside");
    ObservableList<String> NBCThursdayShows = FXCollections.observableArrayList("Parks & Recreation", "Welcome to the Family","Sean Saves the World","Micheal J.Fox Show",
            "Parenthood");
    ObservableList<String> NBCFridayShows = FXCollections.observableArrayList("Dateline NBC", "Grimm", "Dracula");
    ObservableList<String> NBCSaturdayShows = FXCollections.observableArrayList("Repeats","Repeats","Repeats");
    ObservableList<String> NBCSundayShows = FXCollections.observableArrayList("Football Night in America","NFL Sunday Night Football");

    //FOX
    ObservableList<String> FOXMondayShows = FXCollections.observableArrayList("Bones","Sleepy Hollow","Local");
    ObservableList<String> FOXTuesdayShows = FXCollections.observableArrayList("Dads", "Brooklyn Nine-Nine","New Girl", "Mindy Project","Local");
    ObservableList<String> FOXWednesdayShows = FXCollections.observableArrayList("The X Factor","Local");
    ObservableList<String> FOXThursdayShows = FXCollections.observableArrayList("The X Factor", "Glee", "Local");
    ObservableList<String> FOXFridayShows = FXCollections.observableArrayList("Junior Masterchef", "Sleepy Hollow (repeats)", "Local");
    ObservableList<String> FOXSaturdayShows = FXCollections.observableArrayList("Fox Sports Saturday","Local");
    ObservableList<String> FOXSundayShows = FXCollections.observableArrayList("NFL/The O.T.","The Simpsons", "Bob's Burgers","Family Guy","American Dad","Local");


    ObservableList<Show> ABCMondayShowList =FXCollections.observableArrayList(
            new Show("Dancing With The Stars", "Monday","8:00"));
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

            if (PrimeTimeSelectionController.day == "MONDAY" && PrimeTimeSelectionController.channel == null && PrimeTimeSelectionController.time == null){
                colDay.setCellValueFactory(new PropertyValueFactory<Show,String>("Day"));
                colShow.setCellValueFactory(new PropertyValueFactory<Show, String>("Show"));
                colTime.setCellValueFactory(new PropertyValueFactory<Show,String>("Time"));
                showTbl.setItems(ABCMondayShowList);


            }
            else if (day == "MONDAY" && channel == "ABC" && time == null){

                System.out.println("ERROR");
            }
            else {
                System.out.println("ERROR1");
            }

        }


}

