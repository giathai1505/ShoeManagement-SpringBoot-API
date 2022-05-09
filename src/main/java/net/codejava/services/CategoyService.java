package net.codejava.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.models.Category;
import net.codejava.repositories.CategoryRepository;

@Service
public class CategoyService {
	@Autowired
	private CategoryRepository repo;
	
	public List<Category> getAllCategorys()
	{
		return repo.findAll();
	}
	public void saveCategory(Category category) {
		repo.save(category);
	}
	public Category getCategoryById(Integer id) {
		return repo.findById(id).get();
	}
	public void deleteCategory(Integer id) {
		repo.deleteById(id);
	}

}
