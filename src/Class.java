public class Class {
    private int courseID;
    private String courseTitle;
    private String description;

    public Class() {
    }

    public Class(int courseID, String courseTitle, String description) {
        this.courseID = courseID;
        this.courseTitle = courseTitle;
        this.description = description;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
