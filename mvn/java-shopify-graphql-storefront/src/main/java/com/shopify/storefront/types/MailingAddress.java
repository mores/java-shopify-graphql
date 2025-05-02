package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents a mailing address for customers and shipping.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class MailingAddress implements DeliveryAddress, com.shopify.storefront.types.Node {
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
   * The name of the customer's company or organization.
   */
  private String company;

  /**
   * The name of the country.
   */
  private String country;

  /**
   * The two-letter code for the country of the address.
   *   
   * For example, US.
   */
  private String countryCode;

  /**
   * The two-letter code for the country of the address.
   *   
   * For example, US.
   */
  private CountryCode countryCodeV2;

  /**
   * The first name of the customer.
   */
  private String firstName;

  /**
   * A formatted version of the address, customized by the provided arguments.
   */
  private List<String> formatted;

  /**
   * A comma-separated list of the values for city, province, and country.
   */
  private String formattedArea;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The last name of the customer.
   */
  private String lastName;

  /**
   * The latitude coordinate of the customer address.
   */
  private Double latitude;

  /**
   * The longitude coordinate of the customer address.
   */
  private Double longitude;

  /**
   * The full name of the customer, based on firstName and lastName.
   */
  private String name;

  /**
   * A unique phone number for the customer.
   *   
   * Formatted using E.164 standard. For example, _+16135551111_.
   */
  private String phone;

  /**
   * The region of the address, such as the province, state, or district.
   */
  private String province;

  /**
   * The alphanumeric code for the region.
   *   
   * For example, ON.
   */
  private String provinceCode;

  /**
   * The zip or postal code of the address.
   */
  private String zip;

  public MailingAddress() {
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
   * The name of the customer's company or organization.
   */
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
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
   *   
   * For example, US.
   */
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * The two-letter code for the country of the address.
   *   
   * For example, US.
   */
  public CountryCode getCountryCodeV2() {
    return countryCodeV2;
  }

  public void setCountryCodeV2(CountryCode countryCodeV2) {
    this.countryCodeV2 = countryCodeV2;
  }

  /**
   * The first name of the customer.
   */
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * A formatted version of the address, customized by the provided arguments.
   */
  public List<String> getFormatted() {
    return formatted;
  }

  public void setFormatted(List<String> formatted) {
    this.formatted = formatted;
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
   * The last name of the customer.
   */
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * The latitude coordinate of the customer address.
   */
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   * The longitude coordinate of the customer address.
   */
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  /**
   * The full name of the customer, based on firstName and lastName.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * A unique phone number for the customer.
   *   
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
   * The alphanumeric code for the region.
   *   
   * For example, ON.
   */
  public String getProvinceCode() {
    return provinceCode;
  }

  public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
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

  @Override
  public String toString() {
    return "MailingAddress{address1='" + address1 + "', address2='" + address2 + "', city='" + city + "', company='" + company + "', country='" + country + "', countryCode='" + countryCode + "', countryCodeV2='" + countryCodeV2 + "', firstName='" + firstName + "', formatted='" + formatted + "', formattedArea='" + formattedArea + "', id='" + id + "', lastName='" + lastName + "', latitude='" + latitude + "', longitude='" + longitude + "', name='" + name + "', phone='" + phone + "', province='" + province + "', provinceCode='" + provinceCode + "', zip='" + zip + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MailingAddress that = (MailingAddress) o;
    return Objects.equals(address1, that.address1) &&
        Objects.equals(address2, that.address2) &&
        Objects.equals(city, that.city) &&
        Objects.equals(company, that.company) &&
        Objects.equals(country, that.country) &&
        Objects.equals(countryCode, that.countryCode) &&
        Objects.equals(countryCodeV2, that.countryCodeV2) &&
        Objects.equals(firstName, that.firstName) &&
        Objects.equals(formatted, that.formatted) &&
        Objects.equals(formattedArea, that.formattedArea) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lastName, that.lastName) &&
        Objects.equals(latitude, that.latitude) &&
        Objects.equals(longitude, that.longitude) &&
        Objects.equals(name, that.name) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(province, that.province) &&
        Objects.equals(provinceCode, that.provinceCode) &&
        Objects.equals(zip, that.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, company, country, countryCode, countryCodeV2, firstName, formatted, formattedArea, id, lastName, latitude, longitude, name, phone, province, provinceCode, zip);
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
     * The name of the customer's company or organization.
     */
    private String company;

    /**
     * The name of the country.
     */
    private String country;

    /**
     * The two-letter code for the country of the address.
     *   
     * For example, US.
     */
    private String countryCode;

    /**
     * The two-letter code for the country of the address.
     *   
     * For example, US.
     */
    private CountryCode countryCodeV2;

    /**
     * The first name of the customer.
     */
    private String firstName;

    /**
     * A formatted version of the address, customized by the provided arguments.
     */
    private List<String> formatted;

    /**
     * A comma-separated list of the values for city, province, and country.
     */
    private String formattedArea;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The last name of the customer.
     */
    private String lastName;

    /**
     * The latitude coordinate of the customer address.
     */
    private Double latitude;

    /**
     * The longitude coordinate of the customer address.
     */
    private Double longitude;

    /**
     * The full name of the customer, based on firstName and lastName.
     */
    private String name;

    /**
     * A unique phone number for the customer.
     *   
     * Formatted using E.164 standard. For example, _+16135551111_.
     */
    private String phone;

    /**
     * The region of the address, such as the province, state, or district.
     */
    private String province;

    /**
     * The alphanumeric code for the region.
     *   
     * For example, ON.
     */
    private String provinceCode;

    /**
     * The zip or postal code of the address.
     */
    private String zip;

    public MailingAddress build() {
      MailingAddress result = new MailingAddress();
      result.address1 = this.address1;
      result.address2 = this.address2;
      result.city = this.city;
      result.company = this.company;
      result.country = this.country;
      result.countryCode = this.countryCode;
      result.countryCodeV2 = this.countryCodeV2;
      result.firstName = this.firstName;
      result.formatted = this.formatted;
      result.formattedArea = this.formattedArea;
      result.id = this.id;
      result.lastName = this.lastName;
      result.latitude = this.latitude;
      result.longitude = this.longitude;
      result.name = this.name;
      result.phone = this.phone;
      result.province = this.province;
      result.provinceCode = this.provinceCode;
      result.zip = this.zip;
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
     * The name of the customer's company or organization.
     */
    public Builder company(String company) {
      this.company = company;
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
     *   
     * For example, US.
     */
    public Builder countryCode(String countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    /**
     * The two-letter code for the country of the address.
     *   
     * For example, US.
     */
    public Builder countryCodeV2(CountryCode countryCodeV2) {
      this.countryCodeV2 = countryCodeV2;
      return this;
    }

    /**
     * The first name of the customer.
     */
    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    /**
     * A formatted version of the address, customized by the provided arguments.
     */
    public Builder formatted(List<String> formatted) {
      this.formatted = formatted;
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
     * The last name of the customer.
     */
    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    /**
     * The latitude coordinate of the customer address.
     */
    public Builder latitude(Double latitude) {
      this.latitude = latitude;
      return this;
    }

    /**
     * The longitude coordinate of the customer address.
     */
    public Builder longitude(Double longitude) {
      this.longitude = longitude;
      return this;
    }

    /**
     * The full name of the customer, based on firstName and lastName.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * A unique phone number for the customer.
     *   
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
     * The alphanumeric code for the region.
     *   
     * For example, ON.
     */
    public Builder provinceCode(String provinceCode) {
      this.provinceCode = provinceCode;
      return this;
    }

    /**
     * The zip or postal code of the address.
     */
    public Builder zip(String zip) {
      this.zip = zip;
      return this;
    }
  }
}
