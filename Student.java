/**
 * Represents a student in the attendance system.
 * Stores student id and name.
 *
 * @author Durgesh
 * @version 1.0
 */

public class Student {

    private int id;
    private String name;

    /**
     * Constructor to initialize student
     * @param id student id
     * @param name student name
     */
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Returns student id
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Returns student name
     * @return name
     */
    public String getName() {
        return name;
    }
}