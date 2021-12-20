package primetime.primetime;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ResultsController implements Initializable {
    private static final  String NAME = "src/main/java/primetime/primetime/PrimeTime.xlsx";

//
//    //ABC
//    ObservableList<String> ABCMondayShows = FXCollections.observableArrayList("Dancing with the Stars","Castle");
//    ObservableList<String> ABCTuesdayShows = FXCollections.observableArrayList("Marvels Agents of S.H.I.L.D.","The Goldbegrs","Trophy Wife","Lucky 7");
//    ObservableList<String> ABCWednesdayShows = FXCollections.observableArrayList("The Middle", "Back in the Game","Modern Family","Super Fun Night", "NashVille");
//    ObservableList<String> ABCThursdayShows = FXCollections.observableArrayList("Once Upon a Time in Wonderland", "Greys Anatomy","Scandal");
//    ObservableList<String> ABCFridayShows = FXCollections.observableArrayList("Last Man Standing","The Neighbors","Shark Tank", "20/20");
//    ObservableList<String> ABCSaturdayShows = FXCollections.observableArrayList("ABC Saturday Night College Football");
//    ObservableList<String> ABCSundayShows = FXCollections.observableArrayList("America's Funniest Home Videos", "Once Upon a Time", "Revenge","Betrayal");
//
//    //NBC
//    ObservableList<String> NBCMondayShows = FXCollections.observableArrayList("How I Met Your Mother", "We Are Men","2 Broke Girls","Mom","Hostages");
//    ObservableList<String> NBCTuesdayShows = FXCollections.observableArrayList("NCIS","NCIS: Los Angeles","Person of Interest");
//    ObservableList<String> NBCWednesdayShows = FXCollections.observableArrayList("Survivor", "Criminal Minds","CSI");
//    ObservableList<String> NBCThursdayShows = FXCollections.observableArrayList("Big Bang Theory", "The Millers","The Crazy Ones", "Two and a Half Men", "Elementary");
//    ObservableList<String> NBCFridayShows = FXCollections.observableArrayList("Undercover Boss","Hawaii Five-0","Blue Bloods");
//    ObservableList<String> NBCSaturdayShows = FXCollections.observableArrayList("ABC Saturday Night College Football");
//    ObservableList<String> NBCSundayShows = FXCollections.observableArrayList("America's Funniest Home Videos", "Once Upon a Time", "Revenge","Betrayal");
//

    public ResultsController() throws IOException {
    }

    public static void excelReader(){
        try {
           FileInputStream file = new FileInputStream(new File(NAME));
            XSSFWorkbook workbook =  new XSSFWorkbook(file);
            DataFormatter dataFormatter = new DataFormatter();
            XSSFSheet sheet = workbook.getSheetAt(0);



        } catch (Exception e) {
            e.printStackTrace();
        }
        }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        excelReader();

        if
    }
}
}
