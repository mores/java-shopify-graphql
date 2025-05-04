package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Balance and payout information for a
 * [Shopify Payments](https://help.shopify.com/manual/payments/shopify-payments/getting-paid-with-shopify-payments)
 * account. Balance includes all balances for the currencies supported by the shop.
 * You can also query for a list of payouts, where each payout includes the corresponding currencyCode field.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopifyPaymentsAccount implements com.shopify.admin.types.Node {
  /**
   * The name of the account opener.
   */
  private String accountOpenerName;

  /**
   * Whether the Shopify Payments setup is completed.
   */
  private boolean activated;

  /**
   * Current balances in all currencies for the account.
   */
  private List<MoneyV2> balance;

  /**
   * A list of balance transactions associated with the shop.
   */
  private ShopifyPaymentsBalanceTransactionConnection balanceTransactions;

  /**
   * All bank accounts configured for the Shopify Payments account.
   */
  private ShopifyPaymentsBankAccountConnection bankAccounts;

  /**
   * The statement descriptor used for charges.
   *   
   * The statement descriptor appears on a customer's credit card or bank statement when they make a purchase.
   */
  private String chargeStatementDescriptor;

  /**
   * The statement descriptors used for charges.
   *   
   * These descriptors appear on a customer's credit card or bank statement when they make a purchase.
   */
  private ShopifyPaymentsChargeStatementDescriptor chargeStatementDescriptors;

  /**
   * The Shopify Payments account country.
   */
  private String country;

  /**
   * The default payout currency for the Shopify Payments account.
   */
  private CurrencyCode defaultCurrency;

  /**
   * All disputes that originated from a transaction made with the Shopify Payments account.
   */
  private ShopifyPaymentsDisputeConnection disputes;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * Whether the Shopify Payments account can be onboarded.
   */
  private boolean onboardable;

  /**
   * The payout schedule for the account.
   */
  private ShopifyPaymentsPayoutSchedule payoutSchedule;

  /**
   * The descriptor used for payouts.
   *   
   * The descriptor appears on a merchant's bank statement when they receive a payout.
   */
  private String payoutStatementDescriptor;

  /**
   * All current and previous payouts made between the account and the bank account.
   */
  private ShopifyPaymentsPayoutConnection payouts;

  public ShopifyPaymentsAccount() {
  }

  /**
   * The name of the account opener.
   */
  public String getAccountOpenerName() {
    return accountOpenerName;
  }

  public void setAccountOpenerName(String accountOpenerName) {
    this.accountOpenerName = accountOpenerName;
  }

  /**
   * Whether the Shopify Payments setup is completed.
   */
  public boolean getActivated() {
    return activated;
  }

  public void setActivated(boolean activated) {
    this.activated = activated;
  }

  /**
   * Current balances in all currencies for the account.
   */
  public List<MoneyV2> getBalance() {
    return balance;
  }

  public void setBalance(List<MoneyV2> balance) {
    this.balance = balance;
  }

  /**
   * A list of balance transactions associated with the shop.
   */
  public ShopifyPaymentsBalanceTransactionConnection getBalanceTransactions() {
    return balanceTransactions;
  }

  public void setBalanceTransactions(
      ShopifyPaymentsBalanceTransactionConnection balanceTransactions) {
    this.balanceTransactions = balanceTransactions;
  }

  /**
   * All bank accounts configured for the Shopify Payments account.
   */
  public ShopifyPaymentsBankAccountConnection getBankAccounts() {
    return bankAccounts;
  }

  public void setBankAccounts(ShopifyPaymentsBankAccountConnection bankAccounts) {
    this.bankAccounts = bankAccounts;
  }

  /**
   * The statement descriptor used for charges.
   *   
   * The statement descriptor appears on a customer's credit card or bank statement when they make a purchase.
   */
  public String getChargeStatementDescriptor() {
    return chargeStatementDescriptor;
  }

  public void setChargeStatementDescriptor(String chargeStatementDescriptor) {
    this.chargeStatementDescriptor = chargeStatementDescriptor;
  }

  /**
   * The statement descriptors used for charges.
   *   
   * These descriptors appear on a customer's credit card or bank statement when they make a purchase.
   */
  public ShopifyPaymentsChargeStatementDescriptor getChargeStatementDescriptors() {
    return chargeStatementDescriptors;
  }

  public void setChargeStatementDescriptors(
      ShopifyPaymentsChargeStatementDescriptor chargeStatementDescriptors) {
    this.chargeStatementDescriptors = chargeStatementDescriptors;
  }

  /**
   * The Shopify Payments account country.
   */
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * The default payout currency for the Shopify Payments account.
   */
  public CurrencyCode getDefaultCurrency() {
    return defaultCurrency;
  }

  public void setDefaultCurrency(CurrencyCode defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  /**
   * All disputes that originated from a transaction made with the Shopify Payments account.
   */
  public ShopifyPaymentsDisputeConnection getDisputes() {
    return disputes;
  }

  public void setDisputes(ShopifyPaymentsDisputeConnection disputes) {
    this.disputes = disputes;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Whether the Shopify Payments account can be onboarded.
   */
  public boolean getOnboardable() {
    return onboardable;
  }

  public void setOnboardable(boolean onboardable) {
    this.onboardable = onboardable;
  }

  /**
   * The payout schedule for the account.
   */
  public ShopifyPaymentsPayoutSchedule getPayoutSchedule() {
    return payoutSchedule;
  }

  public void setPayoutSchedule(ShopifyPaymentsPayoutSchedule payoutSchedule) {
    this.payoutSchedule = payoutSchedule;
  }

  /**
   * The descriptor used for payouts.
   *   
   * The descriptor appears on a merchant's bank statement when they receive a payout.
   */
  public String getPayoutStatementDescriptor() {
    return payoutStatementDescriptor;
  }

  public void setPayoutStatementDescriptor(String payoutStatementDescriptor) {
    this.payoutStatementDescriptor = payoutStatementDescriptor;
  }

  /**
   * All current and previous payouts made between the account and the bank account.
   */
  public ShopifyPaymentsPayoutConnection getPayouts() {
    return payouts;
  }

  public void setPayouts(ShopifyPaymentsPayoutConnection payouts) {
    this.payouts = payouts;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsAccount{accountOpenerName='" + accountOpenerName + "', activated='" + activated + "', balance='" + balance + "', balanceTransactions='" + balanceTransactions + "', bankAccounts='" + bankAccounts + "', chargeStatementDescriptor='" + chargeStatementDescriptor + "', chargeStatementDescriptors='" + chargeStatementDescriptors + "', country='" + country + "', defaultCurrency='" + defaultCurrency + "', disputes='" + disputes + "', id='" + id + "', onboardable='" + onboardable + "', payoutSchedule='" + payoutSchedule + "', payoutStatementDescriptor='" + payoutStatementDescriptor + "', payouts='" + payouts + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsAccount that = (ShopifyPaymentsAccount) o;
    return Objects.equals(accountOpenerName, that.accountOpenerName) &&
        activated == that.activated &&
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
    return Objects.hash(accountOpenerName, activated, balance, balanceTransactions, bankAccounts, chargeStatementDescriptor, chargeStatementDescriptors, country, defaultCurrency, disputes, id, onboardable, payoutSchedule, payoutStatementDescriptor, payouts);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the account opener.
     */
    private String accountOpenerName;

    /**
     * Whether the Shopify Payments setup is completed.
     */
    private boolean activated;

    /**
     * Current balances in all currencies for the account.
     */
    private List<MoneyV2> balance;

    /**
     * A list of balance transactions associated with the shop.
     */
    private ShopifyPaymentsBalanceTransactionConnection balanceTransactions;

    /**
     * All bank accounts configured for the Shopify Payments account.
     */
    private ShopifyPaymentsBankAccountConnection bankAccounts;

    /**
     * The statement descriptor used for charges.
     *   
     * The statement descriptor appears on a customer's credit card or bank statement when they make a purchase.
     */
    private String chargeStatementDescriptor;

    /**
     * The statement descriptors used for charges.
     *   
     * These descriptors appear on a customer's credit card or bank statement when they make a purchase.
     */
    private ShopifyPaymentsChargeStatementDescriptor chargeStatementDescriptors;

    /**
     * The Shopify Payments account country.
     */
    private String country;

    /**
     * The default payout currency for the Shopify Payments account.
     */
    private CurrencyCode defaultCurrency;

    /**
     * All disputes that originated from a transaction made with the Shopify Payments account.
     */
    private ShopifyPaymentsDisputeConnection disputes;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * Whether the Shopify Payments account can be onboarded.
     */
    private boolean onboardable;

    /**
     * The payout schedule for the account.
     */
    private ShopifyPaymentsPayoutSchedule payoutSchedule;

    /**
     * The descriptor used for payouts.
     *   
     * The descriptor appears on a merchant's bank statement when they receive a payout.
     */
    private String payoutStatementDescriptor;

    /**
     * All current and previous payouts made between the account and the bank account.
     */
    private ShopifyPaymentsPayoutConnection payouts;

    public ShopifyPaymentsAccount build() {
      ShopifyPaymentsAccount result = new ShopifyPaymentsAccount();
      result.accountOpenerName = this.accountOpenerName;
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

    /**
     * The name of the account opener.
     */
    public Builder accountOpenerName(String accountOpenerName) {
      this.accountOpenerName = accountOpenerName;
      return this;
    }

    /**
     * Whether the Shopify Payments setup is completed.
     */
    public Builder activated(boolean activated) {
      this.activated = activated;
      return this;
    }

    /**
     * Current balances in all currencies for the account.
     */
    public Builder balance(List<MoneyV2> balance) {
      this.balance = balance;
      return this;
    }

    /**
     * A list of balance transactions associated with the shop.
     */
    public Builder balanceTransactions(
        ShopifyPaymentsBalanceTransactionConnection balanceTransactions) {
      this.balanceTransactions = balanceTransactions;
      return this;
    }

    /**
     * All bank accounts configured for the Shopify Payments account.
     */
    public Builder bankAccounts(ShopifyPaymentsBankAccountConnection bankAccounts) {
      this.bankAccounts = bankAccounts;
      return this;
    }

    /**
     * The statement descriptor used for charges.
     *   
     * The statement descriptor appears on a customer's credit card or bank statement when they make a purchase.
     */
    public Builder chargeStatementDescriptor(String chargeStatementDescriptor) {
      this.chargeStatementDescriptor = chargeStatementDescriptor;
      return this;
    }

    /**
     * The statement descriptors used for charges.
     *   
     * These descriptors appear on a customer's credit card or bank statement when they make a purchase.
     */
    public Builder chargeStatementDescriptors(
        ShopifyPaymentsChargeStatementDescriptor chargeStatementDescriptors) {
      this.chargeStatementDescriptors = chargeStatementDescriptors;
      return this;
    }

    /**
     * The Shopify Payments account country.
     */
    public Builder country(String country) {
      this.country = country;
      return this;
    }

    /**
     * The default payout currency for the Shopify Payments account.
     */
    public Builder defaultCurrency(CurrencyCode defaultCurrency) {
      this.defaultCurrency = defaultCurrency;
      return this;
    }

    /**
     * All disputes that originated from a transaction made with the Shopify Payments account.
     */
    public Builder disputes(ShopifyPaymentsDisputeConnection disputes) {
      this.disputes = disputes;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Whether the Shopify Payments account can be onboarded.
     */
    public Builder onboardable(boolean onboardable) {
      this.onboardable = onboardable;
      return this;
    }

    /**
     * The payout schedule for the account.
     */
    public Builder payoutSchedule(ShopifyPaymentsPayoutSchedule payoutSchedule) {
      this.payoutSchedule = payoutSchedule;
      return this;
    }

    /**
     * The descriptor used for payouts.
     *   
     * The descriptor appears on a merchant's bank statement when they receive a payout.
     */
    public Builder payoutStatementDescriptor(String payoutStatementDescriptor) {
      this.payoutStatementDescriptor = payoutStatementDescriptor;
      return this;
    }

    /**
     * All current and previous payouts made between the account and the bank account.
     */
    public Builder payouts(ShopifyPaymentsPayoutConnection payouts) {
      this.payouts = payouts;
      return this;
    }
  }
}
