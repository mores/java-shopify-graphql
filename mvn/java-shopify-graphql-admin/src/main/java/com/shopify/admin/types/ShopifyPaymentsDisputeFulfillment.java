package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.util.Objects;

/**
 * The fulfillment associated with dispute evidence.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopifyPaymentsDisputeFulfillment implements com.shopify.admin.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The shipping carrier for this fulfillment.
   */
  private String shippingCarrier;

  /**
   * The shipping date for this fulfillment.
   */
  private LocalDate shippingDate;

  /**
   * The shipping tracking number for this fulfillment.
   */
  private String shippingTrackingNumber;

  public ShopifyPaymentsDisputeFulfillment() {
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
   * The shipping carrier for this fulfillment.
   */
  public String getShippingCarrier() {
    return shippingCarrier;
  }

  public void setShippingCarrier(String shippingCarrier) {
    this.shippingCarrier = shippingCarrier;
  }

  /**
   * The shipping date for this fulfillment.
   */
  public LocalDate getShippingDate() {
    return shippingDate;
  }

  public void setShippingDate(LocalDate shippingDate) {
    this.shippingDate = shippingDate;
  }

  /**
   * The shipping tracking number for this fulfillment.
   */
  public String getShippingTrackingNumber() {
    return shippingTrackingNumber;
  }

  public void setShippingTrackingNumber(String shippingTrackingNumber) {
    this.shippingTrackingNumber = shippingTrackingNumber;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsDisputeFulfillment{id='" + id + "', shippingCarrier='" + shippingCarrier + "', shippingDate='" + shippingDate + "', shippingTrackingNumber='" + shippingTrackingNumber + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsDisputeFulfillment that = (ShopifyPaymentsDisputeFulfillment) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(shippingCarrier, that.shippingCarrier) &&
        Objects.equals(shippingDate, that.shippingDate) &&
        Objects.equals(shippingTrackingNumber, that.shippingTrackingNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, shippingCarrier, shippingDate, shippingTrackingNumber);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The shipping carrier for this fulfillment.
     */
    private String shippingCarrier;

    /**
     * The shipping date for this fulfillment.
     */
    private LocalDate shippingDate;

    /**
     * The shipping tracking number for this fulfillment.
     */
    private String shippingTrackingNumber;

    public ShopifyPaymentsDisputeFulfillment build() {
      ShopifyPaymentsDisputeFulfillment result = new ShopifyPaymentsDisputeFulfillment();
      result.id = this.id;
      result.shippingCarrier = this.shippingCarrier;
      result.shippingDate = this.shippingDate;
      result.shippingTrackingNumber = this.shippingTrackingNumber;
      return result;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The shipping carrier for this fulfillment.
     */
    public Builder shippingCarrier(String shippingCarrier) {
      this.shippingCarrier = shippingCarrier;
      return this;
    }

    /**
     * The shipping date for this fulfillment.
     */
    public Builder shippingDate(LocalDate shippingDate) {
      this.shippingDate = shippingDate;
      return this;
    }

    /**
     * The shipping tracking number for this fulfillment.
     */
    public Builder shippingTrackingNumber(String shippingTrackingNumber) {
      this.shippingTrackingNumber = shippingTrackingNumber;
      return this;
    }
  }
}
