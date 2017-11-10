package School;

import com.company.Lesson;

/**
 * Created by Денис on 09/11/17.
 */
public class Student extends SchoolPerson {

    public void learn() {
        StringBuffer sb = new StringBuffer("Студент: ");
        sb.append(name).append("\nИзучает:");
        for (Lesson lesson : lessonArray) {
            sb.append("\n").append(lesson.toString());
        }
        sb.append("\n");
        System.out.println(sb.toString());
    }
}
