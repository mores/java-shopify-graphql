package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for updating a composite product variant.
 */
public class ProductVariantRelationshipUpdateInput {
  /**
   * The product variant ID representing that which contains the relationships with other variants.
   */
  private String parentProductVariantId;

  /**
   * A product ID which contains product variants that have relationships with other variants.
   */
  private String parentProductId;

  /**
   * The product variants and associated quantitites to add to the product variant.
   */
  private List<ProductVariantGroupRelationshipInput> productVariantRelationshipsToCreate = null;

  /**
   * The product variants and associated quantitites to update in specified product variant.
   */
  private List<ProductVariantGroupRelationshipInput> productVariantRelationshipsToUpdate = null;

  /**
   * The bundle component product variants to be removed from the product variant.
   */
  private List<String> productVariantRelationshipsToRemove = null;

  /**
   * Whether to remove all components from the product variant. The default value is `false`.
   */
  private Boolean removeAllProductVariantRelationships = false;

  /**
   * Method in which to update the price of the parent product variant.
   */
  private PriceInput priceInput = null;

  public ProductVariantRelationshipUpdateInput() {
  }

  /**
   * The product variant ID representing that which contains the relationships with other variants.
   */
  public String getParentProductVariantId() {
    return parentProductVariantId;
  }

  public void setParentProductVariantId(String parentProductVariantId) {
    this.parentProductVariantId = parentProductVariantId;
  }

  /**
   * A product ID which contains product variants that have relationships with other variants.
   */
  public String getParentProductId() {
    return parentProductId;
  }

  public void setParentProductId(String parentProductId) {
    this.parentProductId = parentProductId;
  }

  /**
   * The product variants and associated quantitites to add to the product variant.
   */
  public List<ProductVariantGroupRelationshipInput> getProductVariantRelationshipsToCreate() {
    return productVariantRelationshipsToCreate;
  }

  public void setProductVariantRelationshipsToCreate(
      List<ProductVariantGroupRelationshipInput> productVariantRelationshipsToCreate) {
    this.productVariantRelationshipsToCreate = productVariantRelationshipsToCreate;
  }

  /**
   * The product variants and associated quantitites to update in specified product variant.
   */
  public List<ProductVariantGroupRelationshipInput> getProductVariantRelationshipsToUpdate() {
    return productVariantRelationshipsToUpdate;
  }

  public void setProductVariantRelationshipsToUpdate(
      List<ProductVariantGroupRelationshipInput> productVariantRelationshipsToUpdate) {
    this.productVariantRelationshipsToUpdate = productVariantRelationshipsToUpdate;
  }

  /**
   * The bundle component product variants to be removed from the product variant.
   */
  public List<String> getProductVariantRelationshipsToRemove() {
    return productVariantRelationshipsToRemove;
  }

  public void setProductVariantRelationshipsToRemove(
      List<String> productVariantRelationshipsToRemove) {
    this.productVariantRelationshipsToRemove = productVariantRelationshipsToRemove;
  }

  /**
   * Whether to remove all components from the product variant. The default value is `false`.
   */
  public Boolean getRemoveAllProductVariantRelationships() {
    return removeAllProductVariantRelationships;
  }

  public void setRemoveAllProductVariantRelationships(
      Boolean removeAllProductVariantRelationships) {
    this.removeAllProductVariantRelationships = removeAllProductVariantRelationships;
  }

  /**
   * Method in which to update the price of the parent product variant.
   */
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
    /**
     * The product variant ID representing that which contains the relationships with other variants.
     */
    private String parentProductVariantId;

    /**
     * A product ID which contains product variants that have relationships with other variants.
     */
    private String parentProductId;

    /**
     * The product variants and associated quantitites to add to the product variant.
     */
    private List<ProductVariantGroupRelationshipInput> productVariantRelationshipsToCreate = null;

    /**
     * The product variants and associated quantitites to update in specified product variant.
     */
    private List<ProductVariantGroupRelationshipInput> productVariantRelationshipsToUpdate = null;

    /**
     * The bundle component product variants to be removed from the product variant.
     */
    private List<String> productVariantRelationshipsToRemove = null;

    /**
     * Whether to remove all components from the product variant. The default value is `false`.
     */
    private Boolean removeAllProductVariantRelationships = false;

    /**
     * Method in which to update the price of the parent product variant.
     */
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

    /**
     * The product variant ID representing that which contains the relationships with other variants.
     */
    public Builder parentProductVariantId(String parentProductVariantId) {
      this.parentProductVariantId = parentProductVariantId;
      return this;
    }

    /**
     * A product ID which contains product variants that have relationships with other variants.
     */
    public Builder parentProductId(String parentProductId) {
      this.parentProductId = parentProductId;
      return this;
    }

    /**
     * The product variants and associated quantitites to add to the product variant.
     */
    public Builder productVariantRelationshipsToCreate(
        List<ProductVariantGroupRelationshipInput> productVariantRelationshipsToCreate) {
      this.productVariantRelationshipsToCreate = productVariantRelationshipsToCreate;
      return this;
    }

    /**
     * The product variants and associated quantitites to update in specified product variant.
     */
    public Builder productVariantRelationshipsToUpdate(
        List<ProductVariantGroupRelationshipInput> productVariantRelationshipsToUpdate) {
      this.productVariantRelationshipsToUpdate = productVariantRelationshipsToUpdate;
      return this;
    }

    /**
     * The bundle component product variants to be removed from the product variant.
     */
    public Builder productVariantRelationshipsToRemove(
        List<String> productVariantRelationshipsToRemove) {
      this.productVariantRelationshipsToRemove = productVariantRelationshipsToRemove;
      return this;
    }

    /**
     * Whether to remove all components from the product variant. The default value is `false`.
     */
    public Builder removeAllProductVariantRelationships(
        Boolean removeAllProductVariantRelationships) {
      this.removeAllProductVariantRelationships = removeAllProductVariantRelationships;
      return this;
    }

    /**
     * Method in which to update the price of the parent product variant.
     */
    public Builder priceInput(PriceInput priceInput) {
      this.priceInput = priceInput;
      return this;
    }
  }
}
