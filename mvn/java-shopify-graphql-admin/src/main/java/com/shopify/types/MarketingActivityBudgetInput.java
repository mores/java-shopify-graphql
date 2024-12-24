package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MarketingActivityBudgetInput {
  
  private MarketingBudgetBudgetType budgetType;

  
  private MoneyInput total;

  public MarketingActivityBudgetInput() {
  }

  
  public MarketingBudgetBudgetType getBudgetType() {
    return budgetType;
  }

  public void setBudgetType(MarketingBudgetBudgetType budgetType) {
    this.budgetType = budgetType;
  }

  
  public MoneyInput getTotal() {
    return total;
  }

  public void setTotal(MoneyInput total) {
    this.total = total;
  }

  @Override
  public String toString() {
    return "MarketingActivityBudgetInput{budgetType='" + budgetType + "', total='" + total + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingActivityBudgetInput that = (MarketingActivityBudgetInput) o;
    return Objects.equals(budgetType, that.budgetType) &&
        Objects.equals(total, that.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetType, total);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MarketingBudgetBudgetType budgetType;

    
    private MoneyInput total;

    public MarketingActivityBudgetInput build() {
      MarketingActivityBudgetInput result = new MarketingActivityBudgetInput();
      result.budgetType = this.budgetType;
      result.total = this.total;
      return result;
    }

    
    public Builder budgetType(MarketingBudgetBudgetType budgetType) {
      this.budgetType = budgetType;
      return this;
    }

    
    public Builder total(MoneyInput total) {
      this.total = total;
      return this;
    }
  }
}
