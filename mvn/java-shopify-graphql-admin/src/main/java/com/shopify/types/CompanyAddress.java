package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CompanyAddress implements com.shopify.types.Node {
  
  private String address1;

  
  private String address2;

  
  private String city;

  
  private String companyName;

  
  private String country;

  
  private CountryCode countryCode;

  
  private OffsetDateTime createdAt;

  
  private String firstName;

  
  private List<String> formattedAddress;

  
  private String formattedArea;

  
  private String id;

  
  private String lastName;

  
  private String phone;

  
  private String province;

  
  private String recipient;

  
  private OffsetDateTime updatedAt;

  
  private String zip;

  
  private String zoneCode;

  public CompanyAddress() {
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

  
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  
  public CountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(CountryCode countryCode) {
    this.countryCode = countryCode;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  public List<String> getFormattedAddress() {
    return formattedAddress;
  }

  public void setFormattedAddress(List<String> formattedAddress) {
    this.formattedAddress = formattedAddress;
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

  
  public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  
  public String getZoneCode() {
    return zoneCode;
  }

  public void setZoneCode(String zoneCode) {
    this.zoneCode = zoneCode;
  }

  @Override
  public String toString() {
    return "CompanyAddress{address1='" + address1 + "', address2='" + address2 + "', city='" + city + "', companyName='" + companyName + "', country='" + country + "', countryCode='" + countryCode + "', createdAt='" + createdAt + "', firstName='" + firstName + "', formattedAddress='" + formattedAddress + "', formattedArea='" + formattedArea + "', id='" + id + "', lastName='" + lastName + "', phone='" + phone + "', province='" + province + "', recipient='" + recipient + "', updatedAt='" + updatedAt + "', zip='" + zip + "', zoneCode='" + zoneCode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyAddress that = (CompanyAddress) o;
    return Objects.equals(address1, that.address1) &&
        Objects.equals(address2, that.address2) &&
        Objects.equals(city, that.city) &&
        Objects.equals(companyName, that.companyName) &&
        Objects.equals(country, that.country) &&
        Objects.equals(countryCode, that.countryCode) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(firstName, that.firstName) &&
        Objects.equals(formattedAddress, that.formattedAddress) &&
        Objects.equals(formattedArea, that.formattedArea) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lastName, that.lastName) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(province, that.province) &&
        Objects.equals(recipient, that.recipient) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(zip, that.zip) &&
        Objects.equals(zoneCode, that.zoneCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, companyName, country, countryCode, createdAt, firstName, formattedAddress, formattedArea, id, lastName, phone, province, recipient, updatedAt, zip, zoneCode);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String address1;

    
    private String address2;

    
    private String city;

    
    private String companyName;

    
    private String country;

    
    private CountryCode countryCode;

    
    private OffsetDateTime createdAt;

    
    private String firstName;

    
    private List<String> formattedAddress;

    
    private String formattedArea;

    
    private String id;

    
    private String lastName;

    
    private String phone;

    
    private String province;

    
    private String recipient;

    
    private OffsetDateTime updatedAt;

    
    private String zip;

    
    private String zoneCode;

    public CompanyAddress build() {
      CompanyAddress result = new CompanyAddress();
      result.address1 = this.address1;
      result.address2 = this.address2;
      result.city = this.city;
      result.companyName = this.companyName;
      result.country = this.country;
      result.countryCode = this.countryCode;
      result.createdAt = this.createdAt;
      result.firstName = this.firstName;
      result.formattedAddress = this.formattedAddress;
      result.formattedArea = this.formattedArea;
      result.id = this.id;
      result.lastName = this.lastName;
      result.phone = this.phone;
      result.province = this.province;
      result.recipient = this.recipient;
      result.updatedAt = this.updatedAt;
      result.zip = this.zip;
      result.zoneCode = this.zoneCode;
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

    
    public Builder companyName(String companyName) {
      this.companyName = companyName;
      return this;
    }

    
    public Builder country(String country) {
      this.country = country;
      return this;
    }

    
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    
    public Builder formattedAddress(List<String> formattedAddress) {
      this.formattedAddress = formattedAddress;
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

    
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    
    public Builder province(String province) {
      this.province = province;
      return this;
    }

    
    public Builder recipient(String recipient) {
      this.recipient = recipient;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    
    public Builder zip(String zip) {
      this.zip = zip;
      return this;
    }

    
    public Builder zoneCode(String zoneCode) {
      this.zoneCode = zoneCode;
      return this;
    }
  }
}
