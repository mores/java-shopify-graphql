package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SubscriptionContractSetNextBillingDatePayload {
  
  private SubscriptionContract contract;

  
  private List<SubscriptionContractUserError> userErrors;

  public SubscriptionContractSetNextBillingDatePayload() {
  }

  
  public SubscriptionContract getContract() {
    return contract;
  }

  public void setContract(SubscriptionContract contract) {
    this.contract = contract;
  }

  
  public List<SubscriptionContractUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<SubscriptionContractUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "SubscriptionContractSetNextBillingDatePayload{contract='" + contract + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractSetNextBillingDatePayload that = (SubscriptionContractSetNextBillingDatePayload) o;
    return Objects.equals(contract, that.contract) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SubscriptionContract contract;

    
    private List<SubscriptionContractUserError> userErrors;

    public SubscriptionContractSetNextBillingDatePayload build() {
      SubscriptionContractSetNextBillingDatePayload result = new SubscriptionContractSetNextBillingDatePayload();
      result.contract = this.contract;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder contract(SubscriptionContract contract) {
      this.contract = contract;
      return this;
    }

    
    public Builder userErrors(List<SubscriptionContractUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
