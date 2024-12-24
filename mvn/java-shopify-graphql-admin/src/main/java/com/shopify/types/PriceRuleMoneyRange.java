package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class PriceRuleMoneyRange {
  
  private String greaterThan;

  
  private String greaterThanOrEqualTo;

  
  private String lessThan;

  
  private String lessThanOrEqualTo;

  public PriceRuleMoneyRange() {
  }

  
  public String getGreaterThan() {
    return greaterThan;
  }

  public void setGreaterThan(String greaterThan) {
    this.greaterThan = greaterThan;
  }

  
  public String getGreaterThanOrEqualTo() {
    return greaterThanOrEqualTo;
  }

  public void setGreaterThanOrEqualTo(String greaterThanOrEqualTo) {
    this.greaterThanOrEqualTo = greaterThanOrEqualTo;
  }

  
  public String getLessThan() {
    return lessThan;
  }

  public void setLessThan(String lessThan) {
    this.lessThan = lessThan;
  }

  
  public String getLessThanOrEqualTo() {
    return lessThanOrEqualTo;
  }

  public void setLessThanOrEqualTo(String lessThanOrEqualTo) {
    this.lessThanOrEqualTo = lessThanOrEqualTo;
  }

  @Override
  public String toString() {
    return "PriceRuleMoneyRange{greaterThan='" + greaterThan + "', greaterThanOrEqualTo='" + greaterThanOrEqualTo + "', lessThan='" + lessThan + "', lessThanOrEqualTo='" + lessThanOrEqualTo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleMoneyRange that = (PriceRuleMoneyRange) o;
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
    
    private String greaterThan;

    
    private String greaterThanOrEqualTo;

    
    private String lessThan;

    
    private String lessThanOrEqualTo;

    public PriceRuleMoneyRange build() {
      PriceRuleMoneyRange result = new PriceRuleMoneyRange();
      result.greaterThan = this.greaterThan;
      result.greaterThanOrEqualTo = this.greaterThanOrEqualTo;
      result.lessThan = this.lessThan;
      result.lessThanOrEqualTo = this.lessThanOrEqualTo;
      return result;
    }

    
    public Builder greaterThan(String greaterThan) {
      this.greaterThan = greaterThan;
      return this;
    }

    
    public Builder greaterThanOrEqualTo(String greaterThanOrEqualTo) {
      this.greaterThanOrEqualTo = greaterThanOrEqualTo;
      return this;
    }

    
    public Builder lessThan(String lessThan) {
      this.lessThan = lessThan;
      return this;
    }

    
    public Builder lessThanOrEqualTo(String lessThanOrEqualTo) {
      this.lessThanOrEqualTo = lessThanOrEqualTo;
      return this;
    }
  }
}
