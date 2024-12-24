package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DeliveryProductVariantsCount {
  
  private boolean capped;

  
  private int count;

  public DeliveryProductVariantsCount() {
  }

  
  public boolean getCapped() {
    return capped;
  }

  public void setCapped(boolean capped) {
    this.capped = capped;
  }

  
  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  @Override
  public String toString() {
    return "DeliveryProductVariantsCount{capped='" + capped + "', count='" + count + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryProductVariantsCount that = (DeliveryProductVariantsCount) o;
    return capped == that.capped &&
        count == that.count;
  }

  @Override
  public int hashCode() {
    return Objects.hash(capped, count);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private boolean capped;

    
    private int count;

    public DeliveryProductVariantsCount build() {
      DeliveryProductVariantsCount result = new DeliveryProductVariantsCount();
      result.capped = this.capped;
      result.count = this.count;
      return result;
    }

    
    public Builder capped(boolean capped) {
      this.capped = capped;
      return this;
    }

    
    public Builder count(int count) {
      this.count = count;
      return this;
    }
  }
}
