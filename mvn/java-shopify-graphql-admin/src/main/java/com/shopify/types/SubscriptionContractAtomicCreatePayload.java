package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SubscriptionContractAtomicCreatePayload {
  
  private SubscriptionContract contract;

  
  private List<SubscriptionDraftUserError> userErrors;

  public SubscriptionContractAtomicCreatePayload() {
  }

  
  public SubscriptionContract getContract() {
    return contract;
  }

  public void setContract(SubscriptionContract contract) {
    this.contract = contract;
  }

  
  public List<SubscriptionDraftUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<SubscriptionDraftUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "SubscriptionContractAtomicCreatePayload{contract='" + contract + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractAtomicCreatePayload that = (SubscriptionContractAtomicCreatePayload) o;
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

    
    private List<SubscriptionDraftUserError> userErrors;

    public SubscriptionContractAtomicCreatePayload build() {
      SubscriptionContractAtomicCreatePayload result = new SubscriptionContractAtomicCreatePayload();
      result.contract = this.contract;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder contract(SubscriptionContract contract) {
      this.contract = contract;
      return this;
    }

    
    public Builder userErrors(List<SubscriptionDraftUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
