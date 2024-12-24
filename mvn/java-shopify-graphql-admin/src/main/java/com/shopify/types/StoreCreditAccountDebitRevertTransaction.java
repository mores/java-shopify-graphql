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
public class StoreCreditAccountDebitRevertTransaction implements com.shopify.types.Node, com.shopify.types.StoreCreditAccountTransaction {
  
  private StoreCreditAccount account;

  
  private MoneyV2 amount;

  
  private MoneyV2 balanceAfterTransaction;

  
  private OffsetDateTime createdAt;

  
  private StoreCreditAccountDebitTransaction debitTransaction;

  
  private String id;

  public StoreCreditAccountDebitRevertTransaction() {
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

  
  public StoreCreditAccountDebitTransaction getDebitTransaction() {
    return debitTransaction;
  }

  public void setDebitTransaction(StoreCreditAccountDebitTransaction debitTransaction) {
    this.debitTransaction = debitTransaction;
  }

  
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
    
    private StoreCreditAccount account;

    
    private MoneyV2 amount;

    
    private MoneyV2 balanceAfterTransaction;

    
    private OffsetDateTime createdAt;

    
    private StoreCreditAccountDebitTransaction debitTransaction;

    
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

    
    public Builder debitTransaction(StoreCreditAccountDebitTransaction debitTransaction) {
      this.debitTransaction = debitTransaction;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
