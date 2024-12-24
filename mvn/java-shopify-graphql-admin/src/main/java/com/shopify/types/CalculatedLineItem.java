package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CalculatedLineItem {
  
  private List<CalculatedDiscountAllocation> calculatedDiscountAllocations;

  
  private List<Attribute> customAttributes;

  
  private List<DiscountAllocation> discountAllocations;

  
  private MoneyBag discountedUnitPriceSet;

  
  private int editableQuantity;

  
  private int editableQuantityBeforeChanges;

  
  private MoneyBag editableSubtotalSet;

  
  private boolean hasStagedLineItemDiscount;

  
  private String id;

  
  private Image image;

  
  private MoneyBag originalUnitPriceSet;

  
  private int quantity;

  
  private boolean restockable;

  
  private boolean restocking;

  
  private String sku;

  
  private List<OrderStagedChange> stagedChanges;

  
  private String title;

  
  private MoneyBag uneditableSubtotalSet;

  
  private ProductVariant variant;

  
  private String variantTitle;

  public CalculatedLineItem() {
  }

  
  public List<CalculatedDiscountAllocation> getCalculatedDiscountAllocations() {
    return calculatedDiscountAllocations;
  }

  public void setCalculatedDiscountAllocations(
      List<CalculatedDiscountAllocation> calculatedDiscountAllocations) {
    this.calculatedDiscountAllocations = calculatedDiscountAllocations;
  }

  
  public List<Attribute> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<Attribute> customAttributes) {
    this.customAttributes = customAttributes;
  }

  
  public List<DiscountAllocation> getDiscountAllocations() {
    return discountAllocations;
  }

  public void setDiscountAllocations(List<DiscountAllocation> discountAllocations) {
    this.discountAllocations = discountAllocations;
  }

  
  public MoneyBag getDiscountedUnitPriceSet() {
    return discountedUnitPriceSet;
  }

  public void setDiscountedUnitPriceSet(MoneyBag discountedUnitPriceSet) {
    this.discountedUnitPriceSet = discountedUnitPriceSet;
  }

  
  public int getEditableQuantity() {
    return editableQuantity;
  }

  public void setEditableQuantity(int editableQuantity) {
    this.editableQuantity = editableQuantity;
  }

  
  public int getEditableQuantityBeforeChanges() {
    return editableQuantityBeforeChanges;
  }

  public void setEditableQuantityBeforeChanges(int editableQuantityBeforeChanges) {
    this.editableQuantityBeforeChanges = editableQuantityBeforeChanges;
  }

  
  public MoneyBag getEditableSubtotalSet() {
    return editableSubtotalSet;
  }

  public void setEditableSubtotalSet(MoneyBag editableSubtotalSet) {
    this.editableSubtotalSet = editableSubtotalSet;
  }

  
  public boolean getHasStagedLineItemDiscount() {
    return hasStagedLineItemDiscount;
  }

  public void setHasStagedLineItemDiscount(boolean hasStagedLineItemDiscount) {
    this.hasStagedLineItemDiscount = hasStagedLineItemDiscount;
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

  
  public MoneyBag getOriginalUnitPriceSet() {
    return originalUnitPriceSet;
  }

  public void setOriginalUnitPriceSet(MoneyBag originalUnitPriceSet) {
    this.originalUnitPriceSet = originalUnitPriceSet;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  
  public boolean getRestockable() {
    return restockable;
  }

  public void setRestockable(boolean restockable) {
    this.restockable = restockable;
  }

  
  public boolean getRestocking() {
    return restocking;
  }

  public void setRestocking(boolean restocking) {
    this.restocking = restocking;
  }

  
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  
  public List<OrderStagedChange> getStagedChanges() {
    return stagedChanges;
  }

  public void setStagedChanges(List<OrderStagedChange> stagedChanges) {
    this.stagedChanges = stagedChanges;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public MoneyBag getUneditableSubtotalSet() {
    return uneditableSubtotalSet;
  }

  public void setUneditableSubtotalSet(MoneyBag uneditableSubtotalSet) {
    this.uneditableSubtotalSet = uneditableSubtotalSet;
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
    return "CalculatedLineItem{calculatedDiscountAllocations='" + calculatedDiscountAllocations + "', customAttributes='" + customAttributes + "', discountAllocations='" + discountAllocations + "', discountedUnitPriceSet='" + discountedUnitPriceSet + "', editableQuantity='" + editableQuantity + "', editableQuantityBeforeChanges='" + editableQuantityBeforeChanges + "', editableSubtotalSet='" + editableSubtotalSet + "', hasStagedLineItemDiscount='" + hasStagedLineItemDiscount + "', id='" + id + "', image='" + image + "', originalUnitPriceSet='" + originalUnitPriceSet + "', quantity='" + quantity + "', restockable='" + restockable + "', restocking='" + restocking + "', sku='" + sku + "', stagedChanges='" + stagedChanges + "', title='" + title + "', uneditableSubtotalSet='" + uneditableSubtotalSet + "', variant='" + variant + "', variantTitle='" + variantTitle + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedLineItem that = (CalculatedLineItem) o;
    return Objects.equals(calculatedDiscountAllocations, that.calculatedDiscountAllocations) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(discountAllocations, that.discountAllocations) &&
        Objects.equals(discountedUnitPriceSet, that.discountedUnitPriceSet) &&
        editableQuantity == that.editableQuantity &&
        editableQuantityBeforeChanges == that.editableQuantityBeforeChanges &&
        Objects.equals(editableSubtotalSet, that.editableSubtotalSet) &&
        hasStagedLineItemDiscount == that.hasStagedLineItemDiscount &&
        Objects.equals(id, that.id) &&
        Objects.equals(image, that.image) &&
        Objects.equals(originalUnitPriceSet, that.originalUnitPriceSet) &&
        quantity == that.quantity &&
        restockable == that.restockable &&
        restocking == that.restocking &&
        Objects.equals(sku, that.sku) &&
        Objects.equals(stagedChanges, that.stagedChanges) &&
        Objects.equals(title, that.title) &&
        Objects.equals(uneditableSubtotalSet, that.uneditableSubtotalSet) &&
        Objects.equals(variant, that.variant) &&
        Objects.equals(variantTitle, that.variantTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculatedDiscountAllocations, customAttributes, discountAllocations, discountedUnitPriceSet, editableQuantity, editableQuantityBeforeChanges, editableSubtotalSet, hasStagedLineItemDiscount, id, image, originalUnitPriceSet, quantity, restockable, restocking, sku, stagedChanges, title, uneditableSubtotalSet, variant, variantTitle);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<CalculatedDiscountAllocation> calculatedDiscountAllocations;

    
    private List<Attribute> customAttributes;

    
    private List<DiscountAllocation> discountAllocations;

    
    private MoneyBag discountedUnitPriceSet;

    
    private int editableQuantity;

    
    private int editableQuantityBeforeChanges;

    
    private MoneyBag editableSubtotalSet;

    
    private boolean hasStagedLineItemDiscount;

    
    private String id;

    
    private Image image;

    
    private MoneyBag originalUnitPriceSet;

    
    private int quantity;

    
    private boolean restockable;

    
    private boolean restocking;

    
    private String sku;

    
    private List<OrderStagedChange> stagedChanges;

    
    private String title;

    
    private MoneyBag uneditableSubtotalSet;

    
    private ProductVariant variant;

    
    private String variantTitle;

    public CalculatedLineItem build() {
      CalculatedLineItem result = new CalculatedLineItem();
      result.calculatedDiscountAllocations = this.calculatedDiscountAllocations;
      result.customAttributes = this.customAttributes;
      result.discountAllocations = this.discountAllocations;
      result.discountedUnitPriceSet = this.discountedUnitPriceSet;
      result.editableQuantity = this.editableQuantity;
      result.editableQuantityBeforeChanges = this.editableQuantityBeforeChanges;
      result.editableSubtotalSet = this.editableSubtotalSet;
      result.hasStagedLineItemDiscount = this.hasStagedLineItemDiscount;
      result.id = this.id;
      result.image = this.image;
      result.originalUnitPriceSet = this.originalUnitPriceSet;
      result.quantity = this.quantity;
      result.restockable = this.restockable;
      result.restocking = this.restocking;
      result.sku = this.sku;
      result.stagedChanges = this.stagedChanges;
      result.title = this.title;
      result.uneditableSubtotalSet = this.uneditableSubtotalSet;
      result.variant = this.variant;
      result.variantTitle = this.variantTitle;
      return result;
    }

    
    public Builder calculatedDiscountAllocations(
        List<CalculatedDiscountAllocation> calculatedDiscountAllocations) {
      this.calculatedDiscountAllocations = calculatedDiscountAllocations;
      return this;
    }

    
    public Builder customAttributes(List<Attribute> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    
    public Builder discountAllocations(List<DiscountAllocation> discountAllocations) {
      this.discountAllocations = discountAllocations;
      return this;
    }

    
    public Builder discountedUnitPriceSet(MoneyBag discountedUnitPriceSet) {
      this.discountedUnitPriceSet = discountedUnitPriceSet;
      return this;
    }

    
    public Builder editableQuantity(int editableQuantity) {
      this.editableQuantity = editableQuantity;
      return this;
    }

    
    public Builder editableQuantityBeforeChanges(int editableQuantityBeforeChanges) {
      this.editableQuantityBeforeChanges = editableQuantityBeforeChanges;
      return this;
    }

    
    public Builder editableSubtotalSet(MoneyBag editableSubtotalSet) {
      this.editableSubtotalSet = editableSubtotalSet;
      return this;
    }

    
    public Builder hasStagedLineItemDiscount(boolean hasStagedLineItemDiscount) {
      this.hasStagedLineItemDiscount = hasStagedLineItemDiscount;
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

    
    public Builder originalUnitPriceSet(MoneyBag originalUnitPriceSet) {
      this.originalUnitPriceSet = originalUnitPriceSet;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder restockable(boolean restockable) {
      this.restockable = restockable;
      return this;
    }

    
    public Builder restocking(boolean restocking) {
      this.restocking = restocking;
      return this;
    }

    
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }

    
    public Builder stagedChanges(List<OrderStagedChange> stagedChanges) {
      this.stagedChanges = stagedChanges;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder uneditableSubtotalSet(MoneyBag uneditableSubtotalSet) {
      this.uneditableSubtotalSet = uneditableSubtotalSet;
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
