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
public class AbandonedCheckoutLineItem implements com.shopify.types.Node {
  
  private List<Attribute> customAttributes;

  
  private DiscountAllocationConnection discountAllocations;

  
  private MoneyBag discountedTotalPriceSet;

  
  private MoneyBag discountedTotalPriceWithCodeDiscount;

  
  private MoneyBag discountedUnitPriceSet;

  
  private MoneyBag discountedUnitPriceWithCodeDiscount;

  
  private String id;

  
  private Image image;

  
  private MoneyBag originalTotalPriceSet;

  
  private MoneyBag originalUnitPriceSet;

  
  private Product product;

  
  private int quantity;

  
  private String sku;

  
  private String title;

  
  private ProductVariant variant;

  
  private String variantTitle;

  public AbandonedCheckoutLineItem() {
  }

  
  public List<Attribute> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<Attribute> customAttributes) {
    this.customAttributes = customAttributes;
  }

  
  public DiscountAllocationConnection getDiscountAllocations() {
    return discountAllocations;
  }

  public void setDiscountAllocations(DiscountAllocationConnection discountAllocations) {
    this.discountAllocations = discountAllocations;
  }

  
  public MoneyBag getDiscountedTotalPriceSet() {
    return discountedTotalPriceSet;
  }

  public void setDiscountedTotalPriceSet(MoneyBag discountedTotalPriceSet) {
    this.discountedTotalPriceSet = discountedTotalPriceSet;
  }

  
  public MoneyBag getDiscountedTotalPriceWithCodeDiscount() {
    return discountedTotalPriceWithCodeDiscount;
  }

  public void setDiscountedTotalPriceWithCodeDiscount(
      MoneyBag discountedTotalPriceWithCodeDiscount) {
    this.discountedTotalPriceWithCodeDiscount = discountedTotalPriceWithCodeDiscount;
  }

  
  public MoneyBag getDiscountedUnitPriceSet() {
    return discountedUnitPriceSet;
  }

  public void setDiscountedUnitPriceSet(MoneyBag discountedUnitPriceSet) {
    this.discountedUnitPriceSet = discountedUnitPriceSet;
  }

  
  public MoneyBag getDiscountedUnitPriceWithCodeDiscount() {
    return discountedUnitPriceWithCodeDiscount;
  }

  public void setDiscountedUnitPriceWithCodeDiscount(MoneyBag discountedUnitPriceWithCodeDiscount) {
    this.discountedUnitPriceWithCodeDiscount = discountedUnitPriceWithCodeDiscount;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  
  public MoneyBag getOriginalTotalPriceSet() {
    return originalTotalPriceSet;
  }

  public void setOriginalTotalPriceSet(MoneyBag originalTotalPriceSet) {
    this.originalTotalPriceSet = originalTotalPriceSet;
  }

  
  public MoneyBag getOriginalUnitPriceSet() {
    return originalUnitPriceSet;
  }

  public void setOriginalUnitPriceSet(MoneyBag originalUnitPriceSet) {
    this.originalUnitPriceSet = originalUnitPriceSet;
  }

  
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public ProductVariant getVariant() {
    return variant;
  }

  public void setVariant(ProductVariant variant) {
    this.variant = variant;
  }

  
  public String getVariantTitle() {
    return variantTitle;
  }

  public void setVariantTitle(String variantTitle) {
    this.variantTitle = variantTitle;
  }

  @Override
  public String toString() {
    return "AbandonedCheckoutLineItem{customAttributes='" + customAttributes + "', discountAllocations='" + discountAllocations + "', discountedTotalPriceSet='" + discountedTotalPriceSet + "', discountedTotalPriceWithCodeDiscount='" + discountedTotalPriceWithCodeDiscount + "', discountedUnitPriceSet='" + discountedUnitPriceSet + "', discountedUnitPriceWithCodeDiscount='" + discountedUnitPriceWithCodeDiscount + "', id='" + id + "', image='" + image + "', originalTotalPriceSet='" + originalTotalPriceSet + "', originalUnitPriceSet='" + originalUnitPriceSet + "', product='" + product + "', quantity='" + quantity + "', sku='" + sku + "', title='" + title + "', variant='" + variant + "', variantTitle='" + variantTitle + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AbandonedCheckoutLineItem that = (AbandonedCheckoutLineItem) o;
    return Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(discountAllocations, that.discountAllocations) &&
        Objects.equals(discountedTotalPriceSet, that.discountedTotalPriceSet) &&
        Objects.equals(discountedTotalPriceWithCodeDiscount, that.discountedTotalPriceWithCodeDiscount) &&
        Objects.equals(discountedUnitPriceSet, that.discountedUnitPriceSet) &&
        Objects.equals(discountedUnitPriceWithCodeDiscount, that.discountedUnitPriceWithCodeDiscount) &&
        Objects.equals(id, that.id) &&
        Objects.equals(image, that.image) &&
        Objects.equals(originalTotalPriceSet, that.originalTotalPriceSet) &&
        Objects.equals(originalUnitPriceSet, that.originalUnitPriceSet) &&
        Objects.equals(product, that.product) &&
        quantity == that.quantity &&
        Objects.equals(sku, that.sku) &&
        Objects.equals(title, that.title) &&
        Objects.equals(variant, that.variant) &&
        Objects.equals(variantTitle, that.variantTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customAttributes, discountAllocations, discountedTotalPriceSet, discountedTotalPriceWithCodeDiscount, discountedUnitPriceSet, discountedUnitPriceWithCodeDiscount, id, image, originalTotalPriceSet, originalUnitPriceSet, product, quantity, sku, title, variant, variantTitle);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<Attribute> customAttributes;

    
    private DiscountAllocationConnection discountAllocations;

    
    private MoneyBag discountedTotalPriceSet;

    
    private MoneyBag discountedTotalPriceWithCodeDiscount;

    
    private MoneyBag discountedUnitPriceSet;

    
    private MoneyBag discountedUnitPriceWithCodeDiscount;

    
    private String id;

    
    private Image image;

    
    private MoneyBag originalTotalPriceSet;

    
    private MoneyBag originalUnitPriceSet;

    
    private Product product;

    
    private int quantity;

    
    private String sku;

    
    private String title;

    
    private ProductVariant variant;

    
    private String variantTitle;

    public AbandonedCheckoutLineItem build() {
      AbandonedCheckoutLineItem result = new AbandonedCheckoutLineItem();
      result.customAttributes = this.customAttributes;
      result.discountAllocations = this.discountAllocations;
      result.discountedTotalPriceSet = this.discountedTotalPriceSet;
      result.discountedTotalPriceWithCodeDiscount = this.discountedTotalPriceWithCodeDiscount;
      result.discountedUnitPriceSet = this.discountedUnitPriceSet;
      result.discountedUnitPriceWithCodeDiscount = this.discountedUnitPriceWithCodeDiscount;
      result.id = this.id;
      result.image = this.image;
      result.originalTotalPriceSet = this.originalTotalPriceSet;
      result.originalUnitPriceSet = this.originalUnitPriceSet;
      result.product = this.product;
      result.quantity = this.quantity;
      result.sku = this.sku;
      result.title = this.title;
      result.variant = this.variant;
      result.variantTitle = this.variantTitle;
      return result;
    }

    
    public Builder customAttributes(List<Attribute> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    
    public Builder discountAllocations(DiscountAllocationConnection discountAllocations) {
      this.discountAllocations = discountAllocations;
      return this;
    }

    
    public Builder discountedTotalPriceSet(MoneyBag discountedTotalPriceSet) {
      this.discountedTotalPriceSet = discountedTotalPriceSet;
      return this;
    }

    
    public Builder discountedTotalPriceWithCodeDiscount(
        MoneyBag discountedTotalPriceWithCodeDiscount) {
      this.discountedTotalPriceWithCodeDiscount = discountedTotalPriceWithCodeDiscount;
      return this;
    }

    
    public Builder discountedUnitPriceSet(MoneyBag discountedUnitPriceSet) {
      this.discountedUnitPriceSet = discountedUnitPriceSet;
      return this;
    }

    
    public Builder discountedUnitPriceWithCodeDiscount(
        MoneyBag discountedUnitPriceWithCodeDiscount) {
      this.discountedUnitPriceWithCodeDiscount = discountedUnitPriceWithCodeDiscount;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder image(Image image) {
      this.image = image;
      return this;
    }

    
    public Builder originalTotalPriceSet(MoneyBag originalTotalPriceSet) {
      this.originalTotalPriceSet = originalTotalPriceSet;
      return this;
    }

    
    public Builder originalUnitPriceSet(MoneyBag originalUnitPriceSet) {
      this.originalUnitPriceSet = originalUnitPriceSet;
      return this;
    }

    
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder variant(ProductVariant variant) {
      this.variant = variant;
      return this;
    }

    
    public Builder variantTitle(String variantTitle) {
      this.variantTitle = variantTitle;
      return this;
    }
  }
}
