package com.mugi;

import java.util.ArrayList;
import java.util.List;

/**
 * @Student Mugi
 */
public class TempDb {


    public static List<Student> getStudentsFromTempDb() {
        return new ArrayList<Student>() {
            {
                add(Student.newBuilder().setStudentId(1).setCourseId(1).setFirstName("Charles").setLastName("Dickens").setGender("male").build());
                add(Student.newBuilder().setStudentId(2).setFirstName("William").setLastName("Shakespeare").setGender("male").build());
                add(Student.newBuilder().setStudentId(3).setFirstName("JK").setLastName("Rowling").setGender("female").build());
                add(Student.newBuilder().setStudentId(4).setFirstName("Virginia").setLastName("Woolf").setGender("female").build());
            }
        };
    }

    public static List<Course> getCoursesFromTempDb() {
        return new ArrayList<Course>() {
            {
                add(Course.newBuilder().setCourseId(1).setStudentId(1).setName("MATHEMATICS").build());
                add(Course.newBuilder().setCourseId(2).setStudentId(1).setName("KISWAHILI").build());
                add(Course.newBuilder().setCourseId(3).setStudentId(2).setName("ENGLISH").build());
                add(Course.newBuilder().setCourseId(4).setStudentId(3).setName("KIKUYU").build());
                add(Course.newBuilder().setCourseId(5).setStudentId(3).setName("LUO").build());
                add(Course.newBuilder().setCourseId(6).setStudentId(4).setName("KALENJIN").build());
            }
        };
    }
}
