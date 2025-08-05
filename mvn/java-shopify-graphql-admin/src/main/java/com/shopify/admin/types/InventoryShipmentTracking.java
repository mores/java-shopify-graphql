package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents the tracking information for an inventory shipment.
 */
public class InventoryShipmentTracking {
  /**
   * The estimated date and time that the shipment will arrive.
   */
  private OffsetDateTime arrivesAt;

  /**
   * The name of the shipping carrier company.
   */
  private String company;

  /**
   * The tracking number used by the carrier to identify the shipment.
   */
  private String trackingNumber;

  /**
   * The URL to track the shipment.
   *   
   * Given a tracking number and a shipping carrier company name from
   * [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#field-company),
   * Shopify will return a generated tracking URL if no tracking URL was set manually.
   */
  private String trackingUrl;

  public InventoryShipmentTracking() {
  }

  /**
   * The estimated date and time that the shipment will arrive.
   */
  public OffsetDateTime getArrivesAt() {
    return arrivesAt;
  }

  public void setArrivesAt(OffsetDateTime arrivesAt) {
    this.arrivesAt = arrivesAt;
  }

  /**
   * The name of the shipping carrier company.
   */
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  /**
   * The tracking number used by the carrier to identify the shipment.
   */
  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  /**
   * The URL to track the shipment.
   *   
   * Given a tracking number and a shipping carrier company name from
   * [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#field-company),
   * Shopify will return a generated tracking URL if no tracking URL was set manually.
   */
  public String getTrackingUrl() {
    return trackingUrl;
  }

  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }

  @Override
  public String toString() {
    return "InventoryShipmentTracking{arrivesAt='" + arrivesAt + "', company='" + company + "', trackingNumber='" + trackingNumber + "', trackingUrl='" + trackingUrl + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryShipmentTracking that = (InventoryShipmentTracking) o;
    return Objects.equals(arrivesAt, that.arrivesAt) &&
        Objects.equals(company, that.company) &&
        Objects.equals(trackingNumber, that.trackingNumber) &&
        Objects.equals(trackingUrl, that.trackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrivesAt, company, trackingNumber, trackingUrl);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The estimated date and time that the shipment will arrive.
     */
    private OffsetDateTime arrivesAt;

    /**
     * The name of the shipping carrier company.
     */
    private String company;

    /**
     * The tracking number used by the carrier to identify the shipment.
     */
    private String trackingNumber;

    /**
     * The URL to track the shipment.
     *   
     * Given a tracking number and a shipping carrier company name from
     * [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#field-company),
     * Shopify will return a generated tracking URL if no tracking URL was set manually.
     */
    private String trackingUrl;

    public InventoryShipmentTracking build() {
      InventoryShipmentTracking result = new InventoryShipmentTracking();
      result.arrivesAt = this.arrivesAt;
      result.company = this.company;
      result.trackingNumber = this.trackingNumber;
      result.trackingUrl = this.trackingUrl;
      return result;
    }

    /**
     * The estimated date and time that the shipment will arrive.
     */
    public Builder arrivesAt(OffsetDateTime arrivesAt) {
      this.arrivesAt = arrivesAt;
      return this;
    }

    /**
     * The name of the shipping carrier company.
     */
    public Builder company(String company) {
      this.company = company;
      return this;
    }

    /**
     * The tracking number used by the carrier to identify the shipment.
     */
    public Builder trackingNumber(String trackingNumber) {
      this.trackingNumber = trackingNumber;
      return this;
    }

    /**
     * The URL to track the shipment.
     *   
     * Given a tracking number and a shipping carrier company name from
     * [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#field-company),
     * Shopify will return a generated tracking URL if no tracking URL was set manually.
     */
    public Builder trackingUrl(String trackingUrl) {
      this.trackingUrl = trackingUrl;
      return this;
    }
  }
}
