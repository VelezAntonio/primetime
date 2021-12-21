package primetime.primetime;

public class Show {
    private String Show;
    private String Day;
    private String Time;

    public Show(String show, String day, String time) {
        Show = show;
        Day = day;
        Time = time;
    }

    public String getShow() {
        return Show;
    }

    public String getDay() {
        return Day;
    }

    public String getTime() {
        return Time;
    }

    public String getName() {
        return Show;
    }
}
