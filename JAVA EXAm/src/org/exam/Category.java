package org.exam;

public class Category {

	int catId;
	String categoryName;
	String categoryDesc;
	String categoryImageUrl;
	
	public Category(int catId, String categoryName, String categoryDesc, String categoryImageUrl) {
		super();
		this.catId = catId;
		this.categoryName = categoryName;
		this.categoryDesc = categoryDesc;
		this.categoryImageUrl = categoryImageUrl;
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDesc() {
		return categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	public String getCategoryImageUrl() {
		return categoryImageUrl;
	}

	public void setCategoryImageUrl(String categoryImageUrl) {
		this.categoryImageUrl = categoryImageUrl;
	}
}
