package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class FulfillmentOriginAddressInput {
  
  private String address1;

  
  private String address2;

  
  private String city;

  
  private String zip;

  
  private String provinceCode;

  
  private String countryCode;

  public FulfillmentOriginAddressInput() {
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

  
  public String getProvinceCode() {
    return provinceCode;
  }

  public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
  }

  
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  @Override
  public String toString() {
    return "FulfillmentOriginAddressInput{address1='" + address1 + "', address2='" + address2 + "', city='" + city + "', zip='" + zip + "', provinceCode='" + provinceCode + "', countryCode='" + countryCode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOriginAddressInput that = (FulfillmentOriginAddressInput) o;
    return Objects.equals(address1, that.address1) &&
        Objects.equals(address2, that.address2) &&
        Objects.equals(city, that.city) &&
        Objects.equals(zip, that.zip) &&
        Objects.equals(provinceCode, that.provinceCode) &&
        Objects.equals(countryCode, that.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, zip, provinceCode, countryCode);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String address1;

    
    private String address2;

    
    private String city;

    
    private String zip;

    
    private String provinceCode;

    
    private String countryCode;

    public FulfillmentOriginAddressInput build() {
      FulfillmentOriginAddressInput result = new FulfillmentOriginAddressInput();
      result.address1 = this.address1;
      result.address2 = this.address2;
      result.city = this.city;
      result.zip = this.zip;
      result.provinceCode = this.provinceCode;
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

    
    public Builder provinceCode(String provinceCode) {
      this.provinceCode = provinceCode;
      return this;
    }

    
    public Builder countryCode(String countryCode) {
      this.countryCode = countryCode;
      return this;
    }
  }
}
