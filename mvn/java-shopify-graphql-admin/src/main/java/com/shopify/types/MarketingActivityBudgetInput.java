package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields combining budget amount and its marketing budget type.
 */
public class MarketingActivityBudgetInput {
  /**
   * Budget type for marketing activity.
   */
  private MarketingBudgetBudgetType budgetType;

  /**
   * Amount of budget for the marketing activity.
   */
  private MoneyInput total;

  public MarketingActivityBudgetInput() {
  }

  /**
   * Budget type for marketing activity.
   */
  public MarketingBudgetBudgetType getBudgetType() {
    return budgetType;
  }

  public void setBudgetType(MarketingBudgetBudgetType budgetType) {
    this.budgetType = budgetType;
  }

  /**
   * Amount of budget for the marketing activity.
   */
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
    /**
     * Budget type for marketing activity.
     */
    private MarketingBudgetBudgetType budgetType;

    /**
     * Amount of budget for the marketing activity.
     */
    private MoneyInput total;

    public MarketingActivityBudgetInput build() {
      MarketingActivityBudgetInput result = new MarketingActivityBudgetInput();
      result.budgetType = this.budgetType;
      result.total = this.total;
      return result;
    }

    /**
     * Budget type for marketing activity.
     */
    public Builder budgetType(MarketingBudgetBudgetType budgetType) {
      this.budgetType = budgetType;
      return this;
    }

    /**
     * Amount of budget for the marketing activity.
     */
    public Builder total(MoneyInput total) {
      this.total = total;
      return this;
    }
  }
}
