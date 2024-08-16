package com.example.account.repo;

import com.example.account.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AccountRepo extends JpaRepository<Account,Long> {

    @Query(value = "select * from account where userid =:userid",nativeQuery = true)
    List<Account> findByUserid(@Param("userid") Long userid);



}
