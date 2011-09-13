/**
 * DO NOT MODIFY THIS CODE
 *
 * Place all of your changes in BillingAddress.java
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

public class MGBillingAddress extends ShopifyResource {

	@JsonProperty("company")
	public String getCompany() {
		return (String)attributes.get("company");
	}
	@JsonProperty("company")
	public void setCompany(String _company) {
		attributes.put("company", _company);
	}

	@JsonProperty("city")
	public String getCity() {
		return (String)attributes.get("city");
	}
	@JsonProperty("city")
	public void setCity(String _city) {
		attributes.put("city", _city);
	}

	@JsonProperty("address1")
	public String getAddress1() {
		return (String)attributes.get("address1");
	}
	@JsonProperty("address1")
	public void setAddress1(String _address1) {
		attributes.put("address1", _address1);
	}

	@JsonProperty("name")
	public String getName() {
		return (String)attributes.get("name");
	}
	@JsonProperty("name")
	public void setName(String _name) {
		attributes.put("name", _name);
	}

	@JsonProperty("zip")
	public String getZip() {
		return (String)attributes.get("zip");
	}
	@JsonProperty("zip")
	public void setZip(String _zip) {
		attributes.put("zip", _zip);
	}

	@JsonProperty("latitude")
	public String getLatitude() {
		return (String)attributes.get("latitude");
	}
	@JsonProperty("latitude")
	public void setLatitude(String _latitude) {
		attributes.put("latitude", _latitude);
	}

	@JsonProperty("address2")
	public String getAddress2() {
		return (String)attributes.get("address2");
	}
	@JsonProperty("address2")
	public void setAddress2(String _address2) {
		attributes.put("address2", _address2);
	}

	@JsonProperty("country")
	public String getCountry() {
		return (String)attributes.get("country");
	}
	@JsonProperty("country")
	public void setCountry(String _country) {
		attributes.put("country", _country);
	}

	@JsonProperty("country_code")
	public String getCountryCode() {
		return (String)attributes.get("country_code");
	}
	@JsonProperty("country_code")
	public void setCountryCode(String _country_code) {
		attributes.put("country_code", _country_code);
	}

	@JsonProperty("province_code")
	public String getProvinceCode() {
		return (String)attributes.get("province_code");
	}
	@JsonProperty("province_code")
	public void setProvinceCode(String _province_code) {
		attributes.put("province_code", _province_code);
	}

	@JsonProperty("phone")
	public String getPhone() {
		return (String)attributes.get("phone");
	}
	@JsonProperty("phone")
	public void setPhone(String _phone) {
		attributes.put("phone", _phone);
	}

	@JsonProperty("last_name")
	public String getLastName() {
		return (String)attributes.get("last_name");
	}
	@JsonProperty("last_name")
	public void setLastName(String _last_name) {
		attributes.put("last_name", _last_name);
	}

	@JsonProperty("longitude")
	public String getLongitude() {
		return (String)attributes.get("longitude");
	}
	@JsonProperty("longitude")
	public void setLongitude(String _longitude) {
		attributes.put("longitude", _longitude);
	}

	@JsonProperty("province")
	public String getProvince() {
		return (String)attributes.get("province");
	}
	@JsonProperty("province")
	public void setProvince(String _province) {
		attributes.put("province", _province);
	}

	@JsonProperty("first_name")
	public String getFirstName() {
		return (String)attributes.get("first_name");
	}
	@JsonProperty("first_name")
	public void setFirstName(String _first_name) {
		attributes.put("first_name", _first_name);
	}

}
