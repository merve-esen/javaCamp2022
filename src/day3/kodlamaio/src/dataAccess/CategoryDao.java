package day3.kodlamaio.src.dataAccess;

import day3.kodlamaio.src.entities.Category;

public interface CategoryDao {
	void add(Category category);
	boolean existsByName(String name);
}