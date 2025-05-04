package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A store credit account contains a monetary balance that can be redeemed at checkout for purchases in the shop.
 * The account is held in the specified currency and has an owner that cannot be transferred.
 *
 * The account balance is redeemable at checkout only when the owner is
 * authenticated via [new customer accounts
 * authentication](https://shopify.dev/docs/api/customer).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class StoreCreditAccount implements com.shopify.admin.types.Node {
  /**
   * The current balance of the store credit account.
   */
  private MoneyV2 balance;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The owner of the store credit account.
   */
  private HasStoreCreditAccounts owner;

  /**
   * The transaction history of the store credit account.
   */
  private StoreCreditAccountTransactionConnection transactions;

  public StoreCreditAccount() {
  }

  /**
   * The current balance of the store credit account.
   */
  public MoneyV2 getBalance() {
    return balance;
  }

  public void setBalance(MoneyV2 balance) {
    this.balance = balance;
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
   * The owner of the store credit account.
   */
  public HasStoreCreditAccounts getOwner() {
    return owner;
  }

  public void setOwner(HasStoreCreditAccounts owner) {
    this.owner = owner;
  }

  /**
   * The transaction history of the store credit account.
   */
  public StoreCreditAccountTransactionConnection getTransactions() {
    return transactions;
  }

  public void setTransactions(StoreCreditAccountTransactionConnection transactions) {
    this.transactions = transactions;
  }

  @Override
  public String toString() {
    return "StoreCreditAccount{balance='" + balance + "', id='" + id + "', owner='" + owner + "', transactions='" + transactions + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StoreCreditAccount that = (StoreCreditAccount) o;
    return Objects.equals(balance, that.balance) &&
        Objects.equals(id, that.id) &&
        Objects.equals(owner, that.owner) &&
        Objects.equals(transactions, that.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, id, owner, transactions);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The current balance of the store credit account.
     */
    private MoneyV2 balance;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The owner of the store credit account.
     */
    private HasStoreCreditAccounts owner;

    /**
     * The transaction history of the store credit account.
     */
    private StoreCreditAccountTransactionConnection transactions;

    public StoreCreditAccount build() {
      StoreCreditAccount result = new StoreCreditAccount();
      result.balance = this.balance;
      result.id = this.id;
      result.owner = this.owner;
      result.transactions = this.transactions;
      return result;
    }

    /**
     * The current balance of the store credit account.
     */
    public Builder balance(MoneyV2 balance) {
      this.balance = balance;
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
     * The owner of the store credit account.
     */
    public Builder owner(HasStoreCreditAccounts owner) {
      this.owner = owner;
      return this;
    }

    /**
     * The transaction history of the store credit account.
     */
    public Builder transactions(StoreCreditAccountTransactionConnection transactions) {
      this.transactions = transactions;
      return this;
    }
  }
}
