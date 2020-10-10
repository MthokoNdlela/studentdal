package com.mthoko.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.mthoko.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
