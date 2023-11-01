package com.tobeto.spring.workshop.b.controller;

import com.tobeto.spring.workshop.b.module.User;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/api/users") //Bu controllerın kontrol edeceği alt routeları tanımlamak
public class UsersController {
    List<User> items = new ArrayList<>();

    @PostConstruct
    public void initializeUsers(){
        items.add(new User(1,"Ahmet","ahmet@ahmet.com","ahmet123","5343572837"));
        items.add(new User(2,"Süleyman","suleyman@suleyman.com","suleyman123","5333572837"));
        items.add(new User(3,"Şeyhmus","seyhmus@seyhmus.com","seyhmus123","5343682837"));
        items.add(new User(4, "Mustafa", "mustafa@example.com", "mustafa123", "55551234"));
        items.add(new User(5, "Emine", "emine@example.com", "emine123", "55552345"));
        items.add(new User(6, "Zeynep", "zeynep@example.com", "zeynep123", "55563456"));
        items.add(new User(7, "Mehmet", "mehmet@example.com", "mehmet123", "55574567"));
        items.add(new User(8, "Ayşe", "ayse@example.com", "ayse123", "55585678"));
        items.add(new User(9, "Fırat", "firat@example.com", "firat123", "55596789"));
        items.add(new User(10, "Gül", "gul@example.com", "gul123", "55501010"));
    }

    @GetMapping("/getall")
    public List<User> getAllUsersSortedById() {
        return items.stream()
                .sorted(Comparator.comparingInt(User::getId))
                .collect(Collectors.toList());
    }
    @PostMapping("/add")
    public String createUser(@RequestBody User user){
        this.items.add(user);
        return user.getName() + " kullanıcı başarıyla eklendi.";
    }

    @PutMapping("/update/{id}")
    public String updateUser (@PathVariable int id, @RequestBody User updatedUser){
        for (User user : items) {
            if (user.getId() == id) {
                user.setName(updatedUser.getName());
                user.setEmail(updatedUser.getEmail());
                user.setPassword(updatedUser.getPassword());
                user.setPhone(updatedUser.getPhone());

                return user.getName() + " kullanıcı başarıyla güncellendi.";
            }

        }
        return  "Kullanıcı bulunamadı!";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        for (User user : items) {
            if (user.getId() == id) {
                items.remove(user);
                return user.getName() + " kullanıcı başarıyla silindi.";
            }
        }

        return "Kullanıcı bulunamadı.";
    }


}
