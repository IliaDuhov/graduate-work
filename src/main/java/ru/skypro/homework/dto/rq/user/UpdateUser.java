package ru.skypro.homework.dto.rq.user;

import lombok.Data;

@Data
public class UpdateUser {
    private String firstName;
    private String lastName;
    private String phone;

}
