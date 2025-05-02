package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents a single fulfillment in an order.
 */
public class Fulfillment {
  /**
   * List of the fulfillment's line items.
   */
  private FulfillmentLineItemConnection fulfillmentLineItems;

  /**
   * The name of the tracking company.
   */
  private String trackingCompany;

  /**
   * Tracking information associated with the fulfillment,
   * such as the tracking number and tracking URL.
   */
  private List<FulfillmentTrackingInfo> trackingInfo;

  public Fulfillment() {
  }

  /**
   * List of the fulfillment's line items.
   */
  public FulfillmentLineItemConnection getFulfillmentLineItems() {
    return fulfillmentLineItems;
  }

  public void setFulfillmentLineItems(FulfillmentLineItemConnection fulfillmentLineItems) {
    this.fulfillmentLineItems = fulfillmentLineItems;
  }

  /**
   * The name of the tracking company.
   */
  public String getTrackingCompany() {
    return trackingCompany;
  }

  public void setTrackingCompany(String trackingCompany) {
    this.trackingCompany = trackingCompany;
  }

  /**
   * Tracking information associated with the fulfillment,
   * such as the tracking number and tracking URL.
   */
  public List<FulfillmentTrackingInfo> getTrackingInfo() {
    return trackingInfo;
  }

  public void setTrackingInfo(List<FulfillmentTrackingInfo> trackingInfo) {
    this.trackingInfo = trackingInfo;
  }

  @Override
  public String toString() {
    return "Fulfillment{fulfillmentLineItems='" + fulfillmentLineItems + "', trackingCompany='" + trackingCompany + "', trackingInfo='" + trackingInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Fulfillment that = (Fulfillment) o;
    return Objects.equals(fulfillmentLineItems, that.fulfillmentLineItems) &&
        Objects.equals(trackingCompany, that.trackingCompany) &&
        Objects.equals(trackingInfo, that.trackingInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentLineItems, trackingCompany, trackingInfo);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * List of the fulfillment's line items.
     */
    private FulfillmentLineItemConnection fulfillmentLineItems;

    /**
     * The name of the tracking company.
     */
    private String trackingCompany;

    /**
     * Tracking information associated with the fulfillment,
     * such as the tracking number and tracking URL.
     */
    private List<FulfillmentTrackingInfo> trackingInfo;

    public Fulfillment build() {
      Fulfillment result = new Fulfillment();
      result.fulfillmentLineItems = this.fulfillmentLineItems;
      result.trackingCompany = this.trackingCompany;
      result.trackingInfo = this.trackingInfo;
      return result;
    }

    /**
     * List of the fulfillment's line items.
     */
    public Builder fulfillmentLineItems(FulfillmentLineItemConnection fulfillmentLineItems) {
      this.fulfillmentLineItems = fulfillmentLineItems;
      return this;
    }

    /**
     * The name of the tracking company.
     */
    public Builder trackingCompany(String trackingCompany) {
      this.trackingCompany = trackingCompany;
      return this;
    }

    /**
     * Tracking information associated with the fulfillment,
     * such as the tracking number and tracking URL.
     */
    public Builder trackingInfo(List<FulfillmentTrackingInfo> trackingInfo) {
      this.trackingInfo = trackingInfo;
      return this;
    }
  }
}
