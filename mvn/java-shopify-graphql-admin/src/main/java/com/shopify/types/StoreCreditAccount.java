package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class StoreCreditAccount implements com.shopify.types.Node {
  
  private MoneyV2 balance;

  
  private String id;

  
  private HasStoreCreditAccounts owner;

  
  private StoreCreditAccountTransactionConnection transactions;

  public StoreCreditAccount() {
  }

  
  public MoneyV2 getBalance() {
    return balance;
  }

  public void setBalance(MoneyV2 balance) {
    this.balance = balance;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public HasStoreCreditAccounts getOwner() {
    return owner;
  }

  public void setOwner(HasStoreCreditAccounts owner) {
    this.owner = owner;
  }

  
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
    
    private MoneyV2 balance;

    
    private String id;

    
    private HasStoreCreditAccounts owner;

    
    private StoreCreditAccountTransactionConnection transactions;

    public StoreCreditAccount build() {
      StoreCreditAccount result = new StoreCreditAccount();
      result.balance = this.balance;
      result.id = this.id;
      result.owner = this.owner;
      result.transactions = this.transactions;
      return result;
    }

    
    public Builder balance(MoneyV2 balance) {
      this.balance = balance;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder owner(HasStoreCreditAccounts owner) {
      this.owner = owner;
      return this;
    }

    
    public Builder transactions(StoreCreditAccountTransactionConnection transactions) {
      this.transactions = transactions;
      return this;
    }
  }
}
