package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class FulfillmentConstraintRuleUpdatePayload {
  
  private FulfillmentConstraintRule fulfillmentConstraintRule;

  
  private List<FulfillmentConstraintRuleUpdateUserError> userErrors;

  public FulfillmentConstraintRuleUpdatePayload() {
  }

  
  public FulfillmentConstraintRule getFulfillmentConstraintRule() {
    return fulfillmentConstraintRule;
  }

  public void setFulfillmentConstraintRule(FulfillmentConstraintRule fulfillmentConstraintRule) {
    this.fulfillmentConstraintRule = fulfillmentConstraintRule;
  }

  
  public List<FulfillmentConstraintRuleUpdateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<FulfillmentConstraintRuleUpdateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "FulfillmentConstraintRuleUpdatePayload{fulfillmentConstraintRule='" + fulfillmentConstraintRule + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentConstraintRuleUpdatePayload that = (FulfillmentConstraintRuleUpdatePayload) o;
    return Objects.equals(fulfillmentConstraintRule, that.fulfillmentConstraintRule) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentConstraintRule, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private FulfillmentConstraintRule fulfillmentConstraintRule;

    
    private List<FulfillmentConstraintRuleUpdateUserError> userErrors;

    public FulfillmentConstraintRuleUpdatePayload build() {
      FulfillmentConstraintRuleUpdatePayload result = new FulfillmentConstraintRuleUpdatePayload();
      result.fulfillmentConstraintRule = this.fulfillmentConstraintRule;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder fulfillmentConstraintRule(FulfillmentConstraintRule fulfillmentConstraintRule) {
      this.fulfillmentConstraintRule = fulfillmentConstraintRule;
      return this;
    }

    
    public Builder userErrors(List<FulfillmentConstraintRuleUpdateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
