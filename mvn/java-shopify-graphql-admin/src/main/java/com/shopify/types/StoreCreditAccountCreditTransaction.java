package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A credit transaction which increases the store credit account balance.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class StoreCreditAccountCreditTransaction implements com.shopify.types.Node, com.shopify.types.StoreCreditAccountTransaction {
  /**
   * The store credit account that the transaction belongs to.
   */
  private StoreCreditAccount account;

  /**
   * The amount of the transaction.
   */
  private MoneyV2 amount;

  /**
   * The balance of the account after the transaction.
   */
  private MoneyV2 balanceAfterTransaction;

  /**
   * The date and time when the transaction was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The time at which the transaction expires.
   * Debit transactions will always spend the soonest expiring credit first.
   */
  private OffsetDateTime expiresAt;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The remaining amount of the credit.
   * The remaining amount will decrease when a debit spends this credit. It may
   * also increase if that debit is subsequently reverted.
   * In the event that the credit expires, the remaining amount will represent the amount that remained as the expiry ocurred.
   */
  private MoneyV2 remainingAmount;

  public StoreCreditAccountCreditTransaction() {
  }

  /**
   * The store credit account that the transaction belongs to.
   */
  public StoreCreditAccount getAccount() {
    return account;
  }

  public void setAccount(StoreCreditAccount account) {
    this.account = account;
  }

  /**
   * The amount of the transaction.
   */
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
  }

  /**
   * The balance of the account after the transaction.
   */
  public MoneyV2 getBalanceAfterTransaction() {
    return balanceAfterTransaction;
  }

  public void setBalanceAfterTransaction(MoneyV2 balanceAfterTransaction) {
    this.balanceAfterTransaction = balanceAfterTransaction;
  }

  /**
   * The date and time when the transaction was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The time at which the transaction expires.
   * Debit transactions will always spend the soonest expiring credit first.
   */
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
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
   * The remaining amount of the credit.
   * The remaining amount will decrease when a debit spends this credit. It may
   * also increase if that debit is subsequently reverted.
   * In the event that the credit expires, the remaining amount will represent the amount that remained as the expiry ocurred.
   */
  public MoneyV2 getRemainingAmount() {
    return remainingAmount;
  }

  public void setRemainingAmount(MoneyV2 remainingAmount) {
    this.remainingAmount = remainingAmount;
  }

  @Override
  public String toString() {
    return "StoreCreditAccountCreditTransaction{account='" + account + "', amount='" + amount + "', balanceAfterTransaction='" + balanceAfterTransaction + "', createdAt='" + createdAt + "', expiresAt='" + expiresAt + "', id='" + id + "', remainingAmount='" + remainingAmount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StoreCreditAccountCreditTransaction that = (StoreCreditAccountCreditTransaction) o;
    return Objects.equals(account, that.account) &&
        Objects.equals(amount, that.amount) &&
        Objects.equals(balanceAfterTransaction, that.balanceAfterTransaction) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(expiresAt, that.expiresAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(remainingAmount, that.remainingAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, amount, balanceAfterTransaction, createdAt, expiresAt, id, remainingAmount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The store credit account that the transaction belongs to.
     */
    private StoreCreditAccount account;

    /**
     * The amount of the transaction.
     */
    private MoneyV2 amount;

    /**
     * The balance of the account after the transaction.
     */
    private MoneyV2 balanceAfterTransaction;

    /**
     * The date and time when the transaction was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The time at which the transaction expires.
     * Debit transactions will always spend the soonest expiring credit first.
     */
    private OffsetDateTime expiresAt;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The remaining amount of the credit.
     * The remaining amount will decrease when a debit spends this credit. It may
     * also increase if that debit is subsequently reverted.
     * In the event that the credit expires, the remaining amount will represent the amount that remained as the expiry ocurred.
     */
    private MoneyV2 remainingAmount;

    public StoreCreditAccountCreditTransaction build() {
      StoreCreditAccountCreditTransaction result = new StoreCreditAccountCreditTransaction();
      result.account = this.account;
      result.amount = this.amount;
      result.balanceAfterTransaction = this.balanceAfterTransaction;
      result.createdAt = this.createdAt;
      result.expiresAt = this.expiresAt;
      result.id = this.id;
      result.remainingAmount = this.remainingAmount;
      return result;
    }

    /**
     * The store credit account that the transaction belongs to.
     */
    public Builder account(StoreCreditAccount account) {
      this.account = account;
      return this;
    }

    /**
     * The amount of the transaction.
     */
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The balance of the account after the transaction.
     */
    public Builder balanceAfterTransaction(MoneyV2 balanceAfterTransaction) {
      this.balanceAfterTransaction = balanceAfterTransaction;
      return this;
    }

    /**
     * The date and time when the transaction was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The time at which the transaction expires.
     * Debit transactions will always spend the soonest expiring credit first.
     */
    public Builder expiresAt(OffsetDateTime expiresAt) {
      this.expiresAt = expiresAt;
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
     * The remaining amount of the credit.
     * The remaining amount will decrease when a debit spends this credit. It may
     * also increase if that debit is subsequently reverted.
     * In the event that the credit expires, the remaining amount will represent the amount that remained as the expiry ocurred.
     */
    public Builder remainingAmount(MoneyV2 remainingAmount) {
      this.remainingAmount = remainingAmount;
      return this;
    }
  }
}
