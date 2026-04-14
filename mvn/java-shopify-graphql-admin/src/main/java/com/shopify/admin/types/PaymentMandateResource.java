package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A payment mandate with resource information, representing the permission
 * the owner of the payment instrument gives to the merchant to debit it
 * for specific resources (e.g., Order, Subscriptions).
 */
public class PaymentMandateResource {
  /**
   * The ID of the resource that this payment method was created for.
   */
  private String resourceId;

  /**
   * The resource type that this payment method was created for (e.g., Order, Subscriptions).
   */
  private MandateResourceType resourceType;

  public PaymentMandateResource() {
  }

  /**
   * The ID of the resource that this payment method was created for.
   */
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  /**
   * The resource type that this payment method was created for (e.g., Order, Subscriptions).
   */
  public MandateResourceType getResourceType() {
    return resourceType;
  }

  public void setResourceType(MandateResourceType resourceType) {
    this.resourceType = resourceType;
  }

  @Override
  public String toString() {
    return "PaymentMandateResource{resourceId='" + resourceId + "', resourceType='" + resourceType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentMandateResource that = (PaymentMandateResource) o;
    return Objects.equals(resourceId, that.resourceId) &&
        Objects.equals(resourceType, that.resourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, resourceType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the resource that this payment method was created for.
     */
    private String resourceId;

    /**
     * The resource type that this payment method was created for (e.g., Order, Subscriptions).
     */
    private MandateResourceType resourceType;

    public PaymentMandateResource build() {
      PaymentMandateResource result = new PaymentMandateResource();
      result.resourceId = this.resourceId;
      result.resourceType = this.resourceType;
      return result;
    }

    /**
     * The ID of the resource that this payment method was created for.
     */
    public Builder resourceId(String resourceId) {
      this.resourceId = resourceId;
      return this;
    }

    /**
     * The resource type that this payment method was created for (e.g., Order, Subscriptions).
     */
    public Builder resourceType(MandateResourceType resourceType) {
      this.resourceType = resourceType;
      return this;
    }
  }
}
