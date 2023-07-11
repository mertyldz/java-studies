package service;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class LectureService {
    /**
     * private String name;
     * private Instructor instructor;
     * private Branch branch;
     * private int capacity;
     * private List<LectureScheduleTime> lectureScheduleTimeList;
     * private List<Student> studentList;
     *
     * @return
     */
    public Lecture createLecture(String name, Instructor instructor, Branch branch, int capactiy,
                                 List<LectureScheduleTime> lectureScheduleTimeList, List<Student> studentList) {
        Lecture lecture = new Lecture();
        lecture.setName(name);
        lecture.setInstructor(instructor);
        lecture.setBranch(branch);
        lecture.setCapacity(capactiy);
        lecture.setLectureScheduleTimeList(lectureScheduleTimeList);
        lecture.setStudentList(studentList);

        return lecture;
    }

    public void addLectureScheduleTime(Lecture lecture, LectureScheduleTime lectureScheduleTime) {
        if (lecture.getLectureScheduleTimeList() != null) {
            lecture.getLectureScheduleTimeList().add(lectureScheduleTime);
        } else {
            List<LectureScheduleTime> tmpList = new ArrayList<>();
            tmpList.add(lectureScheduleTime);
            lecture.setLectureScheduleTimeList(tmpList);
        }
    }

    public void addStudent(Lecture lecture, Student student) {
        if (lecture.getStudentList() != null) {
            lecture.getStudentList().add(student);
        } else {
            List<Student> tmpList = new ArrayList<>();
            tmpList.add(student);
            lecture.setStudentList(tmpList);
        }
    }
}
