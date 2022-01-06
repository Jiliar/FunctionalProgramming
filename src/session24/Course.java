package session24;

public class Course {

    private String title;
    private float duration; //Expresada en horas
    private int videos; //cantidad de vídeos
    private int students; //Cantidad de alumnos

    public Course(String title, float duration, int videos, int students) {
        this.title = title;
        this.duration = duration;
        this.videos = videos;
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public int getVideos() {
        return videos;
    }

    public void setVideos(int videos) {
        this.videos = videos;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }
}
