package School;

import com.company.Lesson;

/**
 * Created by Денис on 09/11/17.
 */
public class Teaher extends SchoolPerson{

    public void teah() {
        StringBuffer sb = new StringBuffer("Учитель: ");
        sb.append(name).append("\nПреподаёт:");
        for (Lesson lesson : lessonArray) {
            sb.append("\n").append(lesson.toString());
        }
        sb.append("\n");
        System.out.println(sb.toString());
    }



}
