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
public class FulfillmentOrderLineItem implements com.shopify.types.Node {
  
  private List<FulfillmentOrderLineItemFinancialSummary> financialSummaries;

  
  private String id;

  
  private Image image;

  
  private String inventoryItemId;

  
  private LineItem lineItem;

  
  private MoneyBag originalUnitPriceSet;

  
  private String productTitle;

  
  private int remainingQuantity;

  
  private boolean requiresShipping;

  
  private String sku;

  
  private int totalQuantity;

  
  private ProductVariant variant;

  
  private String variantTitle;

  
  private String vendor;

  
  private List<FulfillmentOrderLineItemWarning> warnings;

  
  private Weight weight;

  public FulfillmentOrderLineItem() {
  }

  
  public List<FulfillmentOrderLineItemFinancialSummary> getFinancialSummaries() {
    return financialSummaries;
  }

  public void setFinancialSummaries(
      List<FulfillmentOrderLineItemFinancialSummary> financialSummaries) {
    this.financialSummaries = financialSummaries;
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

  
  public String getInventoryItemId() {
    return inventoryItemId;
  }

  public void setInventoryItemId(String inventoryItemId) {
    this.inventoryItemId = inventoryItemId;
  }

  
  public LineItem getLineItem() {
    return lineItem;
  }

  public void setLineItem(LineItem lineItem) {
    this.lineItem = lineItem;
  }

  
  public MoneyBag getOriginalUnitPriceSet() {
    return originalUnitPriceSet;
  }

  public void setOriginalUnitPriceSet(MoneyBag originalUnitPriceSet) {
    this.originalUnitPriceSet = originalUnitPriceSet;
  }

  
  public String getProductTitle() {
    return productTitle;
  }

  public void setProductTitle(String productTitle) {
    this.productTitle = productTitle;
  }

  
  public int getRemainingQuantity() {
    return remainingQuantity;
  }

  public void setRemainingQuantity(int remainingQuantity) {
    this.remainingQuantity = remainingQuantity;
  }

  
  public boolean getRequiresShipping() {
    return requiresShipping;
  }

  public void setRequiresShipping(boolean requiresShipping) {
    this.requiresShipping = requiresShipping;
  }

  
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  
  public int getTotalQuantity() {
    return totalQuantity;
  }

  public void setTotalQuantity(int totalQuantity) {
    this.totalQuantity = totalQuantity;
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

  
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  
  public List<FulfillmentOrderLineItemWarning> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<FulfillmentOrderLineItemWarning> warnings) {
    this.warnings = warnings;
  }

  
  public Weight getWeight() {
    return weight;
  }

  public void setWeight(Weight weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderLineItem{financialSummaries='" + financialSummaries + "', id='" + id + "', image='" + image + "', inventoryItemId='" + inventoryItemId + "', lineItem='" + lineItem + "', originalUnitPriceSet='" + originalUnitPriceSet + "', productTitle='" + productTitle + "', remainingQuantity='" + remainingQuantity + "', requiresShipping='" + requiresShipping + "', sku='" + sku + "', totalQuantity='" + totalQuantity + "', variant='" + variant + "', variantTitle='" + variantTitle + "', vendor='" + vendor + "', warnings='" + warnings + "', weight='" + weight + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderLineItem that = (FulfillmentOrderLineItem) o;
    return Objects.equals(financialSummaries, that.financialSummaries) &&
        Objects.equals(id, that.id) &&
        Objects.equals(image, that.image) &&
        Objects.equals(inventoryItemId, that.inventoryItemId) &&
        Objects.equals(lineItem, that.lineItem) &&
        Objects.equals(originalUnitPriceSet, that.originalUnitPriceSet) &&
        Objects.equals(productTitle, that.productTitle) &&
        remainingQuantity == that.remainingQuantity &&
        requiresShipping == that.requiresShipping &&
        Objects.equals(sku, that.sku) &&
        totalQuantity == that.totalQuantity &&
        Objects.equals(variant, that.variant) &&
        Objects.equals(variantTitle, that.variantTitle) &&
        Objects.equals(vendor, that.vendor) &&
        Objects.equals(warnings, that.warnings) &&
        Objects.equals(weight, that.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialSummaries, id, image, inventoryItemId, lineItem, originalUnitPriceSet, productTitle, remainingQuantity, requiresShipping, sku, totalQuantity, variant, variantTitle, vendor, warnings, weight);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<FulfillmentOrderLineItemFinancialSummary> financialSummaries;

    
    private String id;

    
    private Image image;

    
    private String inventoryItemId;

    
    private LineItem lineItem;

    
    private MoneyBag originalUnitPriceSet;

    
    private String productTitle;

    
    private int remainingQuantity;

    
    private boolean requiresShipping;

    
    private String sku;

    
    private int totalQuantity;

    
    private ProductVariant variant;

    
    private String variantTitle;

    
    private String vendor;

    
    private List<FulfillmentOrderLineItemWarning> warnings;

    
    private Weight weight;

    public FulfillmentOrderLineItem build() {
      FulfillmentOrderLineItem result = new FulfillmentOrderLineItem();
      result.financialSummaries = this.financialSummaries;
      result.id = this.id;
      result.image = this.image;
      result.inventoryItemId = this.inventoryItemId;
      result.lineItem = this.lineItem;
      result.originalUnitPriceSet = this.originalUnitPriceSet;
      result.productTitle = this.productTitle;
      result.remainingQuantity = this.remainingQuantity;
      result.requiresShipping = this.requiresShipping;
      result.sku = this.sku;
      result.totalQuantity = this.totalQuantity;
      result.variant = this.variant;
      result.variantTitle = this.variantTitle;
      result.vendor = this.vendor;
      result.warnings = this.warnings;
      result.weight = this.weight;
      return result;
    }

    
    public Builder financialSummaries(
        List<FulfillmentOrderLineItemFinancialSummary> financialSummaries) {
      this.financialSummaries = financialSummaries;
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

    
    public Builder inventoryItemId(String inventoryItemId) {
      this.inventoryItemId = inventoryItemId;
      return this;
    }

    
    public Builder lineItem(LineItem lineItem) {
      this.lineItem = lineItem;
      return this;
    }

    
    public Builder originalUnitPriceSet(MoneyBag originalUnitPriceSet) {
      this.originalUnitPriceSet = originalUnitPriceSet;
      return this;
    }

    
    public Builder productTitle(String productTitle) {
      this.productTitle = productTitle;
      return this;
    }

    
    public Builder remainingQuantity(int remainingQuantity) {
      this.remainingQuantity = remainingQuantity;
      return this;
    }

    
    public Builder requiresShipping(boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      return this;
    }

    
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }

    
    public Builder totalQuantity(int totalQuantity) {
      this.totalQuantity = totalQuantity;
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

    
    public Builder vendor(String vendor) {
      this.vendor = vendor;
      return this;
    }

    
    public Builder warnings(List<FulfillmentOrderLineItemWarning> warnings) {
      this.warnings = warnings;
      return this;
    }

    
    public Builder weight(Weight weight) {
      this.weight = weight;
      return this;
    }
  }
}
