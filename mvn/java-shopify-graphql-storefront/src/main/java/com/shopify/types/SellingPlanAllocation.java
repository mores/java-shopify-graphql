package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents an association between a variant and a selling plan. Selling plan
 * allocations describe the options offered for each variant, and the price of the
 * variant when purchased with a selling plan.
 */
public class SellingPlanAllocation {
  /**
   * The checkout charge amount due for the purchase.
   */
  private MoneyV2 checkoutChargeAmount;

  /**
   * A list of price adjustments, with a maximum of two. When there are two, the
   * first price adjustment goes into effect at the time of purchase, while the
   * second one starts after a certain number of orders. A price adjustment
   * represents how a selling plan affects pricing when a variant is purchased with
   * a selling plan. Prices display in the customer's currency if the shop is
   * configured for it.
   */
  private List<SellingPlanAllocationPriceAdjustment> priceAdjustments;

  /**
   * The remaining balance charge amount due for the purchase.
   */
  private MoneyV2 remainingBalanceChargeAmount;

  /**
   * A representation of how products and variants can be sold and purchased. For
   * example, an individual selling plan could be '6 weeks of prepaid granola,
   * delivered weekly'.
   */
  private SellingPlan sellingPlan;

  public SellingPlanAllocation() {
  }

  /**
   * The checkout charge amount due for the purchase.
   */
  public MoneyV2 getCheckoutChargeAmount() {
    return checkoutChargeAmount;
  }

  public void setCheckoutChargeAmount(MoneyV2 checkoutChargeAmount) {
    this.checkoutChargeAmount = checkoutChargeAmount;
  }

  /**
   * A list of price adjustments, with a maximum of two. When there are two, the
   * first price adjustment goes into effect at the time of purchase, while the
   * second one starts after a certain number of orders. A price adjustment
   * represents how a selling plan affects pricing when a variant is purchased with
   * a selling plan. Prices display in the customer's currency if the shop is
   * configured for it.
   */
  public List<SellingPlanAllocationPriceAdjustment> getPriceAdjustments() {
    return priceAdjustments;
  }

  public void setPriceAdjustments(List<SellingPlanAllocationPriceAdjustment> priceAdjustments) {
    this.priceAdjustments = priceAdjustments;
  }

  /**
   * The remaining balance charge amount due for the purchase.
   */
  public MoneyV2 getRemainingBalanceChargeAmount() {
    return remainingBalanceChargeAmount;
  }

  public void setRemainingBalanceChargeAmount(MoneyV2 remainingBalanceChargeAmount) {
    this.remainingBalanceChargeAmount = remainingBalanceChargeAmount;
  }

  /**
   * A representation of how products and variants can be sold and purchased. For
   * example, an individual selling plan could be '6 weeks of prepaid granola,
   * delivered weekly'.
   */
  public SellingPlan getSellingPlan() {
    return sellingPlan;
  }

  public void setSellingPlan(SellingPlan sellingPlan) {
    this.sellingPlan = sellingPlan;
  }

  @Override
  public String toString() {
    return "SellingPlanAllocation{checkoutChargeAmount='" + checkoutChargeAmount + "', priceAdjustments='" + priceAdjustments + "', remainingBalanceChargeAmount='" + remainingBalanceChargeAmount + "', sellingPlan='" + sellingPlan + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanAllocation that = (SellingPlanAllocation) o;
    return Objects.equals(checkoutChargeAmount, that.checkoutChargeAmount) &&
        Objects.equals(priceAdjustments, that.priceAdjustments) &&
        Objects.equals(remainingBalanceChargeAmount, that.remainingBalanceChargeAmount) &&
        Objects.equals(sellingPlan, that.sellingPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutChargeAmount, priceAdjustments, remainingBalanceChargeAmount, sellingPlan);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The checkout charge amount due for the purchase.
     */
    private MoneyV2 checkoutChargeAmount;

    /**
     * A list of price adjustments, with a maximum of two. When there are two, the
     * first price adjustment goes into effect at the time of purchase, while the
     * second one starts after a certain number of orders. A price adjustment
     * represents how a selling plan affects pricing when a variant is purchased with
     * a selling plan. Prices display in the customer's currency if the shop is
     * configured for it.
     */
    private List<SellingPlanAllocationPriceAdjustment> priceAdjustments;

    /**
     * The remaining balance charge amount due for the purchase.
     */
    private MoneyV2 remainingBalanceChargeAmount;

    /**
     * A representation of how products and variants can be sold and purchased. For
     * example, an individual selling plan could be '6 weeks of prepaid granola,
     * delivered weekly'.
     */
    private SellingPlan sellingPlan;

    public SellingPlanAllocation build() {
      SellingPlanAllocation result = new SellingPlanAllocation();
      result.checkoutChargeAmount = this.checkoutChargeAmount;
      result.priceAdjustments = this.priceAdjustments;
      result.remainingBalanceChargeAmount = this.remainingBalanceChargeAmount;
      result.sellingPlan = this.sellingPlan;
      return result;
    }

    /**
     * The checkout charge amount due for the purchase.
     */
    public Builder checkoutChargeAmount(MoneyV2 checkoutChargeAmount) {
      this.checkoutChargeAmount = checkoutChargeAmount;
      return this;
    }

    /**
     * A list of price adjustments, with a maximum of two. When there are two, the
     * first price adjustment goes into effect at the time of purchase, while the
     * second one starts after a certain number of orders. A price adjustment
     * represents how a selling plan affects pricing when a variant is purchased with
     * a selling plan. Prices display in the customer's currency if the shop is
     * configured for it.
     */
    public Builder priceAdjustments(List<SellingPlanAllocationPriceAdjustment> priceAdjustments) {
      this.priceAdjustments = priceAdjustments;
      return this;
    }

    /**
     * The remaining balance charge amount due for the purchase.
     */
    public Builder remainingBalanceChargeAmount(MoneyV2 remainingBalanceChargeAmount) {
      this.remainingBalanceChargeAmount = remainingBalanceChargeAmount;
      return this;
    }

    /**
     * A representation of how products and variants can be sold and purchased. For
     * example, an individual selling plan could be '6 weeks of prepaid granola,
     * delivered weekly'.
     */
    public Builder sellingPlan(SellingPlan sellingPlan) {
      this.sellingPlan = sellingPlan;
      return this;
    }
  }
}
