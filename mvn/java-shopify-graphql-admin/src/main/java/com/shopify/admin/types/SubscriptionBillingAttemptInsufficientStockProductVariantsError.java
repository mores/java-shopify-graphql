package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An inventory error caused by an issue with one or more of the contract merchandise lines.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionBillingAttemptInsufficientStockProductVariantsError implements com.shopify.admin.types.SubscriptionBillingAttemptProcessingError {
  /**
   * The code for the error.
   */
  private SubscriptionBillingAttemptErrorCode code;

  /**
   * A list of product variants that caused the insufficient inventory error.
   */
  private ProductVariantConnection insufficientStockProductVariants;

  /**
   * An explanation of the error.
   */
  private String message;

  public SubscriptionBillingAttemptInsufficientStockProductVariantsError() {
  }

  /**
   * The code for the error.
   */
  public SubscriptionBillingAttemptErrorCode getCode() {
    return code;
  }

  public void setCode(SubscriptionBillingAttemptErrorCode code) {
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

  /**
   * An explanation of the error.
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingAttemptInsufficientStockProductVariantsError{code='" + code + "', insufficientStockProductVariants='" + insufficientStockProductVariants + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingAttemptInsufficientStockProductVariantsError that = (SubscriptionBillingAttemptInsufficientStockProductVariantsError) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(insufficientStockProductVariants, that.insufficientStockProductVariants) &&
        Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, insufficientStockProductVariants, message);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The code for the error.
     */
    private SubscriptionBillingAttemptErrorCode code;

    /**
     * A list of product variants that caused the insufficient inventory error.
     */
    private ProductVariantConnection insufficientStockProductVariants;

    /**
     * An explanation of the error.
     */
    private String message;

    public SubscriptionBillingAttemptInsufficientStockProductVariantsError build() {
      SubscriptionBillingAttemptInsufficientStockProductVariantsError result = new SubscriptionBillingAttemptInsufficientStockProductVariantsError();
      result.code = this.code;
      result.insufficientStockProductVariants = this.insufficientStockProductVariants;
      result.message = this.message;
      return result;
    }

    /**
     * The code for the error.
     */
    public Builder code(SubscriptionBillingAttemptErrorCode code) {
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

    /**
     * An explanation of the error.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }
}
