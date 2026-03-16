package com.shopify.storefront.types;

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
   * A variant option to filter on.
   */
  private VariantOptionFilter variantOption;

  /**
   * A product category to filter on.
   */
  private CategoryFilter category;

  /**
   * A standard product attribute metafield to filter on.
   */
  private TaxonomyMetafieldFilter taxonomyMetafield;

  /**
   * The product type to filter on.
   */
  private String productType;

  /**
   * The product vendor to filter on.
   */
  private String productVendor;

  /**
   * A range of prices to filter with-in.
   */
  private PriceRangeFilter price;

  /**
   * A product metafield to filter on.
   */
  private MetafieldFilter productMetafield;

  /**
   * A variant metafield to filter on.
   */
  private MetafieldFilter variantMetafield;

  /**
   * A product tag to filter on.
   */
  private String tag;

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
   * A variant option to filter on.
   */
  public VariantOptionFilter getVariantOption() {
    return variantOption;
  }

  public void setVariantOption(VariantOptionFilter variantOption) {
    this.variantOption = variantOption;
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
   * A standard product attribute metafield to filter on.
   */
  public TaxonomyMetafieldFilter getTaxonomyMetafield() {
    return taxonomyMetafield;
  }

  public void setTaxonomyMetafield(TaxonomyMetafieldFilter taxonomyMetafield) {
    this.taxonomyMetafield = taxonomyMetafield;
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
   * A variant metafield to filter on.
   */
  public MetafieldFilter getVariantMetafield() {
    return variantMetafield;
  }

  public void setVariantMetafield(MetafieldFilter variantMetafield) {
    this.variantMetafield = variantMetafield;
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

  @Override
  public String toString() {
    return "ProductFilter{available='" + available + "', variantOption='" + variantOption + "', category='" + category + "', taxonomyMetafield='" + taxonomyMetafield + "', productType='" + productType + "', productVendor='" + productVendor + "', price='" + price + "', productMetafield='" + productMetafield + "', variantMetafield='" + variantMetafield + "', tag='" + tag + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductFilter that = (ProductFilter) o;
    return Objects.equals(available, that.available) &&
        Objects.equals(variantOption, that.variantOption) &&
        Objects.equals(category, that.category) &&
        Objects.equals(taxonomyMetafield, that.taxonomyMetafield) &&
        Objects.equals(productType, that.productType) &&
        Objects.equals(productVendor, that.productVendor) &&
        Objects.equals(price, that.price) &&
        Objects.equals(productMetafield, that.productMetafield) &&
        Objects.equals(variantMetafield, that.variantMetafield) &&
        Objects.equals(tag, that.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, variantOption, category, taxonomyMetafield, productType, productVendor, price, productMetafield, variantMetafield, tag);
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
     * A variant option to filter on.
     */
    private VariantOptionFilter variantOption;

    /**
     * A product category to filter on.
     */
    private CategoryFilter category;

    /**
     * A standard product attribute metafield to filter on.
     */
    private TaxonomyMetafieldFilter taxonomyMetafield;

    /**
     * The product type to filter on.
     */
    private String productType;

    /**
     * The product vendor to filter on.
     */
    private String productVendor;

    /**
     * A range of prices to filter with-in.
     */
    private PriceRangeFilter price;

    /**
     * A product metafield to filter on.
     */
    private MetafieldFilter productMetafield;

    /**
     * A variant metafield to filter on.
     */
    private MetafieldFilter variantMetafield;

    /**
     * A product tag to filter on.
     */
    private String tag;

    public ProductFilter build() {
      ProductFilter result = new ProductFilter();
      result.available = this.available;
      result.variantOption = this.variantOption;
      result.category = this.category;
      result.taxonomyMetafield = this.taxonomyMetafield;
      result.productType = this.productType;
      result.productVendor = this.productVendor;
      result.price = this.price;
      result.productMetafield = this.productMetafield;
      result.variantMetafield = this.variantMetafield;
      result.tag = this.tag;
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
     * A variant option to filter on.
     */
    public Builder variantOption(VariantOptionFilter variantOption) {
      this.variantOption = variantOption;
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
     * A standard product attribute metafield to filter on.
     */
    public Builder taxonomyMetafield(TaxonomyMetafieldFilter taxonomyMetafield) {
      this.taxonomyMetafield = taxonomyMetafield;
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
     * A variant metafield to filter on.
     */
    public Builder variantMetafield(MetafieldFilter variantMetafield) {
      this.variantMetafield = variantMetafield;
      return this;
    }

    /**
     * A product tag to filter on.
     */
    public Builder tag(String tag) {
      this.tag = tag;
      return this;
    }
  }
}
