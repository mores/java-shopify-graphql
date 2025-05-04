package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for a shipping line to create for an order.
 */
public class OrderCreateShippingLineInput {
  /**
   * A reference to the shipping method.
   */
  private String code;

  /**
   * The price of this shipping method in the shop currency. Can't be negative.
   */
  private MoneyBagInput priceSet;

  /**
   * The source of the shipping method.
   */
  private String source;

  /**
   * A list of tax line objects, each of which details a tax applicable to this shipping line.
   */
  private List<OrderCreateTaxLineInput> taxLines;

  /**
   * The title of the shipping method.
   */
  private String title;

  public OrderCreateShippingLineInput() {
  }

  /**
   * A reference to the shipping method.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * The price of this shipping method in the shop currency. Can't be negative.
   */
  public MoneyBagInput getPriceSet() {
    return priceSet;
  }

  public void setPriceSet(MoneyBagInput priceSet) {
    this.priceSet = priceSet;
  }

  /**
   * The source of the shipping method.
   */
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  /**
   * A list of tax line objects, each of which details a tax applicable to this shipping line.
   */
  public List<OrderCreateTaxLineInput> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<OrderCreateTaxLineInput> taxLines) {
    this.taxLines = taxLines;
  }

  /**
   * The title of the shipping method.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "OrderCreateShippingLineInput{code='" + code + "', priceSet='" + priceSet + "', source='" + source + "', taxLines='" + taxLines + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCreateShippingLineInput that = (OrderCreateShippingLineInput) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(priceSet, that.priceSet) &&
        Objects.equals(source, that.source) &&
        Objects.equals(taxLines, that.taxLines) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, priceSet, source, taxLines, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A reference to the shipping method.
     */
    private String code;

    /**
     * The price of this shipping method in the shop currency. Can't be negative.
     */
    private MoneyBagInput priceSet;

    /**
     * The source of the shipping method.
     */
    private String source;

    /**
     * A list of tax line objects, each of which details a tax applicable to this shipping line.
     */
    private List<OrderCreateTaxLineInput> taxLines;

    /**
     * The title of the shipping method.
     */
    private String title;

    public OrderCreateShippingLineInput build() {
      OrderCreateShippingLineInput result = new OrderCreateShippingLineInput();
      result.code = this.code;
      result.priceSet = this.priceSet;
      result.source = this.source;
      result.taxLines = this.taxLines;
      result.title = this.title;
      return result;
    }

    /**
     * A reference to the shipping method.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * The price of this shipping method in the shop currency. Can't be negative.
     */
    public Builder priceSet(MoneyBagInput priceSet) {
      this.priceSet = priceSet;
      return this;
    }

    /**
     * The source of the shipping method.
     */
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    /**
     * A list of tax line objects, each of which details a tax applicable to this shipping line.
     */
    public Builder taxLines(List<OrderCreateTaxLineInput> taxLines) {
      this.taxLines = taxLines;
      return this;
    }

    /**
     * The title of the shipping method.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
