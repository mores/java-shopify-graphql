package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class StoreCreditAccountDebitInput {
  
  private MoneyInput debitAmount;

  public StoreCreditAccountDebitInput() {
  }

  
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
    
    private MoneyInput debitAmount;

    public StoreCreditAccountDebitInput build() {
      StoreCreditAccountDebitInput result = new StoreCreditAccountDebitInput();
      result.debitAmount = this.debitAmount;
      return result;
    }

    
    public Builder debitAmount(MoneyInput debitAmount) {
      this.debitAmount = debitAmount;
      return this;
    }
  }
}
