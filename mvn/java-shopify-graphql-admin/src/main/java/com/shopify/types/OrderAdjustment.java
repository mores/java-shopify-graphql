package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OrderAdjustment implements com.shopify.types.Node {
  
  private MoneyBag amountSet;

  
  private String id;

  
  private OrderAdjustmentDiscrepancyReason reason;

  
  private MoneyBag taxAmountSet;

  public OrderAdjustment() {
  }

  
  public MoneyBag getAmountSet() {
    return amountSet;
  }

  public void setAmountSet(MoneyBag amountSet) {
    this.amountSet = amountSet;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public OrderAdjustmentDiscrepancyReason getReason() {
    return reason;
  }

  public void setReason(OrderAdjustmentDiscrepancyReason reason) {
    this.reason = reason;
  }

  
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
    
    private MoneyBag amountSet;

    
    private String id;

    
    private OrderAdjustmentDiscrepancyReason reason;

    
    private MoneyBag taxAmountSet;

    public OrderAdjustment build() {
      OrderAdjustment result = new OrderAdjustment();
      result.amountSet = this.amountSet;
      result.id = this.id;
      result.reason = this.reason;
      result.taxAmountSet = this.taxAmountSet;
      return result;
    }

    
    public Builder amountSet(MoneyBag amountSet) {
      this.amountSet = amountSet;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder reason(OrderAdjustmentDiscrepancyReason reason) {
      this.reason = reason;
      return this;
    }

    
    public Builder taxAmountSet(MoneyBag taxAmountSet) {
      this.taxAmountSet = taxAmountSet;
      return this;
    }
  }
}
