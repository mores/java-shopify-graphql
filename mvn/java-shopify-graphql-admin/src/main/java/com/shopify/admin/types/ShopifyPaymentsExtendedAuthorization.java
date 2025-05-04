package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Presents all Shopify Payments information related to an extended authorization.
 */
public class ShopifyPaymentsExtendedAuthorization {
  /**
   * The time after which the extended authorization expires. After the expiry, the merchant is unable to capture the payment.
   */
  private OffsetDateTime extendedAuthorizationExpiresAt;

  /**
   * The time after which capture will incur an additional fee.
   */
  private OffsetDateTime standardAuthorizationExpiresAt;

  public ShopifyPaymentsExtendedAuthorization() {
  }

  /**
   * The time after which the extended authorization expires. After the expiry, the merchant is unable to capture the payment.
   */
  public OffsetDateTime getExtendedAuthorizationExpiresAt() {
    return extendedAuthorizationExpiresAt;
  }

  public void setExtendedAuthorizationExpiresAt(OffsetDateTime extendedAuthorizationExpiresAt) {
    this.extendedAuthorizationExpiresAt = extendedAuthorizationExpiresAt;
  }

  /**
   * The time after which capture will incur an additional fee.
   */
  public OffsetDateTime getStandardAuthorizationExpiresAt() {
    return standardAuthorizationExpiresAt;
  }

  public void setStandardAuthorizationExpiresAt(OffsetDateTime standardAuthorizationExpiresAt) {
    this.standardAuthorizationExpiresAt = standardAuthorizationExpiresAt;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsExtendedAuthorization{extendedAuthorizationExpiresAt='" + extendedAuthorizationExpiresAt + "', standardAuthorizationExpiresAt='" + standardAuthorizationExpiresAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsExtendedAuthorization that = (ShopifyPaymentsExtendedAuthorization) o;
    return Objects.equals(extendedAuthorizationExpiresAt, that.extendedAuthorizationExpiresAt) &&
        Objects.equals(standardAuthorizationExpiresAt, that.standardAuthorizationExpiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extendedAuthorizationExpiresAt, standardAuthorizationExpiresAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The time after which the extended authorization expires. After the expiry, the merchant is unable to capture the payment.
     */
    private OffsetDateTime extendedAuthorizationExpiresAt;

    /**
     * The time after which capture will incur an additional fee.
     */
    private OffsetDateTime standardAuthorizationExpiresAt;

    public ShopifyPaymentsExtendedAuthorization build() {
      ShopifyPaymentsExtendedAuthorization result = new ShopifyPaymentsExtendedAuthorization();
      result.extendedAuthorizationExpiresAt = this.extendedAuthorizationExpiresAt;
      result.standardAuthorizationExpiresAt = this.standardAuthorizationExpiresAt;
      return result;
    }

    /**
     * The time after which the extended authorization expires. After the expiry, the merchant is unable to capture the payment.
     */
    public Builder extendedAuthorizationExpiresAt(OffsetDateTime extendedAuthorizationExpiresAt) {
      this.extendedAuthorizationExpiresAt = extendedAuthorizationExpiresAt;
      return this;
    }

    /**
     * The time after which capture will incur an additional fee.
     */
    public Builder standardAuthorizationExpiresAt(OffsetDateTime standardAuthorizationExpiresAt) {
      this.standardAuthorizationExpiresAt = standardAuthorizationExpiresAt;
      return this;
    }
  }
}
