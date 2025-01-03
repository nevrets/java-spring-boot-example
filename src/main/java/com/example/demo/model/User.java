package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity    // 엔티티 클래스임을 선언.
@Table(name = "users")    // 해당 엔티티 클래스와 mapping될 데이터베이스 테이블 이름을 지정.
public class User {
    @Id    // 엔티티 클래스의 주요 식별자(primary key)임을 선언.
    @GeneratedValue(strategy = GenerationType.IDENTITY)    // 엔티티의 식별자 값을 자동으로 생성.
    private Long id;

    @Column(nullable = false, unique = true, name = "user_name")
    private String name;

    @Column(nullable = false, name = "user_email")
    private String email;

    public User() {} // JPA를 위한 기본 생성자

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
    public Long getId() { 
        return id; 
    }

    public void setId(Long id) { 
        this.id = id; 
    }
    
    public String getName() { 
        return name; 
    }

    public void setName(String name) { 
        this.name = name; 
    }

    public String getEmail() { 
        return email; 
    }

    public void setEmail(String email) { 
        this.email = email; 
    }
    
    // // version getter/setter 추가
    // public Long getVersion() {
    //     return version;
    // }

    // public void setVersion(Long version) {
    //     this.version = version;
    // }

} 