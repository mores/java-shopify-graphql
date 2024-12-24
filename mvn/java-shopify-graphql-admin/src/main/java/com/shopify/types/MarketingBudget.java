package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MarketingBudget {
  
  private MarketingBudgetBudgetType budgetType;

  
  private MoneyV2 total;

  public MarketingBudget() {
  }

  
  public MarketingBudgetBudgetType getBudgetType() {
    return budgetType;
  }

  public void setBudgetType(MarketingBudgetBudgetType budgetType) {
    this.budgetType = budgetType;
  }

  
  public MoneyV2 getTotal() {
    return total;
  }

  public void setTotal(MoneyV2 total) {
    this.total = total;
  }

  @Override
  public String toString() {
    return "MarketingBudget{budgetType='" + budgetType + "', total='" + total + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingBudget that = (MarketingBudget) o;
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

    
    private MoneyV2 total;

    public MarketingBudget build() {
      MarketingBudget result = new MarketingBudget();
      result.budgetType = this.budgetType;
      result.total = this.total;
      return result;
    }

    
    public Builder budgetType(MarketingBudgetBudgetType budgetType) {
      this.budgetType = budgetType;
      return this;
    }

    
    public Builder total(MoneyV2 total) {
      this.total = total;
      return this;
    }
  }
}
