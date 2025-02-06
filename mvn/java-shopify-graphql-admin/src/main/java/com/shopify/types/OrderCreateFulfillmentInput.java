package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a fulfillment to create for an order.
 */
public class OrderCreateFulfillmentInput {
  /**
   * The ID of the location to fulfill the order from.
   */
  private String locationId;

  /**
   * The address at which the fulfillment occurred.
   */
  private FulfillmentOriginAddressInput originAddress;

  /**
   * Whether the customer should be notified of changes with the fulfillment.
   */
  private Boolean notifyCustomer = false;

  /**
   * The status of the shipment.
   */
  private FulfillmentEventStatus shipmentStatus;

  /**
   * The tracking number of the fulfillment.
   *   
   * The tracking number will be clickable in the interface if one of the following applies
   * (the highest in the list has the highest priority):
   *   
   * * [Shopify-known tracking company name](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies)
   *   specified in the `company` field.
   *   Shopify will build the tracking URL automatically based on the tracking number specified.
   * * The tracking number has a Shopify-known format.
   *   Shopify will guess the tracking provider and build the tracking url based on the tracking number format.
   *   Not all tracking carriers are supported, and multiple tracking carriers may use similarly formatted tracking numbers.
   *   This can result in an invalid tracking URL.
   */
  private String trackingNumber;

  /**
   * The name of the tracking company.
   *   
   * If you specify a tracking company name from
   * [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies),
   * Shopify will automatically build tracking URLs for all provided tracking numbers,
   * which will make the tracking numbers clickable in the interface.
   * The same tracking company will be applied to all tracking numbers specified.
   *   
   * Additionally, for the tracking companies listed on the
   * [Shipping Carriers help page](https://help.shopify.com/manual/shipping/understanding-shipping/shipping-carriers#integrated-shipping-carriers)
   * Shopify will automatically update the fulfillment's `shipment_status` field during the fulfillment process.
   *   
   * > Note:
   * > Send the tracking company name exactly as written in
   * > [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies)
   * > (capitalization matters).
   */
  private String trackingCompany;

  public OrderCreateFulfillmentInput() {
  }

  /**
   * The ID of the location to fulfill the order from.
   */
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  /**
   * The address at which the fulfillment occurred.
   */
  public FulfillmentOriginAddressInput getOriginAddress() {
    return originAddress;
  }

  public void setOriginAddress(FulfillmentOriginAddressInput originAddress) {
    this.originAddress = originAddress;
  }

  /**
   * Whether the customer should be notified of changes with the fulfillment.
   */
  public Boolean getNotifyCustomer() {
    return notifyCustomer;
  }

  public void setNotifyCustomer(Boolean notifyCustomer) {
    this.notifyCustomer = notifyCustomer;
  }

  /**
   * The status of the shipment.
   */
  public FulfillmentEventStatus getShipmentStatus() {
    return shipmentStatus;
  }

  public void setShipmentStatus(FulfillmentEventStatus shipmentStatus) {
    this.shipmentStatus = shipmentStatus;
  }

  /**
   * The tracking number of the fulfillment.
   *   
   * The tracking number will be clickable in the interface if one of the following applies
   * (the highest in the list has the highest priority):
   *   
   * * [Shopify-known tracking company name](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies)
   *   specified in the `company` field.
   *   Shopify will build the tracking URL automatically based on the tracking number specified.
   * * The tracking number has a Shopify-known format.
   *   Shopify will guess the tracking provider and build the tracking url based on the tracking number format.
   *   Not all tracking carriers are supported, and multiple tracking carriers may use similarly formatted tracking numbers.
   *   This can result in an invalid tracking URL.
   */
  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  /**
   * The name of the tracking company.
   *   
   * If you specify a tracking company name from
   * [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies),
   * Shopify will automatically build tracking URLs for all provided tracking numbers,
   * which will make the tracking numbers clickable in the interface.
   * The same tracking company will be applied to all tracking numbers specified.
   *   
   * Additionally, for the tracking companies listed on the
   * [Shipping Carriers help page](https://help.shopify.com/manual/shipping/understanding-shipping/shipping-carriers#integrated-shipping-carriers)
   * Shopify will automatically update the fulfillment's `shipment_status` field during the fulfillment process.
   *   
   * > Note:
   * > Send the tracking company name exactly as written in
   * > [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies)
   * > (capitalization matters).
   */
  public String getTrackingCompany() {
    return trackingCompany;
  }

  public void setTrackingCompany(String trackingCompany) {
    this.trackingCompany = trackingCompany;
  }

  @Override
  public String toString() {
    return "OrderCreateFulfillmentInput{locationId='" + locationId + "', originAddress='" + originAddress + "', notifyCustomer='" + notifyCustomer + "', shipmentStatus='" + shipmentStatus + "', trackingNumber='" + trackingNumber + "', trackingCompany='" + trackingCompany + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCreateFulfillmentInput that = (OrderCreateFulfillmentInput) o;
    return Objects.equals(locationId, that.locationId) &&
        Objects.equals(originAddress, that.originAddress) &&
        Objects.equals(notifyCustomer, that.notifyCustomer) &&
        Objects.equals(shipmentStatus, that.shipmentStatus) &&
        Objects.equals(trackingNumber, that.trackingNumber) &&
        Objects.equals(trackingCompany, that.trackingCompany);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, originAddress, notifyCustomer, shipmentStatus, trackingNumber, trackingCompany);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the location to fulfill the order from.
     */
    private String locationId;

    /**
     * The address at which the fulfillment occurred.
     */
    private FulfillmentOriginAddressInput originAddress;

    /**
     * Whether the customer should be notified of changes with the fulfillment.
     */
    private Boolean notifyCustomer = false;

    /**
     * The status of the shipment.
     */
    private FulfillmentEventStatus shipmentStatus;

    /**
     * The tracking number of the fulfillment.
     *   
     * The tracking number will be clickable in the interface if one of the following applies
     * (the highest in the list has the highest priority):
     *   
     * * [Shopify-known tracking company name](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies)
     *   specified in the `company` field.
     *   Shopify will build the tracking URL automatically based on the tracking number specified.
     * * The tracking number has a Shopify-known format.
     *   Shopify will guess the tracking provider and build the tracking url based on the tracking number format.
     *   Not all tracking carriers are supported, and multiple tracking carriers may use similarly formatted tracking numbers.
     *   This can result in an invalid tracking URL.
     */
    private String trackingNumber;

    /**
     * The name of the tracking company.
     *   
     * If you specify a tracking company name from
     * [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies),
     * Shopify will automatically build tracking URLs for all provided tracking numbers,
     * which will make the tracking numbers clickable in the interface.
     * The same tracking company will be applied to all tracking numbers specified.
     *   
     * Additionally, for the tracking companies listed on the
     * [Shipping Carriers help page](https://help.shopify.com/manual/shipping/understanding-shipping/shipping-carriers#integrated-shipping-carriers)
     * Shopify will automatically update the fulfillment's `shipment_status` field during the fulfillment process.
     *   
     * > Note:
     * > Send the tracking company name exactly as written in
     * > [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies)
     * > (capitalization matters).
     */
    private String trackingCompany;

    public OrderCreateFulfillmentInput build() {
      OrderCreateFulfillmentInput result = new OrderCreateFulfillmentInput();
      result.locationId = this.locationId;
      result.originAddress = this.originAddress;
      result.notifyCustomer = this.notifyCustomer;
      result.shipmentStatus = this.shipmentStatus;
      result.trackingNumber = this.trackingNumber;
      result.trackingCompany = this.trackingCompany;
      return result;
    }

    /**
     * The ID of the location to fulfill the order from.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    /**
     * The address at which the fulfillment occurred.
     */
    public Builder originAddress(FulfillmentOriginAddressInput originAddress) {
      this.originAddress = originAddress;
      return this;
    }

    /**
     * Whether the customer should be notified of changes with the fulfillment.
     */
    public Builder notifyCustomer(Boolean notifyCustomer) {
      this.notifyCustomer = notifyCustomer;
      return this;
    }

    /**
     * The status of the shipment.
     */
    public Builder shipmentStatus(FulfillmentEventStatus shipmentStatus) {
      this.shipmentStatus = shipmentStatus;
      return this;
    }

    /**
     * The tracking number of the fulfillment.
     *   
     * The tracking number will be clickable in the interface if one of the following applies
     * (the highest in the list has the highest priority):
     *   
     * * [Shopify-known tracking company name](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies)
     *   specified in the `company` field.
     *   Shopify will build the tracking URL automatically based on the tracking number specified.
     * * The tracking number has a Shopify-known format.
     *   Shopify will guess the tracking provider and build the tracking url based on the tracking number format.
     *   Not all tracking carriers are supported, and multiple tracking carriers may use similarly formatted tracking numbers.
     *   This can result in an invalid tracking URL.
     */
    public Builder trackingNumber(String trackingNumber) {
      this.trackingNumber = trackingNumber;
      return this;
    }

    /**
     * The name of the tracking company.
     *   
     * If you specify a tracking company name from
     * [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies),
     * Shopify will automatically build tracking URLs for all provided tracking numbers,
     * which will make the tracking numbers clickable in the interface.
     * The same tracking company will be applied to all tracking numbers specified.
     *   
     * Additionally, for the tracking companies listed on the
     * [Shipping Carriers help page](https://help.shopify.com/manual/shipping/understanding-shipping/shipping-carriers#integrated-shipping-carriers)
     * Shopify will automatically update the fulfillment's `shipment_status` field during the fulfillment process.
     *   
     * > Note:
     * > Send the tracking company name exactly as written in
     * > [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies)
     * > (capitalization matters).
     */
    public Builder trackingCompany(String trackingCompany) {
      this.trackingCompany = trackingCompany;
      return this;
    }
  }
}
