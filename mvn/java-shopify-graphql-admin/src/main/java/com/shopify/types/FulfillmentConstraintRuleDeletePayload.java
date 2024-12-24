package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class FulfillmentConstraintRuleDeletePayload {
  
  private Boolean success;

  
  private List<FulfillmentConstraintRuleDeleteUserError> userErrors;

  public FulfillmentConstraintRuleDeletePayload() {
  }

  
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  
  public List<FulfillmentConstraintRuleDeleteUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<FulfillmentConstraintRuleDeleteUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "FulfillmentConstraintRuleDeletePayload{success='" + success + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentConstraintRuleDeletePayload that = (FulfillmentConstraintRuleDeletePayload) o;
    return Objects.equals(success, that.success) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Boolean success;

    
    private List<FulfillmentConstraintRuleDeleteUserError> userErrors;

    public FulfillmentConstraintRuleDeletePayload build() {
      FulfillmentConstraintRuleDeletePayload result = new FulfillmentConstraintRuleDeletePayload();
      result.success = this.success;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder success(Boolean success) {
      this.success = success;
      return this;
    }

    
    public Builder userErrors(List<FulfillmentConstraintRuleDeleteUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
