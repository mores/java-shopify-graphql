package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The calculated cost of the return shipping.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CalculatedReturnShippingFee implements com.shopify.admin.types.CalculatedReturnFee {
  /**
   * The calculated amount of the return fee, in shop and presentment currencies.
   */
  private MoneyBag amountSet;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The estimated tax amount on the return shipping fee, in shop and presentment
   * currencies. Estimated when the return is calculated or created, and zero when
   * no tax applies to the fee. For the tax actually charged, use
   * `ReturnShippingFee.finalizedTaxAmountSet` once the return is processed.
   */
  private MoneyBag taxAmountSet;

  public CalculatedReturnShippingFee() {
  }

  /**
   * The calculated amount of the return fee, in shop and presentment currencies.
   */
  public MoneyBag getAmountSet() {
    return amountSet;
  }

  public void setAmountSet(MoneyBag amountSet) {
    this.amountSet = amountSet;
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
   * The estimated tax amount on the return shipping fee, in shop and presentment
   * currencies. Estimated when the return is calculated or created, and zero when
   * no tax applies to the fee. For the tax actually charged, use
   * `ReturnShippingFee.finalizedTaxAmountSet` once the return is processed.
   */
  public MoneyBag getTaxAmountSet() {
    return taxAmountSet;
  }

  public void setTaxAmountSet(MoneyBag taxAmountSet) {
    this.taxAmountSet = taxAmountSet;
  }

  @Override
  public String toString() {
    return "CalculatedReturnShippingFee{amountSet='" + amountSet + "', id='" + id + "', taxAmountSet='" + taxAmountSet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedReturnShippingFee that = (CalculatedReturnShippingFee) o;
    return Objects.equals(amountSet, that.amountSet) &&
        Objects.equals(id, that.id) &&
        Objects.equals(taxAmountSet, that.taxAmountSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountSet, id, taxAmountSet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The calculated amount of the return fee, in shop and presentment currencies.
     */
    private MoneyBag amountSet;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The estimated tax amount on the return shipping fee, in shop and presentment
     * currencies. Estimated when the return is calculated or created, and zero when
     * no tax applies to the fee. For the tax actually charged, use
     * `ReturnShippingFee.finalizedTaxAmountSet` once the return is processed.
     */
    private MoneyBag taxAmountSet;

    public CalculatedReturnShippingFee build() {
      CalculatedReturnShippingFee result = new CalculatedReturnShippingFee();
      result.amountSet = this.amountSet;
      result.id = this.id;
      result.taxAmountSet = this.taxAmountSet;
      return result;
    }

    /**
     * The calculated amount of the return fee, in shop and presentment currencies.
     */
    public Builder amountSet(MoneyBag amountSet) {
      this.amountSet = amountSet;
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
     * The estimated tax amount on the return shipping fee, in shop and presentment
     * currencies. Estimated when the return is calculated or created, and zero when
     * no tax applies to the fee. For the tax actually charged, use
     * `ReturnShippingFee.finalizedTaxAmountSet` once the return is processed.
     */
    public Builder taxAmountSet(MoneyBag taxAmountSet) {
      this.taxAmountSet = taxAmountSet;
      return this;
    }
  }
}
