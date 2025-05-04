package com.shopify.admin.types;

import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the quantity of items discounted and the discount value.
 */
public class DiscountCustomerGetsValueInput {
  /**
   * The quantity of the items that are discounted and the discount value.
   */
  private DiscountOnQuantityInput discountOnQuantity;

  /**
   * The percentage value of the discount. Value must be between 0.00 - 1.00.
   */
  private Double percentage;

  /**
   * The value of the discount.
   */
  private DiscountAmountInput discountAmount;

  public DiscountCustomerGetsValueInput() {
  }

  /**
   * The quantity of the items that are discounted and the discount value.
   */
  public DiscountOnQuantityInput getDiscountOnQuantity() {
    return discountOnQuantity;
  }

  public void setDiscountOnQuantity(DiscountOnQuantityInput discountOnQuantity) {
    this.discountOnQuantity = discountOnQuantity;
  }

  /**
   * The percentage value of the discount. Value must be between 0.00 - 1.00.
   */
  public Double getPercentage() {
    return percentage;
  }

  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }

  /**
   * The value of the discount.
   */
  public DiscountAmountInput getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(DiscountAmountInput discountAmount) {
    this.discountAmount = discountAmount;
  }

  @Override
  public String toString() {
    return "DiscountCustomerGetsValueInput{discountOnQuantity='" + discountOnQuantity + "', percentage='" + percentage + "', discountAmount='" + discountAmount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCustomerGetsValueInput that = (DiscountCustomerGetsValueInput) o;
    return Objects.equals(discountOnQuantity, that.discountOnQuantity) &&
        Objects.equals(percentage, that.percentage) &&
        Objects.equals(discountAmount, that.discountAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountOnQuantity, percentage, discountAmount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The quantity of the items that are discounted and the discount value.
     */
    private DiscountOnQuantityInput discountOnQuantity;

    /**
     * The percentage value of the discount. Value must be between 0.00 - 1.00.
     */
    private Double percentage;

    /**
     * The value of the discount.
     */
    private DiscountAmountInput discountAmount;

    public DiscountCustomerGetsValueInput build() {
      DiscountCustomerGetsValueInput result = new DiscountCustomerGetsValueInput();
      result.discountOnQuantity = this.discountOnQuantity;
      result.percentage = this.percentage;
      result.discountAmount = this.discountAmount;
      return result;
    }

    /**
     * The quantity of the items that are discounted and the discount value.
     */
    public Builder discountOnQuantity(DiscountOnQuantityInput discountOnQuantity) {
      this.discountOnQuantity = discountOnQuantity;
      return this;
    }

    /**
     * The percentage value of the discount. Value must be between 0.00 - 1.00.
     */
    public Builder percentage(Double percentage) {
      this.percentage = percentage;
      return this;
    }

    /**
     * The value of the discount.
     */
    public Builder discountAmount(DiscountAmountInput discountAmount) {
      this.discountAmount = discountAmount;
      return this;
    }
  }
}
