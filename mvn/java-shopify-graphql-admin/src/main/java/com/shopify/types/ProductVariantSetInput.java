package com.shopify.types;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductVariantSetInput {
  
  private Boolean requiresComponents;

  
  private String barcode;

  
  private String compareAtPrice;

  
  private String id;

  
  private FileSetInput file;

  
  private ProductVariantInventoryPolicy inventoryPolicy;

  
  private List<ProductSetInventoryInput> inventoryQuantities;

  
  private List<MetafieldInput> metafields;

  
  private List<VariantOptionValueInput> optionValues;

  
  private Integer position;

  
  private String price;

  
  private String sku;

  
  private Boolean taxable;

  
  private String taxCode;

  public ProductVariantSetInput() {
  }

  
  public Boolean getRequiresComponents() {
    return requiresComponents;
  }

  public void setRequiresComponents(Boolean requiresComponents) {
    this.requiresComponents = requiresComponents;
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

  
  public FileSetInput getFile() {
    return file;
  }

  public void setFile(FileSetInput file) {
    this.file = file;
  }

  
  public ProductVariantInventoryPolicy getInventoryPolicy() {
    return inventoryPolicy;
  }

  public void setInventoryPolicy(ProductVariantInventoryPolicy inventoryPolicy) {
    this.inventoryPolicy = inventoryPolicy;
  }

  
  public List<ProductSetInventoryInput> getInventoryQuantities() {
    return inventoryQuantities;
  }

  public void setInventoryQuantities(List<ProductSetInventoryInput> inventoryQuantities) {
    this.inventoryQuantities = inventoryQuantities;
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

  
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
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

  @Override
  public String toString() {
    return "ProductVariantSetInput{requiresComponents='" + requiresComponents + "', barcode='" + barcode + "', compareAtPrice='" + compareAtPrice + "', id='" + id + "', file='" + file + "', inventoryPolicy='" + inventoryPolicy + "', inventoryQuantities='" + inventoryQuantities + "', metafields='" + metafields + "', optionValues='" + optionValues + "', position='" + position + "', price='" + price + "', sku='" + sku + "', taxable='" + taxable + "', taxCode='" + taxCode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantSetInput that = (ProductVariantSetInput) o;
    return Objects.equals(requiresComponents, that.requiresComponents) &&
        Objects.equals(barcode, that.barcode) &&
        Objects.equals(compareAtPrice, that.compareAtPrice) &&
        Objects.equals(id, that.id) &&
        Objects.equals(file, that.file) &&
        Objects.equals(inventoryPolicy, that.inventoryPolicy) &&
        Objects.equals(inventoryQuantities, that.inventoryQuantities) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(optionValues, that.optionValues) &&
        Objects.equals(position, that.position) &&
        Objects.equals(price, that.price) &&
        Objects.equals(sku, that.sku) &&
        Objects.equals(taxable, that.taxable) &&
        Objects.equals(taxCode, that.taxCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiresComponents, barcode, compareAtPrice, id, file, inventoryPolicy, inventoryQuantities, metafields, optionValues, position, price, sku, taxable, taxCode);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Boolean requiresComponents;

    
    private String barcode;

    
    private String compareAtPrice;

    
    private String id;

    
    private FileSetInput file;

    
    private ProductVariantInventoryPolicy inventoryPolicy;

    
    private List<ProductSetInventoryInput> inventoryQuantities;

    
    private List<MetafieldInput> metafields;

    
    private List<VariantOptionValueInput> optionValues;

    
    private Integer position;

    
    private String price;

    
    private String sku;

    
    private Boolean taxable;

    
    private String taxCode;

    public ProductVariantSetInput build() {
      ProductVariantSetInput result = new ProductVariantSetInput();
      result.requiresComponents = this.requiresComponents;
      result.barcode = this.barcode;
      result.compareAtPrice = this.compareAtPrice;
      result.id = this.id;
      result.file = this.file;
      result.inventoryPolicy = this.inventoryPolicy;
      result.inventoryQuantities = this.inventoryQuantities;
      result.metafields = this.metafields;
      result.optionValues = this.optionValues;
      result.position = this.position;
      result.price = this.price;
      result.sku = this.sku;
      result.taxable = this.taxable;
      result.taxCode = this.taxCode;
      return result;
    }

    
    public Builder requiresComponents(Boolean requiresComponents) {
      this.requiresComponents = requiresComponents;
      return this;
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

    
    public Builder file(FileSetInput file) {
      this.file = file;
      return this;
    }

    
    public Builder inventoryPolicy(ProductVariantInventoryPolicy inventoryPolicy) {
      this.inventoryPolicy = inventoryPolicy;
      return this;
    }

    
    public Builder inventoryQuantities(List<ProductSetInventoryInput> inventoryQuantities) {
      this.inventoryQuantities = inventoryQuantities;
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

    
    public Builder position(Integer position) {
      this.position = position;
      return this;
    }

    
    public Builder price(String price) {
      this.price = price;
      return this;
    }

    
    public Builder sku(String sku) {
      this.sku = sku;
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
  }
}
