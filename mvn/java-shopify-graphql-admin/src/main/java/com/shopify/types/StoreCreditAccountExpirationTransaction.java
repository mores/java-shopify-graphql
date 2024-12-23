package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * An expiration transaction which decreases the store credit account balance.
 * Expiration transactions are created automatically when a [store credit account credit transaction](https://shopify.dev/api/admin-graphql/latest/objects/StoreCreditAccountCreditTransaction) expires.
 *
 * The amount subtracted from the balance is equal to the remaining amount of the credit transaction.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class StoreCreditAccountExpirationTransaction implements com.shopify.types.StoreCreditAccountTransaction {
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
   * The credit transaction which expired.
   */
  private StoreCreditAccountCreditTransaction creditTransaction;

  public StoreCreditAccountExpirationTransaction() {
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
   * The credit transaction which expired.
   */
  public StoreCreditAccountCreditTransaction getCreditTransaction() {
    return creditTransaction;
  }

  public void setCreditTransaction(StoreCreditAccountCreditTransaction creditTransaction) {
    this.creditTransaction = creditTransaction;
  }

  @Override
  public String toString() {
    return "StoreCreditAccountExpirationTransaction{account='" + account + "', amount='" + amount + "', balanceAfterTransaction='" + balanceAfterTransaction + "', createdAt='" + createdAt + "', creditTransaction='" + creditTransaction + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StoreCreditAccountExpirationTransaction that = (StoreCreditAccountExpirationTransaction) o;
    return Objects.equals(account, that.account) &&
        Objects.equals(amount, that.amount) &&
        Objects.equals(balanceAfterTransaction, that.balanceAfterTransaction) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(creditTransaction, that.creditTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, amount, balanceAfterTransaction, createdAt, creditTransaction);
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
     * The credit transaction which expired.
     */
    private StoreCreditAccountCreditTransaction creditTransaction;

    public StoreCreditAccountExpirationTransaction build() {
      StoreCreditAccountExpirationTransaction result = new StoreCreditAccountExpirationTransaction();
      result.account = this.account;
      result.amount = this.amount;
      result.balanceAfterTransaction = this.balanceAfterTransaction;
      result.createdAt = this.createdAt;
      result.creditTransaction = this.creditTransaction;
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
     * The credit transaction which expired.
     */
    public Builder creditTransaction(StoreCreditAccountCreditTransaction creditTransaction) {
      this.creditTransaction = creditTransaction;
      return this;
    }
  }
}
