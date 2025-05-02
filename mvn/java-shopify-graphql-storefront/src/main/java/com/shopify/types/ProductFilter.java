package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a filter used to view a subset of products in a collection.
 * By default, the `available` and `price` filters are enabled. Filters are customized with the Shopify Search &amp; Discovery app.
 * Learn more about [customizing storefront filtering](https://help.shopify.com/manual/online-store/themes/customizing-themes/storefront-filters).
 */
public class ProductFilter {
  /**
   * Filter on if the product is available for sale.
   */
  private Boolean available;

  /**
   * A product category to filter on.
   */
  private CategoryFilter category;

  /**
   * A range of prices to filter with-in.
   */
  private PriceRangeFilter price;

  /**
   * A product metafield to filter on.
   */
  private MetafieldFilter productMetafield;

  /**
   * The product type to filter on.
   */
  private String productType;

  /**
   * The product vendor to filter on.
   */
  private String productVendor;

  /**
   * A product tag to filter on.
   */
  private String tag;

  /**
   * A standard product attribute metafield to filter on.
   */
  private TaxonomyMetafieldFilter taxonomyMetafield;

  /**
   * A variant metafield to filter on.
   */
  private MetafieldFilter variantMetafield;

  /**
   * A variant option to filter on.
   */
  private VariantOptionFilter variantOption;

  public ProductFilter() {
  }

  /**
   * Filter on if the product is available for sale.
   */
  public Boolean getAvailable() {
    return available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }

  /**
   * A product category to filter on.
   */
  public CategoryFilter getCategory() {
    return category;
  }

  public void setCategory(CategoryFilter category) {
    this.category = category;
  }

  /**
   * A range of prices to filter with-in.
   */
  public PriceRangeFilter getPrice() {
    return price;
  }

  public void setPrice(PriceRangeFilter price) {
    this.price = price;
  }

  /**
   * A product metafield to filter on.
   */
  public MetafieldFilter getProductMetafield() {
    return productMetafield;
  }

  public void setProductMetafield(MetafieldFilter productMetafield) {
    this.productMetafield = productMetafield;
  }

  /**
   * The product type to filter on.
   */
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  /**
   * The product vendor to filter on.
   */
  public String getProductVendor() {
    return productVendor;
  }

  public void setProductVendor(String productVendor) {
    this.productVendor = productVendor;
  }

  /**
   * A product tag to filter on.
   */
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  /**
   * A standard product attribute metafield to filter on.
   */
  public TaxonomyMetafieldFilter getTaxonomyMetafield() {
    return taxonomyMetafield;
  }

  public void setTaxonomyMetafield(TaxonomyMetafieldFilter taxonomyMetafield) {
    this.taxonomyMetafield = taxonomyMetafield;
  }

  /**
   * A variant metafield to filter on.
   */
  public MetafieldFilter getVariantMetafield() {
    return variantMetafield;
  }

  public void setVariantMetafield(MetafieldFilter variantMetafield) {
    this.variantMetafield = variantMetafield;
  }

  /**
   * A variant option to filter on.
   */
  public VariantOptionFilter getVariantOption() {
    return variantOption;
  }

  public void setVariantOption(VariantOptionFilter variantOption) {
    this.variantOption = variantOption;
  }

  @Override
  public String toString() {
    return "ProductFilter{available='" + available + "', category='" + category + "', price='" + price + "', productMetafield='" + productMetafield + "', productType='" + productType + "', productVendor='" + productVendor + "', tag='" + tag + "', taxonomyMetafield='" + taxonomyMetafield + "', variantMetafield='" + variantMetafield + "', variantOption='" + variantOption + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductFilter that = (ProductFilter) o;
    return Objects.equals(available, that.available) &&
        Objects.equals(category, that.category) &&
        Objects.equals(price, that.price) &&
        Objects.equals(productMetafield, that.productMetafield) &&
        Objects.equals(productType, that.productType) &&
        Objects.equals(productVendor, that.productVendor) &&
        Objects.equals(tag, that.tag) &&
        Objects.equals(taxonomyMetafield, that.taxonomyMetafield) &&
        Objects.equals(variantMetafield, that.variantMetafield) &&
        Objects.equals(variantOption, that.variantOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, category, price, productMetafield, productType, productVendor, tag, taxonomyMetafield, variantMetafield, variantOption);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Filter on if the product is available for sale.
     */
    private Boolean available;

    /**
     * A product category to filter on.
     */
    private CategoryFilter category;

    /**
     * A range of prices to filter with-in.
     */
    private PriceRangeFilter price;

    /**
     * A product metafield to filter on.
     */
    private MetafieldFilter productMetafield;

    /**
     * The product type to filter on.
     */
    private String productType;

    /**
     * The product vendor to filter on.
     */
    private String productVendor;

    /**
     * A product tag to filter on.
     */
    private String tag;

    /**
     * A standard product attribute metafield to filter on.
     */
    private TaxonomyMetafieldFilter taxonomyMetafield;

    /**
     * A variant metafield to filter on.
     */
    private MetafieldFilter variantMetafield;

    /**
     * A variant option to filter on.
     */
    private VariantOptionFilter variantOption;

    public ProductFilter build() {
      ProductFilter result = new ProductFilter();
      result.available = this.available;
      result.category = this.category;
      result.price = this.price;
      result.productMetafield = this.productMetafield;
      result.productType = this.productType;
      result.productVendor = this.productVendor;
      result.tag = this.tag;
      result.taxonomyMetafield = this.taxonomyMetafield;
      result.variantMetafield = this.variantMetafield;
      result.variantOption = this.variantOption;
      return result;
    }

    /**
     * Filter on if the product is available for sale.
     */
    public Builder available(Boolean available) {
      this.available = available;
      return this;
    }

    /**
     * A product category to filter on.
     */
    public Builder category(CategoryFilter category) {
      this.category = category;
      return this;
    }

    /**
     * A range of prices to filter with-in.
     */
    public Builder price(PriceRangeFilter price) {
      this.price = price;
      return this;
    }

    /**
     * A product metafield to filter on.
     */
    public Builder productMetafield(MetafieldFilter productMetafield) {
      this.productMetafield = productMetafield;
      return this;
    }

    /**
     * The product type to filter on.
     */
    public Builder productType(String productType) {
      this.productType = productType;
      return this;
    }

    /**
     * The product vendor to filter on.
     */
    public Builder productVendor(String productVendor) {
      this.productVendor = productVendor;
      return this;
    }

    /**
     * A product tag to filter on.
     */
    public Builder tag(String tag) {
      this.tag = tag;
      return this;
    }

    /**
     * A standard product attribute metafield to filter on.
     */
    public Builder taxonomyMetafield(TaxonomyMetafieldFilter taxonomyMetafield) {
      this.taxonomyMetafield = taxonomyMetafield;
      return this;
    }

    /**
     * A variant metafield to filter on.
     */
    public Builder variantMetafield(MetafieldFilter variantMetafield) {
      this.variantMetafield = variantMetafield;
      return this;
    }

    /**
     * A variant option to filter on.
     */
    public Builder variantOption(VariantOptionFilter variantOption) {
      this.variantOption = variantOption;
      return this;
    }
  }
}
