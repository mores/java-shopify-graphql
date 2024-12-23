package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for a single component related to a componentized product.
 */
public class ProductBundleComponentInput {
  /**
   * The quantity of the component product to add to the bundle product.
   */
  private Integer quantity;

  /**
   * The ID of the component product to add to the bundle product.
   */
  private String productId;

  /**
   * The options to use in the component product, and the values for the option.
   */
  private List<ProductBundleComponentOptionSelectionInput> optionSelections;

  /**
   * New option to be created on the bundle parent that enables the buyer to select different quantities for
   * this component (e.g. two-pack, three-pack). Can only be used if quantity isn't set.
   */
  private ProductBundleComponentQuantityOptionInput quantityOption;

  public ProductBundleComponentInput() {
  }

  /**
   * The quantity of the component product to add to the bundle product.
   */
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   * The ID of the component product to add to the bundle product.
   */
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  /**
   * The options to use in the component product, and the values for the option.
   */
  public List<ProductBundleComponentOptionSelectionInput> getOptionSelections() {
    return optionSelections;
  }

  public void setOptionSelections(
      List<ProductBundleComponentOptionSelectionInput> optionSelections) {
    this.optionSelections = optionSelections;
  }

  /**
   * New option to be created on the bundle parent that enables the buyer to select different quantities for
   * this component (e.g. two-pack, three-pack). Can only be used if quantity isn't set.
   */
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
    /**
     * The quantity of the component product to add to the bundle product.
     */
    private Integer quantity;

    /**
     * The ID of the component product to add to the bundle product.
     */
    private String productId;

    /**
     * The options to use in the component product, and the values for the option.
     */
    private List<ProductBundleComponentOptionSelectionInput> optionSelections;

    /**
     * New option to be created on the bundle parent that enables the buyer to select different quantities for
     * this component (e.g. two-pack, three-pack). Can only be used if quantity isn't set.
     */
    private ProductBundleComponentQuantityOptionInput quantityOption;

    public ProductBundleComponentInput build() {
      ProductBundleComponentInput result = new ProductBundleComponentInput();
      result.quantity = this.quantity;
      result.productId = this.productId;
      result.optionSelections = this.optionSelections;
      result.quantityOption = this.quantityOption;
      return result;
    }

    /**
     * The quantity of the component product to add to the bundle product.
     */
    public Builder quantity(Integer quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The ID of the component product to add to the bundle product.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    /**
     * The options to use in the component product, and the values for the option.
     */
    public Builder optionSelections(
        List<ProductBundleComponentOptionSelectionInput> optionSelections) {
      this.optionSelections = optionSelections;
      return this;
    }

    /**
     * New option to be created on the bundle parent that enables the buyer to select different quantities for
     * this component (e.g. two-pack, three-pack). Can only be used if quantity isn't set.
     */
    public Builder quantityOption(ProductBundleComponentQuantityOptionInput quantityOption) {
      this.quantityOption = quantityOption;
      return this;
    }
  }
}
