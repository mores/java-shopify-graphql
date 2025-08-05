package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The financial transfer details for a return outcome that results in a refund.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class RefundReturnOutcome implements ReturnOutcomeFinancialTransfer {
  /**
   * The total monetary value to be refunded in shop and presentment currencies.
   */
  private MoneyBag amount;

  /**
   * A list of suggested refund methods.
   */
  private List<SuggestedRefundMethod> suggestedRefundMethods;

  /**
   * A list of suggested order transactions.
   */
  private List<SuggestedOrderTransaction> suggestedTransactions;

  public RefundReturnOutcome() {
  }

  /**
   * The total monetary value to be refunded in shop and presentment currencies.
   */
  public MoneyBag getAmount() {
    return amount;
  }

  public void setAmount(MoneyBag amount) {
    this.amount = amount;
  }

  /**
   * A list of suggested refund methods.
   */
  public List<SuggestedRefundMethod> getSuggestedRefundMethods() {
    return suggestedRefundMethods;
  }

  public void setSuggestedRefundMethods(List<SuggestedRefundMethod> suggestedRefundMethods) {
    this.suggestedRefundMethods = suggestedRefundMethods;
  }

  /**
   * A list of suggested order transactions.
   */
  public List<SuggestedOrderTransaction> getSuggestedTransactions() {
    return suggestedTransactions;
  }

  public void setSuggestedTransactions(List<SuggestedOrderTransaction> suggestedTransactions) {
    this.suggestedTransactions = suggestedTransactions;
  }

  @Override
  public String toString() {
    return "RefundReturnOutcome{amount='" + amount + "', suggestedRefundMethods='" + suggestedRefundMethods + "', suggestedTransactions='" + suggestedTransactions + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RefundReturnOutcome that = (RefundReturnOutcome) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(suggestedRefundMethods, that.suggestedRefundMethods) &&
        Objects.equals(suggestedTransactions, that.suggestedTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, suggestedRefundMethods, suggestedTransactions);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The total monetary value to be refunded in shop and presentment currencies.
     */
    private MoneyBag amount;

    /**
     * A list of suggested refund methods.
     */
    private List<SuggestedRefundMethod> suggestedRefundMethods;

    /**
     * A list of suggested order transactions.
     */
    private List<SuggestedOrderTransaction> suggestedTransactions;

    public RefundReturnOutcome build() {
      RefundReturnOutcome result = new RefundReturnOutcome();
      result.amount = this.amount;
      result.suggestedRefundMethods = this.suggestedRefundMethods;
      result.suggestedTransactions = this.suggestedTransactions;
      return result;
    }

    /**
     * The total monetary value to be refunded in shop and presentment currencies.
     */
    public Builder amount(MoneyBag amount) {
      this.amount = amount;
      return this;
    }

    /**
     * A list of suggested refund methods.
     */
    public Builder suggestedRefundMethods(List<SuggestedRefundMethod> suggestedRefundMethods) {
      this.suggestedRefundMethods = suggestedRefundMethods;
      return this;
    }

    /**
     * A list of suggested order transactions.
     */
    public Builder suggestedTransactions(List<SuggestedOrderTransaction> suggestedTransactions) {
      this.suggestedTransactions = suggestedTransactions;
      return this;
    }
  }
}
