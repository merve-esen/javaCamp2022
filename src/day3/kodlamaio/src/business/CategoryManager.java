package day3.kodlamaio.src.business;

import day3.kodlamaio.src.dataAccess.CategoryDao;
import day3.kodlamaio.src.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;

	public CategoryManager(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}

	public void add(Category category) {
		if (this.categoryDao.existsByName(category.getName())){
			System.out.println("Bu isimde bir kayıt bulunmaktadır.");
			return;
		}

		this.categoryDao.add(category);
	}
}
