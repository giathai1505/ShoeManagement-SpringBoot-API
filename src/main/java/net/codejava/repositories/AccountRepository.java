package net.codejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.models.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
