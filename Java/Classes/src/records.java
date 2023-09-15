import java.time.LocalDate;
import java.util.ArrayList;

public class records {
    private LocalDate date;
    private String sickness;
    private String procedure;
    private ArrayList<String> midicine;

    public records(LocalDate date, String sick, String procd, ArrayList<String> mdn) {
        this.date = date;
        this.sickness = sick;
        this.procedure = procd;
        this.midicine = mdn;
    }
}
