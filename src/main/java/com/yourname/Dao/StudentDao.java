package com.yourname.Dao;

import com.yourname.Entity.Student;

import java.util.Collection;

/**
 * Created by ZBaimanov on 01.05.2018.
 */
public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void updateStudent(Student student);

    void removeStudentById(int id);

    void insertStudent(Student student);
}
