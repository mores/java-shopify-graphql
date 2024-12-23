package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A shipping line item that's included in a refund.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class RefundShippingLine implements com.shopify.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The `ShippingLine` resource associated to the refunded shipping line item.
   */
  private ShippingLine shippingLine;

  /**
   * The subtotal amount of the refund shipping line in shop and presentment currencies.
   */
  private MoneyBag subtotalAmountSet;

  /**
   * The tax amount of the refund shipping line in shop and presentment currencies.
   */
  private MoneyBag taxAmountSet;

  public RefundShippingLine() {
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
   * The `ShippingLine` resource associated to the refunded shipping line item.
   */
  public ShippingLine getShippingLine() {
    return shippingLine;
  }

  public void setShippingLine(ShippingLine shippingLine) {
    this.shippingLine = shippingLine;
  }

  /**
   * The subtotal amount of the refund shipping line in shop and presentment currencies.
   */
  public MoneyBag getSubtotalAmountSet() {
    return subtotalAmountSet;
  }

  public void setSubtotalAmountSet(MoneyBag subtotalAmountSet) {
    this.subtotalAmountSet = subtotalAmountSet;
  }

  /**
   * The tax amount of the refund shipping line in shop and presentment currencies.
   */
  public MoneyBag getTaxAmountSet() {
    return taxAmountSet;
  }

  public void setTaxAmountSet(MoneyBag taxAmountSet) {
    this.taxAmountSet = taxAmountSet;
  }

  @Override
  public String toString() {
    return "RefundShippingLine{id='" + id + "', shippingLine='" + shippingLine + "', subtotalAmountSet='" + subtotalAmountSet + "', taxAmountSet='" + taxAmountSet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RefundShippingLine that = (RefundShippingLine) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(shippingLine, that.shippingLine) &&
        Objects.equals(subtotalAmountSet, that.subtotalAmountSet) &&
        Objects.equals(taxAmountSet, that.taxAmountSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, shippingLine, subtotalAmountSet, taxAmountSet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The `ShippingLine` resource associated to the refunded shipping line item.
     */
    private ShippingLine shippingLine;

    /**
     * The subtotal amount of the refund shipping line in shop and presentment currencies.
     */
    private MoneyBag subtotalAmountSet;

    /**
     * The tax amount of the refund shipping line in shop and presentment currencies.
     */
    private MoneyBag taxAmountSet;

    public RefundShippingLine build() {
      RefundShippingLine result = new RefundShippingLine();
      result.id = this.id;
      result.shippingLine = this.shippingLine;
      result.subtotalAmountSet = this.subtotalAmountSet;
      result.taxAmountSet = this.taxAmountSet;
      return result;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The `ShippingLine` resource associated to the refunded shipping line item.
     */
    public Builder shippingLine(ShippingLine shippingLine) {
      this.shippingLine = shippingLine;
      return this;
    }

    /**
     * The subtotal amount of the refund shipping line in shop and presentment currencies.
     */
    public Builder subtotalAmountSet(MoneyBag subtotalAmountSet) {
      this.subtotalAmountSet = subtotalAmountSet;
      return this;
    }

    /**
     * The tax amount of the refund shipping line in shop and presentment currencies.
     */
    public Builder taxAmountSet(MoneyBag taxAmountSet) {
      this.taxAmountSet = taxAmountSet;
      return this;
    }
  }
}
