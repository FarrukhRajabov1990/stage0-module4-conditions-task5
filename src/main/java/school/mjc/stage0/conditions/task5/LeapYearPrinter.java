package school.mjc.stage0.conditions.task5;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        switch (year) {
            case 2000:
            case 2004:
            case 2008:
            case 2012:
            case 2016:
            case 2020:
            case 2024:
                System.out.println("leap");
                break;
            default:
                System.out.println("not leap");
                break;
        }
    }
}
