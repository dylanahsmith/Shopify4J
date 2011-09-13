/**
 * DO NOT MODIFY THIS CODE
 *
 * Place all of your changes in Metafield.java
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

public class MGMetafield extends ShopifyResource {

	@JsonProperty("namespace")
	public String getNamespace() {
		return (String)attributes.get("namespace");
	}
	@JsonProperty("namespace")
	public void setNamespace(String _namespace) {
		attributes.put("namespace", _namespace);
	}

	@JsonProperty("value")
	public String getValue() {
		return (String)attributes.get("value");
	}
	@JsonProperty("value")
	public void setValue(String _value) {
		attributes.put("value", _value);
	}

	@JsonProperty("description")
	public String getDescription() {
		return (String)attributes.get("description");
	}
	@JsonProperty("description")
	public void setDescription(String _description) {
		attributes.put("description", _description);
	}

	@JsonProperty("key")
	public String getKey() {
		return (String)attributes.get("key");
	}
	@JsonProperty("key")
	public void setKey(String _key) {
		attributes.put("key", _key);
	}

	@JsonProperty("value_type")
	public String getValueType() {
		return (String)attributes.get("value_type");
	}
	@JsonProperty("value_type")
	public void setValueType(String _value_type) {
		attributes.put("value_type", _value_type);
	}

}
