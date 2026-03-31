package flc.service;

import flc.model.*;

import java.util.ArrayList;
import java.util.List;

public class TimeTableService {
    private List<Lesson> lessons = new ArrayList<>();

    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
    }

    public List<Lesson> getAllLessons() { return lessons; }

    public Lesson getLessonById(int id) {
        return lessons.stream().filter(l -> l.getId() == id).findFirst().orElse(null);
    }

    public List<Lesson> getByDay(DayType day) {
        List<Lesson> list = new ArrayList<>();
        for (Lesson l : lessons)
            if (l.getDay() == day) list.add(l);
        return list;
    }

    public List<Lesson> getByType(ExerciseType type) {
        List<Lesson> list = new ArrayList<>();
        for (Lesson l : lessons)
            if (l.getType() == type) list.add(l);
        return list;
    }
}