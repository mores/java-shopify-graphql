package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A shipping rate is an additional cost added to the cost of the products that were ordered.
 */
public class DraftOrderShippingRate {
  /**
   * The code of the shipping rate.
   */
  private String code;

  /**
   * Unique identifier for this shipping rate.
   */
  private String handle;

  /**
   * The cost associated with the shipping rate.
   */
  private MoneyV2 price;

  /**
   * The source of the shipping rate.
   */
  private String source;

  /**
   * The name of the shipping rate.
   */
  private String title;

  public DraftOrderShippingRate() {
  }

  /**
   * The code of the shipping rate.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Unique identifier for this shipping rate.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * The cost associated with the shipping rate.
   */
  public MoneyV2 getPrice() {
    return price;
  }

  public void setPrice(MoneyV2 price) {
    this.price = price;
  }

  /**
   * The source of the shipping rate.
   */
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  /**
   * The name of the shipping rate.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "DraftOrderShippingRate{code='" + code + "', handle='" + handle + "', price='" + price + "', source='" + source + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderShippingRate that = (DraftOrderShippingRate) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(price, that.price) &&
        Objects.equals(source, that.source) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, handle, price, source, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The code of the shipping rate.
     */
    private String code;

    /**
     * Unique identifier for this shipping rate.
     */
    private String handle;

    /**
     * The cost associated with the shipping rate.
     */
    private MoneyV2 price;

    /**
     * The source of the shipping rate.
     */
    private String source;

    /**
     * The name of the shipping rate.
     */
    private String title;

    public DraftOrderShippingRate build() {
      DraftOrderShippingRate result = new DraftOrderShippingRate();
      result.code = this.code;
      result.handle = this.handle;
      result.price = this.price;
      result.source = this.source;
      result.title = this.title;
      return result;
    }

    /**
     * The code of the shipping rate.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * Unique identifier for this shipping rate.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * The cost associated with the shipping rate.
     */
    public Builder price(MoneyV2 price) {
      this.price = price;
      return this;
    }

    /**
     * The source of the shipping rate.
     */
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    /**
     * The name of the shipping rate.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
