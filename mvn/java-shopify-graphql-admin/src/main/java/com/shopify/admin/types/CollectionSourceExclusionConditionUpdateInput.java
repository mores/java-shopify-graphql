package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating a condition that determines which products are
 * excluded from a collection. Exactly one condition type must be provided.
 */
public class CollectionSourceExclusionConditionUpdateInput {
  /**
   * An update to an exclusion condition based on product tags.
   */
  private CollectionSourceExclusionConditionUpdateProductTagInput productTag;

  /**
   * An update to an exclusion condition based on product types.
   */
  private CollectionSourceExclusionConditionUpdateProductTypeInput productType;

  /**
   * An update to an exclusion condition based on product vendors.
   */
  private CollectionSourceExclusionConditionUpdateProductVendorInput productVendor;

  /**
   * An update to an exclusion condition based on product categories.
   */
  private CollectionSourceExclusionConditionUpdateProductCategoryInput productCategory;

  /**
   * An update to an exclusion condition based on collections.
   */
  private CollectionSourceExclusionConditionUpdateCollectionInput collection;

  public CollectionSourceExclusionConditionUpdateInput() {
  }

  /**
   * An update to an exclusion condition based on product tags.
   */
  public CollectionSourceExclusionConditionUpdateProductTagInput getProductTag() {
    return productTag;
  }

  public void setProductTag(CollectionSourceExclusionConditionUpdateProductTagInput productTag) {
    this.productTag = productTag;
  }

  /**
   * An update to an exclusion condition based on product types.
   */
  public CollectionSourceExclusionConditionUpdateProductTypeInput getProductType() {
    return productType;
  }

  public void setProductType(CollectionSourceExclusionConditionUpdateProductTypeInput productType) {
    this.productType = productType;
  }

  /**
   * An update to an exclusion condition based on product vendors.
   */
  public CollectionSourceExclusionConditionUpdateProductVendorInput getProductVendor() {
    return productVendor;
  }

  public void setProductVendor(
      CollectionSourceExclusionConditionUpdateProductVendorInput productVendor) {
    this.productVendor = productVendor;
  }

  /**
   * An update to an exclusion condition based on product categories.
   */
  public CollectionSourceExclusionConditionUpdateProductCategoryInput getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(
      CollectionSourceExclusionConditionUpdateProductCategoryInput productCategory) {
    this.productCategory = productCategory;
  }

  /**
   * An update to an exclusion condition based on collections.
   */
  public CollectionSourceExclusionConditionUpdateCollectionInput getCollection() {
    return collection;
  }

  public void setCollection(CollectionSourceExclusionConditionUpdateCollectionInput collection) {
    this.collection = collection;
  }

  @Override
  public String toString() {
    return "CollectionSourceExclusionConditionUpdateInput{productTag='" + productTag + "', productType='" + productType + "', productVendor='" + productVendor + "', productCategory='" + productCategory + "', collection='" + collection + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceExclusionConditionUpdateInput that = (CollectionSourceExclusionConditionUpdateInput) o;
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
     * An update to an exclusion condition based on product tags.
     */
    private CollectionSourceExclusionConditionUpdateProductTagInput productTag;

    /**
     * An update to an exclusion condition based on product types.
     */
    private CollectionSourceExclusionConditionUpdateProductTypeInput productType;

    /**
     * An update to an exclusion condition based on product vendors.
     */
    private CollectionSourceExclusionConditionUpdateProductVendorInput productVendor;

    /**
     * An update to an exclusion condition based on product categories.
     */
    private CollectionSourceExclusionConditionUpdateProductCategoryInput productCategory;

    /**
     * An update to an exclusion condition based on collections.
     */
    private CollectionSourceExclusionConditionUpdateCollectionInput collection;

    public CollectionSourceExclusionConditionUpdateInput build() {
      CollectionSourceExclusionConditionUpdateInput result = new CollectionSourceExclusionConditionUpdateInput();
      result.productTag = this.productTag;
      result.productType = this.productType;
      result.productVendor = this.productVendor;
      result.productCategory = this.productCategory;
      result.collection = this.collection;
      return result;
    }

    /**
     * An update to an exclusion condition based on product tags.
     */
    public Builder productTag(CollectionSourceExclusionConditionUpdateProductTagInput productTag) {
      this.productTag = productTag;
      return this;
    }

    /**
     * An update to an exclusion condition based on product types.
     */
    public Builder productType(
        CollectionSourceExclusionConditionUpdateProductTypeInput productType) {
      this.productType = productType;
      return this;
    }

    /**
     * An update to an exclusion condition based on product vendors.
     */
    public Builder productVendor(
        CollectionSourceExclusionConditionUpdateProductVendorInput productVendor) {
      this.productVendor = productVendor;
      return this;
    }

    /**
     * An update to an exclusion condition based on product categories.
     */
    public Builder productCategory(
        CollectionSourceExclusionConditionUpdateProductCategoryInput productCategory) {
      this.productCategory = productCategory;
      return this;
    }

    /**
     * An update to an exclusion condition based on collections.
     */
    public Builder collection(CollectionSourceExclusionConditionUpdateCollectionInput collection) {
      this.collection = collection;
      return this;
    }
  }
}
