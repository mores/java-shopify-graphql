package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A debit revert transaction which increases the store credit account balance.
 * Debit revert transactions are created automatically when a [store credit account debit transaction](https://shopify.dev/api/admin-graphql/latest/objects/StoreCreditAccountDebitTransaction) is reverted.
 *
 * Store credit account debit transactions are reverted when an order is cancelled,
 * refunded or in the event of a payment failure at checkout.
 * The amount added to the balance is equal to the amount reverted on the original credit.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class StoreCreditAccountDebitRevertTransaction implements com.shopify.types.Node, com.shopify.types.StoreCreditAccountTransaction {
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
   * The reverted debit transaction.
   */
  private StoreCreditAccountDebitTransaction debitTransaction;

  /**
   * A globally-unique ID.
   */
  private String id;

  public StoreCreditAccountDebitRevertTransaction() {
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
   * The reverted debit transaction.
   */
  public StoreCreditAccountDebitTransaction getDebitTransaction() {
    return debitTransaction;
  }

  public void setDebitTransaction(StoreCreditAccountDebitTransaction debitTransaction) {
    this.debitTransaction = debitTransaction;
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

  @Override
  public String toString() {
    return "StoreCreditAccountDebitRevertTransaction{account='" + account + "', amount='" + amount + "', balanceAfterTransaction='" + balanceAfterTransaction + "', createdAt='" + createdAt + "', debitTransaction='" + debitTransaction + "', id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StoreCreditAccountDebitRevertTransaction that = (StoreCreditAccountDebitRevertTransaction) o;
    return Objects.equals(account, that.account) &&
        Objects.equals(amount, that.amount) &&
        Objects.equals(balanceAfterTransaction, that.balanceAfterTransaction) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(debitTransaction, that.debitTransaction) &&
        Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, amount, balanceAfterTransaction, createdAt, debitTransaction, id);
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
     * The reverted debit transaction.
     */
    private StoreCreditAccountDebitTransaction debitTransaction;

    /**
     * A globally-unique ID.
     */
    private String id;

    public StoreCreditAccountDebitRevertTransaction build() {
      StoreCreditAccountDebitRevertTransaction result = new StoreCreditAccountDebitRevertTransaction();
      result.account = this.account;
      result.amount = this.amount;
      result.balanceAfterTransaction = this.balanceAfterTransaction;
      result.createdAt = this.createdAt;
      result.debitTransaction = this.debitTransaction;
      result.id = this.id;
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
     * The reverted debit transaction.
     */
    public Builder debitTransaction(StoreCreditAccountDebitTransaction debitTransaction) {
      this.debitTransaction = debitTransaction;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}