package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CompanyAddressInput {
  
  private String address1;

  
  private String address2;

  
  private String city;

  
  private String zip;

  
  private String recipient;

  
  private String firstName;

  
  private String lastName;

  
  private String phone;

  
  private String zoneCode;

  
  private CountryCode countryCode;

  public CompanyAddressInput() {
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

  
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  
  public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
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

  
  public String getZoneCode() {
    return zoneCode;
  }

  public void setZoneCode(String zoneCode) {
    this.zoneCode = zoneCode;
  }

  
  public CountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(CountryCode countryCode) {
    this.countryCode = countryCode;
  }

  @Override
  public String toString() {
    return "CompanyAddressInput{address1='" + address1 + "', address2='" + address2 + "', city='" + city + "', zip='" + zip + "', recipient='" + recipient + "', firstName='" + firstName + "', lastName='" + lastName + "', phone='" + phone + "', zoneCode='" + zoneCode + "', countryCode='" + countryCode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyAddressInput that = (CompanyAddressInput) o;
    return Objects.equals(address1, that.address1) &&
        Objects.equals(address2, that.address2) &&
        Objects.equals(city, that.city) &&
        Objects.equals(zip, that.zip) &&
        Objects.equals(recipient, that.recipient) &&
        Objects.equals(firstName, that.firstName) &&
        Objects.equals(lastName, that.lastName) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(zoneCode, that.zoneCode) &&
        Objects.equals(countryCode, that.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, zip, recipient, firstName, lastName, phone, zoneCode, countryCode);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String address1;

    
    private String address2;

    
    private String city;

    
    private String zip;

    
    private String recipient;

    
    private String firstName;

    
    private String lastName;

    
    private String phone;

    
    private String zoneCode;

    
    private CountryCode countryCode;

    public CompanyAddressInput build() {
      CompanyAddressInput result = new CompanyAddressInput();
      result.address1 = this.address1;
      result.address2 = this.address2;
      result.city = this.city;
      result.zip = this.zip;
      result.recipient = this.recipient;
      result.firstName = this.firstName;
      result.lastName = this.lastName;
      result.phone = this.phone;
      result.zoneCode = this.zoneCode;
      result.countryCode = this.countryCode;
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

    
    public Builder zip(String zip) {
      this.zip = zip;
      return this;
    }

    
    public Builder recipient(String recipient) {
      this.recipient = recipient;
      return this;
    }

    
    public Builder firstName(String firstName) {
      this.firstName = firstName;
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

    
    public Builder zoneCode(String zoneCode) {
      this.zoneCode = zoneCode;
      return this;
    }

    
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }
  }
}
