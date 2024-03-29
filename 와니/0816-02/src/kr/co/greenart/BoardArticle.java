package kr.co.greenart;

public class BoardArticle {
	private int id;
	// 제목
	private String title;
	// 내용
	private String content;
	//생성자 / 게터세터
	
	public BoardArticle() {
	}
	public BoardArticle(int id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "BoardArticle [id=" + id + ", title=" + title + ", content=" + content + "]";
	}
	
}
