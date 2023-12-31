package com.GouthamPeddi.Mappings.repository;

import com.GouthamPeddi.Mappings.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends JpaRepository<Student,Long> {
    Student findByStudentId(Long sId);
}
