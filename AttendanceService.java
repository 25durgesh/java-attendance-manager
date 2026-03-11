import java.util.*;

/**
 * Handles attendance operations
 * @author Durgesh
 */
public class AttendanceService {

    private Map<Integer, List<Subject>> attendanceData = new HashMap<>();

    public void addAttendance(int studentId, Subject subject) {

        attendanceData.computeIfAbsent(studentId, k -> new ArrayList<>()).add(subject);
    }

    public void showReport(int studentId) {

        List<Subject> subjects = attendanceData.get(studentId);

        if(subjects == null){
            System.out.println("No record found");
            return;
        }

        for(Subject s : subjects){
            System.out.println("Attendance % : " + s.getPercentage());
        }
    }
}