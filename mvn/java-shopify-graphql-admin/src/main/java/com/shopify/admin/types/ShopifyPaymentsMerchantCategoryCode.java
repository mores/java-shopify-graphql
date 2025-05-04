package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A MerchantCategoryCode (MCC) is a four-digit number listed in ISO 18245 for
 * retail financial services and used to classify the business by the type of goods
 * or services it provides.
 */
public class ShopifyPaymentsMerchantCategoryCode {
  /**
   * The category of the MCC.
   */
  private String category;

  /**
   * The category label of the MCC.
   */
  private String categoryLabel;

  /**
   * A four-digit number listed in ISO 18245.
   */
  private int code;

  /**
   * The ID of the MCC.
   */
  private int id;

  /**
   * The subcategory label of the MCC.
   */
  private String subcategoryLabel;

  public ShopifyPaymentsMerchantCategoryCode() {
  }

  /**
   * The category of the MCC.
   */
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * The category label of the MCC.
   */
  public String getCategoryLabel() {
    return categoryLabel;
  }

  public void setCategoryLabel(String categoryLabel) {
    this.categoryLabel = categoryLabel;
  }

  /**
   * A four-digit number listed in ISO 18245.
   */
  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  /**
   * The ID of the MCC.
   */
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  /**
   * The subcategory label of the MCC.
   */
  public String getSubcategoryLabel() {
    return subcategoryLabel;
  }

  public void setSubcategoryLabel(String subcategoryLabel) {
    this.subcategoryLabel = subcategoryLabel;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsMerchantCategoryCode{category='" + category + "', categoryLabel='" + categoryLabel + "', code='" + code + "', id='" + id + "', subcategoryLabel='" + subcategoryLabel + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsMerchantCategoryCode that = (ShopifyPaymentsMerchantCategoryCode) o;
    return Objects.equals(category, that.category) &&
        Objects.equals(categoryLabel, that.categoryLabel) &&
        code == that.code &&
        id == that.id &&
        Objects.equals(subcategoryLabel, that.subcategoryLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, categoryLabel, code, id, subcategoryLabel);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The category of the MCC.
     */
    private String category;

    /**
     * The category label of the MCC.
     */
    private String categoryLabel;

    /**
     * A four-digit number listed in ISO 18245.
     */
    private int code;

    /**
     * The ID of the MCC.
     */
    private int id;

    /**
     * The subcategory label of the MCC.
     */
    private String subcategoryLabel;

    public ShopifyPaymentsMerchantCategoryCode build() {
      ShopifyPaymentsMerchantCategoryCode result = new ShopifyPaymentsMerchantCategoryCode();
      result.category = this.category;
      result.categoryLabel = this.categoryLabel;
      result.code = this.code;
      result.id = this.id;
      result.subcategoryLabel = this.subcategoryLabel;
      return result;
    }

    /**
     * The category of the MCC.
     */
    public Builder category(String category) {
      this.category = category;
      return this;
    }

    /**
     * The category label of the MCC.
     */
    public Builder categoryLabel(String categoryLabel) {
      this.categoryLabel = categoryLabel;
      return this;
    }

    /**
     * A four-digit number listed in ISO 18245.
     */
    public Builder code(int code) {
      this.code = code;
      return this;
    }

    /**
     * The ID of the MCC.
     */
    public Builder id(int id) {
      this.id = id;
      return this;
    }

    /**
     * The subcategory label of the MCC.
     */
    public Builder subcategoryLabel(String subcategoryLabel) {
      this.subcategoryLabel = subcategoryLabel;
      return this;
    }
  }
}
