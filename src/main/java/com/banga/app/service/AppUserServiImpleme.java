package com.banga.app.service;

import com.banga.app.entity.AppUser;
import com.banga.app.reposito.AppUserReposi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class AppUserServiImpleme  implements AppUserServi{
    @Autowired
    private AppUserReposi appUserReposi;

    @Override
    public AppUser saveTheUsers(AppUser appUser) {
        return appUserReposi.save(appUser);
    }

    @Override
    public List<AppUser> getUser() {
        return appUserReposi.findAll();
    }



    @Override
    public void deleteTheUser(Long id) {
        appUserReposi.deleteById(id);
    }

    @Override
    public AppUser getUserById(Long id) {
        return appUserReposi.findById(id).get();
    }

    @Override
    public AppUser updateTheUserz(AppUser appUser, Long id) {
        AppUser dept = appUserReposi.findById(id).get();

        if(Objects.nonNull(appUser.getFirstName()) && !"".equalsIgnoreCase(appUser.getFirstName())){
            dept.setFirstName(appUser.getFirstName());
        }

        if(Objects.nonNull(appUser.getLastName()) && !"".equalsIgnoreCase(appUser.getLastName())){
            dept.setLastName(appUser.getLastName());
        }
        if(Objects.nonNull(appUser.getEmail()) && !"".equalsIgnoreCase(appUser.getEmail())) {
            dept.setEmail(appUser.getEmail());
        }
        if (Objects.nonNull(appUser.getPassword()) && !"".equalsIgnoreCase(appUser.getPassword())){
            dept.setPassword(appUser.getPassword());
        }

        return appUserReposi.save(appUser);
    }


}
