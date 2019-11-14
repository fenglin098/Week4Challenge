public class Enrollment {
    private int enrollmentID;
    private int enrolledSID;
    private int enrolledFID;
    private int enrolledCID;
    private String enrolledDate;

    public Enrollment() {
    }

    public Enrollment(int enrollmentID, int enrolledSID, int enrolledFID, int enrolledCID, String enrolledDate) {
        this.enrollmentID = enrollmentID;
        this.enrolledSID = enrolledSID;
        this.enrolledFID = enrolledFID;
        this.enrolledCID = enrolledCID;
        this.enrolledDate = enrolledDate;
    }

    public int getEnrollmentID() {
        return enrollmentID;
    }

    public void setEnrollmentID(int enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    public int getEnrolledSID() {
        return enrolledSID;
    }

    public void setEnrolledSID(int enrolledSID) {
        this.enrolledSID = enrolledSID;
    }

    public int getEnrolledFID() {
        return enrolledFID;
    }

    public void setEnrolledFID(int enrolledFID) {
        this.enrolledFID = enrolledFID;
    }

    public int getEnrolledCID() {
        return enrolledCID;
    }

    public void setEnrolledCID(int enrolledCID) {
        this.enrolledCID = enrolledCID;
    }

    public String getEnrolledDate() {
        return enrolledDate;
    }

    public void setEnrolledDate(String enrolledDate) {
        this.enrolledDate = enrolledDate;
    }
}
