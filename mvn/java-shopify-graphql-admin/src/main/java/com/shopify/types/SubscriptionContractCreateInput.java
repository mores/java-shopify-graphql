package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class SubscriptionContractCreateInput {
  
  private String customerId;

  
  private OffsetDateTime nextBillingDate;

  
  private CurrencyCode currencyCode;

  
  private SubscriptionDraftInput contract;

  public SubscriptionContractCreateInput() {
  }

  
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  
  public OffsetDateTime getNextBillingDate() {
    return nextBillingDate;
  }

  public void setNextBillingDate(OffsetDateTime nextBillingDate) {
    this.nextBillingDate = nextBillingDate;
  }

  
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  
  public SubscriptionDraftInput getContract() {
    return contract;
  }

  public void setContract(SubscriptionDraftInput contract) {
    this.contract = contract;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCreateInput{customerId='" + customerId + "', nextBillingDate='" + nextBillingDate + "', currencyCode='" + currencyCode + "', contract='" + contract + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCreateInput that = (SubscriptionContractCreateInput) o;
    return Objects.equals(customerId, that.customerId) &&
        Objects.equals(nextBillingDate, that.nextBillingDate) &&
        Objects.equals(currencyCode, that.currencyCode) &&
        Objects.equals(contract, that.contract);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, nextBillingDate, currencyCode, contract);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String customerId;

    
    private OffsetDateTime nextBillingDate;

    
    private CurrencyCode currencyCode;

    
    private SubscriptionDraftInput contract;

    public SubscriptionContractCreateInput build() {
      SubscriptionContractCreateInput result = new SubscriptionContractCreateInput();
      result.customerId = this.customerId;
      result.nextBillingDate = this.nextBillingDate;
      result.currencyCode = this.currencyCode;
      result.contract = this.contract;
      return result;
    }

    
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    
    public Builder nextBillingDate(OffsetDateTime nextBillingDate) {
      this.nextBillingDate = nextBillingDate;
      return this;
    }

    
    public Builder currencyCode(CurrencyCode currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }

    
    public Builder contract(SubscriptionDraftInput contract) {
      this.contract = contract;
      return this;
    }
  }
}
