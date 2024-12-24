package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class FulfillmentOrderDestination implements com.shopify.types.Node {
  
  private String address1;

  
  private String address2;

  
  private String city;

  
  private String company;

  
  private CountryCode countryCode;

  
  private String email;

  
  private String firstName;

  
  private String id;

  
  private String lastName;

  
  private Location location;

  
  private String phone;

  
  private String province;

  
  private String zip;

  public FulfillmentOrderDestination() {
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

  
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
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

  
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
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

  
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderDestination{address1='" + address1 + "', address2='" + address2 + "', city='" + city + "', company='" + company + "', countryCode='" + countryCode + "', email='" + email + "', firstName='" + firstName + "', id='" + id + "', lastName='" + lastName + "', location='" + location + "', phone='" + phone + "', province='" + province + "', zip='" + zip + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderDestination that = (FulfillmentOrderDestination) o;
    return Objects.equals(address1, that.address1) &&
        Objects.equals(address2, that.address2) &&
        Objects.equals(city, that.city) &&
        Objects.equals(company, that.company) &&
        Objects.equals(countryCode, that.countryCode) &&
        Objects.equals(email, that.email) &&
        Objects.equals(firstName, that.firstName) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lastName, that.lastName) &&
        Objects.equals(location, that.location) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(province, that.province) &&
        Objects.equals(zip, that.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, company, countryCode, email, firstName, id, lastName, location, phone, province, zip);
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

    
    private String email;

    
    private String firstName;

    
    private String id;

    
    private String lastName;

    
    private Location location;

    
    private String phone;

    
    private String province;

    
    private String zip;

    public FulfillmentOrderDestination build() {
      FulfillmentOrderDestination result = new FulfillmentOrderDestination();
      result.address1 = this.address1;
      result.address2 = this.address2;
      result.city = this.city;
      result.company = this.company;
      result.countryCode = this.countryCode;
      result.email = this.email;
      result.firstName = this.firstName;
      result.id = this.id;
      result.lastName = this.lastName;
      result.location = this.location;
      result.phone = this.phone;
      result.province = this.province;
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

    
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    
    public Builder firstName(String firstName) {
      this.firstName = firstName;
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

    
    public Builder location(Location location) {
      this.location = location;
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

    
    public Builder zip(String zip) {
      this.zip = zip;
      return this;
    }
  }
}
