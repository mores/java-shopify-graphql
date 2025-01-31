package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CustomerPaymentInstrumentBillingAddress {
  
  private String address1;

  
  private String city;

  
  private String country;

  
  private CountryCode countryCode;

  
  private String name;

  
  private String province;

  
  private String provinceCode;

  
  private String zip;

  public CustomerPaymentInstrumentBillingAddress() {
  }

  
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
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

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
    return "CustomerPaymentInstrumentBillingAddress{address1='" + address1 + "', city='" + city + "', country='" + country + "', countryCode='" + countryCode + "', name='" + name + "', province='" + province + "', provinceCode='" + provinceCode + "', zip='" + zip + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerPaymentInstrumentBillingAddress that = (CustomerPaymentInstrumentBillingAddress) o;
    return Objects.equals(address1, that.address1) &&
        Objects.equals(city, that.city) &&
        Objects.equals(country, that.country) &&
        Objects.equals(countryCode, that.countryCode) &&
        Objects.equals(name, that.name) &&
        Objects.equals(province, that.province) &&
        Objects.equals(provinceCode, that.provinceCode) &&
        Objects.equals(zip, that.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, city, country, countryCode, name, province, provinceCode, zip);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String address1;

    
    private String city;

    
    private String country;

    
    private CountryCode countryCode;

    
    private String name;

    
    private String province;

    
    private String provinceCode;

    
    private String zip;

    public CustomerPaymentInstrumentBillingAddress build() {
      CustomerPaymentInstrumentBillingAddress result = new CustomerPaymentInstrumentBillingAddress();
      result.address1 = this.address1;
      result.city = this.city;
      result.country = this.country;
      result.countryCode = this.countryCode;
      result.name = this.name;
      result.province = this.province;
      result.provinceCode = this.provinceCode;
      result.zip = this.zip;
      return result;
    }

    
    public Builder address1(String address1) {
      this.address1 = address1;
      return this;
    }

    
    public Builder city(String city) {
      this.city = city;
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

    
    public Builder name(String name) {
      this.name = name;
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
