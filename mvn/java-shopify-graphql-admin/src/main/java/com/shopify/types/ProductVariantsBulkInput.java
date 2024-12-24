package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductVariantsBulkInput {
  
  private String barcode;

  
  private String compareAtPrice;

  
  private String id;

  
  private List<String> mediaSrc;

  
  private ProductVariantInventoryPolicy inventoryPolicy;

  
  private List<InventoryLevelInput> inventoryQuantities;

  
  private InventoryItemInput inventoryItem;

  
  private String mediaId;

  
  private List<MetafieldInput> metafields;

  
  private List<VariantOptionValueInput> optionValues;

  
  private String price;

  
  private Boolean taxable;

  
  private String taxCode;

  
  private Boolean requiresComponents;

  public ProductVariantsBulkInput() {
  }

  
  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  
  public String getCompareAtPrice() {
    return compareAtPrice;
  }

  public void setCompareAtPrice(String compareAtPrice) {
    this.compareAtPrice = compareAtPrice;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public List<String> getMediaSrc() {
    return mediaSrc;
  }

  public void setMediaSrc(List<String> mediaSrc) {
    this.mediaSrc = mediaSrc;
  }

  
  public ProductVariantInventoryPolicy getInventoryPolicy() {
    return inventoryPolicy;
  }

  public void setInventoryPolicy(ProductVariantInventoryPolicy inventoryPolicy) {
    this.inventoryPolicy = inventoryPolicy;
  }

  
  public List<InventoryLevelInput> getInventoryQuantities() {
    return inventoryQuantities;
  }

  public void setInventoryQuantities(List<InventoryLevelInput> inventoryQuantities) {
    this.inventoryQuantities = inventoryQuantities;
  }

  
  public InventoryItemInput getInventoryItem() {
    return inventoryItem;
  }

  public void setInventoryItem(InventoryItemInput inventoryItem) {
    this.inventoryItem = inventoryItem;
  }

  
  public String getMediaId() {
    return mediaId;
  }

  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  
  public List<VariantOptionValueInput> getOptionValues() {
    return optionValues;
  }

  public void setOptionValues(List<VariantOptionValueInput> optionValues) {
    this.optionValues = optionValues;
  }

  
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  
  public Boolean getTaxable() {
    return taxable;
  }

  public void setTaxable(Boolean taxable) {
    this.taxable = taxable;
  }

  
  public String getTaxCode() {
    return taxCode;
  }

  public void setTaxCode(String taxCode) {
    this.taxCode = taxCode;
  }

  
  public Boolean getRequiresComponents() {
    return requiresComponents;
  }

  public void setRequiresComponents(Boolean requiresComponents) {
    this.requiresComponents = requiresComponents;
  }

  @Override
  public String toString() {
    return "ProductVariantsBulkInput{barcode='" + barcode + "', compareAtPrice='" + compareAtPrice + "', id='" + id + "', mediaSrc='" + mediaSrc + "', inventoryPolicy='" + inventoryPolicy + "', inventoryQuantities='" + inventoryQuantities + "', inventoryItem='" + inventoryItem + "', mediaId='" + mediaId + "', metafields='" + metafields + "', optionValues='" + optionValues + "', price='" + price + "', taxable='" + taxable + "', taxCode='" + taxCode + "', requiresComponents='" + requiresComponents + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantsBulkInput that = (ProductVariantsBulkInput) o;
    return Objects.equals(barcode, that.barcode) &&
        Objects.equals(compareAtPrice, that.compareAtPrice) &&
        Objects.equals(id, that.id) &&
        Objects.equals(mediaSrc, that.mediaSrc) &&
        Objects.equals(inventoryPolicy, that.inventoryPolicy) &&
        Objects.equals(inventoryQuantities, that.inventoryQuantities) &&
        Objects.equals(inventoryItem, that.inventoryItem) &&
        Objects.equals(mediaId, that.mediaId) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(optionValues, that.optionValues) &&
        Objects.equals(price, that.price) &&
        Objects.equals(taxable, that.taxable) &&
        Objects.equals(taxCode, that.taxCode) &&
        Objects.equals(requiresComponents, that.requiresComponents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barcode, compareAtPrice, id, mediaSrc, inventoryPolicy, inventoryQuantities, inventoryItem, mediaId, metafields, optionValues, price, taxable, taxCode, requiresComponents);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String barcode;

    
    private String compareAtPrice;

    
    private String id;

    
    private List<String> mediaSrc;

    
    private ProductVariantInventoryPolicy inventoryPolicy;

    
    private List<InventoryLevelInput> inventoryQuantities;

    
    private InventoryItemInput inventoryItem;

    
    private String mediaId;

    
    private List<MetafieldInput> metafields;

    
    private List<VariantOptionValueInput> optionValues;

    
    private String price;

    
    private Boolean taxable;

    
    private String taxCode;

    
    private Boolean requiresComponents;

    public ProductVariantsBulkInput build() {
      ProductVariantsBulkInput result = new ProductVariantsBulkInput();
      result.barcode = this.barcode;
      result.compareAtPrice = this.compareAtPrice;
      result.id = this.id;
      result.mediaSrc = this.mediaSrc;
      result.inventoryPolicy = this.inventoryPolicy;
      result.inventoryQuantities = this.inventoryQuantities;
      result.inventoryItem = this.inventoryItem;
      result.mediaId = this.mediaId;
      result.metafields = this.metafields;
      result.optionValues = this.optionValues;
      result.price = this.price;
      result.taxable = this.taxable;
      result.taxCode = this.taxCode;
      result.requiresComponents = this.requiresComponents;
      return result;
    }

    
    public Builder barcode(String barcode) {
      this.barcode = barcode;
      return this;
    }

    
    public Builder compareAtPrice(String compareAtPrice) {
      this.compareAtPrice = compareAtPrice;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder mediaSrc(List<String> mediaSrc) {
      this.mediaSrc = mediaSrc;
      return this;
    }

    
    public Builder inventoryPolicy(ProductVariantInventoryPolicy inventoryPolicy) {
      this.inventoryPolicy = inventoryPolicy;
      return this;
    }

    
    public Builder inventoryQuantities(List<InventoryLevelInput> inventoryQuantities) {
      this.inventoryQuantities = inventoryQuantities;
      return this;
    }

    
    public Builder inventoryItem(InventoryItemInput inventoryItem) {
      this.inventoryItem = inventoryItem;
      return this;
    }

    
    public Builder mediaId(String mediaId) {
      this.mediaId = mediaId;
      return this;
    }

    
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder optionValues(List<VariantOptionValueInput> optionValues) {
      this.optionValues = optionValues;
      return this;
    }

    
    public Builder price(String price) {
      this.price = price;
      return this;
    }

    
    public Builder taxable(Boolean taxable) {
      this.taxable = taxable;
      return this;
    }

    
    public Builder taxCode(String taxCode) {
      this.taxCode = taxCode;
      return this;
    }

    
    public Builder requiresComponents(Boolean requiresComponents) {
      this.requiresComponents = requiresComponents;
      return this;
    }
  }
}
