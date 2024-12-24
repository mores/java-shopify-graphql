package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class QuantityRulesAddPayload {
  
  private List<QuantityRule> quantityRules;

  
  private List<QuantityRuleUserError> userErrors;

  public QuantityRulesAddPayload() {
  }

  
  public List<QuantityRule> getQuantityRules() {
    return quantityRules;
  }

  public void setQuantityRules(List<QuantityRule> quantityRules) {
    this.quantityRules = quantityRules;
  }

  
  public List<QuantityRuleUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<QuantityRuleUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "QuantityRulesAddPayload{quantityRules='" + quantityRules + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QuantityRulesAddPayload that = (QuantityRulesAddPayload) o;
    return Objects.equals(quantityRules, that.quantityRules) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantityRules, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<QuantityRule> quantityRules;

    
    private List<QuantityRuleUserError> userErrors;

    public QuantityRulesAddPayload build() {
      QuantityRulesAddPayload result = new QuantityRulesAddPayload();
      result.quantityRules = this.quantityRules;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder quantityRules(List<QuantityRule> quantityRules) {
      this.quantityRules = quantityRules;
      return this;
    }

    
    public Builder userErrors(List<QuantityRuleUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
