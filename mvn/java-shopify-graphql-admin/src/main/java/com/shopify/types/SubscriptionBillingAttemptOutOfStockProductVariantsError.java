package com.shopify.types;

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
public class SubscriptionBillingAttemptOutOfStockProductVariantsError implements com.shopify.types.SubscriptionBillingAttemptProcessingError {
  /**
   * The code for the error.
   */
  private SubscriptionBillingAttemptErrorCode code;

  /**
   * An explanation of the error.
   */
  private String message;

  /**
   * A list of responsible product variants.
   */
  private ProductVariantConnection outOfStockProductVariants;

  public SubscriptionBillingAttemptOutOfStockProductVariantsError() {
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
   * An explanation of the error.
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * A list of responsible product variants.
   */
  public ProductVariantConnection getOutOfStockProductVariants() {
    return outOfStockProductVariants;
  }

  public void setOutOfStockProductVariants(ProductVariantConnection outOfStockProductVariants) {
    this.outOfStockProductVariants = outOfStockProductVariants;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingAttemptOutOfStockProductVariantsError{code='" + code + "', message='" + message + "', outOfStockProductVariants='" + outOfStockProductVariants + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingAttemptOutOfStockProductVariantsError that = (SubscriptionBillingAttemptOutOfStockProductVariantsError) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(message, that.message) &&
        Objects.equals(outOfStockProductVariants, that.outOfStockProductVariants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, outOfStockProductVariants);
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
     * An explanation of the error.
     */
    private String message;

    /**
     * A list of responsible product variants.
     */
    private ProductVariantConnection outOfStockProductVariants;

    public SubscriptionBillingAttemptOutOfStockProductVariantsError build() {
      SubscriptionBillingAttemptOutOfStockProductVariantsError result = new SubscriptionBillingAttemptOutOfStockProductVariantsError();
      result.code = this.code;
      result.message = this.message;
      result.outOfStockProductVariants = this.outOfStockProductVariants;
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
     * An explanation of the error.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }

    /**
     * A list of responsible product variants.
     */
    public Builder outOfStockProductVariants(ProductVariantConnection outOfStockProductVariants) {
      this.outOfStockProductVariants = outOfStockProductVariants;
      return this;
    }
  }
}
