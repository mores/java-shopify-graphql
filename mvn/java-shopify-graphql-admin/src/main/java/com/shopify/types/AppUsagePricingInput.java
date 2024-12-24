package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class AppUsagePricingInput {
  
  private MoneyInput cappedAmount;

  
  private String terms;

  public AppUsagePricingInput() {
  }

  
  public MoneyInput getCappedAmount() {
    return cappedAmount;
  }

  public void setCappedAmount(MoneyInput cappedAmount) {
    this.cappedAmount = cappedAmount;
  }

  
  public String getTerms() {
    return terms;
  }

  public void setTerms(String terms) {
    this.terms = terms;
  }

  @Override
  public String toString() {
    return "AppUsagePricingInput{cappedAmount='" + cappedAmount + "', terms='" + terms + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppUsagePricingInput that = (AppUsagePricingInput) o;
    return Objects.equals(cappedAmount, that.cappedAmount) &&
        Objects.equals(terms, that.terms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cappedAmount, terms);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyInput cappedAmount;

    
    private String terms;

    public AppUsagePricingInput build() {
      AppUsagePricingInput result = new AppUsagePricingInput();
      result.cappedAmount = this.cappedAmount;
      result.terms = this.terms;
      return result;
    }

    
    public Builder cappedAmount(MoneyInput cappedAmount) {
      this.cappedAmount = cappedAmount;
      return this;
    }

    
    public Builder terms(String terms) {
      this.terms = terms;
      return this;
    }
  }
}
