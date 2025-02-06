package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A suggested transaction. Suggested transaction are usually used in the context of refunds
 * and exchanges.
 */
public class SuggestedOrderTransaction {
  /**
   * The masked account number associated with the payment method.
   */
  private String accountNumber;

  /**
   * The amount of the transaction.
   */
  private String amount;

  /**
   * The amount and currency of the suggested order transaction in shop and presentment currencies.
   */
  private MoneyBag amountSet;

  /**
   * The human-readable payment gateway name suggested to process the transaction.
   */
  private String formattedGateway;

  /**
   * The suggested payment gateway used to process the transaction.
   */
  private String gateway;

  /**
   * Specifies the kind of the suggested order transaction.
   */
  private SuggestedOrderTransactionKind kind;

  /**
   * Specifies the available amount to refund on the gateway. Only available within SuggestedRefund.
   */
  private String maximumRefundable;

  /**
   * Specifies the available amount to refund on the gateway in shop and
   * presentment currencies. Only available within SuggestedRefund.
   */
  private MoneyBag maximumRefundableSet;

  /**
   * The associated parent transaction, for example the authorization of a capture.
   */
  private OrderTransaction parentTransaction;

  /**
   * The associated payment details related to the transaction.
   */
  private PaymentDetails paymentDetails;

  public SuggestedOrderTransaction() {
  }

  /**
   * The masked account number associated with the payment method.
   */
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  /**
   * The amount of the transaction.
   */
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * The amount and currency of the suggested order transaction in shop and presentment currencies.
   */
  public MoneyBag getAmountSet() {
    return amountSet;
  }

  public void setAmountSet(MoneyBag amountSet) {
    this.amountSet = amountSet;
  }

  /**
   * The human-readable payment gateway name suggested to process the transaction.
   */
  public String getFormattedGateway() {
    return formattedGateway;
  }

  public void setFormattedGateway(String formattedGateway) {
    this.formattedGateway = formattedGateway;
  }

  /**
   * The suggested payment gateway used to process the transaction.
   */
  public String getGateway() {
    return gateway;
  }

  public void setGateway(String gateway) {
    this.gateway = gateway;
  }

  /**
   * Specifies the kind of the suggested order transaction.
   */
  public SuggestedOrderTransactionKind getKind() {
    return kind;
  }

  public void setKind(SuggestedOrderTransactionKind kind) {
    this.kind = kind;
  }

  /**
   * Specifies the available amount to refund on the gateway. Only available within SuggestedRefund.
   */
  public String getMaximumRefundable() {
    return maximumRefundable;
  }

  public void setMaximumRefundable(String maximumRefundable) {
    this.maximumRefundable = maximumRefundable;
  }

  /**
   * Specifies the available amount to refund on the gateway in shop and
   * presentment currencies. Only available within SuggestedRefund.
   */
  public MoneyBag getMaximumRefundableSet() {
    return maximumRefundableSet;
  }

  public void setMaximumRefundableSet(MoneyBag maximumRefundableSet) {
    this.maximumRefundableSet = maximumRefundableSet;
  }

  /**
   * The associated parent transaction, for example the authorization of a capture.
   */
  public OrderTransaction getParentTransaction() {
    return parentTransaction;
  }

  public void setParentTransaction(OrderTransaction parentTransaction) {
    this.parentTransaction = parentTransaction;
  }

  /**
   * The associated payment details related to the transaction.
   */
  public PaymentDetails getPaymentDetails() {
    return paymentDetails;
  }

  public void setPaymentDetails(PaymentDetails paymentDetails) {
    this.paymentDetails = paymentDetails;
  }

  @Override
  public String toString() {
    return "SuggestedOrderTransaction{accountNumber='" + accountNumber + "', amount='" + amount + "', amountSet='" + amountSet + "', formattedGateway='" + formattedGateway + "', gateway='" + gateway + "', kind='" + kind + "', maximumRefundable='" + maximumRefundable + "', maximumRefundableSet='" + maximumRefundableSet + "', parentTransaction='" + parentTransaction + "', paymentDetails='" + paymentDetails + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SuggestedOrderTransaction that = (SuggestedOrderTransaction) o;
    return Objects.equals(accountNumber, that.accountNumber) &&
        Objects.equals(amount, that.amount) &&
        Objects.equals(amountSet, that.amountSet) &&
        Objects.equals(formattedGateway, that.formattedGateway) &&
        Objects.equals(gateway, that.gateway) &&
        Objects.equals(kind, that.kind) &&
        Objects.equals(maximumRefundable, that.maximumRefundable) &&
        Objects.equals(maximumRefundableSet, that.maximumRefundableSet) &&
        Objects.equals(parentTransaction, that.parentTransaction) &&
        Objects.equals(paymentDetails, that.paymentDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, amount, amountSet, formattedGateway, gateway, kind, maximumRefundable, maximumRefundableSet, parentTransaction, paymentDetails);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The masked account number associated with the payment method.
     */
    private String accountNumber;

    /**
     * The amount of the transaction.
     */
    private String amount;

    /**
     * The amount and currency of the suggested order transaction in shop and presentment currencies.
     */
    private MoneyBag amountSet;

    /**
     * The human-readable payment gateway name suggested to process the transaction.
     */
    private String formattedGateway;

    /**
     * The suggested payment gateway used to process the transaction.
     */
    private String gateway;

    /**
     * Specifies the kind of the suggested order transaction.
     */
    private SuggestedOrderTransactionKind kind;

    /**
     * Specifies the available amount to refund on the gateway. Only available within SuggestedRefund.
     */
    private String maximumRefundable;

    /**
     * Specifies the available amount to refund on the gateway in shop and
     * presentment currencies. Only available within SuggestedRefund.
     */
    private MoneyBag maximumRefundableSet;

    /**
     * The associated parent transaction, for example the authorization of a capture.
     */
    private OrderTransaction parentTransaction;

    /**
     * The associated payment details related to the transaction.
     */
    private PaymentDetails paymentDetails;

    public SuggestedOrderTransaction build() {
      SuggestedOrderTransaction result = new SuggestedOrderTransaction();
      result.accountNumber = this.accountNumber;
      result.amount = this.amount;
      result.amountSet = this.amountSet;
      result.formattedGateway = this.formattedGateway;
      result.gateway = this.gateway;
      result.kind = this.kind;
      result.maximumRefundable = this.maximumRefundable;
      result.maximumRefundableSet = this.maximumRefundableSet;
      result.parentTransaction = this.parentTransaction;
      result.paymentDetails = this.paymentDetails;
      return result;
    }

    /**
     * The masked account number associated with the payment method.
     */
    public Builder accountNumber(String accountNumber) {
      this.accountNumber = accountNumber;
      return this;
    }

    /**
     * The amount of the transaction.
     */
    public Builder amount(String amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The amount and currency of the suggested order transaction in shop and presentment currencies.
     */
    public Builder amountSet(MoneyBag amountSet) {
      this.amountSet = amountSet;
      return this;
    }

    /**
     * The human-readable payment gateway name suggested to process the transaction.
     */
    public Builder formattedGateway(String formattedGateway) {
      this.formattedGateway = formattedGateway;
      return this;
    }

    /**
     * The suggested payment gateway used to process the transaction.
     */
    public Builder gateway(String gateway) {
      this.gateway = gateway;
      return this;
    }

    /**
     * Specifies the kind of the suggested order transaction.
     */
    public Builder kind(SuggestedOrderTransactionKind kind) {
      this.kind = kind;
      return this;
    }

    /**
     * Specifies the available amount to refund on the gateway. Only available within SuggestedRefund.
     */
    public Builder maximumRefundable(String maximumRefundable) {
      this.maximumRefundable = maximumRefundable;
      return this;
    }

    /**
     * Specifies the available amount to refund on the gateway in shop and
     * presentment currencies. Only available within SuggestedRefund.
     */
    public Builder maximumRefundableSet(MoneyBag maximumRefundableSet) {
      this.maximumRefundableSet = maximumRefundableSet;
      return this;
    }

    /**
     * The associated parent transaction, for example the authorization of a capture.
     */
    public Builder parentTransaction(OrderTransaction parentTransaction) {
      this.parentTransaction = parentTransaction;
      return this;
    }

    /**
     * The associated payment details related to the transaction.
     */
    public Builder paymentDetails(PaymentDetails paymentDetails) {
      this.paymentDetails = paymentDetails;
      return this;
    }
  }
}
