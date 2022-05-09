package net.codejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
