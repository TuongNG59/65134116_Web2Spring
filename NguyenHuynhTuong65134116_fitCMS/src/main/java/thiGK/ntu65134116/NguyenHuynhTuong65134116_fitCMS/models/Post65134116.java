package thiGK.ntu65134116.NguyenHuynhTuong65134116_fitCMS.models;

public class Post65134116 {
	private int id;
	private String title;
	private String content;
	private int categoryId;
	
	public Post65134116(int id, String title, String content, int categoryId) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.categoryId = categoryId;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public int getCategoryId() {
		return categoryId;
	}
	
	
}
