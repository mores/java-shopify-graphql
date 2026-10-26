package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating a condition that determines which products are
 * included in a collection. Exactly one condition type must be provided.
 */
public class CollectionSourceInclusionConditionUpdateInput {
  /**
   * An update to a condition based on product tags.
   */
  private CollectionSourceInclusionConditionUpdateProductTagInput productTag;

  /**
   * An update to a condition based on product titles.
   */
  private CollectionSourceInclusionConditionUpdateProductTitleInput productTitle;

  /**
   * An update to a condition based on product categories.
   */
  private CollectionSourceInclusionConditionUpdateProductCategoryInput productCategory;

  /**
   * An update to a condition based on product types.
   */
  private CollectionSourceInclusionConditionUpdateProductTypeInput productType;

  /**
   * An update to a condition based on product vendors.
   */
  private CollectionSourceInclusionConditionUpdateProductVendorInput productVendor;

  /**
   * An update to a condition based on product status.
   */
  private CollectionSourceInclusionConditionUpdateProductStatusInput productStatus;

  /**
   * An update to a condition based on variant titles.
   */
  private CollectionSourceInclusionConditionUpdateVariantTitleInput variantTitle;

  /**
   * An update to a condition based on variant prices.
   */
  private CollectionSourceInclusionConditionUpdateVariantPriceInput variantPrice;

  /**
   * An update to a condition based on variant compare at prices.
   */
  private CollectionSourceInclusionConditionUpdateVariantCompareAtPriceInput variantCompareAtPrice;

  /**
   * An update to a condition based on variant inventory quantities.
   */
  private CollectionSourceInclusionConditionUpdateVariantInventoryInput variantInventory;

  /**
   * An update to a condition based on variant weights.
   */
  private CollectionSourceInclusionConditionUpdateVariantWeightInput variantWeight;

  /**
   * An update to a condition based on boolean metafield values.
   */
  private CollectionSourceInclusionConditionUpdateMetafieldBooleanInput metafieldBoolean;

  /**
   * An update to a condition based on integer metafield values.
   */
  private CollectionSourceInclusionConditionUpdateMetafieldIntInput metafieldInt;

  /**
   * An update to a condition based on decimal metafield values.
   */
  private CollectionSourceInclusionConditionUpdateMetafieldDecimalInput metafieldDecimal;

  /**
   * An update to a condition based on string metafield values.
   */
  private CollectionSourceInclusionConditionUpdateMetafieldStringInput metafieldString;

  /**
   * An update to a condition based on string list metafield values.
   */
  private CollectionSourceInclusionConditionUpdateMetafieldStringListInput metafieldStringList;

  /**
   * An update to a condition based on single metaobject reference metafield values.
   */
  private CollectionSourceInclusionConditionUpdateMetafieldMetaobjectInput metafieldMetaobject;

  /**
   * An update to a condition based on metaobject list reference metafield values.
   */
  private CollectionSourceInclusionConditionUpdateMetafieldMetaobjectListInput metafieldMetaobjectList;

  public CollectionSourceInclusionConditionUpdateInput() {
  }

  /**
   * An update to a condition based on product tags.
   */
  public CollectionSourceInclusionConditionUpdateProductTagInput getProductTag() {
    return productTag;
  }

  public void setProductTag(CollectionSourceInclusionConditionUpdateProductTagInput productTag) {
    this.productTag = productTag;
  }

  /**
   * An update to a condition based on product titles.
   */
  public CollectionSourceInclusionConditionUpdateProductTitleInput getProductTitle() {
    return productTitle;
  }

  public void setProductTitle(
      CollectionSourceInclusionConditionUpdateProductTitleInput productTitle) {
    this.productTitle = productTitle;
  }

  /**
   * An update to a condition based on product categories.
   */
  public CollectionSourceInclusionConditionUpdateProductCategoryInput getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(
      CollectionSourceInclusionConditionUpdateProductCategoryInput productCategory) {
    this.productCategory = productCategory;
  }

  /**
   * An update to a condition based on product types.
   */
  public CollectionSourceInclusionConditionUpdateProductTypeInput getProductType() {
    return productType;
  }

  public void setProductType(CollectionSourceInclusionConditionUpdateProductTypeInput productType) {
    this.productType = productType;
  }

  /**
   * An update to a condition based on product vendors.
   */
  public CollectionSourceInclusionConditionUpdateProductVendorInput getProductVendor() {
    return productVendor;
  }

  public void setProductVendor(
      CollectionSourceInclusionConditionUpdateProductVendorInput productVendor) {
    this.productVendor = productVendor;
  }

  /**
   * An update to a condition based on product status.
   */
  public CollectionSourceInclusionConditionUpdateProductStatusInput getProductStatus() {
    return productStatus;
  }

  public void setProductStatus(
      CollectionSourceInclusionConditionUpdateProductStatusInput productStatus) {
    this.productStatus = productStatus;
  }

  /**
   * An update to a condition based on variant titles.
   */
  public CollectionSourceInclusionConditionUpdateVariantTitleInput getVariantTitle() {
    return variantTitle;
  }

  public void setVariantTitle(
      CollectionSourceInclusionConditionUpdateVariantTitleInput variantTitle) {
    this.variantTitle = variantTitle;
  }

  /**
   * An update to a condition based on variant prices.
   */
  public CollectionSourceInclusionConditionUpdateVariantPriceInput getVariantPrice() {
    return variantPrice;
  }

  public void setVariantPrice(
      CollectionSourceInclusionConditionUpdateVariantPriceInput variantPrice) {
    this.variantPrice = variantPrice;
  }

  /**
   * An update to a condition based on variant compare at prices.
   */
  public CollectionSourceInclusionConditionUpdateVariantCompareAtPriceInput getVariantCompareAtPrice(
      ) {
    return variantCompareAtPrice;
  }

  public void setVariantCompareAtPrice(
      CollectionSourceInclusionConditionUpdateVariantCompareAtPriceInput variantCompareAtPrice) {
    this.variantCompareAtPrice = variantCompareAtPrice;
  }

  /**
   * An update to a condition based on variant inventory quantities.
   */
  public CollectionSourceInclusionConditionUpdateVariantInventoryInput getVariantInventory() {
    return variantInventory;
  }

  public void setVariantInventory(
      CollectionSourceInclusionConditionUpdateVariantInventoryInput variantInventory) {
    this.variantInventory = variantInventory;
  }

  /**
   * An update to a condition based on variant weights.
   */
  public CollectionSourceInclusionConditionUpdateVariantWeightInput getVariantWeight() {
    return variantWeight;
  }

  public void setVariantWeight(
      CollectionSourceInclusionConditionUpdateVariantWeightInput variantWeight) {
    this.variantWeight = variantWeight;
  }

  /**
   * An update to a condition based on boolean metafield values.
   */
  public CollectionSourceInclusionConditionUpdateMetafieldBooleanInput getMetafieldBoolean() {
    return metafieldBoolean;
  }

  public void setMetafieldBoolean(
      CollectionSourceInclusionConditionUpdateMetafieldBooleanInput metafieldBoolean) {
    this.metafieldBoolean = metafieldBoolean;
  }

  /**
   * An update to a condition based on integer metafield values.
   */
  public CollectionSourceInclusionConditionUpdateMetafieldIntInput getMetafieldInt() {
    return metafieldInt;
  }

  public void setMetafieldInt(
      CollectionSourceInclusionConditionUpdateMetafieldIntInput metafieldInt) {
    this.metafieldInt = metafieldInt;
  }

  /**
   * An update to a condition based on decimal metafield values.
   */
  public CollectionSourceInclusionConditionUpdateMetafieldDecimalInput getMetafieldDecimal() {
    return metafieldDecimal;
  }

  public void setMetafieldDecimal(
      CollectionSourceInclusionConditionUpdateMetafieldDecimalInput metafieldDecimal) {
    this.metafieldDecimal = metafieldDecimal;
  }

  /**
   * An update to a condition based on string metafield values.
   */
  public CollectionSourceInclusionConditionUpdateMetafieldStringInput getMetafieldString() {
    return metafieldString;
  }

  public void setMetafieldString(
      CollectionSourceInclusionConditionUpdateMetafieldStringInput metafieldString) {
    this.metafieldString = metafieldString;
  }

  /**
   * An update to a condition based on string list metafield values.
   */
  public CollectionSourceInclusionConditionUpdateMetafieldStringListInput getMetafieldStringList() {
    return metafieldStringList;
  }

  public void setMetafieldStringList(
      CollectionSourceInclusionConditionUpdateMetafieldStringListInput metafieldStringList) {
    this.metafieldStringList = metafieldStringList;
  }

  /**
   * An update to a condition based on single metaobject reference metafield values.
   */
  public CollectionSourceInclusionConditionUpdateMetafieldMetaobjectInput getMetafieldMetaobject() {
    return metafieldMetaobject;
  }

  public void setMetafieldMetaobject(
      CollectionSourceInclusionConditionUpdateMetafieldMetaobjectInput metafieldMetaobject) {
    this.metafieldMetaobject = metafieldMetaobject;
  }

  /**
   * An update to a condition based on metaobject list reference metafield values.
   */
  public CollectionSourceInclusionConditionUpdateMetafieldMetaobjectListInput getMetafieldMetaobjectList(
      ) {
    return metafieldMetaobjectList;
  }

  public void setMetafieldMetaobjectList(
      CollectionSourceInclusionConditionUpdateMetafieldMetaobjectListInput metafieldMetaobjectList) {
    this.metafieldMetaobjectList = metafieldMetaobjectList;
  }

  @Override
  public String toString() {
    return "CollectionSourceInclusionConditionUpdateInput{productTag='" + productTag + "', productTitle='" + productTitle + "', productCategory='" + productCategory + "', productType='" + productType + "', productVendor='" + productVendor + "', productStatus='" + productStatus + "', variantTitle='" + variantTitle + "', variantPrice='" + variantPrice + "', variantCompareAtPrice='" + variantCompareAtPrice + "', variantInventory='" + variantInventory + "', variantWeight='" + variantWeight + "', metafieldBoolean='" + metafieldBoolean + "', metafieldInt='" + metafieldInt + "', metafieldDecimal='" + metafieldDecimal + "', metafieldString='" + metafieldString + "', metafieldStringList='" + metafieldStringList + "', metafieldMetaobject='" + metafieldMetaobject + "', metafieldMetaobjectList='" + metafieldMetaobjectList + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceInclusionConditionUpdateInput that = (CollectionSourceInclusionConditionUpdateInput) o;
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
     * An update to a condition based on product tags.
     */
    private CollectionSourceInclusionConditionUpdateProductTagInput productTag;

    /**
     * An update to a condition based on product titles.
     */
    private CollectionSourceInclusionConditionUpdateProductTitleInput productTitle;

    /**
     * An update to a condition based on product categories.
     */
    private CollectionSourceInclusionConditionUpdateProductCategoryInput productCategory;

    /**
     * An update to a condition based on product types.
     */
    private CollectionSourceInclusionConditionUpdateProductTypeInput productType;

    /**
     * An update to a condition based on product vendors.
     */
    private CollectionSourceInclusionConditionUpdateProductVendorInput productVendor;

    /**
     * An update to a condition based on product status.
     */
    private CollectionSourceInclusionConditionUpdateProductStatusInput productStatus;

    /**
     * An update to a condition based on variant titles.
     */
    private CollectionSourceInclusionConditionUpdateVariantTitleInput variantTitle;

    /**
     * An update to a condition based on variant prices.
     */
    private CollectionSourceInclusionConditionUpdateVariantPriceInput variantPrice;

    /**
     * An update to a condition based on variant compare at prices.
     */
    private CollectionSourceInclusionConditionUpdateVariantCompareAtPriceInput variantCompareAtPrice;

    /**
     * An update to a condition based on variant inventory quantities.
     */
    private CollectionSourceInclusionConditionUpdateVariantInventoryInput variantInventory;

    /**
     * An update to a condition based on variant weights.
     */
    private CollectionSourceInclusionConditionUpdateVariantWeightInput variantWeight;

    /**
     * An update to a condition based on boolean metafield values.
     */
    private CollectionSourceInclusionConditionUpdateMetafieldBooleanInput metafieldBoolean;

    /**
     * An update to a condition based on integer metafield values.
     */
    private CollectionSourceInclusionConditionUpdateMetafieldIntInput metafieldInt;

    /**
     * An update to a condition based on decimal metafield values.
     */
    private CollectionSourceInclusionConditionUpdateMetafieldDecimalInput metafieldDecimal;

    /**
     * An update to a condition based on string metafield values.
     */
    private CollectionSourceInclusionConditionUpdateMetafieldStringInput metafieldString;

    /**
     * An update to a condition based on string list metafield values.
     */
    private CollectionSourceInclusionConditionUpdateMetafieldStringListInput metafieldStringList;

    /**
     * An update to a condition based on single metaobject reference metafield values.
     */
    private CollectionSourceInclusionConditionUpdateMetafieldMetaobjectInput metafieldMetaobject;

    /**
     * An update to a condition based on metaobject list reference metafield values.
     */
    private CollectionSourceInclusionConditionUpdateMetafieldMetaobjectListInput metafieldMetaobjectList;

    public CollectionSourceInclusionConditionUpdateInput build() {
      CollectionSourceInclusionConditionUpdateInput result = new CollectionSourceInclusionConditionUpdateInput();
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
     * An update to a condition based on product tags.
     */
    public Builder productTag(CollectionSourceInclusionConditionUpdateProductTagInput productTag) {
      this.productTag = productTag;
      return this;
    }

    /**
     * An update to a condition based on product titles.
     */
    public Builder productTitle(
        CollectionSourceInclusionConditionUpdateProductTitleInput productTitle) {
      this.productTitle = productTitle;
      return this;
    }

    /**
     * An update to a condition based on product categories.
     */
    public Builder productCategory(
        CollectionSourceInclusionConditionUpdateProductCategoryInput productCategory) {
      this.productCategory = productCategory;
      return this;
    }

    /**
     * An update to a condition based on product types.
     */
    public Builder productType(
        CollectionSourceInclusionConditionUpdateProductTypeInput productType) {
      this.productType = productType;
      return this;
    }

    /**
     * An update to a condition based on product vendors.
     */
    public Builder productVendor(
        CollectionSourceInclusionConditionUpdateProductVendorInput productVendor) {
      this.productVendor = productVendor;
      return this;
    }

    /**
     * An update to a condition based on product status.
     */
    public Builder productStatus(
        CollectionSourceInclusionConditionUpdateProductStatusInput productStatus) {
      this.productStatus = productStatus;
      return this;
    }

    /**
     * An update to a condition based on variant titles.
     */
    public Builder variantTitle(
        CollectionSourceInclusionConditionUpdateVariantTitleInput variantTitle) {
      this.variantTitle = variantTitle;
      return this;
    }

    /**
     * An update to a condition based on variant prices.
     */
    public Builder variantPrice(
        CollectionSourceInclusionConditionUpdateVariantPriceInput variantPrice) {
      this.variantPrice = variantPrice;
      return this;
    }

    /**
     * An update to a condition based on variant compare at prices.
     */
    public Builder variantCompareAtPrice(
        CollectionSourceInclusionConditionUpdateVariantCompareAtPriceInput variantCompareAtPrice) {
      this.variantCompareAtPrice = variantCompareAtPrice;
      return this;
    }

    /**
     * An update to a condition based on variant inventory quantities.
     */
    public Builder variantInventory(
        CollectionSourceInclusionConditionUpdateVariantInventoryInput variantInventory) {
      this.variantInventory = variantInventory;
      return this;
    }

    /**
     * An update to a condition based on variant weights.
     */
    public Builder variantWeight(
        CollectionSourceInclusionConditionUpdateVariantWeightInput variantWeight) {
      this.variantWeight = variantWeight;
      return this;
    }

    /**
     * An update to a condition based on boolean metafield values.
     */
    public Builder metafieldBoolean(
        CollectionSourceInclusionConditionUpdateMetafieldBooleanInput metafieldBoolean) {
      this.metafieldBoolean = metafieldBoolean;
      return this;
    }

    /**
     * An update to a condition based on integer metafield values.
     */
    public Builder metafieldInt(
        CollectionSourceInclusionConditionUpdateMetafieldIntInput metafieldInt) {
      this.metafieldInt = metafieldInt;
      return this;
    }

    /**
     * An update to a condition based on decimal metafield values.
     */
    public Builder metafieldDecimal(
        CollectionSourceInclusionConditionUpdateMetafieldDecimalInput metafieldDecimal) {
      this.metafieldDecimal = metafieldDecimal;
      return this;
    }

    /**
     * An update to a condition based on string metafield values.
     */
    public Builder metafieldString(
        CollectionSourceInclusionConditionUpdateMetafieldStringInput metafieldString) {
      this.metafieldString = metafieldString;
      return this;
    }

    /**
     * An update to a condition based on string list metafield values.
     */
    public Builder metafieldStringList(
        CollectionSourceInclusionConditionUpdateMetafieldStringListInput metafieldStringList) {
      this.metafieldStringList = metafieldStringList;
      return this;
    }

    /**
     * An update to a condition based on single metaobject reference metafield values.
     */
    public Builder metafieldMetaobject(
        CollectionSourceInclusionConditionUpdateMetafieldMetaobjectInput metafieldMetaobject) {
      this.metafieldMetaobject = metafieldMetaobject;
      return this;
    }

    /**
     * An update to a condition based on metaobject list reference metafield values.
     */
    public Builder metafieldMetaobjectList(
        CollectionSourceInclusionConditionUpdateMetafieldMetaobjectListInput metafieldMetaobjectList) {
      this.metafieldMetaobjectList = metafieldMetaobjectList;
      return this;
    }
  }
}
