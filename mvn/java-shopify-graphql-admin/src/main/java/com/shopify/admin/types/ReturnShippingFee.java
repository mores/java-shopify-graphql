package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A return shipping fee is a fee captured as part of a return to cover the costs of shipping the return.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ReturnShippingFee implements com.shopify.admin.types.Fee {
  /**
   * The amount of the return shipping fee, in shop and presentment currencies.
   */
  private MoneyBag amountSet;

  /**
   * The finalized tax amount on the return shipping fee, in shop and presentment
   * currencies. Locked in when the return is processed, and can differ from the
   * estimate in `CalculatedReturnShippingFee.taxAmountSet`. Returns `null` until
   * the return is processed, and zero if no tax applied to the fee.
   */
  private MoneyBag finalizedTaxAmountSet;

  /**
   * The unique ID for the Fee.
   */
  private String id;

  public ReturnShippingFee() {
  }

  /**
   * The amount of the return shipping fee, in shop and presentment currencies.
   */
  public MoneyBag getAmountSet() {
    return amountSet;
  }

  public void setAmountSet(MoneyBag amountSet) {
    this.amountSet = amountSet;
  }

  /**
   * The finalized tax amount on the return shipping fee, in shop and presentment
   * currencies. Locked in when the return is processed, and can differ from the
   * estimate in `CalculatedReturnShippingFee.taxAmountSet`. Returns `null` until
   * the return is processed, and zero if no tax applied to the fee.
   */
  public MoneyBag getFinalizedTaxAmountSet() {
    return finalizedTaxAmountSet;
  }

  public void setFinalizedTaxAmountSet(MoneyBag finalizedTaxAmountSet) {
    this.finalizedTaxAmountSet = finalizedTaxAmountSet;
  }

  /**
   * The unique ID for the Fee.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "ReturnShippingFee{amountSet='" + amountSet + "', finalizedTaxAmountSet='" + finalizedTaxAmountSet + "', id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnShippingFee that = (ReturnShippingFee) o;
    return Objects.equals(amountSet, that.amountSet) &&
        Objects.equals(finalizedTaxAmountSet, that.finalizedTaxAmountSet) &&
        Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountSet, finalizedTaxAmountSet, id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The amount of the return shipping fee, in shop and presentment currencies.
     */
    private MoneyBag amountSet;

    /**
     * The finalized tax amount on the return shipping fee, in shop and presentment
     * currencies. Locked in when the return is processed, and can differ from the
     * estimate in `CalculatedReturnShippingFee.taxAmountSet`. Returns `null` until
     * the return is processed, and zero if no tax applied to the fee.
     */
    private MoneyBag finalizedTaxAmountSet;

    /**
     * The unique ID for the Fee.
     */
    private String id;

    public ReturnShippingFee build() {
      ReturnShippingFee result = new ReturnShippingFee();
      result.amountSet = this.amountSet;
      result.finalizedTaxAmountSet = this.finalizedTaxAmountSet;
      result.id = this.id;
      return result;
    }

    /**
     * The amount of the return shipping fee, in shop and presentment currencies.
     */
    public Builder amountSet(MoneyBag amountSet) {
      this.amountSet = amountSet;
      return this;
    }

    /**
     * The finalized tax amount on the return shipping fee, in shop and presentment
     * currencies. Locked in when the return is processed, and can differ from the
     * estimate in `CalculatedReturnShippingFee.taxAmountSet`. Returns `null` until
     * the return is processed, and zero if no tax applied to the fee.
     */
    public Builder finalizedTaxAmountSet(MoneyBag finalizedTaxAmountSet) {
      this.finalizedTaxAmountSet = finalizedTaxAmountSet;
      return this;
    }

    /**
     * The unique ID for the Fee.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
