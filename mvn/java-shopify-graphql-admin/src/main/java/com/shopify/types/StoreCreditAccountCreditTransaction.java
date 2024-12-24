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
public class StoreCreditAccountCreditTransaction implements com.shopify.types.Node, com.shopify.types.StoreCreditAccountTransaction {
  
  private StoreCreditAccount account;

  
  private MoneyV2 amount;

  
  private MoneyV2 balanceAfterTransaction;

  
  private OffsetDateTime createdAt;

  
  private OffsetDateTime expiresAt;

  
  private String id;

  
  private MoneyV2 remainingAmount;

  public StoreCreditAccountCreditTransaction() {
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

  
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
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
    
    private StoreCreditAccount account;

    
    private MoneyV2 amount;

    
    private MoneyV2 balanceAfterTransaction;

    
    private OffsetDateTime createdAt;

    
    private OffsetDateTime expiresAt;

    
    private String id;

    
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

    
    public Builder expiresAt(OffsetDateTime expiresAt) {
      this.expiresAt = expiresAt;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder remainingAmount(MoneyV2 remainingAmount) {
      this.remainingAmount = remainingAmount;
      return this;
    }
  }
}
