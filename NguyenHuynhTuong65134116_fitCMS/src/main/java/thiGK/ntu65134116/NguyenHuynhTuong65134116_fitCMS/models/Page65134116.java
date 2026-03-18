package thiGK.ntu65134116.NguyenHuynhTuong65134116_fitCMS.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pages")
public class Page65134116 {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="pageName")
	private String pageName;
	
	@Column(name="keyword")
	private String keyword;
	
	@Column(name="content")
	private String content;
	
	@Column(name="parentPageId")
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
