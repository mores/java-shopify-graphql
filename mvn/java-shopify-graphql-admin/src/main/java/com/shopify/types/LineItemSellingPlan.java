package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class LineItemSellingPlan {
  
  private String name;

  
  private String sellingPlanId;

  public LineItemSellingPlan() {
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getSellingPlanId() {
    return sellingPlanId;
  }

  public void setSellingPlanId(String sellingPlanId) {
    this.sellingPlanId = sellingPlanId;
  }

  @Override
  public String toString() {
    return "LineItemSellingPlan{name='" + name + "', sellingPlanId='" + sellingPlanId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LineItemSellingPlan that = (LineItemSellingPlan) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(sellingPlanId, that.sellingPlanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sellingPlanId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String name;

    
    private String sellingPlanId;

    public LineItemSellingPlan build() {
      LineItemSellingPlan result = new LineItemSellingPlan();
      result.name = this.name;
      result.sellingPlanId = this.sellingPlanId;
      return result;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder sellingPlanId(String sellingPlanId) {
      this.sellingPlanId = sellingPlanId;
      return this;
    }
  }
}
