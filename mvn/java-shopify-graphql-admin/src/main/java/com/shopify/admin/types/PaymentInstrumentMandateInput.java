package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for specifying a specific mandate resource.
 */
public class PaymentInstrumentMandateInput {
  /**
   * The type of resource.
   */
  private PaymentInstrumentMandateResourceType resourceType;

  /**
   * The ID of the resource (subscription contract, order, or draft order).
   */
  private String resourceId;

  public PaymentInstrumentMandateInput() {
  }

  /**
   * The type of resource.
   */
  public PaymentInstrumentMandateResourceType getResourceType() {
    return resourceType;
  }

  public void setResourceType(PaymentInstrumentMandateResourceType resourceType) {
    this.resourceType = resourceType;
  }

  /**
   * The ID of the resource (subscription contract, order, or draft order).
   */
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  @Override
  public String toString() {
    return "PaymentInstrumentMandateInput{resourceType='" + resourceType + "', resourceId='" + resourceId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentInstrumentMandateInput that = (PaymentInstrumentMandateInput) o;
    return Objects.equals(resourceType, that.resourceType) &&
        Objects.equals(resourceId, that.resourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType, resourceId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The type of resource.
     */
    private PaymentInstrumentMandateResourceType resourceType;

    /**
     * The ID of the resource (subscription contract, order, or draft order).
     */
    private String resourceId;

    public PaymentInstrumentMandateInput build() {
      PaymentInstrumentMandateInput result = new PaymentInstrumentMandateInput();
      result.resourceType = this.resourceType;
      result.resourceId = this.resourceId;
      return result;
    }

    /**
     * The type of resource.
     */
    public Builder resourceType(PaymentInstrumentMandateResourceType resourceType) {
      this.resourceType = resourceType;
      return this;
    }

    /**
     * The ID of the resource (subscription contract, order, or draft order).
     */
    public Builder resourceId(String resourceId) {
      this.resourceId = resourceId;
      return this;
    }
  }
}
