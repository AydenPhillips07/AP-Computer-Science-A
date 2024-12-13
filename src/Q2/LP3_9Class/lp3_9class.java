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


    public lp3_9class(int bye, int bmo, int bda, int ye, int mo, int da){
        byear = bye;
        bmonth = bmo;
        bday = bda;
        year = ye;
        month = mo;
        day = da;
        alivedays = 0;
        sleeptime = 0;

    }
    public void calc(){
        alivedays = ((year * 365) + (month * 30) + day) - ((byear * 365) + (bmonth * 30) + bday);
        sleeptime = alivedays * 8;
    }

    public int getAlivedays() {return alivedays;}
    public int getSleeptime() {return sleeptime; }
}
