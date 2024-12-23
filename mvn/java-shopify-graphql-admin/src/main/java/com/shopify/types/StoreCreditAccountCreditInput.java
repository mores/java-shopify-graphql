package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields for a store credit account credit transaction.
 */
public class StoreCreditAccountCreditInput {
  /**
   * The amount to credit the store credit account.
   */
  private MoneyInput creditAmount;

  /**
   * The date and time when the credit expires.
   */
  private OffsetDateTime expiresAt;

  public StoreCreditAccountCreditInput() {
  }

  /**
   * The amount to credit the store credit account.
   */
  public MoneyInput getCreditAmount() {
    return creditAmount;
  }

  public void setCreditAmount(MoneyInput creditAmount) {
    this.creditAmount = creditAmount;
  }

  /**
   * The date and time when the credit expires.
   */
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  @Override
  public String toString() {
    return "StoreCreditAccountCreditInput{creditAmount='" + creditAmount + "', expiresAt='" + expiresAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StoreCreditAccountCreditInput that = (StoreCreditAccountCreditInput) o;
    return Objects.equals(creditAmount, that.creditAmount) &&
        Objects.equals(expiresAt, that.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditAmount, expiresAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The amount to credit the store credit account.
     */
    private MoneyInput creditAmount;

    /**
     * The date and time when the credit expires.
     */
    private OffsetDateTime expiresAt;

    public StoreCreditAccountCreditInput build() {
      StoreCreditAccountCreditInput result = new StoreCreditAccountCreditInput();
      result.creditAmount = this.creditAmount;
      result.expiresAt = this.expiresAt;
      return result;
    }

    /**
     * The amount to credit the store credit account.
     */
    public Builder creditAmount(MoneyInput creditAmount) {
      this.creditAmount = creditAmount;
      return this;
    }

    /**
     * The date and time when the credit expires.
     */
    public Builder expiresAt(OffsetDateTime expiresAt) {
      this.expiresAt = expiresAt;
      return this;
    }
  }
}
