package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The delivery promise settings.
 */
public class DeliveryPromiseSetting {
  /**
   * Whether delivery dates is enabled.
   */
  private boolean deliveryDatesEnabled;

  /**
   * The number of business days required for processing the order before the
   * package is handed off to the carrier. Expressed as an ISO8601 duration.
   */
  private String processingTime;

  public DeliveryPromiseSetting() {
  }

  /**
   * Whether delivery dates is enabled.
   */
  public boolean getDeliveryDatesEnabled() {
    return deliveryDatesEnabled;
  }

  public void setDeliveryDatesEnabled(boolean deliveryDatesEnabled) {
    this.deliveryDatesEnabled = deliveryDatesEnabled;
  }

  /**
   * The number of business days required for processing the order before the
   * package is handed off to the carrier. Expressed as an ISO8601 duration.
   */
  public String getProcessingTime() {
    return processingTime;
  }

  public void setProcessingTime(String processingTime) {
    this.processingTime = processingTime;
  }

  @Override
  public String toString() {
    return "DeliveryPromiseSetting{deliveryDatesEnabled='" + deliveryDatesEnabled + "', processingTime='" + processingTime + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryPromiseSetting that = (DeliveryPromiseSetting) o;
    return deliveryDatesEnabled == that.deliveryDatesEnabled &&
        Objects.equals(processingTime, that.processingTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryDatesEnabled, processingTime);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether delivery dates is enabled.
     */
    private boolean deliveryDatesEnabled;

    /**
     * The number of business days required for processing the order before the
     * package is handed off to the carrier. Expressed as an ISO8601 duration.
     */
    private String processingTime;

    public DeliveryPromiseSetting build() {
      DeliveryPromiseSetting result = new DeliveryPromiseSetting();
      result.deliveryDatesEnabled = this.deliveryDatesEnabled;
      result.processingTime = this.processingTime;
      return result;
    }

    /**
     * Whether delivery dates is enabled.
     */
    public Builder deliveryDatesEnabled(boolean deliveryDatesEnabled) {
      this.deliveryDatesEnabled = deliveryDatesEnabled;
      return this;
    }

    /**
     * The number of business days required for processing the order before the
     * package is handed off to the carrier. Expressed as an ISO8601 duration.
     */
    public Builder processingTime(String processingTime) {
      this.processingTime = processingTime;
      return this;
    }
  }
}
