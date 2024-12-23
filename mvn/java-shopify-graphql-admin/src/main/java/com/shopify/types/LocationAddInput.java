package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to use to add a location.
 */
public class LocationAddInput {
  /**
   * The name of the location.
   */
  private String name;

  /**
   * The address of the location.
   */
  private LocationAddAddressInput address;

  /**
   * Whether inventory at this location is available for sale online.
   */
  private Boolean fulfillsOnlineOrders = true;

  /**
   * Additional customizable information to associate with the location.
   */
  private List<MetafieldInput> metafields;

  public LocationAddInput() {
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
   * The address of the location.
   */
  public LocationAddAddressInput getAddress() {
    return address;
  }

  public void setAddress(LocationAddAddressInput address) {
    this.address = address;
  }

  /**
   * Whether inventory at this location is available for sale online.
   */
  public Boolean getFulfillsOnlineOrders() {
    return fulfillsOnlineOrders;
  }

  public void setFulfillsOnlineOrders(Boolean fulfillsOnlineOrders) {
    this.fulfillsOnlineOrders = fulfillsOnlineOrders;
  }

  /**
   * Additional customizable information to associate with the location.
   */
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  @Override
  public String toString() {
    return "LocationAddInput{name='" + name + "', address='" + address + "', fulfillsOnlineOrders='" + fulfillsOnlineOrders + "', metafields='" + metafields + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LocationAddInput that = (LocationAddInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(address, that.address) &&
        Objects.equals(fulfillsOnlineOrders, that.fulfillsOnlineOrders) &&
        Objects.equals(metafields, that.metafields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address, fulfillsOnlineOrders, metafields);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the location.
     */
    private String name;

    /**
     * The address of the location.
     */
    private LocationAddAddressInput address;

    /**
     * Whether inventory at this location is available for sale online.
     */
    private Boolean fulfillsOnlineOrders = true;

    /**
     * Additional customizable information to associate with the location.
     */
    private List<MetafieldInput> metafields;

    public LocationAddInput build() {
      LocationAddInput result = new LocationAddInput();
      result.name = this.name;
      result.address = this.address;
      result.fulfillsOnlineOrders = this.fulfillsOnlineOrders;
      result.metafields = this.metafields;
      return result;
    }

    /**
     * The name of the location.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The address of the location.
     */
    public Builder address(LocationAddAddressInput address) {
      this.address = address;
      return this;
    }

    /**
     * Whether inventory at this location is available for sale online.
     */
    public Builder fulfillsOnlineOrders(Boolean fulfillsOnlineOrders) {
      this.fulfillsOnlineOrders = fulfillsOnlineOrders;
      return this;
    }

    /**
     * Additional customizable information to associate with the location.
     */
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }
  }
}
