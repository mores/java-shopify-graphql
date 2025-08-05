package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a currency exchange adjustment applied to an order transaction.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CurrencyExchangeAdjustment implements com.shopify.admin.types.Node {
  /**
   * The adjustment amount in both shop and presentment currencies.
   */
  private MoneyV2 adjustment;

  /**
   * The final amount in both shop and presentment currencies after the adjustment.
   */
  private MoneyV2 finalAmountSet;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The original amount in both shop and presentment currencies before the adjustment.
   */
  private MoneyV2 originalAmountSet;

  public CurrencyExchangeAdjustment() {
  }

  /**
   * The adjustment amount in both shop and presentment currencies.
   */
  public MoneyV2 getAdjustment() {
    return adjustment;
  }

  public void setAdjustment(MoneyV2 adjustment) {
    this.adjustment = adjustment;
  }

  /**
   * The final amount in both shop and presentment currencies after the adjustment.
   */
  public MoneyV2 getFinalAmountSet() {
    return finalAmountSet;
  }

  public void setFinalAmountSet(MoneyV2 finalAmountSet) {
    this.finalAmountSet = finalAmountSet;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The original amount in both shop and presentment currencies before the adjustment.
   */
  public MoneyV2 getOriginalAmountSet() {
    return originalAmountSet;
  }

  public void setOriginalAmountSet(MoneyV2 originalAmountSet) {
    this.originalAmountSet = originalAmountSet;
  }

  @Override
  public String toString() {
    return "CurrencyExchangeAdjustment{adjustment='" + adjustment + "', finalAmountSet='" + finalAmountSet + "', id='" + id + "', originalAmountSet='" + originalAmountSet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CurrencyExchangeAdjustment that = (CurrencyExchangeAdjustment) o;
    return Objects.equals(adjustment, that.adjustment) &&
        Objects.equals(finalAmountSet, that.finalAmountSet) &&
        Objects.equals(id, that.id) &&
        Objects.equals(originalAmountSet, that.originalAmountSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustment, finalAmountSet, id, originalAmountSet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The adjustment amount in both shop and presentment currencies.
     */
    private MoneyV2 adjustment;

    /**
     * The final amount in both shop and presentment currencies after the adjustment.
     */
    private MoneyV2 finalAmountSet;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The original amount in both shop and presentment currencies before the adjustment.
     */
    private MoneyV2 originalAmountSet;

    public CurrencyExchangeAdjustment build() {
      CurrencyExchangeAdjustment result = new CurrencyExchangeAdjustment();
      result.adjustment = this.adjustment;
      result.finalAmountSet = this.finalAmountSet;
      result.id = this.id;
      result.originalAmountSet = this.originalAmountSet;
      return result;
    }

    /**
     * The adjustment amount in both shop and presentment currencies.
     */
    public Builder adjustment(MoneyV2 adjustment) {
      this.adjustment = adjustment;
      return this;
    }

    /**
     * The final amount in both shop and presentment currencies after the adjustment.
     */
    public Builder finalAmountSet(MoneyV2 finalAmountSet) {
      this.finalAmountSet = finalAmountSet;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The original amount in both shop and presentment currencies before the adjustment.
     */
    public Builder originalAmountSet(MoneyV2 originalAmountSet) {
      this.originalAmountSet = originalAmountSet;
      return this;
    }
  }
}
