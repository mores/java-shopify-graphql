package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class RowCount {
  
  private int count;

  
  private boolean exceedsMax;

  public RowCount() {
  }

  
  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  
  public boolean getExceedsMax() {
    return exceedsMax;
  }

  public void setExceedsMax(boolean exceedsMax) {
    this.exceedsMax = exceedsMax;
  }

  @Override
  public String toString() {
    return "RowCount{count='" + count + "', exceedsMax='" + exceedsMax + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RowCount that = (RowCount) o;
    return count == that.count &&
        exceedsMax == that.exceedsMax;
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, exceedsMax);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private int count;

    
    private boolean exceedsMax;

    public RowCount build() {
      RowCount result = new RowCount();
      result.count = this.count;
      result.exceedsMax = this.exceedsMax;
      return result;
    }

    
    public Builder count(int count) {
      this.count = count;
      return this;
    }

    
    public Builder exceedsMax(boolean exceedsMax) {
      this.exceedsMax = exceedsMax;
      return this;
    }
  }
}
