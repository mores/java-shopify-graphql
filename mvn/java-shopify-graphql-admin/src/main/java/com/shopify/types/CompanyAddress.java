package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Represents a billing or shipping address for a company location.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CompanyAddress implements com.shopify.types.Node {
  /**
   * The first line of the address. Typically the street address or PO Box number.
   */
  private String address1;

  /**
   * The second line of the address. Typically the number of the apartment, suite, or unit.
   */
  private String address2;

  /**
   * The name of the city, district, village, or town.
   */
  private String city;

  /**
   * The name of the company.
   */
  private String companyName;

  /**
   * The name of the country.
   */
  private String country;

  /**
   * The two-letter code for the country of the address.
   * For example, US.
   */
  private CountryCode countryCode;

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at which the company address was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The first name of the recipient.
   */
  private String firstName;

  /**
   * The formatted version of the address.
   */
  private List<String> formattedAddress;

  /**
   * A comma-separated list of the values for city, province, and country.
   */
  private String formattedArea;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The last name of the recipient.
   */
  private String lastName;

  /**
   * A unique phone number for the customer.
   * Formatted using E.164 standard. For example, _+16135551111_.
   */
  private String phone;

  /**
   * The region of the address, such as the province, state, or district.
   */
  private String province;

  /**
   * The identity of the recipient e.g. 'Receiving Department'.
   */
  private String recipient;

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
   * at which the company address was last updated.
   */
  private OffsetDateTime updatedAt;

  /**
   * The zip or postal code of the address.
   */
  private String zip;

  /**
   * The alphanumeric code for the region.
   * For example, ON.
   */
  private String zoneCode;

  public CompanyAddress() {
  }

  /**
   * The first line of the address. Typically the street address or PO Box number.
   */
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  /**
   * The second line of the address. Typically the number of the apartment, suite, or unit.
   */
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  /**
   * The name of the city, district, village, or town.
   */
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  /**
   * The name of the company.
   */
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  /**
   * The name of the country.
   */
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * The two-letter code for the country of the address.
   * For example, US.
   */
  public CountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(CountryCode countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at which the company address was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The first name of the recipient.
   */
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * The formatted version of the address.
   */
  public List<String> getFormattedAddress() {
    return formattedAddress;
  }

  public void setFormattedAddress(List<String> formattedAddress) {
    this.formattedAddress = formattedAddress;
  }

  /**
   * A comma-separated list of the values for city, province, and country.
   */
  public String getFormattedArea() {
    return formattedArea;
  }

  public void setFormattedArea(String formattedArea) {
    this.formattedArea = formattedArea;
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
   * The last name of the recipient.
   */
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * A unique phone number for the customer.
   * Formatted using E.164 standard. For example, _+16135551111_.
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * The region of the address, such as the province, state, or district.
   */
  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  /**
   * The identity of the recipient e.g. 'Receiving Department'.
   */
  public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
   * at which the company address was last updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * The zip or postal code of the address.
   */
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  /**
   * The alphanumeric code for the region.
   * For example, ON.
   */
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
    /**
     * The first line of the address. Typically the street address or PO Box number.
     */
    private String address1;

    /**
     * The second line of the address. Typically the number of the apartment, suite, or unit.
     */
    private String address2;

    /**
     * The name of the city, district, village, or town.
     */
    private String city;

    /**
     * The name of the company.
     */
    private String companyName;

    /**
     * The name of the country.
     */
    private String country;

    /**
     * The two-letter code for the country of the address.
     * For example, US.
     */
    private CountryCode countryCode;

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at which the company address was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The first name of the recipient.
     */
    private String firstName;

    /**
     * The formatted version of the address.
     */
    private List<String> formattedAddress;

    /**
     * A comma-separated list of the values for city, province, and country.
     */
    private String formattedArea;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The last name of the recipient.
     */
    private String lastName;

    /**
     * A unique phone number for the customer.
     * Formatted using E.164 standard. For example, _+16135551111_.
     */
    private String phone;

    /**
     * The region of the address, such as the province, state, or district.
     */
    private String province;

    /**
     * The identity of the recipient e.g. 'Receiving Department'.
     */
    private String recipient;

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
     * at which the company address was last updated.
     */
    private OffsetDateTime updatedAt;

    /**
     * The zip or postal code of the address.
     */
    private String zip;

    /**
     * The alphanumeric code for the region.
     * For example, ON.
     */
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

    /**
     * The first line of the address. Typically the street address or PO Box number.
     */
    public Builder address1(String address1) {
      this.address1 = address1;
      return this;
    }

    /**
     * The second line of the address. Typically the number of the apartment, suite, or unit.
     */
    public Builder address2(String address2) {
      this.address2 = address2;
      return this;
    }

    /**
     * The name of the city, district, village, or town.
     */
    public Builder city(String city) {
      this.city = city;
      return this;
    }

    /**
     * The name of the company.
     */
    public Builder companyName(String companyName) {
      this.companyName = companyName;
      return this;
    }

    /**
     * The name of the country.
     */
    public Builder country(String country) {
      this.country = country;
      return this;
    }

    /**
     * The two-letter code for the country of the address.
     * For example, US.
     */
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at which the company address was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The first name of the recipient.
     */
    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    /**
     * The formatted version of the address.
     */
    public Builder formattedAddress(List<String> formattedAddress) {
      this.formattedAddress = formattedAddress;
      return this;
    }

    /**
     * A comma-separated list of the values for city, province, and country.
     */
    public Builder formattedArea(String formattedArea) {
      this.formattedArea = formattedArea;
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
     * The last name of the recipient.
     */
    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    /**
     * A unique phone number for the customer.
     * Formatted using E.164 standard. For example, _+16135551111_.
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * The region of the address, such as the province, state, or district.
     */
    public Builder province(String province) {
      this.province = province;
      return this;
    }

    /**
     * The identity of the recipient e.g. 'Receiving Department'.
     */
    public Builder recipient(String recipient) {
      this.recipient = recipient;
      return this;
    }

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
     * at which the company address was last updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     * The zip or postal code of the address.
     */
    public Builder zip(String zip) {
      this.zip = zip;
      return this;
    }

    /**
     * The alphanumeric code for the region.
     * For example, ON.
     */
    public Builder zoneCode(String zoneCode) {
      this.zoneCode = zoneCode;
      return this;
    }
  }
}
