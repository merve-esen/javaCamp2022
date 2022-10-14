package day3.kodlamaio.src.dataAccess;

import day3.kodlamaio.src.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile eklendi: " + category.getName());
	}

	@Override
	public boolean existsByName(String name) {
		return false;
	}

}
