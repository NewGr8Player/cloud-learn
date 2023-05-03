package com.xavier.config.client.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Table("test_user")
public class UserEntity {
    @Id
    private int userId;
    private String userName;
    private int age;
    private String address;
}
