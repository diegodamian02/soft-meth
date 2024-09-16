/*
Software Methodology - Fall 2024
@Diego Damian dad405 - section 01
@Jimena Reyes --- - section 01
*/

public class Appointment implements Comparable <Appointment> {
    private Date date;
    private Timeslot timeslot;
    private Profile patient;
    private Provider provider;

    @Override
    public int compareTo(Appointment o) {
        return 0;
    }
}
