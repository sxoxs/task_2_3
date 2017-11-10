package School;

import com.company.Lesson;

import java.util.ArrayList;

/**
 * Created by Денис on 09/11/17.
 */
public class SchoolPerson {
    protected String name;
    protected ArrayList<Lesson> lessonArray = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addLesson (Lesson lesson) {
        lessonArray.add(lesson);
    }

    public void removeLesson (Lesson lesson){
        lessonArray.remove(lesson);
    }

}
