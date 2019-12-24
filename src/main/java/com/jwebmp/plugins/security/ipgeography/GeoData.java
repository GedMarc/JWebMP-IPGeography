package com.jwebmp.plugins.security.ipgeography;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoData
		extends JavaScriptPart<GeoData>
{
	private String ip;
	private String isp;
	private String org;
	private String hostname;
	private String longitude;
	private String latitude;
	@JsonProperty("postal_code")
	private String postalCode;
	private String city;
	@JsonProperty("country_code")
	private String countryCode;
	@JsonProperty("country_name")
	private String country_short_name;
	@JsonProperty("continent_code")
	private String continentCode;
	private String region;
	private String district;
	@JsonProperty("timezone_name")
	private String timezoneName;
	@JsonProperty("connection_type")
	private String connectionType;
	@JsonProperty("asn_number")
	private String asnNumber;
	@JsonProperty("asn_org")
	private String asnOrg;
	@JsonProperty("asn")
	private String asn;
	@JsonProperty("currency_code")
	private String currencyCode;
	@JsonProperty("premium")
	private Boolean premium;
	@JsonProperty("currency_name")
	private String currencyName;
	private Boolean success;
	private Boolean cached;
	@JsonProperty("localstorage")
	private String localStorage;
	@JsonProperty("sessionid")
	private String sessionid;

	public String getIp()
	{
		return ip;
	}

	public GeoData setIp(String ip)
	{
		this.ip = ip;
		return this;
	}

	public String getIsp()
	{
		return isp;
	}

	public GeoData setIsp(String isp)
	{
		this.isp = isp;
		return this;
	}

	public String getOrg()
	{
		return org;
	}

	public GeoData setOrg(String org)
	{
		this.org = org;
		return this;
	}

	public String getHostname()
	{
		return hostname;
	}

	public GeoData setHostname(String hostname)
	{
		this.hostname = hostname;
		return this;
	}

	public String getLongitude()
	{
		return longitude;
	}

	public GeoData setLongitude(String longitude)
	{
		this.longitude = longitude;
		return this;
	}

	public String getLatitude()
	{
		return latitude;
	}

	public GeoData setLatitude(String latitude)
	{
		this.latitude = latitude;
		return this;
	}

	public String getPostalCode()
	{
		return postalCode;
	}

	public GeoData setPostalCode(String postalCode)
	{
		this.postalCode = postalCode;
		return this;
	}

	public String getCity()
	{
		return city;
	}

	public GeoData setCity(String city)
	{
		this.city = city;
		return this;
	}

	public String getCountryCode()
	{
		return countryCode;
	}

	public GeoData setCountryCode(String countryCode)
	{
		this.countryCode = countryCode;
		return this;
	}

	public String getCountry_short_name()
	{
		return country_short_name;
	}

	public GeoData setCountry_short_name(String country_short_name)
	{
		this.country_short_name = country_short_name;
		return this;
	}

	public String getContinentCode()
	{
		return continentCode;
	}

	public GeoData setContinentCode(String continentCode)
	{
		this.continentCode = continentCode;
		return this;
	}

	public String getRegion()
	{
		return region;
	}

	public GeoData setRegion(String region)
	{
		this.region = region;
		return this;
	}

	public String getDistrict()
	{
		return district;
	}

	public GeoData setDistrict(String district)
	{
		this.district = district;
		return this;
	}

	public String getTimezoneName()
	{
		return timezoneName;
	}

	public GeoData setTimezoneName(String timezoneName)
	{
		this.timezoneName = timezoneName;
		return this;
	}

	public String getConnectionType()
	{
		return connectionType;
	}

	public GeoData setConnectionType(String connectionType)
	{
		this.connectionType = connectionType;
		return this;
	}

	public String getAsnNumber()
	{
		return asnNumber;
	}

	public GeoData setAsnNumber(String asnNumber)
	{
		this.asnNumber = asnNumber;
		return this;
	}

	public String getAsnOrg()
	{
		return asnOrg;
	}

	public GeoData setAsnOrg(String asnOrg)
	{
		this.asnOrg = asnOrg;
		return this;
	}

	public String getAsn()
	{
		return asn;
	}

	public GeoData setAsn(String asn)
	{
		this.asn = asn;
		return this;
	}

	public String getCurrencyCode()
	{
		return currencyCode;
	}

	public GeoData setCurrencyCode(String currencyCode)
	{
		this.currencyCode = currencyCode;
		return this;
	}

	public Boolean getPremium()
	{
		return premium;
	}

	public GeoData setPremium(Boolean premium)
	{
		this.premium = premium;
		return this;
	}

	public String getCurrencyName()
	{
		return currencyName;
	}

	public GeoData setCurrencyName(String currencyName)
	{
		this.currencyName = currencyName;
		return this;
	}

	public Boolean getSuccess()
	{
		return success;
	}

	public GeoData setSuccess(Boolean success)
	{
		this.success = success;
		return this;
	}

	public Boolean getCached()
	{
		return cached;
	}

	public GeoData setCached(Boolean cached)
	{
		this.cached = cached;
		return this;
	}

	public String getLocalStorage()
	{
		return localStorage;
	}

	public GeoData setLocalStorage(String localStorage)
	{
		this.localStorage = localStorage;
		return this;
	}

	public String getSessionid()
	{
		return sessionid;
	}

	public GeoData setSessionid(String sessionid)
	{
		this.sessionid = sessionid;
		return this;
	}
}
