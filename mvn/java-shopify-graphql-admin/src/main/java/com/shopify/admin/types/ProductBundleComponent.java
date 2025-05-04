package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The product's component information.
 */
public class ProductBundleComponent {
  /**
   * The product that's related as a component.
   */
  private Product componentProduct;

  /**
   * The list of products' variants that are components.
   */
  private ProductVariantConnection componentVariants;

  /**
   * The number of component variants for the product component.
   */
  private Count componentVariantsCount;

  /**
   * The options in the parent and the component options they're connected to, along with the chosen option values
   * that appear in the bundle.
   */
  private List<ProductBundleComponentOptionSelection> optionSelections;

  /**
   * The quantity of the component product set for this bundle line.
   * It will be null if there's a quantityOption present.
   */
  private Integer quantity;

  /**
   * The quantity as option of the component product. It will be null if there's a quantity set.
   */
  private ProductBundleComponentQuantityOption quantityOption;

  public ProductBundleComponent() {
  }

  /**
   * The product that's related as a component.
   */
  public Product getComponentProduct() {
    return componentProduct;
  }

  public void setComponentProduct(Product componentProduct) {
    this.componentProduct = componentProduct;
  }

  /**
   * The list of products' variants that are components.
   */
  public ProductVariantConnection getComponentVariants() {
    return componentVariants;
  }

  public void setComponentVariants(ProductVariantConnection componentVariants) {
    this.componentVariants = componentVariants;
  }

  /**
   * The number of component variants for the product component.
   */
  public Count getComponentVariantsCount() {
    return componentVariantsCount;
  }

  public void setComponentVariantsCount(Count componentVariantsCount) {
    this.componentVariantsCount = componentVariantsCount;
  }

  /**
   * The options in the parent and the component options they're connected to, along with the chosen option values
   * that appear in the bundle.
   */
  public List<ProductBundleComponentOptionSelection> getOptionSelections() {
    return optionSelections;
  }

  public void setOptionSelections(List<ProductBundleComponentOptionSelection> optionSelections) {
    this.optionSelections = optionSelections;
  }

  /**
   * The quantity of the component product set for this bundle line.
   * It will be null if there's a quantityOption present.
   */
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   * The quantity as option of the component product. It will be null if there's a quantity set.
   */
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
    /**
     * The product that's related as a component.
     */
    private Product componentProduct;

    /**
     * The list of products' variants that are components.
     */
    private ProductVariantConnection componentVariants;

    /**
     * The number of component variants for the product component.
     */
    private Count componentVariantsCount;

    /**
     * The options in the parent and the component options they're connected to, along with the chosen option values
     * that appear in the bundle.
     */
    private List<ProductBundleComponentOptionSelection> optionSelections;

    /**
     * The quantity of the component product set for this bundle line.
     * It will be null if there's a quantityOption present.
     */
    private Integer quantity;

    /**
     * The quantity as option of the component product. It will be null if there's a quantity set.
     */
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

    /**
     * The product that's related as a component.
     */
    public Builder componentProduct(Product componentProduct) {
      this.componentProduct = componentProduct;
      return this;
    }

    /**
     * The list of products' variants that are components.
     */
    public Builder componentVariants(ProductVariantConnection componentVariants) {
      this.componentVariants = componentVariants;
      return this;
    }

    /**
     * The number of component variants for the product component.
     */
    public Builder componentVariantsCount(Count componentVariantsCount) {
      this.componentVariantsCount = componentVariantsCount;
      return this;
    }

    /**
     * The options in the parent and the component options they're connected to, along with the chosen option values
     * that appear in the bundle.
     */
    public Builder optionSelections(List<ProductBundleComponentOptionSelection> optionSelections) {
      this.optionSelections = optionSelections;
      return this;
    }

    /**
     * The quantity of the component product set for this bundle line.
     * It will be null if there's a quantityOption present.
     */
    public Builder quantity(Integer quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The quantity as option of the component product. It will be null if there's a quantity set.
     */
    public Builder quantityOption(ProductBundleComponentQuantityOption quantityOption) {
      this.quantityOption = quantityOption;
      return this;
    }
  }
}
