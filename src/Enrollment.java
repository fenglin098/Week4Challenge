import java.util.ArrayList;

public class Enrollment {
    private int enrollmentID;
    private ArrayList<Integer> enrolledSID;
    private ArrayList<Integer> enrolledFID;
    private int enrolledCID;
    private ArrayList<String> enrolledSDate;
    private ArrayList<String> enrolledFDate;

    public Enrollment() {
    }

    public Enrollment(int enrollmentID, ArrayList<Integer> enrolledSID, ArrayList<Integer> enrolledFID, int enrolledCID, ArrayList<String> enrolledSDate, ArrayList<String> enrolledFDate) {
        this.enrollmentID = enrollmentID;
        this.enrolledSID = enrolledSID;
        this.enrolledFID = enrolledFID;
        this.enrolledCID = enrolledCID;
        this.enrolledSDate = enrolledSDate;
        this.enrolledFDate = enrolledFDate;
    }

    public int getEnrollmentID() {
        return enrollmentID;
    }

    public void setEnrollmentID(int enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    public ArrayList<Integer> getEnrolledSID() {
        return enrolledSID;
    }

    public void setEnrolledSID(ArrayList<Integer> enrolledSID) {
        this.enrolledSID = enrolledSID;
    }

    public ArrayList<Integer> getEnrolledFID() {
        return enrolledFID;
    }

    public void setEnrolledFID(ArrayList<Integer> enrolledFID) {
        this.enrolledFID = enrolledFID;
    }

    public int getEnrolledCID() {
        return enrolledCID;
    }

    public void setEnrolledCID(int enrolledCID) {
        this.enrolledCID = enrolledCID;
    }

    public ArrayList<String> getEnrolledSDate() {
        return enrolledSDate;
    }

    public void setEnrolledSDate(ArrayList<String> enrolledSDate) {
        this.enrolledSDate = enrolledSDate;
    }

    public ArrayList<String> getEnrolledFDate() {
        return enrolledFDate;
    }

    public void setEnrolledFDate(ArrayList<String> enrolledFDate) {
        this.enrolledFDate = enrolledFDate;
    }
}
