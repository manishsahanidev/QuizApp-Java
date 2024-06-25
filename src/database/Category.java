package database;

public class Category {
	
	private int category_Id;
	private String categoryName;
	
	public int getCategory_Id() {
		return category_Id;
	}
	
	public String getCategoryName() {
		return categoryName;
	}

	public Category(int category_Id, String categoryName) {
		this.category_Id = category_Id;
		this.categoryName = categoryName;
	}
}
