package com.tobeto.spring.workshop.b.module;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    public int id;
    public String name;
    public String email;
    public String password;
    public String phone;


}
