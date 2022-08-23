package com.banga.app.control;

import com.banga.app.entity.AppUser;
import com.banga.app.service.AppUserServi;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@AllArgsConstructor
@NoArgsConstructor
public class AppUserContro {
    @Autowired
    private AppUserServi appUserServi;
    @PostMapping("/user")
    public AppUser saveTheUsers(@RequestBody AppUser appUser){
        return appUserServi. saveTheUsers(appUser);
    }
    @GetMapping
    public List<AppUser> getUsers(){
        return appUserServi.getUser();
    }
    @GetMapping("/may/{id}")
    public AppUser getId(@PathVariable("id") Long id){

        return appUserServi.getUserById(id);
    }
      @DeleteMapping("/{id}")
    public String deleteTheUser(@PathVariable("id") Long id){
        appUserServi.deleteTheUser(id);
        return "Succesfuly deleted";
      }

      @PutMapping("/{id}")
    public AppUser updateTheUser(@RequestBody AppUser appUser, @PathVariable("id") Long id){
        return appUserServi.updateTheUserz(appUser,id);

      }

}
