package com.jwebmp.plugins.security.ipgeography;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@EqualsAndHashCode(of="ip",callSuper = false)
public class GeoData
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
}
