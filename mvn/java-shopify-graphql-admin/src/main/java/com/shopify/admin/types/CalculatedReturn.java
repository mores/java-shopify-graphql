package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A calculated return.
 */
public class CalculatedReturn {
  /**
   * A list of calculated exchange line items.
   */
  private List<CalculatedExchangeLineItem> exchangeLineItems;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * A list of calculated return line items.
   */
  private List<CalculatedReturnLineItem> returnLineItems;

  /**
   * The calulated return shipping fee.
   */
  private CalculatedReturnShippingFee returnShippingFee;

  public CalculatedReturn() {
  }

  /**
   * A list of calculated exchange line items.
   */
  public List<CalculatedExchangeLineItem> getExchangeLineItems() {
    return exchangeLineItems;
  }

  public void setExchangeLineItems(List<CalculatedExchangeLineItem> exchangeLineItems) {
    this.exchangeLineItems = exchangeLineItems;
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
   * A list of calculated return line items.
   */
  public List<CalculatedReturnLineItem> getReturnLineItems() {
    return returnLineItems;
  }

  public void setReturnLineItems(List<CalculatedReturnLineItem> returnLineItems) {
    this.returnLineItems = returnLineItems;
  }

  /**
   * The calulated return shipping fee.
   */
  public CalculatedReturnShippingFee getReturnShippingFee() {
    return returnShippingFee;
  }

  public void setReturnShippingFee(CalculatedReturnShippingFee returnShippingFee) {
    this.returnShippingFee = returnShippingFee;
  }

  @Override
  public String toString() {
    return "CalculatedReturn{exchangeLineItems='" + exchangeLineItems + "', id='" + id + "', returnLineItems='" + returnLineItems + "', returnShippingFee='" + returnShippingFee + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedReturn that = (CalculatedReturn) o;
    return Objects.equals(exchangeLineItems, that.exchangeLineItems) &&
        Objects.equals(id, that.id) &&
        Objects.equals(returnLineItems, that.returnLineItems) &&
        Objects.equals(returnShippingFee, that.returnShippingFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeLineItems, id, returnLineItems, returnShippingFee);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of calculated exchange line items.
     */
    private List<CalculatedExchangeLineItem> exchangeLineItems;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * A list of calculated return line items.
     */
    private List<CalculatedReturnLineItem> returnLineItems;

    /**
     * The calulated return shipping fee.
     */
    private CalculatedReturnShippingFee returnShippingFee;

    public CalculatedReturn build() {
      CalculatedReturn result = new CalculatedReturn();
      result.exchangeLineItems = this.exchangeLineItems;
      result.id = this.id;
      result.returnLineItems = this.returnLineItems;
      result.returnShippingFee = this.returnShippingFee;
      return result;
    }

    /**
     * A list of calculated exchange line items.
     */
    public Builder exchangeLineItems(List<CalculatedExchangeLineItem> exchangeLineItems) {
      this.exchangeLineItems = exchangeLineItems;
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
     * A list of calculated return line items.
     */
    public Builder returnLineItems(List<CalculatedReturnLineItem> returnLineItems) {
      this.returnLineItems = returnLineItems;
      return this;
    }

    /**
     * The calulated return shipping fee.
     */
    public Builder returnShippingFee(CalculatedReturnShippingFee returnShippingFee) {
      this.returnShippingFee = returnShippingFee;
      return this;
    }
  }
}
