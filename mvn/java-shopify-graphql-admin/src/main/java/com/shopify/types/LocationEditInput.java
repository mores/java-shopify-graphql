package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to use to edit a location.
 */
public class LocationEditInput {
  /**
   * The name of the location.
   */
  private String name;

  /**
   * The address of the location.
   */
  private LocationEditAddressInput address;

  /**
   * Whether inventory at this location is available for sale online.
   *   
   * **Note:** This can't be disabled for fulfillment service locations.
   */
  private Boolean fulfillsOnlineOrders;

  /**
   * Additional customizable information to associate with the location.
   */
  private List<MetafieldInput> metafields;

  public LocationEditInput() {
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
  public LocationEditAddressInput getAddress() {
    return address;
  }

  public void setAddress(LocationEditAddressInput address) {
    this.address = address;
  }

  /**
   * Whether inventory at this location is available for sale online.
   *   
   * **Note:** This can't be disabled for fulfillment service locations.
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
    return "LocationEditInput{name='" + name + "', address='" + address + "', fulfillsOnlineOrders='" + fulfillsOnlineOrders + "', metafields='" + metafields + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LocationEditInput that = (LocationEditInput) o;
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
    private LocationEditAddressInput address;

    /**
     * Whether inventory at this location is available for sale online.
     *   
     * **Note:** This can't be disabled for fulfillment service locations.
     */
    private Boolean fulfillsOnlineOrders;

    /**
     * Additional customizable information to associate with the location.
     */
    private List<MetafieldInput> metafields;

    public LocationEditInput build() {
      LocationEditInput result = new LocationEditInput();
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
    public Builder address(LocationEditAddressInput address) {
      this.address = address;
      return this;
    }

    /**
     * Whether inventory at this location is available for sale online.
     *   
     * **Note:** This can't be disabled for fulfillment service locations.
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
