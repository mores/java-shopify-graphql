package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class LimitedPendingOrderCount {
  
  private boolean atMax;

  
  private int count;

  public LimitedPendingOrderCount() {
  }

  
  public boolean getAtMax() {
    return atMax;
  }

  public void setAtMax(boolean atMax) {
    this.atMax = atMax;
  }

  
  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  @Override
  public String toString() {
    return "LimitedPendingOrderCount{atMax='" + atMax + "', count='" + count + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LimitedPendingOrderCount that = (LimitedPendingOrderCount) o;
    return atMax == that.atMax &&
        count == that.count;
  }

  @Override
  public int hashCode() {
    return Objects.hash(atMax, count);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private boolean atMax;

    
    private int count;

    public LimitedPendingOrderCount build() {
      LimitedPendingOrderCount result = new LimitedPendingOrderCount();
      result.atMax = this.atMax;
      result.count = this.count;
      return result;
    }

    
    public Builder atMax(boolean atMax) {
      this.atMax = atMax;
      return this;
    }

    
    public Builder count(int count) {
      this.count = count;
      return this;
    }
  }
}
