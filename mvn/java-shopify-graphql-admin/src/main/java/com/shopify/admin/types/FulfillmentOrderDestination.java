package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents the destination where the items should be sent upon fulfillment.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class FulfillmentOrderDestination implements com.shopify.admin.types.Node {
  /**
   * The first line of the address of the destination.
   */
  private String address1;

  /**
   * The second line of the address of the destination.
   */
  private String address2;

  /**
   * The city of the destination.
   */
  private String city;

  /**
   * The company of the destination.
   */
  private String company;

  /**
   * The two-letter country code of the destination.
   */
  private CountryCode countryCode;

  /**
   * The email of the customer at the destination.
   */
  private String email;

  /**
   * The first name of the customer at the destination.
   */
  private String firstName;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The last name of the customer at the destination.
   */
  private String lastName;

  /**
   * The location designated for the pick-up of the fulfillment order.
   */
  private Location location;

  /**
   * The phone number of the customer at the destination.
   */
  private String phone;

  /**
   * The province of the destination.
   */
  private String province;

  /**
   * The ZIP code of the destination.
   */
  private String zip;

  public FulfillmentOrderDestination() {
  }

  /**
   * The first line of the address of the destination.
   */
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  /**
   * The second line of the address of the destination.
   */
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  /**
   * The city of the destination.
   */
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  /**
   * The company of the destination.
   */
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  /**
   * The two-letter country code of the destination.
   */
  public CountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(CountryCode countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * The email of the customer at the destination.
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The first name of the customer at the destination.
   */
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The last name of the customer at the destination.
   */
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * The location designated for the pick-up of the fulfillment order.
   */
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * The phone number of the customer at the destination.
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * The province of the destination.
   */
  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  /**
   * The ZIP code of the destination.
   */
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
    /**
     * The first line of the address of the destination.
     */
    private String address1;

    /**
     * The second line of the address of the destination.
     */
    private String address2;

    /**
     * The city of the destination.
     */
    private String city;

    /**
     * The company of the destination.
     */
    private String company;

    /**
     * The two-letter country code of the destination.
     */
    private CountryCode countryCode;

    /**
     * The email of the customer at the destination.
     */
    private String email;

    /**
     * The first name of the customer at the destination.
     */
    private String firstName;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The last name of the customer at the destination.
     */
    private String lastName;

    /**
     * The location designated for the pick-up of the fulfillment order.
     */
    private Location location;

    /**
     * The phone number of the customer at the destination.
     */
    private String phone;

    /**
     * The province of the destination.
     */
    private String province;

    /**
     * The ZIP code of the destination.
     */
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

    /**
     * The first line of the address of the destination.
     */
    public Builder address1(String address1) {
      this.address1 = address1;
      return this;
    }

    /**
     * The second line of the address of the destination.
     */
    public Builder address2(String address2) {
      this.address2 = address2;
      return this;
    }

    /**
     * The city of the destination.
     */
    public Builder city(String city) {
      this.city = city;
      return this;
    }

    /**
     * The company of the destination.
     */
    public Builder company(String company) {
      this.company = company;
      return this;
    }

    /**
     * The two-letter country code of the destination.
     */
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    /**
     * The email of the customer at the destination.
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * The first name of the customer at the destination.
     */
    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The last name of the customer at the destination.
     */
    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    /**
     * The location designated for the pick-up of the fulfillment order.
     */
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    /**
     * The phone number of the customer at the destination.
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * The province of the destination.
     */
    public Builder province(String province) {
      this.province = province;
      return this;
    }

    /**
     * The ZIP code of the destination.
     */
    public Builder zip(String zip) {
      this.zip = zip;
      return this;
    }
  }
}
