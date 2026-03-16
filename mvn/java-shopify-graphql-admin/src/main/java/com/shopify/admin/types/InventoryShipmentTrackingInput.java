package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields for an inventory shipment's tracking information.
 */
public class InventoryShipmentTrackingInput {
  /**
   * The tracking number for the shipment.
   */
  private String trackingNumber;

  /**
   * The name of the shipping carrier company.
   *   
   * Given a shipping carrier company name from
   * [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#field-company),
   * Shopify can build a tracking URL for a provided tracking number.
   */
  private String company;

  /**
   * The URL to track the shipment.
   *   
   * Use this field to specify a custom tracking URL. If no custom tracking URL is set, Shopify will automatically provide
   * this field on query for a tracking number and a supported shipping carrier company from
   * [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#field-company).
   */
  private String trackingUrl;

  /**
   * The estimated date and time that the shipment will arrive.
   */
  private OffsetDateTime arrivesAt;

  public InventoryShipmentTrackingInput() {
  }

  /**
   * The tracking number for the shipment.
   */
  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  /**
   * The name of the shipping carrier company.
   *   
   * Given a shipping carrier company name from
   * [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#field-company),
   * Shopify can build a tracking URL for a provided tracking number.
   */
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  /**
   * The URL to track the shipment.
   *   
   * Use this field to specify a custom tracking URL. If no custom tracking URL is set, Shopify will automatically provide
   * this field on query for a tracking number and a supported shipping carrier company from
   * [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#field-company).
   */
  public String getTrackingUrl() {
    return trackingUrl;
  }

  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
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

  @Override
  public String toString() {
    return "InventoryShipmentTrackingInput{trackingNumber='" + trackingNumber + "', company='" + company + "', trackingUrl='" + trackingUrl + "', arrivesAt='" + arrivesAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryShipmentTrackingInput that = (InventoryShipmentTrackingInput) o;
    return Objects.equals(trackingNumber, that.trackingNumber) &&
        Objects.equals(company, that.company) &&
        Objects.equals(trackingUrl, that.trackingUrl) &&
        Objects.equals(arrivesAt, that.arrivesAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackingNumber, company, trackingUrl, arrivesAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The tracking number for the shipment.
     */
    private String trackingNumber;

    /**
     * The name of the shipping carrier company.
     *   
     * Given a shipping carrier company name from
     * [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#field-company),
     * Shopify can build a tracking URL for a provided tracking number.
     */
    private String company;

    /**
     * The URL to track the shipment.
     *   
     * Use this field to specify a custom tracking URL. If no custom tracking URL is set, Shopify will automatically provide
     * this field on query for a tracking number and a supported shipping carrier company from
     * [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#field-company).
     */
    private String trackingUrl;

    /**
     * The estimated date and time that the shipment will arrive.
     */
    private OffsetDateTime arrivesAt;

    public InventoryShipmentTrackingInput build() {
      InventoryShipmentTrackingInput result = new InventoryShipmentTrackingInput();
      result.trackingNumber = this.trackingNumber;
      result.company = this.company;
      result.trackingUrl = this.trackingUrl;
      result.arrivesAt = this.arrivesAt;
      return result;
    }

    /**
     * The tracking number for the shipment.
     */
    public Builder trackingNumber(String trackingNumber) {
      this.trackingNumber = trackingNumber;
      return this;
    }

    /**
     * The name of the shipping carrier company.
     *   
     * Given a shipping carrier company name from
     * [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#field-company),
     * Shopify can build a tracking URL for a provided tracking number.
     */
    public Builder company(String company) {
      this.company = company;
      return this;
    }

    /**
     * The URL to track the shipment.
     *   
     * Use this field to specify a custom tracking URL. If no custom tracking URL is set, Shopify will automatically provide
     * this field on query for a tracking number and a supported shipping carrier company from
     * [the list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#field-company).
     */
    public Builder trackingUrl(String trackingUrl) {
      this.trackingUrl = trackingUrl;
      return this;
    }

    /**
     * The estimated date and time that the shipment will arrive.
     */
    public Builder arrivesAt(OffsetDateTime arrivesAt) {
      this.arrivesAt = arrivesAt;
      return this;
    }
  }
}
