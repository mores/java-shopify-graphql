package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MailingAddressInput {
  
  private String address1;

  
  private String address2;

  
  private String city;

  
  private String company;

  
  private CountryCode countryCode;

  
  private String firstName;

  
  private String lastName;

  
  private String phone;

  
  private String provinceCode;

  
  private String zip;

  public MailingAddressInput() {
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

  
  public CountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(CountryCode countryCode) {
    this.countryCode = countryCode;
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

  
  public String getProvinceCode() {
    return provinceCode;
  }

  public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
  }

  
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  @Override
  public String toString() {
    return "MailingAddressInput{address1='" + address1 + "', address2='" + address2 + "', city='" + city + "', company='" + company + "', countryCode='" + countryCode + "', firstName='" + firstName + "', lastName='" + lastName + "', phone='" + phone + "', provinceCode='" + provinceCode + "', zip='" + zip + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MailingAddressInput that = (MailingAddressInput) o;
    return Objects.equals(address1, that.address1) &&
        Objects.equals(address2, that.address2) &&
        Objects.equals(city, that.city) &&
        Objects.equals(company, that.company) &&
        Objects.equals(countryCode, that.countryCode) &&
        Objects.equals(firstName, that.firstName) &&
        Objects.equals(lastName, that.lastName) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(provinceCode, that.provinceCode) &&
        Objects.equals(zip, that.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, company, countryCode, firstName, lastName, phone, provinceCode, zip);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String address1;

    
    private String address2;

    
    private String city;

    
    private String company;

    
    private CountryCode countryCode;

    
    private String firstName;

    
    private String lastName;

    
    private String phone;

    
    private String provinceCode;

    
    private String zip;

    public MailingAddressInput build() {
      MailingAddressInput result = new MailingAddressInput();
      result.address1 = this.address1;
      result.address2 = this.address2;
      result.city = this.city;
      result.company = this.company;
      result.countryCode = this.countryCode;
      result.firstName = this.firstName;
      result.lastName = this.lastName;
      result.phone = this.phone;
      result.provinceCode = this.provinceCode;
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

    
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
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

    
    public Builder provinceCode(String provinceCode) {
      this.provinceCode = provinceCode;
      return this;
    }

    
    public Builder zip(String zip) {
      this.zip = zip;
      return this;
    }
  }
}
