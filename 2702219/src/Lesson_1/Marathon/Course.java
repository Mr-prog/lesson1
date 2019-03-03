package Lesson_1.Marathon;

public class Course {
    Obstacle[] course;
    public Course(int _length, int _height, int _height2, int _length2) {
        Obstacle[] _course = {new Cross(80), new Wall(2), new Wall(1), new Cross(120)};
        course = _course;
    }

    public void doIt(Competitor[] competitors, Obstacle[] course) {
        for (Competitor c : competitors) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
        for (Competitor c : competitors) {
            c.info();
        }
    }

}
