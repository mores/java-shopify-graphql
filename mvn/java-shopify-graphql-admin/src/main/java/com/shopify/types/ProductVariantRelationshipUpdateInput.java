package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductVariantRelationshipUpdateInput {
  
  private String parentProductVariantId;

  
  private String parentProductId;

  
  private List<ProductVariantGroupRelationshipInput> productVariantRelationshipsToCreate = null;

  
  private List<ProductVariantGroupRelationshipInput> productVariantRelationshipsToUpdate = null;

  
  private List<String> productVariantRelationshipsToRemove = null;

  
  private Boolean removeAllProductVariantRelationships = false;

  
  private PriceInput priceInput = null;

  public ProductVariantRelationshipUpdateInput() {
  }

  
  public String getParentProductVariantId() {
    return parentProductVariantId;
  }

  public void setParentProductVariantId(String parentProductVariantId) {
    this.parentProductVariantId = parentProductVariantId;
  }

  
  public String getParentProductId() {
    return parentProductId;
  }

  public void setParentProductId(String parentProductId) {
    this.parentProductId = parentProductId;
  }

  
  public List<ProductVariantGroupRelationshipInput> getProductVariantRelationshipsToCreate() {
    return productVariantRelationshipsToCreate;
  }

  public void setProductVariantRelationshipsToCreate(
      List<ProductVariantGroupRelationshipInput> productVariantRelationshipsToCreate) {
    this.productVariantRelationshipsToCreate = productVariantRelationshipsToCreate;
  }

  
  public List<ProductVariantGroupRelationshipInput> getProductVariantRelationshipsToUpdate() {
    return productVariantRelationshipsToUpdate;
  }

  public void setProductVariantRelationshipsToUpdate(
      List<ProductVariantGroupRelationshipInput> productVariantRelationshipsToUpdate) {
    this.productVariantRelationshipsToUpdate = productVariantRelationshipsToUpdate;
  }

  
  public List<String> getProductVariantRelationshipsToRemove() {
    return productVariantRelationshipsToRemove;
  }

  public void setProductVariantRelationshipsToRemove(
      List<String> productVariantRelationshipsToRemove) {
    this.productVariantRelationshipsToRemove = productVariantRelationshipsToRemove;
  }

  
  public Boolean getRemoveAllProductVariantRelationships() {
    return removeAllProductVariantRelationships;
  }

  public void setRemoveAllProductVariantRelationships(
      Boolean removeAllProductVariantRelationships) {
    this.removeAllProductVariantRelationships = removeAllProductVariantRelationships;
  }

  
  public PriceInput getPriceInput() {
    return priceInput;
  }

  public void setPriceInput(PriceInput priceInput) {
    this.priceInput = priceInput;
  }

  @Override
  public String toString() {
    return "ProductVariantRelationshipUpdateInput{parentProductVariantId='" + parentProductVariantId + "', parentProductId='" + parentProductId + "', productVariantRelationshipsToCreate='" + productVariantRelationshipsToCreate + "', productVariantRelationshipsToUpdate='" + productVariantRelationshipsToUpdate + "', productVariantRelationshipsToRemove='" + productVariantRelationshipsToRemove + "', removeAllProductVariantRelationships='" + removeAllProductVariantRelationships + "', priceInput='" + priceInput + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantRelationshipUpdateInput that = (ProductVariantRelationshipUpdateInput) o;
    return Objects.equals(parentProductVariantId, that.parentProductVariantId) &&
        Objects.equals(parentProductId, that.parentProductId) &&
        Objects.equals(productVariantRelationshipsToCreate, that.productVariantRelationshipsToCreate) &&
        Objects.equals(productVariantRelationshipsToUpdate, that.productVariantRelationshipsToUpdate) &&
        Objects.equals(productVariantRelationshipsToRemove, that.productVariantRelationshipsToRemove) &&
        Objects.equals(removeAllProductVariantRelationships, that.removeAllProductVariantRelationships) &&
        Objects.equals(priceInput, that.priceInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentProductVariantId, parentProductId, productVariantRelationshipsToCreate, productVariantRelationshipsToUpdate, productVariantRelationshipsToRemove, removeAllProductVariantRelationships, priceInput);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String parentProductVariantId;

    
    private String parentProductId;

    
    private List<ProductVariantGroupRelationshipInput> productVariantRelationshipsToCreate = null;

    
    private List<ProductVariantGroupRelationshipInput> productVariantRelationshipsToUpdate = null;

    
    private List<String> productVariantRelationshipsToRemove = null;

    
    private Boolean removeAllProductVariantRelationships = false;

    
    private PriceInput priceInput = null;

    public ProductVariantRelationshipUpdateInput build() {
      ProductVariantRelationshipUpdateInput result = new ProductVariantRelationshipUpdateInput();
      result.parentProductVariantId = this.parentProductVariantId;
      result.parentProductId = this.parentProductId;
      result.productVariantRelationshipsToCreate = this.productVariantRelationshipsToCreate;
      result.productVariantRelationshipsToUpdate = this.productVariantRelationshipsToUpdate;
      result.productVariantRelationshipsToRemove = this.productVariantRelationshipsToRemove;
      result.removeAllProductVariantRelationships = this.removeAllProductVariantRelationships;
      result.priceInput = this.priceInput;
      return result;
    }

    
    public Builder parentProductVariantId(String parentProductVariantId) {
      this.parentProductVariantId = parentProductVariantId;
      return this;
    }

    
    public Builder parentProductId(String parentProductId) {
      this.parentProductId = parentProductId;
      return this;
    }

    
    public Builder productVariantRelationshipsToCreate(
        List<ProductVariantGroupRelationshipInput> productVariantRelationshipsToCreate) {
      this.productVariantRelationshipsToCreate = productVariantRelationshipsToCreate;
      return this;
    }

    
    public Builder productVariantRelationshipsToUpdate(
        List<ProductVariantGroupRelationshipInput> productVariantRelationshipsToUpdate) {
      this.productVariantRelationshipsToUpdate = productVariantRelationshipsToUpdate;
      return this;
    }

    
    public Builder productVariantRelationshipsToRemove(
        List<String> productVariantRelationshipsToRemove) {
      this.productVariantRelationshipsToRemove = productVariantRelationshipsToRemove;
      return this;
    }

    
    public Builder removeAllProductVariantRelationships(
        Boolean removeAllProductVariantRelationships) {
      this.removeAllProductVariantRelationships = removeAllProductVariantRelationships;
      return this;
    }

    
    public Builder priceInput(PriceInput priceInput) {
      this.priceInput = priceInput;
      return this;
    }
  }
}
