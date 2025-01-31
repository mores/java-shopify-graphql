package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class MailingAddress implements com.shopify.types.Node {
  
  private String address1;

  
  private String address2;

  
  private String city;

  
  private String company;

  
  private boolean coordinatesValidated;

  
  private String country;

  
  private String countryCode;

  
  private CountryCode countryCodeV2;

  
  private String firstName;

  
  private List<String> formatted;

  
  private String formattedArea;

  
  private String id;

  
  private String lastName;

  
  private Double latitude;

  
  private Double longitude;

  
  private String name;

  
  private String phone;

  
  private String province;

  
  private String provinceCode;

  
  private String timeZone;

  
  private MailingAddressValidationResult validationResultSummary;

  
  private String zip;

  public MailingAddress() {
  }

  
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  
  public boolean getCoordinatesValidated() {
    return coordinatesValidated;
  }

  public void setCoordinatesValidated(boolean coordinatesValidated) {
    this.coordinatesValidated = coordinatesValidated;
  }

  
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  
  public CountryCode getCountryCodeV2() {
    return countryCodeV2;
  }

  public void setCountryCodeV2(CountryCode countryCodeV2) {
    this.countryCodeV2 = countryCodeV2;
  }

  
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  public List<String> getFormatted() {
    return formatted;
  }

  public void setFormatted(List<String> formatted) {
    this.formatted = formatted;
  }

  
  public String getFormattedArea() {
    return formattedArea;
  }

  public void setFormattedArea(String formattedArea) {
    this.formattedArea = formattedArea;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  
  public String getProvinceCode() {
    return provinceCode;
  }

  public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
  }

  
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  
  public MailingAddressValidationResult getValidationResultSummary() {
    return validationResultSummary;
  }

  public void setValidationResultSummary(MailingAddressValidationResult validationResultSummary) {
    this.validationResultSummary = validationResultSummary;
  }

  
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  @Override
  public String toString() {
    return "MailingAddress{address1='" + address1 + "', address2='" + address2 + "', city='" + city + "', company='" + company + "', coordinatesValidated='" + coordinatesValidated + "', country='" + country + "', countryCode='" + countryCode + "', countryCodeV2='" + countryCodeV2 + "', firstName='" + firstName + "', formatted='" + formatted + "', formattedArea='" + formattedArea + "', id='" + id + "', lastName='" + lastName + "', latitude='" + latitude + "', longitude='" + longitude + "', name='" + name + "', phone='" + phone + "', province='" + province + "', provinceCode='" + provinceCode + "', timeZone='" + timeZone + "', validationResultSummary='" + validationResultSummary + "', zip='" + zip + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MailingAddress that = (MailingAddress) o;
    return Objects.equals(address1, that.address1) &&
        Objects.equals(address2, that.address2) &&
        Objects.equals(city, that.city) &&
        Objects.equals(company, that.company) &&
        coordinatesValidated == that.coordinatesValidated &&
        Objects.equals(country, that.country) &&
        Objects.equals(countryCode, that.countryCode) &&
        Objects.equals(countryCodeV2, that.countryCodeV2) &&
        Objects.equals(firstName, that.firstName) &&
        Objects.equals(formatted, that.formatted) &&
        Objects.equals(formattedArea, that.formattedArea) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lastName, that.lastName) &&
        Objects.equals(latitude, that.latitude) &&
        Objects.equals(longitude, that.longitude) &&
        Objects.equals(name, that.name) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(province, that.province) &&
        Objects.equals(provinceCode, that.provinceCode) &&
        Objects.equals(timeZone, that.timeZone) &&
        Objects.equals(validationResultSummary, that.validationResultSummary) &&
        Objects.equals(zip, that.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, company, coordinatesValidated, country, countryCode, countryCodeV2, firstName, formatted, formattedArea, id, lastName, latitude, longitude, name, phone, province, provinceCode, timeZone, validationResultSummary, zip);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String address1;

    
    private String address2;

    
    private String city;

    
    private String company;

    
    private boolean coordinatesValidated;

    
    private String country;

    
    private String countryCode;

    
    private CountryCode countryCodeV2;

    
    private String firstName;

    
    private List<String> formatted;

    
    private String formattedArea;

    
    private String id;

    
    private String lastName;

    
    private Double latitude;

    
    private Double longitude;

    
    private String name;

    
    private String phone;

    
    private String province;

    
    private String provinceCode;

    
    private String timeZone;

    
    private MailingAddressValidationResult validationResultSummary;

    
    private String zip;

    public MailingAddress build() {
      MailingAddress result = new MailingAddress();
      result.address1 = this.address1;
      result.address2 = this.address2;
      result.city = this.city;
      result.company = this.company;
      result.coordinatesValidated = this.coordinatesValidated;
      result.country = this.country;
      result.countryCode = this.countryCode;
      result.countryCodeV2 = this.countryCodeV2;
      result.firstName = this.firstName;
      result.formatted = this.formatted;
      result.formattedArea = this.formattedArea;
      result.id = this.id;
      result.lastName = this.lastName;
      result.latitude = this.latitude;
      result.longitude = this.longitude;
      result.name = this.name;
      result.phone = this.phone;
      result.province = this.province;
      result.provinceCode = this.provinceCode;
      result.timeZone = this.timeZone;
      result.validationResultSummary = this.validationResultSummary;
      result.zip = this.zip;
      return result;
    }

    
    public Builder address1(String address1) {
      this.address1 = address1;
      return this;
    }

    
    public Builder address2(String address2) {
      this.address2 = address2;
      return this;
    }

    
    public Builder city(String city) {
      this.city = city;
      return this;
    }

    
    public Builder company(String company) {
      this.company = company;
      return this;
    }

    
    public Builder coordinatesValidated(boolean coordinatesValidated) {
      this.coordinatesValidated = coordinatesValidated;
      return this;
    }

    
    public Builder country(String country) {
      this.country = country;
      return this;
    }

    
    public Builder countryCode(String countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    
    public Builder countryCodeV2(CountryCode countryCodeV2) {
      this.countryCodeV2 = countryCodeV2;
      return this;
    }

    
    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    
    public Builder formatted(List<String> formatted) {
      this.formatted = formatted;
      return this;
    }

    
    public Builder formattedArea(String formattedArea) {
      this.formattedArea = formattedArea;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    
    public Builder latitude(Double latitude) {
      this.latitude = latitude;
      return this;
    }

    
    public Builder longitude(Double longitude) {
      this.longitude = longitude;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    
    public Builder province(String province) {
      this.province = province;
      return this;
    }

    
    public Builder provinceCode(String provinceCode) {
      this.provinceCode = provinceCode;
      return this;
    }

    
    public Builder timeZone(String timeZone) {
      this.timeZone = timeZone;
      return this;
    }

    
    public Builder validationResultSummary(MailingAddressValidationResult validationResultSummary) {
      this.validationResultSummary = validationResultSummary;
      return this;
    }

    
    public Builder zip(String zip) {
      this.zip = zip;
      return this;
    }
  }
}
