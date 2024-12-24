package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SellingPlanInventoryPolicyInput {
  
  private SellingPlanReserve reserve;

  public SellingPlanInventoryPolicyInput() {
  }

  
  public SellingPlanReserve getReserve() {
    return reserve;
  }

  public void setReserve(SellingPlanReserve reserve) {
    this.reserve = reserve;
  }

  @Override
  public String toString() {
    return "SellingPlanInventoryPolicyInput{reserve='" + reserve + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanInventoryPolicyInput that = (SellingPlanInventoryPolicyInput) o;
    return Objects.equals(reserve, that.reserve);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reserve);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SellingPlanReserve reserve;

    public SellingPlanInventoryPolicyInput build() {
      SellingPlanInventoryPolicyInput result = new SellingPlanInventoryPolicyInput();
      result.reserve = this.reserve;
      return result;
    }

    
    public Builder reserve(SellingPlanReserve reserve) {
      this.reserve = reserve;
      return this;
    }
  }
}
