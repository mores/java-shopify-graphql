package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopifyPaymentsAccount implements com.shopify.types.Node {
  
  private boolean activated;

  
  private List<MoneyV2> balance;

  
  private ShopifyPaymentsBalanceTransactionConnection balanceTransactions;

  
  private ShopifyPaymentsBankAccountConnection bankAccounts;

  
  private String chargeStatementDescriptor;

  
  private ShopifyPaymentsChargeStatementDescriptor chargeStatementDescriptors;

  
  private String country;

  
  private CurrencyCode defaultCurrency;

  
  private ShopifyPaymentsDisputeConnection disputes;

  
  private String id;

  
  private boolean onboardable;

  
  private ShopifyPaymentsPayoutSchedule payoutSchedule;

  
  private String payoutStatementDescriptor;

  
  private ShopifyPaymentsPayoutConnection payouts;

  public ShopifyPaymentsAccount() {
  }

  
  public boolean getActivated() {
    return activated;
  }

  public void setActivated(boolean activated) {
    this.activated = activated;
  }

  
  public List<MoneyV2> getBalance() {
    return balance;
  }

  public void setBalance(List<MoneyV2> balance) {
    this.balance = balance;
  }

  
  public ShopifyPaymentsBalanceTransactionConnection getBalanceTransactions() {
    return balanceTransactions;
  }

  public void setBalanceTransactions(
      ShopifyPaymentsBalanceTransactionConnection balanceTransactions) {
    this.balanceTransactions = balanceTransactions;
  }

  
  public ShopifyPaymentsBankAccountConnection getBankAccounts() {
    return bankAccounts;
  }

  public void setBankAccounts(ShopifyPaymentsBankAccountConnection bankAccounts) {
    this.bankAccounts = bankAccounts;
  }

  
  public String getChargeStatementDescriptor() {
    return chargeStatementDescriptor;
  }

  public void setChargeStatementDescriptor(String chargeStatementDescriptor) {
    this.chargeStatementDescriptor = chargeStatementDescriptor;
  }

  
  public ShopifyPaymentsChargeStatementDescriptor getChargeStatementDescriptors() {
    return chargeStatementDescriptors;
  }

  public void setChargeStatementDescriptors(
      ShopifyPaymentsChargeStatementDescriptor chargeStatementDescriptors) {
    this.chargeStatementDescriptors = chargeStatementDescriptors;
  }

  
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  
  public CurrencyCode getDefaultCurrency() {
    return defaultCurrency;
  }

  public void setDefaultCurrency(CurrencyCode defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  
  public ShopifyPaymentsDisputeConnection getDisputes() {
    return disputes;
  }

  public void setDisputes(ShopifyPaymentsDisputeConnection disputes) {
    this.disputes = disputes;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public boolean getOnboardable() {
    return onboardable;
  }

  public void setOnboardable(boolean onboardable) {
    this.onboardable = onboardable;
  }

  
  public ShopifyPaymentsPayoutSchedule getPayoutSchedule() {
    return payoutSchedule;
  }

  public void setPayoutSchedule(ShopifyPaymentsPayoutSchedule payoutSchedule) {
    this.payoutSchedule = payoutSchedule;
  }

  
  public String getPayoutStatementDescriptor() {
    return payoutStatementDescriptor;
  }

  public void setPayoutStatementDescriptor(String payoutStatementDescriptor) {
    this.payoutStatementDescriptor = payoutStatementDescriptor;
  }

  
  public ShopifyPaymentsPayoutConnection getPayouts() {
    return payouts;
  }

  public void setPayouts(ShopifyPaymentsPayoutConnection payouts) {
    this.payouts = payouts;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsAccount{activated='" + activated + "', balance='" + balance + "', balanceTransactions='" + balanceTransactions + "', bankAccounts='" + bankAccounts + "', chargeStatementDescriptor='" + chargeStatementDescriptor + "', chargeStatementDescriptors='" + chargeStatementDescriptors + "', country='" + country + "', defaultCurrency='" + defaultCurrency + "', disputes='" + disputes + "', id='" + id + "', onboardable='" + onboardable + "', payoutSchedule='" + payoutSchedule + "', payoutStatementDescriptor='" + payoutStatementDescriptor + "', payouts='" + payouts + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsAccount that = (ShopifyPaymentsAccount) o;
    return activated == that.activated &&
        Objects.equals(balance, that.balance) &&
        Objects.equals(balanceTransactions, that.balanceTransactions) &&
        Objects.equals(bankAccounts, that.bankAccounts) &&
        Objects.equals(chargeStatementDescriptor, that.chargeStatementDescriptor) &&
        Objects.equals(chargeStatementDescriptors, that.chargeStatementDescriptors) &&
        Objects.equals(country, that.country) &&
        Objects.equals(defaultCurrency, that.defaultCurrency) &&
        Objects.equals(disputes, that.disputes) &&
        Objects.equals(id, that.id) &&
        onboardable == that.onboardable &&
        Objects.equals(payoutSchedule, that.payoutSchedule) &&
        Objects.equals(payoutStatementDescriptor, that.payoutStatementDescriptor) &&
        Objects.equals(payouts, that.payouts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activated, balance, balanceTransactions, bankAccounts, chargeStatementDescriptor, chargeStatementDescriptors, country, defaultCurrency, disputes, id, onboardable, payoutSchedule, payoutStatementDescriptor, payouts);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private boolean activated;

    
    private List<MoneyV2> balance;

    
    private ShopifyPaymentsBalanceTransactionConnection balanceTransactions;

    
    private ShopifyPaymentsBankAccountConnection bankAccounts;

    
    private String chargeStatementDescriptor;

    
    private ShopifyPaymentsChargeStatementDescriptor chargeStatementDescriptors;

    
    private String country;

    
    private CurrencyCode defaultCurrency;

    
    private ShopifyPaymentsDisputeConnection disputes;

    
    private String id;

    
    private boolean onboardable;

    
    private ShopifyPaymentsPayoutSchedule payoutSchedule;

    
    private String payoutStatementDescriptor;

    
    private ShopifyPaymentsPayoutConnection payouts;

    public ShopifyPaymentsAccount build() {
      ShopifyPaymentsAccount result = new ShopifyPaymentsAccount();
      result.activated = this.activated;
      result.balance = this.balance;
      result.balanceTransactions = this.balanceTransactions;
      result.bankAccounts = this.bankAccounts;
      result.chargeStatementDescriptor = this.chargeStatementDescriptor;
      result.chargeStatementDescriptors = this.chargeStatementDescriptors;
      result.country = this.country;
      result.defaultCurrency = this.defaultCurrency;
      result.disputes = this.disputes;
      result.id = this.id;
      result.onboardable = this.onboardable;
      result.payoutSchedule = this.payoutSchedule;
      result.payoutStatementDescriptor = this.payoutStatementDescriptor;
      result.payouts = this.payouts;
      return result;
    }

    
    public Builder activated(boolean activated) {
      this.activated = activated;
      return this;
    }

    
    public Builder balance(List<MoneyV2> balance) {
      this.balance = balance;
      return this;
    }

    
    public Builder balanceTransactions(
        ShopifyPaymentsBalanceTransactionConnection balanceTransactions) {
      this.balanceTransactions = balanceTransactions;
      return this;
    }

    
    public Builder bankAccounts(ShopifyPaymentsBankAccountConnection bankAccounts) {
      this.bankAccounts = bankAccounts;
      return this;
    }

    
    public Builder chargeStatementDescriptor(String chargeStatementDescriptor) {
      this.chargeStatementDescriptor = chargeStatementDescriptor;
      return this;
    }

    
    public Builder chargeStatementDescriptors(
        ShopifyPaymentsChargeStatementDescriptor chargeStatementDescriptors) {
      this.chargeStatementDescriptors = chargeStatementDescriptors;
      return this;
    }

    
    public Builder country(String country) {
      this.country = country;
      return this;
    }

    
    public Builder defaultCurrency(CurrencyCode defaultCurrency) {
      this.defaultCurrency = defaultCurrency;
      return this;
    }

    
    public Builder disputes(ShopifyPaymentsDisputeConnection disputes) {
      this.disputes = disputes;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder onboardable(boolean onboardable) {
      this.onboardable = onboardable;
      return this;
    }

    
    public Builder payoutSchedule(ShopifyPaymentsPayoutSchedule payoutSchedule) {
      this.payoutSchedule = payoutSchedule;
      return this;
    }

    
    public Builder payoutStatementDescriptor(String payoutStatementDescriptor) {
      this.payoutStatementDescriptor = payoutStatementDescriptor;
      return this;
    }

    
    public Builder payouts(ShopifyPaymentsPayoutConnection payouts) {
      this.payouts = payouts;
      return this;
    }
  }
}
