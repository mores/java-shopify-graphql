package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to update a market condition.
 */
public class MarketConditionsUpdateInput {
  /**
   * The conditions to update to the market condition.
   */
  private MarketConditionsInput conditionsToAdd;

  /**
   * The conditions to delete from the market condition.
   */
  private MarketConditionsInput conditionsToDelete;

  public MarketConditionsUpdateInput() {
  }

  /**
   * The conditions to update to the market condition.
   */
  public MarketConditionsInput getConditionsToAdd() {
    return conditionsToAdd;
  }

  public void setConditionsToAdd(MarketConditionsInput conditionsToAdd) {
    this.conditionsToAdd = conditionsToAdd;
  }

  /**
   * The conditions to delete from the market condition.
   */
  public MarketConditionsInput getConditionsToDelete() {
    return conditionsToDelete;
  }

  public void setConditionsToDelete(MarketConditionsInput conditionsToDelete) {
    this.conditionsToDelete = conditionsToDelete;
  }

  @Override
  public String toString() {
    return "MarketConditionsUpdateInput{conditionsToAdd='" + conditionsToAdd + "', conditionsToDelete='" + conditionsToDelete + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketConditionsUpdateInput that = (MarketConditionsUpdateInput) o;
    return Objects.equals(conditionsToAdd, that.conditionsToAdd) &&
        Objects.equals(conditionsToDelete, that.conditionsToDelete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionsToAdd, conditionsToDelete);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The conditions to update to the market condition.
     */
    private MarketConditionsInput conditionsToAdd;

    /**
     * The conditions to delete from the market condition.
     */
    private MarketConditionsInput conditionsToDelete;

    public MarketConditionsUpdateInput build() {
      MarketConditionsUpdateInput result = new MarketConditionsUpdateInput();
      result.conditionsToAdd = this.conditionsToAdd;
      result.conditionsToDelete = this.conditionsToDelete;
      return result;
    }

    /**
     * The conditions to update to the market condition.
     */
    public Builder conditionsToAdd(MarketConditionsInput conditionsToAdd) {
      this.conditionsToAdd = conditionsToAdd;
      return this;
    }

    /**
     * The conditions to delete from the market condition.
     */
    public Builder conditionsToDelete(MarketConditionsInput conditionsToDelete) {
      this.conditionsToDelete = conditionsToDelete;
      return this;
    }
  }
}
