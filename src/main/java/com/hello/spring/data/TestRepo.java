package com.hello.spring.data;

import com.hello.spring.data.models.Student;
import com.hello.spring.data.models.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepo extends JpaRepository<Test, Integer> {

}
