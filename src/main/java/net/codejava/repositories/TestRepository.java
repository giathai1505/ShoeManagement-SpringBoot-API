package net.codejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.models.Test;

public interface TestRepository extends JpaRepository<Test, Integer>{

}
