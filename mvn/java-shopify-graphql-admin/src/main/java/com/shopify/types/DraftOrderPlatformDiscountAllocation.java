package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DraftOrderPlatformDiscountAllocation {
  
  private String id;

  
  private Integer quantity;

  
  private MoneyV2 reductionAmount;

  
  private MoneyBag reductionAmountSet;

  
  private DraftOrderPlatformDiscountAllocationTarget target;

  public DraftOrderPlatformDiscountAllocation() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  
  public MoneyV2 getReductionAmount() {
    return reductionAmount;
  }

  public void setReductionAmount(MoneyV2 reductionAmount) {
    this.reductionAmount = reductionAmount;
  }

  
  public MoneyBag getReductionAmountSet() {
    return reductionAmountSet;
  }

  public void setReductionAmountSet(MoneyBag reductionAmountSet) {
    this.reductionAmountSet = reductionAmountSet;
  }

  
  public DraftOrderPlatformDiscountAllocationTarget getTarget() {
    return target;
  }

  public void setTarget(DraftOrderPlatformDiscountAllocationTarget target) {
    this.target = target;
  }

  @Override
  public String toString() {
    return "DraftOrderPlatformDiscountAllocation{id='" + id + "', quantity='" + quantity + "', reductionAmount='" + reductionAmount + "', reductionAmountSet='" + reductionAmountSet + "', target='" + target + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderPlatformDiscountAllocation that = (DraftOrderPlatformDiscountAllocation) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(quantity, that.quantity) &&
        Objects.equals(reductionAmount, that.reductionAmount) &&
        Objects.equals(reductionAmountSet, that.reductionAmountSet) &&
        Objects.equals(target, that.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, quantity, reductionAmount, reductionAmountSet, target);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private Integer quantity;

    
    private MoneyV2 reductionAmount;

    
    private MoneyBag reductionAmountSet;

    
    private DraftOrderPlatformDiscountAllocationTarget target;

    public DraftOrderPlatformDiscountAllocation build() {
      DraftOrderPlatformDiscountAllocation result = new DraftOrderPlatformDiscountAllocation();
      result.id = this.id;
      result.quantity = this.quantity;
      result.reductionAmount = this.reductionAmount;
      result.reductionAmountSet = this.reductionAmountSet;
      result.target = this.target;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder quantity(Integer quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder reductionAmount(MoneyV2 reductionAmount) {
      this.reductionAmount = reductionAmount;
      return this;
    }

    
    public Builder reductionAmountSet(MoneyBag reductionAmountSet) {
      this.reductionAmountSet = reductionAmountSet;
      return this;
    }

    
    public Builder target(DraftOrderPlatformDiscountAllocationTarget target) {
      this.target = target;
      return this;
    }
  }
}
