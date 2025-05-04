package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Represents a selling method (for example, "Subscribe and save" or "Pre-paid"). Selling plan groups
 * and associated records (selling plans and policies) are deleted 48 hours after a merchant
 * uninstalls their subscriptions app. We recommend backing up these records if you need to restore them later.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SellingPlanGroup implements com.shopify.admin.types.HasPublishedTranslations, com.shopify.admin.types.Node {
  /**
   * The ID for app, exposed in Liquid and product JSON.
   */
  private String appId;

  /**
   * Whether the given product is directly associated to the selling plan group.
   */
  private boolean appliesToProduct;

  /**
   * Whether the given product variant is directly associated to the selling plan group.
   */
  private boolean appliesToProductVariant;

  /**
   * Whether any of the product variants of the given product are associated to the selling plan group.
   */
  private boolean appliesToProductVariants;

  /**
   * The date and time when the selling plan group was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The merchant-facing description of the selling plan group.
   */
  private String description;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The merchant-facing label of the selling plan group.
   */
  private String merchantCode;

  /**
   * The buyer-facing label of the selling plan group.
   */
  private String name;

  /**
   * The values of all options available on the selling plan group. Selling plans
   * are grouped together in Liquid when they're created by the same app, and have
   * the same `selling_plan_group.name` and `selling_plan_group.options` values.
   */
  private List<String> options;

  /**
   * The relative position of the selling plan group for display.
   */
  private Integer position;

  /**
   * Product variants associated to the selling plan group.
   */
  private ProductVariantConnection productVariants;

  /**
   * A count of product variants associated to the selling plan group.
   */
  private Count productVariantsCount;

  /**
   * Products associated to the selling plan group.
   */
  private ProductConnection products;

  /**
   * A count of products associated to the selling plan group.
   */
  private Count productsCount;

  /**
   * Selling plans associated to the selling plan group.
   */
  private SellingPlanConnection sellingPlans;

  /**
   * A summary of the policies associated to the selling plan group.
   */
  private String summary;

  /**
   * The published translations associated with the resource.
   */
  private List<Translation> translations;

  public SellingPlanGroup() {
  }

  /**
   * The ID for app, exposed in Liquid and product JSON.
   */
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  /**
   * Whether the given product is directly associated to the selling plan group.
   */
  public boolean getAppliesToProduct() {
    return appliesToProduct;
  }

  public void setAppliesToProduct(boolean appliesToProduct) {
    this.appliesToProduct = appliesToProduct;
  }

  /**
   * Whether the given product variant is directly associated to the selling plan group.
   */
  public boolean getAppliesToProductVariant() {
    return appliesToProductVariant;
  }

  public void setAppliesToProductVariant(boolean appliesToProductVariant) {
    this.appliesToProductVariant = appliesToProductVariant;
  }

  /**
   * Whether any of the product variants of the given product are associated to the selling plan group.
   */
  public boolean getAppliesToProductVariants() {
    return appliesToProductVariants;
  }

  public void setAppliesToProductVariants(boolean appliesToProductVariants) {
    this.appliesToProductVariants = appliesToProductVariants;
  }

  /**
   * The date and time when the selling plan group was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The merchant-facing description of the selling plan group.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The merchant-facing label of the selling plan group.
   */
  public String getMerchantCode() {
    return merchantCode;
  }

  public void setMerchantCode(String merchantCode) {
    this.merchantCode = merchantCode;
  }

  /**
   * The buyer-facing label of the selling plan group.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The values of all options available on the selling plan group. Selling plans
   * are grouped together in Liquid when they're created by the same app, and have
   * the same `selling_plan_group.name` and `selling_plan_group.options` values.
   */
  public List<String> getOptions() {
    return options;
  }

  public void setOptions(List<String> options) {
    this.options = options;
  }

  /**
   * The relative position of the selling plan group for display.
   */
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  /**
   * Product variants associated to the selling plan group.
   */
  public ProductVariantConnection getProductVariants() {
    return productVariants;
  }

  public void setProductVariants(ProductVariantConnection productVariants) {
    this.productVariants = productVariants;
  }

  /**
   * A count of product variants associated to the selling plan group.
   */
  public Count getProductVariantsCount() {
    return productVariantsCount;
  }

  public void setProductVariantsCount(Count productVariantsCount) {
    this.productVariantsCount = productVariantsCount;
  }

  /**
   * Products associated to the selling plan group.
   */
  public ProductConnection getProducts() {
    return products;
  }

  public void setProducts(ProductConnection products) {
    this.products = products;
  }

  /**
   * A count of products associated to the selling plan group.
   */
  public Count getProductsCount() {
    return productsCount;
  }

  public void setProductsCount(Count productsCount) {
    this.productsCount = productsCount;
  }

  /**
   * Selling plans associated to the selling plan group.
   */
  public SellingPlanConnection getSellingPlans() {
    return sellingPlans;
  }

  public void setSellingPlans(SellingPlanConnection sellingPlans) {
    this.sellingPlans = sellingPlans;
  }

  /**
   * A summary of the policies associated to the selling plan group.
   */
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  /**
   * The published translations associated with the resource.
   */
  public List<Translation> getTranslations() {
    return translations;
  }

  public void setTranslations(List<Translation> translations) {
    this.translations = translations;
  }

  @Override
  public String toString() {
    return "SellingPlanGroup{appId='" + appId + "', appliesToProduct='" + appliesToProduct + "', appliesToProductVariant='" + appliesToProductVariant + "', appliesToProductVariants='" + appliesToProductVariants + "', createdAt='" + createdAt + "', description='" + description + "', id='" + id + "', merchantCode='" + merchantCode + "', name='" + name + "', options='" + options + "', position='" + position + "', productVariants='" + productVariants + "', productVariantsCount='" + productVariantsCount + "', products='" + products + "', productsCount='" + productsCount + "', sellingPlans='" + sellingPlans + "', summary='" + summary + "', translations='" + translations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanGroup that = (SellingPlanGroup) o;
    return Objects.equals(appId, that.appId) &&
        appliesToProduct == that.appliesToProduct &&
        appliesToProductVariant == that.appliesToProductVariant &&
        appliesToProductVariants == that.appliesToProductVariants &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(description, that.description) &&
        Objects.equals(id, that.id) &&
        Objects.equals(merchantCode, that.merchantCode) &&
        Objects.equals(name, that.name) &&
        Objects.equals(options, that.options) &&
        Objects.equals(position, that.position) &&
        Objects.equals(productVariants, that.productVariants) &&
        Objects.equals(productVariantsCount, that.productVariantsCount) &&
        Objects.equals(products, that.products) &&
        Objects.equals(productsCount, that.productsCount) &&
        Objects.equals(sellingPlans, that.sellingPlans) &&
        Objects.equals(summary, that.summary) &&
        Objects.equals(translations, that.translations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, appliesToProduct, appliesToProductVariant, appliesToProductVariants, createdAt, description, id, merchantCode, name, options, position, productVariants, productVariantsCount, products, productsCount, sellingPlans, summary, translations);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID for app, exposed in Liquid and product JSON.
     */
    private String appId;

    /**
     * Whether the given product is directly associated to the selling plan group.
     */
    private boolean appliesToProduct;

    /**
     * Whether the given product variant is directly associated to the selling plan group.
     */
    private boolean appliesToProductVariant;

    /**
     * Whether any of the product variants of the given product are associated to the selling plan group.
     */
    private boolean appliesToProductVariants;

    /**
     * The date and time when the selling plan group was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The merchant-facing description of the selling plan group.
     */
    private String description;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The merchant-facing label of the selling plan group.
     */
    private String merchantCode;

    /**
     * The buyer-facing label of the selling plan group.
     */
    private String name;

    /**
     * The values of all options available on the selling plan group. Selling plans
     * are grouped together in Liquid when they're created by the same app, and have
     * the same `selling_plan_group.name` and `selling_plan_group.options` values.
     */
    private List<String> options;

    /**
     * The relative position of the selling plan group for display.
     */
    private Integer position;

    /**
     * Product variants associated to the selling plan group.
     */
    private ProductVariantConnection productVariants;

    /**
     * A count of product variants associated to the selling plan group.
     */
    private Count productVariantsCount;

    /**
     * Products associated to the selling plan group.
     */
    private ProductConnection products;

    /**
     * A count of products associated to the selling plan group.
     */
    private Count productsCount;

    /**
     * Selling plans associated to the selling plan group.
     */
    private SellingPlanConnection sellingPlans;

    /**
     * A summary of the policies associated to the selling plan group.
     */
    private String summary;

    /**
     * The published translations associated with the resource.
     */
    private List<Translation> translations;

    public SellingPlanGroup build() {
      SellingPlanGroup result = new SellingPlanGroup();
      result.appId = this.appId;
      result.appliesToProduct = this.appliesToProduct;
      result.appliesToProductVariant = this.appliesToProductVariant;
      result.appliesToProductVariants = this.appliesToProductVariants;
      result.createdAt = this.createdAt;
      result.description = this.description;
      result.id = this.id;
      result.merchantCode = this.merchantCode;
      result.name = this.name;
      result.options = this.options;
      result.position = this.position;
      result.productVariants = this.productVariants;
      result.productVariantsCount = this.productVariantsCount;
      result.products = this.products;
      result.productsCount = this.productsCount;
      result.sellingPlans = this.sellingPlans;
      result.summary = this.summary;
      result.translations = this.translations;
      return result;
    }

    /**
     * The ID for app, exposed in Liquid and product JSON.
     */
    public Builder appId(String appId) {
      this.appId = appId;
      return this;
    }

    /**
     * Whether the given product is directly associated to the selling plan group.
     */
    public Builder appliesToProduct(boolean appliesToProduct) {
      this.appliesToProduct = appliesToProduct;
      return this;
    }

    /**
     * Whether the given product variant is directly associated to the selling plan group.
     */
    public Builder appliesToProductVariant(boolean appliesToProductVariant) {
      this.appliesToProductVariant = appliesToProductVariant;
      return this;
    }

    /**
     * Whether any of the product variants of the given product are associated to the selling plan group.
     */
    public Builder appliesToProductVariants(boolean appliesToProductVariants) {
      this.appliesToProductVariants = appliesToProductVariants;
      return this;
    }

    /**
     * The date and time when the selling plan group was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The merchant-facing description of the selling plan group.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The merchant-facing label of the selling plan group.
     */
    public Builder merchantCode(String merchantCode) {
      this.merchantCode = merchantCode;
      return this;
    }

    /**
     * The buyer-facing label of the selling plan group.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The values of all options available on the selling plan group. Selling plans
     * are grouped together in Liquid when they're created by the same app, and have
     * the same `selling_plan_group.name` and `selling_plan_group.options` values.
     */
    public Builder options(List<String> options) {
      this.options = options;
      return this;
    }

    /**
     * The relative position of the selling plan group for display.
     */
    public Builder position(Integer position) {
      this.position = position;
      return this;
    }

    /**
     * Product variants associated to the selling plan group.
     */
    public Builder productVariants(ProductVariantConnection productVariants) {
      this.productVariants = productVariants;
      return this;
    }

    /**
     * A count of product variants associated to the selling plan group.
     */
    public Builder productVariantsCount(Count productVariantsCount) {
      this.productVariantsCount = productVariantsCount;
      return this;
    }

    /**
     * Products associated to the selling plan group.
     */
    public Builder products(ProductConnection products) {
      this.products = products;
      return this;
    }

    /**
     * A count of products associated to the selling plan group.
     */
    public Builder productsCount(Count productsCount) {
      this.productsCount = productsCount;
      return this;
    }

    /**
     * Selling plans associated to the selling plan group.
     */
    public Builder sellingPlans(SellingPlanConnection sellingPlans) {
      this.sellingPlans = sellingPlans;
      return this;
    }

    /**
     * A summary of the policies associated to the selling plan group.
     */
    public Builder summary(String summary) {
      this.summary = summary;
      return this;
    }

    /**
     * The published translations associated with the resource.
     */
    public Builder translations(List<Translation> translations) {
      this.translations = translations;
      return this;
    }
  }
}
