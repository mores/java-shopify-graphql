package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class QuantityPriceBreak implements com.shopify.types.Node {
  
  private String id;

  
  private int minimumQuantity;

  
  private MoneyV2 price;

  
  private PriceList priceList;

  
  private ProductVariant variant;

  public QuantityPriceBreak() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public int getMinimumQuantity() {
    return minimumQuantity;
  }

  public void setMinimumQuantity(int minimumQuantity) {
    this.minimumQuantity = minimumQuantity;
  }

  
  public MoneyV2 getPrice() {
    return price;
  }

  public void setPrice(MoneyV2 price) {
    this.price = price;
  }

  
  public PriceList getPriceList() {
    return priceList;
  }

  public void setPriceList(PriceList priceList) {
    this.priceList = priceList;
  }

  
  public ProductVariant getVariant() {
    return variant;
  }

  public void setVariant(ProductVariant variant) {
    this.variant = variant;
  }

  @Override
  public String toString() {
    return "QuantityPriceBreak{id='" + id + "', minimumQuantity='" + minimumQuantity + "', price='" + price + "', priceList='" + priceList + "', variant='" + variant + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QuantityPriceBreak that = (QuantityPriceBreak) o;
    return Objects.equals(id, that.id) &&
        minimumQuantity == that.minimumQuantity &&
        Objects.equals(price, that.price) &&
        Objects.equals(priceList, that.priceList) &&
        Objects.equals(variant, that.variant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, minimumQuantity, price, priceList, variant);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private int minimumQuantity;

    
    private MoneyV2 price;

    
    private PriceList priceList;

    
    private ProductVariant variant;

    public QuantityPriceBreak build() {
      QuantityPriceBreak result = new QuantityPriceBreak();
      result.id = this.id;
      result.minimumQuantity = this.minimumQuantity;
      result.price = this.price;
      result.priceList = this.priceList;
      result.variant = this.variant;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder minimumQuantity(int minimumQuantity) {
      this.minimumQuantity = minimumQuantity;
      return this;
    }

    
    public Builder price(MoneyV2 price) {
      this.price = price;
      return this;
    }

    
    public Builder priceList(PriceList priceList) {
      this.priceList = priceList;
      return this;
    }

    
    public Builder variant(ProductVariant variant) {
      this.variant = variant;
      return this;
    }
  }
}
