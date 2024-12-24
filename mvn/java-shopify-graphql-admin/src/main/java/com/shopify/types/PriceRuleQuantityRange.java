package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class PriceRuleQuantityRange {
  
  private Integer greaterThan;

  
  private Integer greaterThanOrEqualTo;

  
  private Integer lessThan;

  
  private Integer lessThanOrEqualTo;

  public PriceRuleQuantityRange() {
  }

  
  public Integer getGreaterThan() {
    return greaterThan;
  }

  public void setGreaterThan(Integer greaterThan) {
    this.greaterThan = greaterThan;
  }

  
  public Integer getGreaterThanOrEqualTo() {
    return greaterThanOrEqualTo;
  }

  public void setGreaterThanOrEqualTo(Integer greaterThanOrEqualTo) {
    this.greaterThanOrEqualTo = greaterThanOrEqualTo;
  }

  
  public Integer getLessThan() {
    return lessThan;
  }

  public void setLessThan(Integer lessThan) {
    this.lessThan = lessThan;
  }

  
  public Integer getLessThanOrEqualTo() {
    return lessThanOrEqualTo;
  }

  public void setLessThanOrEqualTo(Integer lessThanOrEqualTo) {
    this.lessThanOrEqualTo = lessThanOrEqualTo;
  }

  @Override
  public String toString() {
    return "PriceRuleQuantityRange{greaterThan='" + greaterThan + "', greaterThanOrEqualTo='" + greaterThanOrEqualTo + "', lessThan='" + lessThan + "', lessThanOrEqualTo='" + lessThanOrEqualTo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleQuantityRange that = (PriceRuleQuantityRange) o;
    return Objects.equals(greaterThan, that.greaterThan) &&
        Objects.equals(greaterThanOrEqualTo, that.greaterThanOrEqualTo) &&
        Objects.equals(lessThan, that.lessThan) &&
        Objects.equals(lessThanOrEqualTo, that.lessThanOrEqualTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(greaterThan, greaterThanOrEqualTo, lessThan, lessThanOrEqualTo);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Integer greaterThan;

    
    private Integer greaterThanOrEqualTo;

    
    private Integer lessThan;

    
    private Integer lessThanOrEqualTo;

    public PriceRuleQuantityRange build() {
      PriceRuleQuantityRange result = new PriceRuleQuantityRange();
      result.greaterThan = this.greaterThan;
      result.greaterThanOrEqualTo = this.greaterThanOrEqualTo;
      result.lessThan = this.lessThan;
      result.lessThanOrEqualTo = this.lessThanOrEqualTo;
      return result;
    }

    
    public Builder greaterThan(Integer greaterThan) {
      this.greaterThan = greaterThan;
      return this;
    }

    
    public Builder greaterThanOrEqualTo(Integer greaterThanOrEqualTo) {
      this.greaterThanOrEqualTo = greaterThanOrEqualTo;
      return this;
    }

    
    public Builder lessThan(Integer lessThan) {
      this.lessThan = lessThan;
      return this;
    }

    
    public Builder lessThanOrEqualTo(Integer lessThanOrEqualTo) {
      this.lessThanOrEqualTo = lessThanOrEqualTo;
      return this;
    }
  }
}
