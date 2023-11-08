package com.tienthanh.cruddemo.dao;

import com.tienthanh.cruddemo.entity.Course;
import com.tienthanh.cruddemo.entity.Instructor;
import com.tienthanh.cruddemo.entity.InstructorDetail;

import java.util.List;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);

    List<Course> findCoursesByInstructorId(int theId);

    Instructor findInstructorByIdJoinFetch(int theId);

    void update(Instructor tempInstructor);

    void update(Course tempCourse);

    Course findCourseById(int theId);


    void save(Course theCourse);

    Course findCourseAndReviewsByCourseId(int theId);

    void deleteCourseById(int theId);

    Course findCourseAndStudentsByCourseId(int theId);






}