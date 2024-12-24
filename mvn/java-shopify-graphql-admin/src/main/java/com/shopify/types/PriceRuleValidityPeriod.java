package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class PriceRuleValidityPeriod {
  
  private OffsetDateTime end;

  
  private OffsetDateTime start;

  public PriceRuleValidityPeriod() {
  }

  
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }

  
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  @Override
  public String toString() {
    return "PriceRuleValidityPeriod{end='" + end + "', start='" + start + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleValidityPeriod that = (PriceRuleValidityPeriod) o;
    return Objects.equals(end, that.end) &&
        Objects.equals(start, that.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, start);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private OffsetDateTime end;

    
    private OffsetDateTime start;

    public PriceRuleValidityPeriod build() {
      PriceRuleValidityPeriod result = new PriceRuleValidityPeriod();
      result.end = this.end;
      result.start = this.start;
      return result;
    }

    
    public Builder end(OffsetDateTime end) {
      this.end = end;
      return this;
    }

    
    public Builder start(OffsetDateTime start) {
      this.start = start;
      return this;
    }
  }
}
