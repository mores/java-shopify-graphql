package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SellingPlanInventoryPolicy {
  
  private SellingPlanReserve reserve;

  public SellingPlanInventoryPolicy() {
  }

  
  public SellingPlanReserve getReserve() {
    return reserve;
  }

  public void setReserve(SellingPlanReserve reserve) {
    this.reserve = reserve;
  }

  @Override
  public String toString() {
    return "SellingPlanInventoryPolicy{reserve='" + reserve + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanInventoryPolicy that = (SellingPlanInventoryPolicy) o;
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

    public SellingPlanInventoryPolicy build() {
      SellingPlanInventoryPolicy result = new SellingPlanInventoryPolicy();
      result.reserve = this.reserve;
      return result;
    }

    
    public Builder reserve(SellingPlanReserve reserve) {
      this.reserve = reserve;
      return this;
    }
  }
}
