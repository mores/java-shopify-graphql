package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a condition that determines which products are excluded
 * from a collection. Exactly one condition type must be provided.
 */
public class CollectionSourceExclusionConditionInput {
  /**
   * A condition based on product tags.
   */
  private CollectionSourceExclusionConditionProductTagInput productTag;

  /**
   * A condition based on product types.
   */
  private CollectionSourceExclusionConditionProductTypeInput productType;

  /**
   * A condition based on product vendors.
   */
  private CollectionSourceExclusionConditionProductVendorInput productVendor;

  /**
   * A condition based on product categories.
   */
  private CollectionSourceExclusionConditionProductCategoryInput productCategory;

  /**
   * A condition based on collections.
   */
  private CollectionSourceExclusionConditionCollectionInput collection;

  public CollectionSourceExclusionConditionInput() {
  }

  /**
   * A condition based on product tags.
   */
  public CollectionSourceExclusionConditionProductTagInput getProductTag() {
    return productTag;
  }

  public void setProductTag(CollectionSourceExclusionConditionProductTagInput productTag) {
    this.productTag = productTag;
  }

  /**
   * A condition based on product types.
   */
  public CollectionSourceExclusionConditionProductTypeInput getProductType() {
    return productType;
  }

  public void setProductType(CollectionSourceExclusionConditionProductTypeInput productType) {
    this.productType = productType;
  }

  /**
   * A condition based on product vendors.
   */
  public CollectionSourceExclusionConditionProductVendorInput getProductVendor() {
    return productVendor;
  }

  public void setProductVendor(CollectionSourceExclusionConditionProductVendorInput productVendor) {
    this.productVendor = productVendor;
  }

  /**
   * A condition based on product categories.
   */
  public CollectionSourceExclusionConditionProductCategoryInput getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(
      CollectionSourceExclusionConditionProductCategoryInput productCategory) {
    this.productCategory = productCategory;
  }

  /**
   * A condition based on collections.
   */
  public CollectionSourceExclusionConditionCollectionInput getCollection() {
    return collection;
  }

  public void setCollection(CollectionSourceExclusionConditionCollectionInput collection) {
    this.collection = collection;
  }

  @Override
  public String toString() {
    return "CollectionSourceExclusionConditionInput{productTag='" + productTag + "', productType='" + productType + "', productVendor='" + productVendor + "', productCategory='" + productCategory + "', collection='" + collection + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceExclusionConditionInput that = (CollectionSourceExclusionConditionInput) o;
    return Objects.equals(productTag, that.productTag) &&
        Objects.equals(productType, that.productType) &&
        Objects.equals(productVendor, that.productVendor) &&
        Objects.equals(productCategory, that.productCategory) &&
        Objects.equals(collection, that.collection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productTag, productType, productVendor, productCategory, collection);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A condition based on product tags.
     */
    private CollectionSourceExclusionConditionProductTagInput productTag;

    /**
     * A condition based on product types.
     */
    private CollectionSourceExclusionConditionProductTypeInput productType;

    /**
     * A condition based on product vendors.
     */
    private CollectionSourceExclusionConditionProductVendorInput productVendor;

    /**
     * A condition based on product categories.
     */
    private CollectionSourceExclusionConditionProductCategoryInput productCategory;

    /**
     * A condition based on collections.
     */
    private CollectionSourceExclusionConditionCollectionInput collection;

    public CollectionSourceExclusionConditionInput build() {
      CollectionSourceExclusionConditionInput result = new CollectionSourceExclusionConditionInput();
      result.productTag = this.productTag;
      result.productType = this.productType;
      result.productVendor = this.productVendor;
      result.productCategory = this.productCategory;
      result.collection = this.collection;
      return result;
    }

    /**
     * A condition based on product tags.
     */
    public Builder productTag(CollectionSourceExclusionConditionProductTagInput productTag) {
      this.productTag = productTag;
      return this;
    }

    /**
     * A condition based on product types.
     */
    public Builder productType(CollectionSourceExclusionConditionProductTypeInput productType) {
      this.productType = productType;
      return this;
    }

    /**
     * A condition based on product vendors.
     */
    public Builder productVendor(
        CollectionSourceExclusionConditionProductVendorInput productVendor) {
      this.productVendor = productVendor;
      return this;
    }

    /**
     * A condition based on product categories.
     */
    public Builder productCategory(
        CollectionSourceExclusionConditionProductCategoryInput productCategory) {
      this.productCategory = productCategory;
      return this;
    }

    /**
     * A condition based on collections.
     */
    public Builder collection(CollectionSourceExclusionConditionCollectionInput collection) {
      this.collection = collection;
      return this;
    }
  }
}
