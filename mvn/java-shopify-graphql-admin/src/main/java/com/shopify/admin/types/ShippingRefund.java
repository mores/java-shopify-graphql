package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents the shipping costs refunded on the Refund.
 */
public class ShippingRefund {
  /**
   * The monetary value of the shipping fees to be refunded.
   */
  private String amount;

  /**
   * The monetary value of the shipping fees to be refunded in shop and presentment currencies.
   */
  private MoneyBag amountSet;

  /**
   * The maximum amount of shipping fees currently refundable.
   */
  private String maximumRefundable;

  /**
   * The maximum amount of shipping fees currently refundable in shop and presentment currencies.
   */
  private MoneyBag maximumRefundableSet;

  /**
   * The monetary value of the tax allocated to shipping fees to be refunded.
   */
  private String tax;

  /**
   * The monetary value of the tax allocated to shipping fees to be refunded in shop and presentment currencies.
   */
  private MoneyBag taxSet;

  public ShippingRefund() {
  }

  /**
   * The monetary value of the shipping fees to be refunded.
   */
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * The monetary value of the shipping fees to be refunded in shop and presentment currencies.
   */
  public MoneyBag getAmountSet() {
    return amountSet;
  }

  public void setAmountSet(MoneyBag amountSet) {
    this.amountSet = amountSet;
  }

  /**
   * The maximum amount of shipping fees currently refundable.
   */
  public String getMaximumRefundable() {
    return maximumRefundable;
  }

  public void setMaximumRefundable(String maximumRefundable) {
    this.maximumRefundable = maximumRefundable;
  }

  /**
   * The maximum amount of shipping fees currently refundable in shop and presentment currencies.
   */
  public MoneyBag getMaximumRefundableSet() {
    return maximumRefundableSet;
  }

  public void setMaximumRefundableSet(MoneyBag maximumRefundableSet) {
    this.maximumRefundableSet = maximumRefundableSet;
  }

  /**
   * The monetary value of the tax allocated to shipping fees to be refunded.
   */
  public String getTax() {
    return tax;
  }

  public void setTax(String tax) {
    this.tax = tax;
  }

  /**
   * The monetary value of the tax allocated to shipping fees to be refunded in shop and presentment currencies.
   */
  public MoneyBag getTaxSet() {
    return taxSet;
  }

  public void setTaxSet(MoneyBag taxSet) {
    this.taxSet = taxSet;
  }

  @Override
  public String toString() {
    return "ShippingRefund{amount='" + amount + "', amountSet='" + amountSet + "', maximumRefundable='" + maximumRefundable + "', maximumRefundableSet='" + maximumRefundableSet + "', tax='" + tax + "', taxSet='" + taxSet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShippingRefund that = (ShippingRefund) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(amountSet, that.amountSet) &&
        Objects.equals(maximumRefundable, that.maximumRefundable) &&
        Objects.equals(maximumRefundableSet, that.maximumRefundableSet) &&
        Objects.equals(tax, that.tax) &&
        Objects.equals(taxSet, that.taxSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, amountSet, maximumRefundable, maximumRefundableSet, tax, taxSet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The monetary value of the shipping fees to be refunded.
     */
    private String amount;

    /**
     * The monetary value of the shipping fees to be refunded in shop and presentment currencies.
     */
    private MoneyBag amountSet;

    /**
     * The maximum amount of shipping fees currently refundable.
     */
    private String maximumRefundable;

    /**
     * The maximum amount of shipping fees currently refundable in shop and presentment currencies.
     */
    private MoneyBag maximumRefundableSet;

    /**
     * The monetary value of the tax allocated to shipping fees to be refunded.
     */
    private String tax;

    /**
     * The monetary value of the tax allocated to shipping fees to be refunded in shop and presentment currencies.
     */
    private MoneyBag taxSet;

    public ShippingRefund build() {
      ShippingRefund result = new ShippingRefund();
      result.amount = this.amount;
      result.amountSet = this.amountSet;
      result.maximumRefundable = this.maximumRefundable;
      result.maximumRefundableSet = this.maximumRefundableSet;
      result.tax = this.tax;
      result.taxSet = this.taxSet;
      return result;
    }

    /**
     * The monetary value of the shipping fees to be refunded.
     */
    public Builder amount(String amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The monetary value of the shipping fees to be refunded in shop and presentment currencies.
     */
    public Builder amountSet(MoneyBag amountSet) {
      this.amountSet = amountSet;
      return this;
    }

    /**
     * The maximum amount of shipping fees currently refundable.
     */
    public Builder maximumRefundable(String maximumRefundable) {
      this.maximumRefundable = maximumRefundable;
      return this;
    }

    /**
     * The maximum amount of shipping fees currently refundable in shop and presentment currencies.
     */
    public Builder maximumRefundableSet(MoneyBag maximumRefundableSet) {
      this.maximumRefundableSet = maximumRefundableSet;
      return this;
    }

    /**
     * The monetary value of the tax allocated to shipping fees to be refunded.
     */
    public Builder tax(String tax) {
      this.tax = tax;
      return this;
    }

    /**
     * The monetary value of the tax allocated to shipping fees to be refunded in shop and presentment currencies.
     */
    public Builder taxSet(MoneyBag taxSet) {
      this.taxSet = taxSet;
      return this;
    }
  }
}
