package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A condition that determines which products are included in a collection.
 *
 * Available condition types, grouped by what they filter on:
 *
 * - **Product attributes**: `productTag`, `productTitle`, `productType`, `productVendor`, `productStatus`,
 * `productCategory`.
 * - **Variant attributes**: `variantTitle`, `variantPrice`, `variantCompareAtPrice`, `variantInventory`,
 * `variantWeight`.
 * - **Pricing**: `isPriceReduced`.
 * - **Metafields**: `metafieldBoolean`, `metafieldDecimal`, `metafieldString`, `metafieldStringList`,
 * `metafieldMetaobject`, `metafieldMetaobjectList`, and either `metafieldInteger` or `metafieldInt` for
 * integer metafields. Use `metafieldInteger` before API version 2026-10 and `metafieldInt` from 2026-10
 * onward. `metafieldInteger` is deprecated as of 2026-10 and removed as of 2027-01.
 *
 * Each condition type specifies its own `relation` (for example, `EQUALS`, `CONTAINS`, `TAGGED_WITH`) and
 * value shape. Combine multiple conditions in a single source's `inclusion.conditions` list and use the
 * source's `matchType` to require that products match `ANY` or `ALL` of them.
 */
public class CollectionSourceInclusionConditionInput {
  /**
   * A condition based on product tags.
   */
  private CollectionSourceInclusionConditionProductTagInput productTag;

  /**
   * A condition based on product titles.
   */
  private CollectionSourceInclusionConditionProductTitleInput productTitle;

  /**
   * A condition based on product categories.
   */
  private CollectionSourceInclusionConditionProductCategoryInput productCategory;

  /**
   * A condition based on product types.
   */
  private CollectionSourceInclusionConditionProductTypeInput productType;

  /**
   * A condition based on product vendors.
   */
  private CollectionSourceInclusionConditionProductVendorInput productVendor;

  /**
   * A condition based on product status.
   */
  private CollectionSourceInclusionConditionProductStatusInput productStatus;

  /**
   * A condition based on variant titles.
   */
  private CollectionSourceInclusionConditionVariantTitleInput variantTitle;

  /**
   * A condition based on variant prices.
   */
  private CollectionSourceInclusionConditionVariantPriceInput variantPrice;

  /**
   * A condition based on variant compare at prices.
   */
  private CollectionSourceInclusionConditionVariantCompareAtPriceInput variantCompareAtPrice;

  /**
   * A condition based on variant inventory quantities.
   */
  private CollectionSourceInclusionConditionVariantInventoryInput variantInventory;

  /**
   * A condition based on variant weights.
   */
  private CollectionSourceInclusionConditionVariantWeightInput variantWeight;

  /**
   * A condition based on boolean metafield values.
   */
  private CollectionSourceInclusionConditionMetafieldBooleanInput metafieldBoolean;

  /**
   * A condition based on integer metafield values.
   */
  private CollectionSourceInclusionConditionMetafieldIntInput metafieldInt;

  /**
   * A condition based on decimal metafield values.
   */
  private CollectionSourceInclusionConditionMetafieldDecimalInput metafieldDecimal;

  /**
   * A condition based on string metafield values.
   */
  private CollectionSourceInclusionConditionMetafieldStringInput metafieldString;

  /**
   * A condition based on string list metafield values.
   */
  private CollectionSourceInclusionConditionMetafieldStringListInput metafieldStringList;

  /**
   * A condition based on single metaobject reference metafield values.
   */
  private CollectionSourceInclusionConditionMetafieldMetaobjectInput metafieldMetaobject;

  /**
   * A condition based on metaobject list reference metafield values.
   */
  private CollectionSourceInclusionConditionMetafieldMetaobjectListInput metafieldMetaobjectList;

  public CollectionSourceInclusionConditionInput() {
  }

  /**
   * A condition based on product tags.
   */
  public CollectionSourceInclusionConditionProductTagInput getProductTag() {
    return productTag;
  }

  public void setProductTag(CollectionSourceInclusionConditionProductTagInput productTag) {
    this.productTag = productTag;
  }

  /**
   * A condition based on product titles.
   */
  public CollectionSourceInclusionConditionProductTitleInput getProductTitle() {
    return productTitle;
  }

  public void setProductTitle(CollectionSourceInclusionConditionProductTitleInput productTitle) {
    this.productTitle = productTitle;
  }

  /**
   * A condition based on product categories.
   */
  public CollectionSourceInclusionConditionProductCategoryInput getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(
      CollectionSourceInclusionConditionProductCategoryInput productCategory) {
    this.productCategory = productCategory;
  }

  /**
   * A condition based on product types.
   */
  public CollectionSourceInclusionConditionProductTypeInput getProductType() {
    return productType;
  }

  public void setProductType(CollectionSourceInclusionConditionProductTypeInput productType) {
    this.productType = productType;
  }

  /**
   * A condition based on product vendors.
   */
  public CollectionSourceInclusionConditionProductVendorInput getProductVendor() {
    return productVendor;
  }

  public void setProductVendor(CollectionSourceInclusionConditionProductVendorInput productVendor) {
    this.productVendor = productVendor;
  }

  /**
   * A condition based on product status.
   */
  public CollectionSourceInclusionConditionProductStatusInput getProductStatus() {
    return productStatus;
  }

  public void setProductStatus(CollectionSourceInclusionConditionProductStatusInput productStatus) {
    this.productStatus = productStatus;
  }

  /**
   * A condition based on variant titles.
   */
  public CollectionSourceInclusionConditionVariantTitleInput getVariantTitle() {
    return variantTitle;
  }

  public void setVariantTitle(CollectionSourceInclusionConditionVariantTitleInput variantTitle) {
    this.variantTitle = variantTitle;
  }

  /**
   * A condition based on variant prices.
   */
  public CollectionSourceInclusionConditionVariantPriceInput getVariantPrice() {
    return variantPrice;
  }

  public void setVariantPrice(CollectionSourceInclusionConditionVariantPriceInput variantPrice) {
    this.variantPrice = variantPrice;
  }

  /**
   * A condition based on variant compare at prices.
   */
  public CollectionSourceInclusionConditionVariantCompareAtPriceInput getVariantCompareAtPrice() {
    return variantCompareAtPrice;
  }

  public void setVariantCompareAtPrice(
      CollectionSourceInclusionConditionVariantCompareAtPriceInput variantCompareAtPrice) {
    this.variantCompareAtPrice = variantCompareAtPrice;
  }

  /**
   * A condition based on variant inventory quantities.
   */
  public CollectionSourceInclusionConditionVariantInventoryInput getVariantInventory() {
    return variantInventory;
  }

  public void setVariantInventory(
      CollectionSourceInclusionConditionVariantInventoryInput variantInventory) {
    this.variantInventory = variantInventory;
  }

  /**
   * A condition based on variant weights.
   */
  public CollectionSourceInclusionConditionVariantWeightInput getVariantWeight() {
    return variantWeight;
  }

  public void setVariantWeight(CollectionSourceInclusionConditionVariantWeightInput variantWeight) {
    this.variantWeight = variantWeight;
  }

  /**
   * A condition based on boolean metafield values.
   */
  public CollectionSourceInclusionConditionMetafieldBooleanInput getMetafieldBoolean() {
    return metafieldBoolean;
  }

  public void setMetafieldBoolean(
      CollectionSourceInclusionConditionMetafieldBooleanInput metafieldBoolean) {
    this.metafieldBoolean = metafieldBoolean;
  }

  /**
   * A condition based on integer metafield values.
   */
  public CollectionSourceInclusionConditionMetafieldIntInput getMetafieldInt() {
    return metafieldInt;
  }

  public void setMetafieldInt(CollectionSourceInclusionConditionMetafieldIntInput metafieldInt) {
    this.metafieldInt = metafieldInt;
  }

  /**
   * A condition based on decimal metafield values.
   */
  public CollectionSourceInclusionConditionMetafieldDecimalInput getMetafieldDecimal() {
    return metafieldDecimal;
  }

  public void setMetafieldDecimal(
      CollectionSourceInclusionConditionMetafieldDecimalInput metafieldDecimal) {
    this.metafieldDecimal = metafieldDecimal;
  }

  /**
   * A condition based on string metafield values.
   */
  public CollectionSourceInclusionConditionMetafieldStringInput getMetafieldString() {
    return metafieldString;
  }

  public void setMetafieldString(
      CollectionSourceInclusionConditionMetafieldStringInput metafieldString) {
    this.metafieldString = metafieldString;
  }

  /**
   * A condition based on string list metafield values.
   */
  public CollectionSourceInclusionConditionMetafieldStringListInput getMetafieldStringList() {
    return metafieldStringList;
  }

  public void setMetafieldStringList(
      CollectionSourceInclusionConditionMetafieldStringListInput metafieldStringList) {
    this.metafieldStringList = metafieldStringList;
  }

  /**
   * A condition based on single metaobject reference metafield values.
   */
  public CollectionSourceInclusionConditionMetafieldMetaobjectInput getMetafieldMetaobject() {
    return metafieldMetaobject;
  }

  public void setMetafieldMetaobject(
      CollectionSourceInclusionConditionMetafieldMetaobjectInput metafieldMetaobject) {
    this.metafieldMetaobject = metafieldMetaobject;
  }

  /**
   * A condition based on metaobject list reference metafield values.
   */
  public CollectionSourceInclusionConditionMetafieldMetaobjectListInput getMetafieldMetaobjectList(
      ) {
    return metafieldMetaobjectList;
  }

  public void setMetafieldMetaobjectList(
      CollectionSourceInclusionConditionMetafieldMetaobjectListInput metafieldMetaobjectList) {
    this.metafieldMetaobjectList = metafieldMetaobjectList;
  }

  @Override
  public String toString() {
    return "CollectionSourceInclusionConditionInput{productTag='" + productTag + "', productTitle='" + productTitle + "', productCategory='" + productCategory + "', productType='" + productType + "', productVendor='" + productVendor + "', productStatus='" + productStatus + "', variantTitle='" + variantTitle + "', variantPrice='" + variantPrice + "', variantCompareAtPrice='" + variantCompareAtPrice + "', variantInventory='" + variantInventory + "', variantWeight='" + variantWeight + "', metafieldBoolean='" + metafieldBoolean + "', metafieldInt='" + metafieldInt + "', metafieldDecimal='" + metafieldDecimal + "', metafieldString='" + metafieldString + "', metafieldStringList='" + metafieldStringList + "', metafieldMetaobject='" + metafieldMetaobject + "', metafieldMetaobjectList='" + metafieldMetaobjectList + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceInclusionConditionInput that = (CollectionSourceInclusionConditionInput) o;
    return Objects.equals(productTag, that.productTag) &&
        Objects.equals(productTitle, that.productTitle) &&
        Objects.equals(productCategory, that.productCategory) &&
        Objects.equals(productType, that.productType) &&
        Objects.equals(productVendor, that.productVendor) &&
        Objects.equals(productStatus, that.productStatus) &&
        Objects.equals(variantTitle, that.variantTitle) &&
        Objects.equals(variantPrice, that.variantPrice) &&
        Objects.equals(variantCompareAtPrice, that.variantCompareAtPrice) &&
        Objects.equals(variantInventory, that.variantInventory) &&
        Objects.equals(variantWeight, that.variantWeight) &&
        Objects.equals(metafieldBoolean, that.metafieldBoolean) &&
        Objects.equals(metafieldInt, that.metafieldInt) &&
        Objects.equals(metafieldDecimal, that.metafieldDecimal) &&
        Objects.equals(metafieldString, that.metafieldString) &&
        Objects.equals(metafieldStringList, that.metafieldStringList) &&
        Objects.equals(metafieldMetaobject, that.metafieldMetaobject) &&
        Objects.equals(metafieldMetaobjectList, that.metafieldMetaobjectList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productTag, productTitle, productCategory, productType, productVendor, productStatus, variantTitle, variantPrice, variantCompareAtPrice, variantInventory, variantWeight, metafieldBoolean, metafieldInt, metafieldDecimal, metafieldString, metafieldStringList, metafieldMetaobject, metafieldMetaobjectList);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A condition based on product tags.
     */
    private CollectionSourceInclusionConditionProductTagInput productTag;

    /**
     * A condition based on product titles.
     */
    private CollectionSourceInclusionConditionProductTitleInput productTitle;

    /**
     * A condition based on product categories.
     */
    private CollectionSourceInclusionConditionProductCategoryInput productCategory;

    /**
     * A condition based on product types.
     */
    private CollectionSourceInclusionConditionProductTypeInput productType;

    /**
     * A condition based on product vendors.
     */
    private CollectionSourceInclusionConditionProductVendorInput productVendor;

    /**
     * A condition based on product status.
     */
    private CollectionSourceInclusionConditionProductStatusInput productStatus;

    /**
     * A condition based on variant titles.
     */
    private CollectionSourceInclusionConditionVariantTitleInput variantTitle;

    /**
     * A condition based on variant prices.
     */
    private CollectionSourceInclusionConditionVariantPriceInput variantPrice;

    /**
     * A condition based on variant compare at prices.
     */
    private CollectionSourceInclusionConditionVariantCompareAtPriceInput variantCompareAtPrice;

    /**
     * A condition based on variant inventory quantities.
     */
    private CollectionSourceInclusionConditionVariantInventoryInput variantInventory;

    /**
     * A condition based on variant weights.
     */
    private CollectionSourceInclusionConditionVariantWeightInput variantWeight;

    /**
     * A condition based on boolean metafield values.
     */
    private CollectionSourceInclusionConditionMetafieldBooleanInput metafieldBoolean;

    /**
     * A condition based on integer metafield values.
     */
    private CollectionSourceInclusionConditionMetafieldIntInput metafieldInt;

    /**
     * A condition based on decimal metafield values.
     */
    private CollectionSourceInclusionConditionMetafieldDecimalInput metafieldDecimal;

    /**
     * A condition based on string metafield values.
     */
    private CollectionSourceInclusionConditionMetafieldStringInput metafieldString;

    /**
     * A condition based on string list metafield values.
     */
    private CollectionSourceInclusionConditionMetafieldStringListInput metafieldStringList;

    /**
     * A condition based on single metaobject reference metafield values.
     */
    private CollectionSourceInclusionConditionMetafieldMetaobjectInput metafieldMetaobject;

    /**
     * A condition based on metaobject list reference metafield values.
     */
    private CollectionSourceInclusionConditionMetafieldMetaobjectListInput metafieldMetaobjectList;

    public CollectionSourceInclusionConditionInput build() {
      CollectionSourceInclusionConditionInput result = new CollectionSourceInclusionConditionInput();
      result.productTag = this.productTag;
      result.productTitle = this.productTitle;
      result.productCategory = this.productCategory;
      result.productType = this.productType;
      result.productVendor = this.productVendor;
      result.productStatus = this.productStatus;
      result.variantTitle = this.variantTitle;
      result.variantPrice = this.variantPrice;
      result.variantCompareAtPrice = this.variantCompareAtPrice;
      result.variantInventory = this.variantInventory;
      result.variantWeight = this.variantWeight;
      result.metafieldBoolean = this.metafieldBoolean;
      result.metafieldInt = this.metafieldInt;
      result.metafieldDecimal = this.metafieldDecimal;
      result.metafieldString = this.metafieldString;
      result.metafieldStringList = this.metafieldStringList;
      result.metafieldMetaobject = this.metafieldMetaobject;
      result.metafieldMetaobjectList = this.metafieldMetaobjectList;
      return result;
    }

    /**
     * A condition based on product tags.
     */
    public Builder productTag(CollectionSourceInclusionConditionProductTagInput productTag) {
      this.productTag = productTag;
      return this;
    }

    /**
     * A condition based on product titles.
     */
    public Builder productTitle(CollectionSourceInclusionConditionProductTitleInput productTitle) {
      this.productTitle = productTitle;
      return this;
    }

    /**
     * A condition based on product categories.
     */
    public Builder productCategory(
        CollectionSourceInclusionConditionProductCategoryInput productCategory) {
      this.productCategory = productCategory;
      return this;
    }

    /**
     * A condition based on product types.
     */
    public Builder productType(CollectionSourceInclusionConditionProductTypeInput productType) {
      this.productType = productType;
      return this;
    }

    /**
     * A condition based on product vendors.
     */
    public Builder productVendor(
        CollectionSourceInclusionConditionProductVendorInput productVendor) {
      this.productVendor = productVendor;
      return this;
    }

    /**
     * A condition based on product status.
     */
    public Builder productStatus(
        CollectionSourceInclusionConditionProductStatusInput productStatus) {
      this.productStatus = productStatus;
      return this;
    }

    /**
     * A condition based on variant titles.
     */
    public Builder variantTitle(CollectionSourceInclusionConditionVariantTitleInput variantTitle) {
      this.variantTitle = variantTitle;
      return this;
    }

    /**
     * A condition based on variant prices.
     */
    public Builder variantPrice(CollectionSourceInclusionConditionVariantPriceInput variantPrice) {
      this.variantPrice = variantPrice;
      return this;
    }

    /**
     * A condition based on variant compare at prices.
     */
    public Builder variantCompareAtPrice(
        CollectionSourceInclusionConditionVariantCompareAtPriceInput variantCompareAtPrice) {
      this.variantCompareAtPrice = variantCompareAtPrice;
      return this;
    }

    /**
     * A condition based on variant inventory quantities.
     */
    public Builder variantInventory(
        CollectionSourceInclusionConditionVariantInventoryInput variantInventory) {
      this.variantInventory = variantInventory;
      return this;
    }

    /**
     * A condition based on variant weights.
     */
    public Builder variantWeight(
        CollectionSourceInclusionConditionVariantWeightInput variantWeight) {
      this.variantWeight = variantWeight;
      return this;
    }

    /**
     * A condition based on boolean metafield values.
     */
    public Builder metafieldBoolean(
        CollectionSourceInclusionConditionMetafieldBooleanInput metafieldBoolean) {
      this.metafieldBoolean = metafieldBoolean;
      return this;
    }

    /**
     * A condition based on integer metafield values.
     */
    public Builder metafieldInt(CollectionSourceInclusionConditionMetafieldIntInput metafieldInt) {
      this.metafieldInt = metafieldInt;
      return this;
    }

    /**
     * A condition based on decimal metafield values.
     */
    public Builder metafieldDecimal(
        CollectionSourceInclusionConditionMetafieldDecimalInput metafieldDecimal) {
      this.metafieldDecimal = metafieldDecimal;
      return this;
    }

    /**
     * A condition based on string metafield values.
     */
    public Builder metafieldString(
        CollectionSourceInclusionConditionMetafieldStringInput metafieldString) {
      this.metafieldString = metafieldString;
      return this;
    }

    /**
     * A condition based on string list metafield values.
     */
    public Builder metafieldStringList(
        CollectionSourceInclusionConditionMetafieldStringListInput metafieldStringList) {
      this.metafieldStringList = metafieldStringList;
      return this;
    }

    /**
     * A condition based on single metaobject reference metafield values.
     */
    public Builder metafieldMetaobject(
        CollectionSourceInclusionConditionMetafieldMetaobjectInput metafieldMetaobject) {
      this.metafieldMetaobject = metafieldMetaobject;
      return this;
    }

    /**
     * A condition based on metaobject list reference metafield values.
     */
    public Builder metafieldMetaobjectList(
        CollectionSourceInclusionConditionMetafieldMetaobjectListInput metafieldMetaobjectList) {
      this.metafieldMetaobjectList = metafieldMetaobjectList;
      return this;
    }
  }
}
