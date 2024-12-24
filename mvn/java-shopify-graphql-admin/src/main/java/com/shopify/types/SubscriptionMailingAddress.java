package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SubscriptionMailingAddress {
  
  private String address1;

  
  private String address2;

  
  private String city;

  
  private String company;

  
  private String country;

  
  private CountryCode countryCode;

  
  private String firstName;

  
  private String lastName;

  
  private String name;

  
  private String phone;

  
  private String province;

  
  private String provinceCode;

  
  private String zip;

  public SubscriptionMailingAddress() {
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

  
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  @Override
  public String toString() {
    return "SubscriptionMailingAddress{address1='" + address1 + "', address2='" + address2 + "', city='" + city + "', company='" + company + "', country='" + country + "', countryCode='" + countryCode + "', firstName='" + firstName + "', lastName='" + lastName + "', name='" + name + "', phone='" + phone + "', province='" + province + "', provinceCode='" + provinceCode + "', zip='" + zip + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionMailingAddress that = (SubscriptionMailingAddress) o;
    return Objects.equals(address1, that.address1) &&
        Objects.equals(address2, that.address2) &&
        Objects.equals(city, that.city) &&
        Objects.equals(company, that.company) &&
        Objects.equals(country, that.country) &&
        Objects.equals(countryCode, that.countryCode) &&
        Objects.equals(firstName, that.firstName) &&
        Objects.equals(lastName, that.lastName) &&
        Objects.equals(name, that.name) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(province, that.province) &&
        Objects.equals(provinceCode, that.provinceCode) &&
        Objects.equals(zip, that.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, company, country, countryCode, firstName, lastName, name, phone, province, provinceCode, zip);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String address1;

    
    private String address2;

    
    private String city;

    
    private String company;

    
    private String country;

    
    private CountryCode countryCode;

    
    private String firstName;

    
    private String lastName;

    
    private String name;

    
    private String phone;

    
    private String province;

    
    private String provinceCode;

    
    private String zip;

    public SubscriptionMailingAddress build() {
      SubscriptionMailingAddress result = new SubscriptionMailingAddress();
      result.address1 = this.address1;
      result.address2 = this.address2;
      result.city = this.city;
      result.company = this.company;
      result.country = this.country;
      result.countryCode = this.countryCode;
      result.firstName = this.firstName;
      result.lastName = this.lastName;
      result.name = this.name;
      result.phone = this.phone;
      result.province = this.province;
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

    
    public Builder country(String country) {
      this.country = country;
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

    
    public Builder zip(String zip) {
      this.zip = zip;
      return this;
    }
  }
}
