import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AttendanceService service = new AttendanceService();

        System.out.println("Attendance Manager Started");

        Subject java = new Subject("Java");

        java.markAttendance(true);
        java.markAttendance(false);
        java.markAttendance(true);

        service.addAttendance(1, java);

        service.showReport(1);

        Thread reportThread = new Thread(new ReportGenerator());
        reportThread.start();

        sc.close();
    }
}