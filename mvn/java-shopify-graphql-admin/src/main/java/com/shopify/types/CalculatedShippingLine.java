package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A shipping line item involved in order editing that may be newly added or have new changes applied.
 */
public class CalculatedShippingLine {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The price of the shipping line when sold and before applying discounts. This
   * field includes taxes if `Order.taxesIncluded` is true. Otherwise, this field
   * doesn't include taxes for the shipping line.
   */
  private MoneyBag price;

  /**
   * The staged status of the shipping line.
   */
  private CalculatedShippingLineStagedStatus stagedStatus;

  /**
   * The title of the shipping line.
   */
  private String title;

  public CalculatedShippingLine() {
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
   * The price of the shipping line when sold and before applying discounts. This
   * field includes taxes if `Order.taxesIncluded` is true. Otherwise, this field
   * doesn't include taxes for the shipping line.
   */
  public MoneyBag getPrice() {
    return price;
  }

  public void setPrice(MoneyBag price) {
    this.price = price;
  }

  /**
   * The staged status of the shipping line.
   */
  public CalculatedShippingLineStagedStatus getStagedStatus() {
    return stagedStatus;
  }

  public void setStagedStatus(CalculatedShippingLineStagedStatus stagedStatus) {
    this.stagedStatus = stagedStatus;
  }

  /**
   * The title of the shipping line.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "CalculatedShippingLine{id='" + id + "', price='" + price + "', stagedStatus='" + stagedStatus + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedShippingLine that = (CalculatedShippingLine) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(price, that.price) &&
        Objects.equals(stagedStatus, that.stagedStatus) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, price, stagedStatus, title);
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
     * The price of the shipping line when sold and before applying discounts. This
     * field includes taxes if `Order.taxesIncluded` is true. Otherwise, this field
     * doesn't include taxes for the shipping line.
     */
    private MoneyBag price;

    /**
     * The staged status of the shipping line.
     */
    private CalculatedShippingLineStagedStatus stagedStatus;

    /**
     * The title of the shipping line.
     */
    private String title;

    public CalculatedShippingLine build() {
      CalculatedShippingLine result = new CalculatedShippingLine();
      result.id = this.id;
      result.price = this.price;
      result.stagedStatus = this.stagedStatus;
      result.title = this.title;
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
     * The price of the shipping line when sold and before applying discounts. This
     * field includes taxes if `Order.taxesIncluded` is true. Otherwise, this field
     * doesn't include taxes for the shipping line.
     */
    public Builder price(MoneyBag price) {
      this.price = price;
      return this;
    }

    /**
     * The staged status of the shipping line.
     */
    public Builder stagedStatus(CalculatedShippingLineStagedStatus stagedStatus) {
      this.stagedStatus = stagedStatus;
      return this;
    }

    /**
     * The title of the shipping line.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
