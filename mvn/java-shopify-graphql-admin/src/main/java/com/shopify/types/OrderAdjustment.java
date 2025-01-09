package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An order adjustment accounts for the difference between a calculated and actual refund amount.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OrderAdjustment implements com.shopify.types.Node {
  /**
   * The amount of the order adjustment in shop and presentment currencies.
   */
  private MoneyBag amountSet;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * An optional reason that explains a discrepancy between calculated and actual refund amounts.
   */
  private OrderAdjustmentDiscrepancyReason reason;

  /**
   * The tax amount of the order adjustment in shop and presentment currencies.
   */
  private MoneyBag taxAmountSet;

  public OrderAdjustment() {
  }

  /**
   * The amount of the order adjustment in shop and presentment currencies.
   */
  public MoneyBag getAmountSet() {
    return amountSet;
  }

  public void setAmountSet(MoneyBag amountSet) {
    this.amountSet = amountSet;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * An optional reason that explains a discrepancy between calculated and actual refund amounts.
   */
  public OrderAdjustmentDiscrepancyReason getReason() {
    return reason;
  }

  public void setReason(OrderAdjustmentDiscrepancyReason reason) {
    this.reason = reason;
  }

  /**
   * The tax amount of the order adjustment in shop and presentment currencies.
   */
  public MoneyBag getTaxAmountSet() {
    return taxAmountSet;
  }

  public void setTaxAmountSet(MoneyBag taxAmountSet) {
    this.taxAmountSet = taxAmountSet;
  }

  @Override
  public String toString() {
    return "OrderAdjustment{amountSet='" + amountSet + "', id='" + id + "', reason='" + reason + "', taxAmountSet='" + taxAmountSet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderAdjustment that = (OrderAdjustment) o;
    return Objects.equals(amountSet, that.amountSet) &&
        Objects.equals(id, that.id) &&
        Objects.equals(reason, that.reason) &&
        Objects.equals(taxAmountSet, that.taxAmountSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountSet, id, reason, taxAmountSet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The amount of the order adjustment in shop and presentment currencies.
     */
    private MoneyBag amountSet;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * An optional reason that explains a discrepancy between calculated and actual refund amounts.
     */
    private OrderAdjustmentDiscrepancyReason reason;

    /**
     * The tax amount of the order adjustment in shop and presentment currencies.
     */
    private MoneyBag taxAmountSet;

    public OrderAdjustment build() {
      OrderAdjustment result = new OrderAdjustment();
      result.amountSet = this.amountSet;
      result.id = this.id;
      result.reason = this.reason;
      result.taxAmountSet = this.taxAmountSet;
      return result;
    }

    /**
     * The amount of the order adjustment in shop and presentment currencies.
     */
    public Builder amountSet(MoneyBag amountSet) {
      this.amountSet = amountSet;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * An optional reason that explains a discrepancy between calculated and actual refund amounts.
     */
    public Builder reason(OrderAdjustmentDiscrepancyReason reason) {
      this.reason = reason;
      return this;
    }

    /**
     * The tax amount of the order adjustment in shop and presentment currencies.
     */
    public Builder taxAmountSet(MoneyBag taxAmountSet) {
      this.taxAmountSet = taxAmountSet;
      return this;
    }
  }
}
