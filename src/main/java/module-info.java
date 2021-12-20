module primetime.primetime {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.poi.poi;
    requires org.apache.poi.ooxml;


    opens primetime.primetime to javafx.fxml;
    exports primetime.primetime;
}