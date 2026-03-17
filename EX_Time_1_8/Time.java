package EX_Time_1_8;

public class Time {

    private int hour;
    private int minute;
    private int second;

    // Constructor
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Getter
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // Setter
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    // Set toàn bộ thời gian
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Tăng 1 giây
    public Time nextSecond() {
        second++;

        if (second == 60) {
            second = 0;
            minute++;

            if (minute == 60) {
                minute = 0;
                hour++;

                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    // Lùi 1 giây
    public Time previousSecond() {
        second--;

        if (second < 0) {
            second = 59;
            minute--;

            if (minute < 0) {
                minute = 59;
                hour--;

                if (hour < 0) {
                    hour = 23;
                }
            }
        }
        return this;
    }

    // Format hh:mm:ss
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}