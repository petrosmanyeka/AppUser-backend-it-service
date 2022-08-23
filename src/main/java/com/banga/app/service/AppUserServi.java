package com.banga.app.service;

import com.banga.app.entity.AppUser;

import java.util.List;

public interface AppUserServi {
    AppUser saveTheUsers(AppUser appUser);

    List<AppUser> getUser();

   


    void deleteTheUser(Long id);

    AppUser getUserById(Long id);

    AppUser updateTheUserz(AppUser appUser, Long id);
}
