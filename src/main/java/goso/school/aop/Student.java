package goso.school.aop;

public class Student {
    String name;
    int course;
    double avgBall;

    public Student(String name, int course, double avgBall) {
        this.name = name;
        this.course = course;
        this.avgBall = avgBall;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", avgBall=" + avgBall +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgBall() {
        return avgBall;
    }

    public void setAvgBall(double avgBall) {
        this.avgBall = avgBall;
    }
}
