package thiGK.ntu65134116.NguyenHuynhTuong65134116_fitCMS.models;

public class Page65134116 {
	private int id;
	private String pageName;
	private String keyword;
	private String content;
	private int parentPageId;
	
	
	public Page65134116(int id, String pageName, String keyword, String content, int parentPageId) {
		super();
		this.id = id;
		this.pageName = pageName;
		this.keyword = keyword;
		this.content = content;
		this.parentPageId = parentPageId;
	}

	public Page65134116() {
		
	}

	public int getId() {
		return id;
	}

	public String getPageName() {
		return pageName;
	}

	public String getKeyword() {
		return keyword;
	}

	public String getContent() {
		return content;
	}

	public int getParentPageId() {
		return parentPageId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setParentPageId(int parentPageId) {
		this.parentPageId = parentPageId;
	}
	
	
	
}
