package lesson12;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class IdCard {
    InfoWorker infoWorker = new InfoWorker();
    public String numCard;
    LocalDate dataAddIdCard;
    boolean sign;
    ArrayList<AllReport> reports = new ArrayList<>();
}
