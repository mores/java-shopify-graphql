package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class StoreCreditAccountExpirationTransaction implements com.shopify.types.StoreCreditAccountTransaction {
  
  private StoreCreditAccount account;

  
  private MoneyV2 amount;

  
  private MoneyV2 balanceAfterTransaction;

  
  private OffsetDateTime createdAt;

  
  private StoreCreditAccountCreditTransaction creditTransaction;

  public StoreCreditAccountExpirationTransaction() {
  }

  
  public StoreCreditAccount getAccount() {
    return account;
  }

  public void setAccount(StoreCreditAccount account) {
    this.account = account;
  }

  
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
  }

  
  public MoneyV2 getBalanceAfterTransaction() {
    return balanceAfterTransaction;
  }

  public void setBalanceAfterTransaction(MoneyV2 balanceAfterTransaction) {
    this.balanceAfterTransaction = balanceAfterTransaction;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
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
    
    private StoreCreditAccount account;

    
    private MoneyV2 amount;

    
    private MoneyV2 balanceAfterTransaction;

    
    private OffsetDateTime createdAt;

    
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

    
    public Builder account(StoreCreditAccount account) {
      this.account = account;
      return this;
    }

    
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
    }

    
    public Builder balanceAfterTransaction(MoneyV2 balanceAfterTransaction) {
      this.balanceAfterTransaction = balanceAfterTransaction;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder creditTransaction(StoreCreditAccountCreditTransaction creditTransaction) {
      this.creditTransaction = creditTransaction;
      return this;
    }
  }
}
