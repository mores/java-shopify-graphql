package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class FinancialSummaryDiscountApplication {
  
  private DiscountApplicationAllocationMethod allocationMethod;

  
  private DiscountApplicationTargetSelection targetSelection;

  
  private DiscountApplicationTargetType targetType;

  public FinancialSummaryDiscountApplication() {
  }

  
  public DiscountApplicationAllocationMethod getAllocationMethod() {
    return allocationMethod;
  }

  public void setAllocationMethod(DiscountApplicationAllocationMethod allocationMethod) {
    this.allocationMethod = allocationMethod;
  }

  
  public DiscountApplicationTargetSelection getTargetSelection() {
    return targetSelection;
  }

  public void setTargetSelection(DiscountApplicationTargetSelection targetSelection) {
    this.targetSelection = targetSelection;
  }

  
  public DiscountApplicationTargetType getTargetType() {
    return targetType;
  }

  public void setTargetType(DiscountApplicationTargetType targetType) {
    this.targetType = targetType;
  }

  @Override
  public String toString() {
    return "FinancialSummaryDiscountApplication{allocationMethod='" + allocationMethod + "', targetSelection='" + targetSelection + "', targetType='" + targetType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FinancialSummaryDiscountApplication that = (FinancialSummaryDiscountApplication) o;
    return Objects.equals(allocationMethod, that.allocationMethod) &&
        Objects.equals(targetSelection, that.targetSelection) &&
        Objects.equals(targetType, that.targetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationMethod, targetSelection, targetType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DiscountApplicationAllocationMethod allocationMethod;

    
    private DiscountApplicationTargetSelection targetSelection;

    
    private DiscountApplicationTargetType targetType;

    public FinancialSummaryDiscountApplication build() {
      FinancialSummaryDiscountApplication result = new FinancialSummaryDiscountApplication();
      result.allocationMethod = this.allocationMethod;
      result.targetSelection = this.targetSelection;
      result.targetType = this.targetType;
      return result;
    }

    
    public Builder allocationMethod(DiscountApplicationAllocationMethod allocationMethod) {
      this.allocationMethod = allocationMethod;
      return this;
    }

    
    public Builder targetSelection(DiscountApplicationTargetSelection targetSelection) {
      this.targetSelection = targetSelection;
      return this;
    }

    
    public Builder targetType(DiscountApplicationTargetType targetType) {
      this.targetType = targetType;
      return this;
    }
  }
}
