/**
 * DO NOT MODIFY THIS CODE
 *
 * Place all of your changes in Collect.java
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

public class MGCollect extends ShopifyResource {

	@JsonProperty("position")
	public int getPosition() {
		Integer value = (Integer)attributes.get("position");
		return value != null ? value : 0;
	}
	@JsonProperty("position")
	public void setPosition(int _position) {
		attributes.put("position", _position);
	}

	@JsonProperty("product_id")
	public int getProductId() {
		Integer value = (Integer)attributes.get("product_id");
		return value != null ? value : 0;
	}
	@JsonProperty("product_id")
	public void setProductId(int _product_id) {
		attributes.put("product_id", _product_id);
	}

	@JsonProperty("featured")
	public boolean getFeatured() {
		Boolean value = (Boolean)attributes.get("featured");
		return value != null ? value : false;
	}
	@JsonProperty("featured")
	public void setFeatured(boolean _featured) {
		attributes.put("featured", _featured);
	}

	@JsonProperty("collection_id")
	public int getCollectionId() {
		Integer value = (Integer)attributes.get("collection_id");
		return value != null ? value : 0;
	}
	@JsonProperty("collection_id")
	public void setCollectionId(int _collection_id) {
		attributes.put("collection_id", _collection_id);
	}

}
