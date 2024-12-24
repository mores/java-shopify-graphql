package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class LineItemGroup implements com.shopify.types.Node {
  
  private List<Attribute> customAttributes;

  
  private String id;

  
  private int quantity;

  
  private String title;

  
  private String variantId;

  
  private String variantSku;

  public LineItemGroup() {
  }

  
  public List<Attribute> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<Attribute> customAttributes) {
    this.customAttributes = customAttributes;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }

  
  public String getVariantSku() {
    return variantSku;
  }

  public void setVariantSku(String variantSku) {
    this.variantSku = variantSku;
  }

  @Override
  public String toString() {
    return "LineItemGroup{customAttributes='" + customAttributes + "', id='" + id + "', quantity='" + quantity + "', title='" + title + "', variantId='" + variantId + "', variantSku='" + variantSku + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LineItemGroup that = (LineItemGroup) o;
    return Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(id, that.id) &&
        quantity == that.quantity &&
        Objects.equals(title, that.title) &&
        Objects.equals(variantId, that.variantId) &&
        Objects.equals(variantSku, that.variantSku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customAttributes, id, quantity, title, variantId, variantSku);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<Attribute> customAttributes;

    
    private String id;

    
    private int quantity;

    
    private String title;

    
    private String variantId;

    
    private String variantSku;

    public LineItemGroup build() {
      LineItemGroup result = new LineItemGroup();
      result.customAttributes = this.customAttributes;
      result.id = this.id;
      result.quantity = this.quantity;
      result.title = this.title;
      result.variantId = this.variantId;
      result.variantSku = this.variantSku;
      return result;
    }

    
    public Builder customAttributes(List<Attribute> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder variantId(String variantId) {
      this.variantId = variantId;
      return this;
    }

    
    public Builder variantSku(String variantSku) {
      this.variantSku = variantSku;
      return this;
    }
  }
}
