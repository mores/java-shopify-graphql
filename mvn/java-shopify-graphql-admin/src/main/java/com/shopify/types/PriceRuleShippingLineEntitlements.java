package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class PriceRuleShippingLineEntitlements {
  
  private List<CountryCode> countryCodes;

  
  private boolean includeRestOfWorld;

  
  private boolean targetAllShippingLines;

  public PriceRuleShippingLineEntitlements() {
  }

  
  public List<CountryCode> getCountryCodes() {
    return countryCodes;
  }

  public void setCountryCodes(List<CountryCode> countryCodes) {
    this.countryCodes = countryCodes;
  }

  
  public boolean getIncludeRestOfWorld() {
    return includeRestOfWorld;
  }

  public void setIncludeRestOfWorld(boolean includeRestOfWorld) {
    this.includeRestOfWorld = includeRestOfWorld;
  }

  
  public boolean getTargetAllShippingLines() {
    return targetAllShippingLines;
  }

  public void setTargetAllShippingLines(boolean targetAllShippingLines) {
    this.targetAllShippingLines = targetAllShippingLines;
  }

  @Override
  public String toString() {
    return "PriceRuleShippingLineEntitlements{countryCodes='" + countryCodes + "', includeRestOfWorld='" + includeRestOfWorld + "', targetAllShippingLines='" + targetAllShippingLines + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleShippingLineEntitlements that = (PriceRuleShippingLineEntitlements) o;
    return Objects.equals(countryCodes, that.countryCodes) &&
        includeRestOfWorld == that.includeRestOfWorld &&
        targetAllShippingLines == that.targetAllShippingLines;
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCodes, includeRestOfWorld, targetAllShippingLines);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<CountryCode> countryCodes;

    
    private boolean includeRestOfWorld;

    
    private boolean targetAllShippingLines;

    public PriceRuleShippingLineEntitlements build() {
      PriceRuleShippingLineEntitlements result = new PriceRuleShippingLineEntitlements();
      result.countryCodes = this.countryCodes;
      result.includeRestOfWorld = this.includeRestOfWorld;
      result.targetAllShippingLines = this.targetAllShippingLines;
      return result;
    }

    
    public Builder countryCodes(List<CountryCode> countryCodes) {
      this.countryCodes = countryCodes;
      return this;
    }

    
    public Builder includeRestOfWorld(boolean includeRestOfWorld) {
      this.includeRestOfWorld = includeRestOfWorld;
      return this;
    }

    
    public Builder targetAllShippingLines(boolean targetAllShippingLines) {
      this.targetAllShippingLines = targetAllShippingLines;
      return this;
    }
  }
}
