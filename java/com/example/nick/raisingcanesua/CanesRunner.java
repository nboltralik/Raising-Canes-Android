package com.example.nick.raisingcanesua;

/**
 * Created by Nick Boltralik on 2/15/2016.
 */


public class CanesRunner {

    public String output;
    public double hours;
    public int day;
    public double mins;
    public boolean isCanesOpen=false;
    public String schedule;

    public CanesRunner(int day_a, double hours_a, double mins_a)
    {
        super();
        day=day_a;
        hours=hours_a;
        mins=mins_a;
        hours+=mins/60;

        switch (day)
        {
            case 1:
                schedule="12:00 AM - 2:00 AM\n4:00 PM - 12:00 AM";
                if (hours<=2 || (hours>=16 && hours<24))
                    isCanesOpen=true;
                break;
            case 2:
                schedule="10:30 AM - 11:00 PM";
                if (hours>=10.5 && hours<=23)
                    isCanesOpen=true;
                break;
            case 3:
                schedule="10:30 AM - 11:00 PM";
                if (hours>=10.5 && hours<=23)
                    isCanesOpen=true;
                break;
            case 4:
                schedule="10:30 AM - 11:00 PM";
                if (hours>=10.5 && hours<=23)
                    isCanesOpen=true;
                break;
            case 5:
                schedule="10:30 AM - 2:00 AM";
                if (hours>=10.5 && hours<=24)
                    isCanesOpen=true;
                break;
            case 6:
                schedule="12:00 AM - 2:00 AM\n10:30 AM - 2:00 AM";
                if (hours<=2 || (hours>=10.5 && hours<=24))
                    isCanesOpen=true;
                break;
            case 7:
                schedule="12:00 AM - 2:00 AM\n10:30 AM - 2:00 AM";
                if (hours<=2 || (hours>=10.5 && hours<=24))
                    isCanesOpen=true;
                break;
            default:
                isCanesOpen=false;
        }

        if (!(isCanesOpen))
            output="Cane's is closed, no chicken for you";
        else
            output="Cane's is open, go get your fried chicken";

    }

    public String getOutput(){
        return output;
    }

    public double getTime() {
        return hours;
    }

    public int getDay() {
        return day;
    }

    public boolean isOpen() {
        return isCanesOpen;
    }

    public String getSchedule() {
        return schedule;
    }
}
