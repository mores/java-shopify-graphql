package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class LocationEditAddressInput {
  
  private String address1;

  
  private String address2;

  
  private String city;

  
  private String phone;

  
  private String zip;

  
  private CountryCode countryCode;

  
  private String provinceCode;

  public LocationEditAddressInput() {
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

  
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  
  public CountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(CountryCode countryCode) {
    this.countryCode = countryCode;
  }

  
  public String getProvinceCode() {
    return provinceCode;
  }

  public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
  }

  @Override
  public String toString() {
    return "LocationEditAddressInput{address1='" + address1 + "', address2='" + address2 + "', city='" + city + "', phone='" + phone + "', zip='" + zip + "', countryCode='" + countryCode + "', provinceCode='" + provinceCode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LocationEditAddressInput that = (LocationEditAddressInput) o;
    return Objects.equals(address1, that.address1) &&
        Objects.equals(address2, that.address2) &&
        Objects.equals(city, that.city) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(zip, that.zip) &&
        Objects.equals(countryCode, that.countryCode) &&
        Objects.equals(provinceCode, that.provinceCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, phone, zip, countryCode, provinceCode);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String address1;

    
    private String address2;

    
    private String city;

    
    private String phone;

    
    private String zip;

    
    private CountryCode countryCode;

    
    private String provinceCode;

    public LocationEditAddressInput build() {
      LocationEditAddressInput result = new LocationEditAddressInput();
      result.address1 = this.address1;
      result.address2 = this.address2;
      result.city = this.city;
      result.phone = this.phone;
      result.zip = this.zip;
      result.countryCode = this.countryCode;
      result.provinceCode = this.provinceCode;
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

    
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    
    public Builder zip(String zip) {
      this.zip = zip;
      return this;
    }

    
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    
    public Builder provinceCode(String provinceCode) {
      this.provinceCode = provinceCode;
      return this;
    }
  }
}
