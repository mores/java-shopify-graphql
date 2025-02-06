package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A new [shipping line](https://shopify.dev/api/admin-graphql/latest/objects/shippingline)
 * added as part of an order edit.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OrderStagedChangeAddShippingLine implements OrderStagedChange {
  /**
   * The phone number at the shipping address.
   */
  private String phone;

  /**
   * The shipping line's title that's shown to the buyer.
   */
  private String presentmentTitle;

  /**
   * The price that applies to the shipping line.
   */
  private MoneyV2 price;

  /**
   * The title of the shipping line.
   */
  private String title;

  public OrderStagedChangeAddShippingLine() {
  }

  /**
   * The phone number at the shipping address.
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * The shipping line's title that's shown to the buyer.
   */
  public String getPresentmentTitle() {
    return presentmentTitle;
  }

  public void setPresentmentTitle(String presentmentTitle) {
    this.presentmentTitle = presentmentTitle;
  }

  /**
   * The price that applies to the shipping line.
   */
  public MoneyV2 getPrice() {
    return price;
  }

  public void setPrice(MoneyV2 price) {
    this.price = price;
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
    return "OrderStagedChangeAddShippingLine{phone='" + phone + "', presentmentTitle='" + presentmentTitle + "', price='" + price + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderStagedChangeAddShippingLine that = (OrderStagedChangeAddShippingLine) o;
    return Objects.equals(phone, that.phone) &&
        Objects.equals(presentmentTitle, that.presentmentTitle) &&
        Objects.equals(price, that.price) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phone, presentmentTitle, price, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The phone number at the shipping address.
     */
    private String phone;

    /**
     * The shipping line's title that's shown to the buyer.
     */
    private String presentmentTitle;

    /**
     * The price that applies to the shipping line.
     */
    private MoneyV2 price;

    /**
     * The title of the shipping line.
     */
    private String title;

    public OrderStagedChangeAddShippingLine build() {
      OrderStagedChangeAddShippingLine result = new OrderStagedChangeAddShippingLine();
      result.phone = this.phone;
      result.presentmentTitle = this.presentmentTitle;
      result.price = this.price;
      result.title = this.title;
      return result;
    }

    /**
     * The phone number at the shipping address.
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * The shipping line's title that's shown to the buyer.
     */
    public Builder presentmentTitle(String presentmentTitle) {
      this.presentmentTitle = presentmentTitle;
      return this;
    }

    /**
     * The price that applies to the shipping line.
     */
    public Builder price(MoneyV2 price) {
      this.price = price;
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
