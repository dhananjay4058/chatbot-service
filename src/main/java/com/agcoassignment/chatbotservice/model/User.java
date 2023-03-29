package com.agcoassignment.chatbotservice.model;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor 
public class User {


    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String location;
    private Date createdAt;
    private Date updatedAt;

}
