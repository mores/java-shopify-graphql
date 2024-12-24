package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SellingPlanAnchor {
  
  private Integer cutoffDay;

  
  private int day;

  
  private Integer month;

  
  private SellingPlanAnchorType type;

  public SellingPlanAnchor() {
  }

  
  public Integer getCutoffDay() {
    return cutoffDay;
  }

  public void setCutoffDay(Integer cutoffDay) {
    this.cutoffDay = cutoffDay;
  }

  
  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  
  public Integer getMonth() {
    return month;
  }

  public void setMonth(Integer month) {
    this.month = month;
  }

  
  public SellingPlanAnchorType getType() {
    return type;
  }

  public void setType(SellingPlanAnchorType type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "SellingPlanAnchor{cutoffDay='" + cutoffDay + "', day='" + day + "', month='" + month + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanAnchor that = (SellingPlanAnchor) o;
    return Objects.equals(cutoffDay, that.cutoffDay) &&
        day == that.day &&
        Objects.equals(month, that.month) &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cutoffDay, day, month, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Integer cutoffDay;

    
    private int day;

    
    private Integer month;

    
    private SellingPlanAnchorType type;

    public SellingPlanAnchor build() {
      SellingPlanAnchor result = new SellingPlanAnchor();
      result.cutoffDay = this.cutoffDay;
      result.day = this.day;
      result.month = this.month;
      result.type = this.type;
      return result;
    }

    
    public Builder cutoffDay(Integer cutoffDay) {
      this.cutoffDay = cutoffDay;
      return this;
    }

    
    public Builder day(int day) {
      this.day = day;
      return this;
    }

    
    public Builder month(Integer month) {
      this.month = month;
      return this;
    }

    
    public Builder type(SellingPlanAnchorType type) {
      this.type = type;
      return this;
    }
  }
}
