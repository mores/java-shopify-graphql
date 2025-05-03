package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Tracking information associated with the fulfillment.
 */
public class FulfillmentTrackingInfo {
  /**
   * The tracking number of the fulfillment.
   */
  private String number;

  /**
   * The URL to track the fulfillment.
   */
  private String url;

  public FulfillmentTrackingInfo() {
  }

  /**
   * The tracking number of the fulfillment.
   */
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  /**
   * The URL to track the fulfillment.
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "FulfillmentTrackingInfo{number='" + number + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentTrackingInfo that = (FulfillmentTrackingInfo) o;
    return Objects.equals(number, that.number) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The tracking number of the fulfillment.
     */
    private String number;

    /**
     * The URL to track the fulfillment.
     */
    private String url;

    public FulfillmentTrackingInfo build() {
      FulfillmentTrackingInfo result = new FulfillmentTrackingInfo();
      result.number = this.number;
      result.url = this.url;
      return result;
    }

    /**
     * The tracking number of the fulfillment.
     */
    public Builder number(String number) {
      this.number = number;
      return this;
    }

    /**
     * The URL to track the fulfillment.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
