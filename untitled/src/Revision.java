import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Revision {
    private String date;
    private int lack;
    private int overstatement;

    public Revision(String date, int lack, int overstatement) {
        this.date = date;
        this.lack = lack;
        this.overstatement = overstatement;
    }

    public void info() {
        System.out.println("Дата останньої ревізії: " + date);
        System.out.println("Недостача: " + lack);
        System.out.println("Перезбуток: " + overstatement);
    }

    public static String nextRevision() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_MONTH, 7);
        String nextDate = dateFormat.format(calendar.getTime());
        return nextDate;
    }

    // Геттери та сеттери
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getLack() {
        return lack;
    }

    public void setLack(int lack) {
        this.lack = lack;
    }

    public int getOverstatement() {
        return overstatement;
    }

    public void setOverstatement(int overstatement) {
        this.overstatement = overstatement;
    }
}
