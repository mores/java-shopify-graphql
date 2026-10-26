package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Projected order totals for a successfully calculated subscription contract. The
 * figures are derived from the calculation's cost breakdown; taxes are estimated.
 */
public class SubscriptionContractCalculationProjectedOrderTotals {
  /**
   * The merchandise line total after line item discounts and before order-level
   * discounts and delivery. For tax-inclusive carts, this amount includes taxes.
   */
  private MoneyV2 subtotal;

  /**
   * The grand total of the projected order.
   */
  private MoneyV2 total;

  /**
   * The total delivery cost.
   */
  private MoneyV2 totalDelivery;

  /**
   * The total of discounts applied to delivery.
   */
  private MoneyV2 totalDeliveryDiscounts;

  /**
   * The total of discounts applied to the merchandise lines.
   */
  private MoneyV2 totalMerchandiseDiscounts;

  /**
   * The total estimated tax.
   */
  private MoneyV2 totalTax;

  public SubscriptionContractCalculationProjectedOrderTotals() {
  }

  /**
   * The merchandise line total after line item discounts and before order-level
   * discounts and delivery. For tax-inclusive carts, this amount includes taxes.
   */
  public MoneyV2 getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(MoneyV2 subtotal) {
    this.subtotal = subtotal;
  }

  /**
   * The grand total of the projected order.
   */
  public MoneyV2 getTotal() {
    return total;
  }

  public void setTotal(MoneyV2 total) {
    this.total = total;
  }

  /**
   * The total delivery cost.
   */
  public MoneyV2 getTotalDelivery() {
    return totalDelivery;
  }

  public void setTotalDelivery(MoneyV2 totalDelivery) {
    this.totalDelivery = totalDelivery;
  }

  /**
   * The total of discounts applied to delivery.
   */
  public MoneyV2 getTotalDeliveryDiscounts() {
    return totalDeliveryDiscounts;
  }

  public void setTotalDeliveryDiscounts(MoneyV2 totalDeliveryDiscounts) {
    this.totalDeliveryDiscounts = totalDeliveryDiscounts;
  }

  /**
   * The total of discounts applied to the merchandise lines.
   */
  public MoneyV2 getTotalMerchandiseDiscounts() {
    return totalMerchandiseDiscounts;
  }

  public void setTotalMerchandiseDiscounts(MoneyV2 totalMerchandiseDiscounts) {
    this.totalMerchandiseDiscounts = totalMerchandiseDiscounts;
  }

  /**
   * The total estimated tax.
   */
  public MoneyV2 getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(MoneyV2 totalTax) {
    this.totalTax = totalTax;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationProjectedOrderTotals{subtotal='" + subtotal + "', total='" + total + "', totalDelivery='" + totalDelivery + "', totalDeliveryDiscounts='" + totalDeliveryDiscounts + "', totalMerchandiseDiscounts='" + totalMerchandiseDiscounts + "', totalTax='" + totalTax + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationProjectedOrderTotals that = (SubscriptionContractCalculationProjectedOrderTotals) o;
    return Objects.equals(subtotal, that.subtotal) &&
        Objects.equals(total, that.total) &&
        Objects.equals(totalDelivery, that.totalDelivery) &&
        Objects.equals(totalDeliveryDiscounts, that.totalDeliveryDiscounts) &&
        Objects.equals(totalMerchandiseDiscounts, that.totalMerchandiseDiscounts) &&
        Objects.equals(totalTax, that.totalTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subtotal, total, totalDelivery, totalDeliveryDiscounts, totalMerchandiseDiscounts, totalTax);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The merchandise line total after line item discounts and before order-level
     * discounts and delivery. For tax-inclusive carts, this amount includes taxes.
     */
    private MoneyV2 subtotal;

    /**
     * The grand total of the projected order.
     */
    private MoneyV2 total;

    /**
     * The total delivery cost.
     */
    private MoneyV2 totalDelivery;

    /**
     * The total of discounts applied to delivery.
     */
    private MoneyV2 totalDeliveryDiscounts;

    /**
     * The total of discounts applied to the merchandise lines.
     */
    private MoneyV2 totalMerchandiseDiscounts;

    /**
     * The total estimated tax.
     */
    private MoneyV2 totalTax;

    public SubscriptionContractCalculationProjectedOrderTotals build() {
      SubscriptionContractCalculationProjectedOrderTotals result = new SubscriptionContractCalculationProjectedOrderTotals();
      result.subtotal = this.subtotal;
      result.total = this.total;
      result.totalDelivery = this.totalDelivery;
      result.totalDeliveryDiscounts = this.totalDeliveryDiscounts;
      result.totalMerchandiseDiscounts = this.totalMerchandiseDiscounts;
      result.totalTax = this.totalTax;
      return result;
    }

    /**
     * The merchandise line total after line item discounts and before order-level
     * discounts and delivery. For tax-inclusive carts, this amount includes taxes.
     */
    public Builder subtotal(MoneyV2 subtotal) {
      this.subtotal = subtotal;
      return this;
    }

    /**
     * The grand total of the projected order.
     */
    public Builder total(MoneyV2 total) {
      this.total = total;
      return this;
    }

    /**
     * The total delivery cost.
     */
    public Builder totalDelivery(MoneyV2 totalDelivery) {
      this.totalDelivery = totalDelivery;
      return this;
    }

    /**
     * The total of discounts applied to delivery.
     */
    public Builder totalDeliveryDiscounts(MoneyV2 totalDeliveryDiscounts) {
      this.totalDeliveryDiscounts = totalDeliveryDiscounts;
      return this;
    }

    /**
     * The total of discounts applied to the merchandise lines.
     */
    public Builder totalMerchandiseDiscounts(MoneyV2 totalMerchandiseDiscounts) {
      this.totalMerchandiseDiscounts = totalMerchandiseDiscounts;
      return this;
    }

    /**
     * The total estimated tax.
     */
    public Builder totalTax(MoneyV2 totalTax) {
      this.totalTax = totalTax;
      return this;
    }
  }
}
