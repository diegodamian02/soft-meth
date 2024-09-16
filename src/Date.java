/*
Software Methodology - Fall 2024
@Diego Damian dad405 - section 01
@Jimena Reyes --- - section 01
*/

import java.util.*;

public class Date implements Comparable<Date>{
    private int year;
    private int month;
    private int day;
    public boolean isValid(){

        //check if the date is a valid calendar date
        return true;
    }

    @Override
    public int compareTo(Date o) {
        return 0;
    }
}
