package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents the information used to track a reverse delivery.
 */
public class ReverseDeliveryTrackingV2 {
  /**
   * The provider of the tracking information, in a human-readable format for display purposes.
   */
  private String carrierName;

  /**
   * The identifier used by the courier to identify the shipment.
   */
  private String number;

  /**
   * The URL to track a shipment.
   */
  private String url;

  public ReverseDeliveryTrackingV2() {
  }

  /**
   * The provider of the tracking information, in a human-readable format for display purposes.
   */
  public String getCarrierName() {
    return carrierName;
  }

  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }

  /**
   * The identifier used by the courier to identify the shipment.
   */
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  /**
   * The URL to track a shipment.
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "ReverseDeliveryTrackingV2{carrierName='" + carrierName + "', number='" + number + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseDeliveryTrackingV2 that = (ReverseDeliveryTrackingV2) o;
    return Objects.equals(carrierName, that.carrierName) &&
        Objects.equals(number, that.number) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierName, number, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The provider of the tracking information, in a human-readable format for display purposes.
     */
    private String carrierName;

    /**
     * The identifier used by the courier to identify the shipment.
     */
    private String number;

    /**
     * The URL to track a shipment.
     */
    private String url;

    public ReverseDeliveryTrackingV2 build() {
      ReverseDeliveryTrackingV2 result = new ReverseDeliveryTrackingV2();
      result.carrierName = this.carrierName;
      result.number = this.number;
      result.url = this.url;
      return result;
    }

    /**
     * The provider of the tracking information, in a human-readable format for display purposes.
     */
    public Builder carrierName(String carrierName) {
      this.carrierName = carrierName;
      return this;
    }

    /**
     * The identifier used by the courier to identify the shipment.
     */
    public Builder number(String number) {
      this.number = number;
      return this;
    }

    /**
     * The URL to track a shipment.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
