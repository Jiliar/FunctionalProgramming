package x_exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main (String[] args){
        List<Course> cursos = new ArrayList<>();
        cursos.add(new Course("Java Professional Course", 6.5f, 50, 200 ));
        cursos.add(new Course("Python Professional Course", 8.5f, 60, 800 ));
        cursos.add(new Course("DB Professional Course", 4.5f, 70, 700 ));
        cursos.add(new Course("Android Professional Course", 7.5f, 10, 400 ));
        cursos.add(new Course("Writting Professional Course", 1.5f, 10, 300 ));

        //Get count of courses with duration > 5 hours
        System.out.println("---------------------");
        Long cant1 = cursos.stream()
                            .filter(course -> course.getDuration() > 5)
                            .count();
        System.out.println(cant1);
        System.out.println("---------------------");

        //Get count of courses with duration < 2 hours
        Long cant2 = cursos.stream()
                            .filter(course -> course.getDuration() < 2)
                            .count();
        System.out.println(cant2);
        System.out.println("---------------------");

        //List the title of every courses with a count videos > 50
        cursos.stream()
                .filter(course -> course.getVideos() > 50)
                .forEach(course-> System.out.println(course.getTitle()));
        System.out.println("---------------------");

        //List the titles of three courses with higher duration
        Comparator<Course> comparator1 = Comparator.comparing(course1 -> course1.getDuration());
        cursos.stream()
                .sorted(comparator1.reversed())
                .limit(3)
                .forEach(course-> System.out.println(course.getTitle()));
        System.out.println("---------------------");

        //Show on console total duration from every courses
        Double total = cursos.stream()
                .mapToDouble(course -> course.getDuration())
                .sum();
        System.out.println(total);
        System.out.println("---------------------");

        //Show on console every courses higher to the average of duration courses
        cursos.stream()
                .filter(course -> course.getDuration() > cursos.stream()
                        .mapToDouble(aux -> aux.getDuration())
                        .average()
                        .getAsDouble())
                .forEach(course -> System.out.println(course.getTitle()));
        System.out.println("---------------------");

        //Show on console duration of courses with have quantity of inscribed students least to 500
        cursos.stream()
                .filter(course -> course.getStudents() < 500)
                .forEach(course-> System.out.println(course.getDuration()));
        System.out.println("---------------------");

        //Get course with higher duration
        Comparator<Course> comparator2 = Comparator.comparing(course1 -> course1.getDuration());
        cursos.stream()
                .sorted(comparator2.reversed())
                .limit(1)
                .forEach(course -> System.out.println(course.getTitle()));
        System.out.println("---------------------");

        //Make a String List with Every titles of courses
        List<String> strings = cursos.stream()
                                     .map(course -> course.getTitle())
                                     .collect(Collectors.toList());
        System.out.println(strings);
        System.out.println("---------------------");

    }

}
