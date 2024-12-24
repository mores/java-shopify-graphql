package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductBundleComponentInput {
  
  private Integer quantity;

  
  private String productId;

  
  private List<ProductBundleComponentOptionSelectionInput> optionSelections;

  
  private ProductBundleComponentQuantityOptionInput quantityOption;

  public ProductBundleComponentInput() {
  }

  
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  
  public List<ProductBundleComponentOptionSelectionInput> getOptionSelections() {
    return optionSelections;
  }

  public void setOptionSelections(
      List<ProductBundleComponentOptionSelectionInput> optionSelections) {
    this.optionSelections = optionSelections;
  }

  
  public ProductBundleComponentQuantityOptionInput getQuantityOption() {
    return quantityOption;
  }

  public void setQuantityOption(ProductBundleComponentQuantityOptionInput quantityOption) {
    this.quantityOption = quantityOption;
  }

  @Override
  public String toString() {
    return "ProductBundleComponentInput{quantity='" + quantity + "', productId='" + productId + "', optionSelections='" + optionSelections + "', quantityOption='" + quantityOption + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductBundleComponentInput that = (ProductBundleComponentInput) o;
    return Objects.equals(quantity, that.quantity) &&
        Objects.equals(productId, that.productId) &&
        Objects.equals(optionSelections, that.optionSelections) &&
        Objects.equals(quantityOption, that.quantityOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, productId, optionSelections, quantityOption);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Integer quantity;

    
    private String productId;

    
    private List<ProductBundleComponentOptionSelectionInput> optionSelections;

    
    private ProductBundleComponentQuantityOptionInput quantityOption;

    public ProductBundleComponentInput build() {
      ProductBundleComponentInput result = new ProductBundleComponentInput();
      result.quantity = this.quantity;
      result.productId = this.productId;
      result.optionSelections = this.optionSelections;
      result.quantityOption = this.quantityOption;
      return result;
    }

    
    public Builder quantity(Integer quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    
    public Builder optionSelections(
        List<ProductBundleComponentOptionSelectionInput> optionSelections) {
      this.optionSelections = optionSelections;
      return this;
    }

    
    public Builder quantityOption(ProductBundleComponentQuantityOptionInput quantityOption) {
      this.quantityOption = quantityOption;
      return this;
    }
  }
}
