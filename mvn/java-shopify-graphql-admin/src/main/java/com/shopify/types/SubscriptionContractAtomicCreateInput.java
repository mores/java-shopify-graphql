package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class SubscriptionContractAtomicCreateInput {
  
  private String customerId;

  
  private OffsetDateTime nextBillingDate;

  
  private CurrencyCode currencyCode;

  
  private SubscriptionDraftInput contract;

  
  private List<SubscriptionAtomicLineInput> lines;

  
  private List<String> discountCodes = Collections.emptyList();

  public SubscriptionContractAtomicCreateInput() {
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

  
  public List<SubscriptionAtomicLineInput> getLines() {
    return lines;
  }

  public void setLines(List<SubscriptionAtomicLineInput> lines) {
    this.lines = lines;
  }

  
  public List<String> getDiscountCodes() {
    return discountCodes;
  }

  public void setDiscountCodes(List<String> discountCodes) {
    this.discountCodes = discountCodes;
  }

  @Override
  public String toString() {
    return "SubscriptionContractAtomicCreateInput{customerId='" + customerId + "', nextBillingDate='" + nextBillingDate + "', currencyCode='" + currencyCode + "', contract='" + contract + "', lines='" + lines + "', discountCodes='" + discountCodes + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractAtomicCreateInput that = (SubscriptionContractAtomicCreateInput) o;
    return Objects.equals(customerId, that.customerId) &&
        Objects.equals(nextBillingDate, that.nextBillingDate) &&
        Objects.equals(currencyCode, that.currencyCode) &&
        Objects.equals(contract, that.contract) &&
        Objects.equals(lines, that.lines) &&
        Objects.equals(discountCodes, that.discountCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, nextBillingDate, currencyCode, contract, lines, discountCodes);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String customerId;

    
    private OffsetDateTime nextBillingDate;

    
    private CurrencyCode currencyCode;

    
    private SubscriptionDraftInput contract;

    
    private List<SubscriptionAtomicLineInput> lines;

    
    private List<String> discountCodes = Collections.emptyList();

    public SubscriptionContractAtomicCreateInput build() {
      SubscriptionContractAtomicCreateInput result = new SubscriptionContractAtomicCreateInput();
      result.customerId = this.customerId;
      result.nextBillingDate = this.nextBillingDate;
      result.currencyCode = this.currencyCode;
      result.contract = this.contract;
      result.lines = this.lines;
      result.discountCodes = this.discountCodes;
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

    
    public Builder lines(List<SubscriptionAtomicLineInput> lines) {
      this.lines = lines;
      return this;
    }

    
    public Builder discountCodes(List<String> discountCodes) {
      this.discountCodes = discountCodes;
      return this;
    }
  }
}
