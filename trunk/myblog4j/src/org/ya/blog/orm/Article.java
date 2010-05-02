package org.ya.blog.orm;

public class Article {

	public Article() {
	}

	private int articleId;
	
	private String title;
	
	private String context;
	
	private String tags;
	
	private int author;
	
	private String trackback;
	
	private int hidden;

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public int getAuthor() {
		return author;
	}

	public void setAuthor(int author) {
		this.author = author;
	}

	public String getTrackback() {
		return trackback;
	}

	public void setTrackback(String trackback) {
		this.trackback = trackback;
	}

	public int getHidden() {
		return hidden;
	}

	public void setHidden(int hidden) {
		this.hidden = hidden;
	}
	
}
