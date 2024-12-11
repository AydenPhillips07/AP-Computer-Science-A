package Q2.LP3_9Class;

public class lp3_9class {
    private int byear;
    private int bmonth;
    private int bday;
    private int year;
    private int month;
    private int day;
    private int alivedays;
    private int sleeptime;
    private int bytm;
    private int ytm;
    private int m;
    private int mtd;

    public lp3_9class(int byear, int bmonth, int bday, int year, int month, int day){
        byear = this.byear;
        bmonth = this.bmonth;
        bday = this.bday;
        year = this.year;
        month = this.month;
        day = this.day;
        alivedays = 0;
        sleeptime = 0;
        bytm = 0;
        ytm = 0;
        m = 0;
        mtd = 0;
    }
    public void calc(){
        bytm = byear * 12;
        ytm = year * 12;
        m = ytm - bytm;
        mtd = m * 30;

    }
}
