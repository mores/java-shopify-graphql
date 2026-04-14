package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An inventory-related error that occurred during a subscription billing attempt.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionBillingAttemptInventoryError implements SubscriptionBillingAttemptError {
  /**
   * The error code for the inventory-related failure.
   */
  private SubscriptionBillingAttemptInventoryErrorCode code;

  /**
   * A list of product variants that caused the insufficient inventory error.
   */
  private ProductVariantConnection insufficientStockProductVariants;

  public SubscriptionBillingAttemptInventoryError() {
  }

  /**
   * The error code for the inventory-related failure.
   */
  public SubscriptionBillingAttemptInventoryErrorCode getCode() {
    return code;
  }

  public void setCode(SubscriptionBillingAttemptInventoryErrorCode code) {
    this.code = code;
  }

  /**
   * A list of product variants that caused the insufficient inventory error.
   */
  public ProductVariantConnection getInsufficientStockProductVariants() {
    return insufficientStockProductVariants;
  }

  public void setInsufficientStockProductVariants(
      ProductVariantConnection insufficientStockProductVariants) {
    this.insufficientStockProductVariants = insufficientStockProductVariants;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingAttemptInventoryError{code='" + code + "', insufficientStockProductVariants='" + insufficientStockProductVariants + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingAttemptInventoryError that = (SubscriptionBillingAttemptInventoryError) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(insufficientStockProductVariants, that.insufficientStockProductVariants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, insufficientStockProductVariants);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The error code for the inventory-related failure.
     */
    private SubscriptionBillingAttemptInventoryErrorCode code;

    /**
     * A list of product variants that caused the insufficient inventory error.
     */
    private ProductVariantConnection insufficientStockProductVariants;

    public SubscriptionBillingAttemptInventoryError build() {
      SubscriptionBillingAttemptInventoryError result = new SubscriptionBillingAttemptInventoryError();
      result.code = this.code;
      result.insufficientStockProductVariants = this.insufficientStockProductVariants;
      return result;
    }

    /**
     * The error code for the inventory-related failure.
     */
    public Builder code(SubscriptionBillingAttemptInventoryErrorCode code) {
      this.code = code;
      return this;
    }

    /**
     * A list of product variants that caused the insufficient inventory error.
     */
    public Builder insufficientStockProductVariants(
        ProductVariantConnection insufficientStockProductVariants) {
      this.insufficientStockProductVariants = insufficientStockProductVariants;
      return this;
    }
  }
}
