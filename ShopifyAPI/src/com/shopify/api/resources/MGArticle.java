/**
 * DO NOT MODIFY THIS CODE
 *
 * Place all of your changes in Article.java
 *
 * It has been machine generated from fixtures and your changes will be
 * lost if anything new needs to be added to the API.
 **/
// Last Generated: 2011-09-12T22:14:03-04:00
package com.shopify.api.resources;

import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * This code has been machine generated by processing the single entry
 * fixtures found from the Shopify API Documentation
 */

public class MGArticle extends ShopifyResource {

	@JsonProperty("body_html")
	public String getBodyHtml() {
		return (String)attributes.get("body_html");
	}
	@JsonProperty("body_html")
	public void setBodyHtml(String _body_html) {
		attributes.put("body_html", _body_html);
	}

	@JsonProperty("author")
	public String getAuthor() {
		return (String)attributes.get("author");
	}
	@JsonProperty("author")
	public void setAuthor(String _author) {
		attributes.put("author", _author);
	}

	@JsonProperty("title")
	public String getTitle() {
		return (String)attributes.get("title");
	}
	@JsonProperty("title")
	public void setTitle(String _title) {
		attributes.put("title", _title);
	}

	@JsonProperty("blog_id")
	public int getBlogId() {
		Integer value = (Integer)attributes.get("blog_id");
		return value != null ? value : 0;
	}
	@JsonProperty("blog_id")
	public void setBlogId(int _blog_id) {
		attributes.put("blog_id", _blog_id);
	}

	@JsonProperty("summary_html")
	public String getSummaryHtml() {
		return (String)attributes.get("summary_html");
	}
	@JsonProperty("summary_html")
	public void setSummaryHtml(String _summary_html) {
		attributes.put("summary_html", _summary_html);
	}

	@JsonProperty("tags")
	public String getTags() {
		return (String)attributes.get("tags");
	}
	@JsonProperty("tags")
	public void setTags(String _tags) {
		attributes.put("tags", _tags);
	}

	@JsonProperty("user_id")
	public int getUserId() {
		Integer value = (Integer)attributes.get("user_id");
		return value != null ? value : 0;
	}
	@JsonProperty("user_id")
	public void setUserId(int _user_id) {
		attributes.put("user_id", _user_id);
	}

	@JsonProperty("published_at")
	public String getPublishedAt() {
		return (String)attributes.get("published_at");
	}
	@JsonProperty("published_at")
	public void setPublishedAt(String _published_at) {
		attributes.put("published_at", _published_at);
	}

}
