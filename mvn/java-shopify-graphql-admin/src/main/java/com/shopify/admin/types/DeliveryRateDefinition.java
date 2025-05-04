package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The merchant-defined rate of the [DeliveryMethodDefinition](https://shopify.dev/api/admin-graphql/latest/objects/DeliveryMethodDefinition).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryRateDefinition implements DeliveryRateProvider, com.shopify.admin.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The price of this rate.
   */
  private MoneyV2 price;

  public DeliveryRateDefinition() {
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
   * The price of this rate.
   */
  public MoneyV2 getPrice() {
    return price;
  }

  public void setPrice(MoneyV2 price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "DeliveryRateDefinition{id='" + id + "', price='" + price + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryRateDefinition that = (DeliveryRateDefinition) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(price, that.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, price);
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
     * The price of this rate.
     */
    private MoneyV2 price;

    public DeliveryRateDefinition build() {
      DeliveryRateDefinition result = new DeliveryRateDefinition();
      result.id = this.id;
      result.price = this.price;
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
     * The price of this rate.
     */
    public Builder price(MoneyV2 price) {
      this.price = price;
      return this;
    }
  }
}
