package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The fulfillment order's assigned location. This is the location where the fulfillment is expected to happen.
 *
 *  The fulfillment order's assigned location might change in the following cases:
 *
 *   - The fulfillment order has been entirely moved to a new location. For example, the [fulfillmentOrderMove](
 *     https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentOrderMove
 *     ) mutation has been called, and you see the original fulfillment order in the [movedFulfillmentOrder](
 *     https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentOrderMove#field-fulfillmentordermovepayload-movedfulfillmentorder
 *     ) field within the mutation's response.
 *
 *   - Work on the fulfillment order has not yet begun, which means that the fulfillment order has the
 *       [OPEN](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-open),
 *       [SCHEDULED](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-scheduled), or
 *       [ON_HOLD](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-onhold)
 *       status, and the shop's location properties might be undergoing edits (for example, in the Shopify admin).
 *
 * If the [fulfillmentOrderMove](
 * https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentOrderMove
 * ) mutation has moved the fulfillment order's line items to a new location,
 * but hasn't moved the fulfillment order instance itself, then the original fulfillment order's assigned location
 * doesn't change.
 * This happens if the fulfillment order is being split during the move, or if all line items can be moved
 * to an existing fulfillment order at a new location.
 *
 * Once the fulfillment order has been taken into work or canceled,
 * which means that the fulfillment order has the
 * [IN_PROGRESS](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-inprogress),
 * [CLOSED](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-closed),
 * [CANCELLED](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-cancelled), or
 * [INCOMPLETE](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-incomplete)
 * status, `FulfillmentOrderAssignedLocation` acts as a snapshot of the shop's location content.
 * Up-to-date shop's location data may be queried through [location](
 *   https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrderAssignedLocation#field-fulfillmentorderassignedlocation-location
 * ) connection.
 */
public class FulfillmentOrderAssignedLocation {
  /**
   * The first line of the address for the location.
   */
  private String address1;

  /**
   * The second line of the address for the location.
   */
  private String address2;

  /**
   * The city of the location.
   */
  private String city;

  /**
   * The two-letter country code of the location.
   */
  private CountryCode countryCode;

  /**
   * The location where the fulfillment is expected to happen. This value might be different from
   * `FulfillmentOrderAssignedLocation` if the location's attributes were updated
   * after the fulfillment order was taken into work of canceled.
   */
  private Location location;

  /**
   * The name of the location.
   */
  private String name;

  /**
   * The phone number of the location.
   */
  private String phone;

  /**
   * The province of the location.
   */
  private String province;

  /**
   * The ZIP code of the location.
   */
  private String zip;

  public FulfillmentOrderAssignedLocation() {
  }

  /**
   * The first line of the address for the location.
   */
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  /**
   * The second line of the address for the location.
   */
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  /**
   * The city of the location.
   */
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  /**
   * The two-letter country code of the location.
   */
  public CountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(CountryCode countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * The location where the fulfillment is expected to happen. This value might be different from
   * `FulfillmentOrderAssignedLocation` if the location's attributes were updated
   * after the fulfillment order was taken into work of canceled.
   */
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * The name of the location.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The phone number of the location.
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * The province of the location.
   */
  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  /**
   * The ZIP code of the location.
   */
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderAssignedLocation{address1='" + address1 + "', address2='" + address2 + "', city='" + city + "', countryCode='" + countryCode + "', location='" + location + "', name='" + name + "', phone='" + phone + "', province='" + province + "', zip='" + zip + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderAssignedLocation that = (FulfillmentOrderAssignedLocation) o;
    return Objects.equals(address1, that.address1) &&
        Objects.equals(address2, that.address2) &&
        Objects.equals(city, that.city) &&
        Objects.equals(countryCode, that.countryCode) &&
        Objects.equals(location, that.location) &&
        Objects.equals(name, that.name) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(province, that.province) &&
        Objects.equals(zip, that.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, countryCode, location, name, phone, province, zip);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The first line of the address for the location.
     */
    private String address1;

    /**
     * The second line of the address for the location.
     */
    private String address2;

    /**
     * The city of the location.
     */
    private String city;

    /**
     * The two-letter country code of the location.
     */
    private CountryCode countryCode;

    /**
     * The location where the fulfillment is expected to happen. This value might be different from
     * `FulfillmentOrderAssignedLocation` if the location's attributes were updated
     * after the fulfillment order was taken into work of canceled.
     */
    private Location location;

    /**
     * The name of the location.
     */
    private String name;

    /**
     * The phone number of the location.
     */
    private String phone;

    /**
     * The province of the location.
     */
    private String province;

    /**
     * The ZIP code of the location.
     */
    private String zip;

    public FulfillmentOrderAssignedLocation build() {
      FulfillmentOrderAssignedLocation result = new FulfillmentOrderAssignedLocation();
      result.address1 = this.address1;
      result.address2 = this.address2;
      result.city = this.city;
      result.countryCode = this.countryCode;
      result.location = this.location;
      result.name = this.name;
      result.phone = this.phone;
      result.province = this.province;
      result.zip = this.zip;
      return result;
    }

    /**
     * The first line of the address for the location.
     */
    public Builder address1(String address1) {
      this.address1 = address1;
      return this;
    }

    /**
     * The second line of the address for the location.
     */
    public Builder address2(String address2) {
      this.address2 = address2;
      return this;
    }

    /**
     * The city of the location.
     */
    public Builder city(String city) {
      this.city = city;
      return this;
    }

    /**
     * The two-letter country code of the location.
     */
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    /**
     * The location where the fulfillment is expected to happen. This value might be different from
     * `FulfillmentOrderAssignedLocation` if the location's attributes were updated
     * after the fulfillment order was taken into work of canceled.
     */
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    /**
     * The name of the location.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The phone number of the location.
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * The province of the location.
     */
    public Builder province(String province) {
      this.province = province;
      return this;
    }

    /**
     * The ZIP code of the location.
     */
    public Builder zip(String zip) {
      this.zip = zip;
      return this;
    }
  }
}
