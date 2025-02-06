package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A warning indicating that a discount cannot be applied to a draft order.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DraftOrderDiscountNotAppliedWarning implements com.shopify.types.DraftOrderWarning {
  /**
   * The code of the discount that can't be applied.
   */
  private String discountCode;

  /**
   * The title of the discount that can't be applied.
   */
  private String discountTitle;

  /**
   * The error code.
   */
  private String errorCode;

  /**
   * The input field that the warning applies to.
   */
  private String field;

  /**
   * The warning message.
   */
  private String message;

  /**
   * The price rule that can't be applied.
   */
  private PriceRule priceRule;

  public DraftOrderDiscountNotAppliedWarning() {
  }

  /**
   * The code of the discount that can't be applied.
   */
  public String getDiscountCode() {
    return discountCode;
  }

  public void setDiscountCode(String discountCode) {
    this.discountCode = discountCode;
  }

  /**
   * The title of the discount that can't be applied.
   */
  public String getDiscountTitle() {
    return discountTitle;
  }

  public void setDiscountTitle(String discountTitle) {
    this.discountTitle = discountTitle;
  }

  /**
   * The error code.
   */
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * The input field that the warning applies to.
   */
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  /**
   * The warning message.
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * The price rule that can't be applied.
   */
  public PriceRule getPriceRule() {
    return priceRule;
  }

  public void setPriceRule(PriceRule priceRule) {
    this.priceRule = priceRule;
  }

  @Override
  public String toString() {
    return "DraftOrderDiscountNotAppliedWarning{discountCode='" + discountCode + "', discountTitle='" + discountTitle + "', errorCode='" + errorCode + "', field='" + field + "', message='" + message + "', priceRule='" + priceRule + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderDiscountNotAppliedWarning that = (DraftOrderDiscountNotAppliedWarning) o;
    return Objects.equals(discountCode, that.discountCode) &&
        Objects.equals(discountTitle, that.discountTitle) &&
        Objects.equals(errorCode, that.errorCode) &&
        Objects.equals(field, that.field) &&
        Objects.equals(message, that.message) &&
        Objects.equals(priceRule, that.priceRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountCode, discountTitle, errorCode, field, message, priceRule);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The code of the discount that can't be applied.
     */
    private String discountCode;

    /**
     * The title of the discount that can't be applied.
     */
    private String discountTitle;

    /**
     * The error code.
     */
    private String errorCode;

    /**
     * The input field that the warning applies to.
     */
    private String field;

    /**
     * The warning message.
     */
    private String message;

    /**
     * The price rule that can't be applied.
     */
    private PriceRule priceRule;

    public DraftOrderDiscountNotAppliedWarning build() {
      DraftOrderDiscountNotAppliedWarning result = new DraftOrderDiscountNotAppliedWarning();
      result.discountCode = this.discountCode;
      result.discountTitle = this.discountTitle;
      result.errorCode = this.errorCode;
      result.field = this.field;
      result.message = this.message;
      result.priceRule = this.priceRule;
      return result;
    }

    /**
     * The code of the discount that can't be applied.
     */
    public Builder discountCode(String discountCode) {
      this.discountCode = discountCode;
      return this;
    }

    /**
     * The title of the discount that can't be applied.
     */
    public Builder discountTitle(String discountTitle) {
      this.discountTitle = discountTitle;
      return this;
    }

    /**
     * The error code.
     */
    public Builder errorCode(String errorCode) {
      this.errorCode = errorCode;
      return this;
    }

    /**
     * The input field that the warning applies to.
     */
    public Builder field(String field) {
      this.field = field;
      return this;
    }

    /**
     * The warning message.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }

    /**
     * The price rule that can't be applied.
     */
    public Builder priceRule(PriceRule priceRule) {
      this.priceRule = priceRule;
      return this;
    }
  }
}
