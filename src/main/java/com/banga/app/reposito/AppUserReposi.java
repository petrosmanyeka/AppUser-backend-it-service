package com.banga.app.reposito;

import com.banga.app.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserReposi extends JpaRepository<AppUser,Long> {
}
