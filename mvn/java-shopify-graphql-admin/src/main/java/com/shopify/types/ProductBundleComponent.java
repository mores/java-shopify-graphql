package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductBundleComponent {
  
  private Product componentProduct;

  
  private ProductVariantConnection componentVariants;

  
  private Count componentVariantsCount;

  
  private List<ProductBundleComponentOptionSelection> optionSelections;

  
  private Integer quantity;

  
  private ProductBundleComponentQuantityOption quantityOption;

  public ProductBundleComponent() {
  }

  
  public Product getComponentProduct() {
    return componentProduct;
  }

  public void setComponentProduct(Product componentProduct) {
    this.componentProduct = componentProduct;
  }

  
  public ProductVariantConnection getComponentVariants() {
    return componentVariants;
  }

  public void setComponentVariants(ProductVariantConnection componentVariants) {
    this.componentVariants = componentVariants;
  }

  
  public Count getComponentVariantsCount() {
    return componentVariantsCount;
  }

  public void setComponentVariantsCount(Count componentVariantsCount) {
    this.componentVariantsCount = componentVariantsCount;
  }

  
  public List<ProductBundleComponentOptionSelection> getOptionSelections() {
    return optionSelections;
  }

  public void setOptionSelections(List<ProductBundleComponentOptionSelection> optionSelections) {
    this.optionSelections = optionSelections;
  }

  
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  
  public ProductBundleComponentQuantityOption getQuantityOption() {
    return quantityOption;
  }

  public void setQuantityOption(ProductBundleComponentQuantityOption quantityOption) {
    this.quantityOption = quantityOption;
  }

  @Override
  public String toString() {
    return "ProductBundleComponent{componentProduct='" + componentProduct + "', componentVariants='" + componentVariants + "', componentVariantsCount='" + componentVariantsCount + "', optionSelections='" + optionSelections + "', quantity='" + quantity + "', quantityOption='" + quantityOption + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductBundleComponent that = (ProductBundleComponent) o;
    return Objects.equals(componentProduct, that.componentProduct) &&
        Objects.equals(componentVariants, that.componentVariants) &&
        Objects.equals(componentVariantsCount, that.componentVariantsCount) &&
        Objects.equals(optionSelections, that.optionSelections) &&
        Objects.equals(quantity, that.quantity) &&
        Objects.equals(quantityOption, that.quantityOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentProduct, componentVariants, componentVariantsCount, optionSelections, quantity, quantityOption);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Product componentProduct;

    
    private ProductVariantConnection componentVariants;

    
    private Count componentVariantsCount;

    
    private List<ProductBundleComponentOptionSelection> optionSelections;

    
    private Integer quantity;

    
    private ProductBundleComponentQuantityOption quantityOption;

    public ProductBundleComponent build() {
      ProductBundleComponent result = new ProductBundleComponent();
      result.componentProduct = this.componentProduct;
      result.componentVariants = this.componentVariants;
      result.componentVariantsCount = this.componentVariantsCount;
      result.optionSelections = this.optionSelections;
      result.quantity = this.quantity;
      result.quantityOption = this.quantityOption;
      return result;
    }

    
    public Builder componentProduct(Product componentProduct) {
      this.componentProduct = componentProduct;
      return this;
    }

    
    public Builder componentVariants(ProductVariantConnection componentVariants) {
      this.componentVariants = componentVariants;
      return this;
    }

    
    public Builder componentVariantsCount(Count componentVariantsCount) {
      this.componentVariantsCount = componentVariantsCount;
      return this;
    }

    
    public Builder optionSelections(List<ProductBundleComponentOptionSelection> optionSelections) {
      this.optionSelections = optionSelections;
      return this;
    }

    
    public Builder quantity(Integer quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder quantityOption(ProductBundleComponentQuantityOption quantityOption) {
      this.quantityOption = quantityOption;
      return this;
    }
  }
}
