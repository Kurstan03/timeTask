
public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {

        return second;
    }

    public void setSecond(int second) {

        this.second = second;
    }

    public int sum(){
        int sumHour = getHour() * 60 * 60, sumMinute = getMinute() * 60;
        int summa = sumHour + sumMinute + getSecond();
        return summa;
    }
    public String nextSecond() {
        String strHour = "";
        String strMinute = "";
        String strSecond = "";
        String result = "";
        int summa = sum();
        summa++;

        if (summa < 86400) {


            if (hour < 10) {
                strHour = "0";
            }
            if (minute < 10) {
                strMinute = "0";
            }
            if (second < 10) {
                strSecond = "0";
            }
            int hour = summa / 3600;
            int minute = summa % 3600 / 60;
            int second = summa % 3600 % 60;
            result = strHour + hour + ":" + strMinute + minute + ":" + strSecond + second;
        } else if (summa == 86400) {
            System.out.println("00:00:00");
        } else {
            System.out.println("Invalid time");
        }
        return result;
    }

    public String previousSecond() {
        String strHour = "";
        String strMinute = "";
        String strSecond = "";
        String result = "";
        int summa = sum();
        if (summa == 0) {
            System.out.println("23:59:59");
        } else {
            summa--;

            if (summa < 86400) {


                if (hour < 10) {
                    strHour = "0";
                }
                if (minute < 10) {
                    strMinute = "0";
                }
                if (second < 10) {
                    strSecond = "0";
                }
                int hour = summa / 3600;
                int minute = summa % 3600 / 60;
                int second = summa % 3600 % 60;
                result = strHour + hour + ":" + strMinute + minute + ":" + strSecond + second;
            } else if (summa == 86400) {
                System.out.println("00:00:00");
            } else {
                System.out.println("Invalid time");
            }
        }
        return result;
    }
}
