/**
 * Represents a subject and attendance details.
 */

public class Subject {

    private String subjectName;
    private int present;
    private int total;

    public Subject(String subjectName) {
        this.subjectName = subjectName;
        this.present = 0;
        this.total = 0;
    }

    /**
     * Marks attendance for a student
     * @param status true if present
     */
    public void markAttendance(boolean status) {
        total++;
        if(status) {
            present++;
        }
    }

    /**
     * Calculates attendance percentage
     */
    public double getPercentage() {
        return (present * 100.0) / total;
    }
}