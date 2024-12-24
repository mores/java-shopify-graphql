package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SellingPlanAnchorInput {
  
  private SellingPlanAnchorType type;

  
  private Integer day;

  
  private Integer month;

  
  private Integer cutoffDay;

  public SellingPlanAnchorInput() {
  }

  
  public SellingPlanAnchorType getType() {
    return type;
  }

  public void setType(SellingPlanAnchorType type) {
    this.type = type;
  }

  
  public Integer getDay() {
    return day;
  }

  public void setDay(Integer day) {
    this.day = day;
  }

  
  public Integer getMonth() {
    return month;
  }

  public void setMonth(Integer month) {
    this.month = month;
  }

  
  public Integer getCutoffDay() {
    return cutoffDay;
  }

  public void setCutoffDay(Integer cutoffDay) {
    this.cutoffDay = cutoffDay;
  }

  @Override
  public String toString() {
    return "SellingPlanAnchorInput{type='" + type + "', day='" + day + "', month='" + month + "', cutoffDay='" + cutoffDay + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanAnchorInput that = (SellingPlanAnchorInput) o;
    return Objects.equals(type, that.type) &&
        Objects.equals(day, that.day) &&
        Objects.equals(month, that.month) &&
        Objects.equals(cutoffDay, that.cutoffDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, day, month, cutoffDay);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SellingPlanAnchorType type;

    
    private Integer day;

    
    private Integer month;

    
    private Integer cutoffDay;

    public SellingPlanAnchorInput build() {
      SellingPlanAnchorInput result = new SellingPlanAnchorInput();
      result.type = this.type;
      result.day = this.day;
      result.month = this.month;
      result.cutoffDay = this.cutoffDay;
      return result;
    }

    
    public Builder type(SellingPlanAnchorType type) {
      this.type = type;
      return this;
    }

    
    public Builder day(Integer day) {
      this.day = day;
      return this;
    }

    
    public Builder month(Integer month) {
      this.month = month;
      return this;
    }

    
    public Builder cutoffDay(Integer cutoffDay) {
      this.cutoffDay = cutoffDay;
      return this;
    }
  }
}
