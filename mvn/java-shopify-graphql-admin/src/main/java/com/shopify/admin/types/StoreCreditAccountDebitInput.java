package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a store credit account debit transaction.
 */
public class StoreCreditAccountDebitInput {
  /**
   * The amount to debit the store credit account.
   */
  private MoneyInput debitAmount;

  public StoreCreditAccountDebitInput() {
  }

  /**
   * The amount to debit the store credit account.
   */
  public MoneyInput getDebitAmount() {
    return debitAmount;
  }

  public void setDebitAmount(MoneyInput debitAmount) {
    this.debitAmount = debitAmount;
  }

  @Override
  public String toString() {
    return "StoreCreditAccountDebitInput{debitAmount='" + debitAmount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StoreCreditAccountDebitInput that = (StoreCreditAccountDebitInput) o;
    return Objects.equals(debitAmount, that.debitAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(debitAmount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The amount to debit the store credit account.
     */
    private MoneyInput debitAmount;

    public StoreCreditAccountDebitInput build() {
      StoreCreditAccountDebitInput result = new StoreCreditAccountDebitInput();
      result.debitAmount = this.debitAmount;
      return result;
    }

    /**
     * The amount to debit the store credit account.
     */
    public Builder debitAmount(MoneyInput debitAmount) {
      this.debitAmount = debitAmount;
      return this;
    }
  }
}
