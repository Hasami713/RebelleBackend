package com.example.rebellebackend.repositories;

import com.example.rebellebackend.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
