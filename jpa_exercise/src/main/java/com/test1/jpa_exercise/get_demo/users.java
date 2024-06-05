package com.test1.jpa_exercise.get_demo;

import jakarta.persistence.*;

@Entity
public class users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // 이 필드는 자동 증가하는 정수형 ID입니다.

    @Column(unique = true, nullable = false)
    private String username; // 유니크하고 NULL이 아닌 값을 갖습니다.

    private String comment; // 추가적인 설명을 저장할 수 있는 필드입니다.

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
