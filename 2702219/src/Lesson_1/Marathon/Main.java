package Lesson_1.Marathon;

public class Main {
    public static void main(String[] args) {
        Course c = new Course(80, 2, 1, 120); // Создаем полосу препятствий
        Team team; // Создаем команду
        team = new Team("Боб", "Барсик", "Бобик");
        c.doIt(team.competitors, c.course); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты
    }
}