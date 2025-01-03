package com.example.demo.repository;

import java.util.Optional;
import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// 해당 인터페이스가 스프링의 데이터 접근 계층(Data Access Layer)의 컴포넌트임을 선언.
// 간단하게 말하자면 "레파지토리"를 의미
@Repository
// JpaRepository<User, Long> 인터페이스: 스프링 데이터 JPA에서 제공하는 CRUD 메서드를 상속받아 사용할 수 있는 인터페이스.
public interface UserRepository extends JpaRepository<User, Long> {

    // 데이터베이스에서 name 필드 값이 일치하는 User 엔티티 객체를 반환하는 메서드.
    Optional<User> findByName(String name);
} 