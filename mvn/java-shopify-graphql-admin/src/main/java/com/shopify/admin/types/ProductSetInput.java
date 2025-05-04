package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to create or update a product via ProductSet mutation.
 */
public class ProductSetInput {
  /**
   * The description of the product, with HTML tags.
   * For example, the description might include bold `<strong></strong>` and italic `<i></i>` text.
   */
  private String descriptionHtml;

  /**
   * A unique, human-readable string of the product's title. A handle can contain
   * letters, hyphens (`-`), and numbers, but no spaces.
   * The handle is used in the online store URL for the product.
   * For example, if a product is titled "Black Sunglasses", then the handle is `black-sunglasses`.
   */
  private String handle;

  /**
   * The [SEO title and description](https://help.shopify.com/manual/promoting-marketing/seo/adding-keywords)
   * that are associated with a product.
   */
  private SEOInput seo;

  /**
   * The [product type](https://help.shopify.com/manual/products/details/product-type)
   * that merchants define.
   */
  private String productType;

  /**
   * The ID of the [category](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17)
   * that's associated with the product.
   */
  private String category;

  /**
   * A comma-separated list of searchable keywords that are
   * associated with the product. For example, a merchant might apply the `sports`
   * and `summer` tags to products that are associated with sportwear for summer.
   *   
   * Updating `tags` overwrites any existing tags that were previously added to the product.
   * To add new tags without overwriting existing tags, use the
   * [`tagsAdd`](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
   * mutation.
   */
  private List<String> tags;

  /**
   * The [theme template](https://shopify.dev/docs/storefronts/themes/architecture/templates)
   * that's used when customers view a product in a store.
   */
  private String templateSuffix;

  /**
   * The [theme template](https://shopify.dev/docs/storefronts/themes/architecture/templates)
   * that's used when customers view a gift card in a store.
   */
  private String giftCardTemplateSuffix;

  /**
   * The name for the product that displays to customers. The title is used to construct the product's handle.
   * For example, if a product is titled "Black Sunglasses", then the handle is `black-sunglasses`.
   */
  private String title;

  /**
   * The name of the product's vendor.
   */
  private String vendor;

  /**
   * Whether the product is a gift card.
   */
  private Boolean giftCard;

  /**
   * Whether a redirect is required after a new handle has been provided.
   * If `true`, then the old handle is redirected to the new one automatically.
   */
  private Boolean redirectNewHandle;

  /**
   * The IDs of collections that this product will be a member of.
   */
  private List<String> collections;

  /**
   * The metafields to associate with this product.
   */
  private List<MetafieldInput> metafields;

  /**
   * A list of variants associated with the product.
   */
  private List<ProductVariantSetInput> variants;

  /**
   * The files to associate with the product.
   */
  private List<FileSetInput> files;

  /**
   * The status of the product.
   */
  private ProductStatus status;

  /**
   * Whether the product can only be purchased with a selling plan (subscription).
   * Products that are sold exclusively on subscription can only be created on
   * online stores. If set to `true` on an already existing product, then the
   * product will be marked unavailable on channels that don't support subscriptions.
   */
  private Boolean requiresSellingPlan;

  /**
   * List of custom product options and option values (maximum of 3 per product).
   */
  private List<OptionSetInput> productOptions;

  /**
   * The input field to enable an app to provide additional product features.
   * For example, you can specify
   * [`bundles: true`](https://shopify.dev/docs/api/admin-graphql/latest/input-objects/ProductClaimOwnershipInput#field-bundles)
   * in the `claimOwnership` field to let an app add a
   * [product configuration extension](https://shopify.dev/docs/apps/build/product-merchandising/bundles/product-configuration-extension/add-merchant-config-ui).
   */
  private ProductClaimOwnershipInput claimOwnership;

  /**
   * The role of the product in a product grouping. It can only be set during creation.
   */
  private CombinedListingsRole combinedListingRole;

  public ProductSetInput() {
  }

  /**
   * The description of the product, with HTML tags.
   * For example, the description might include bold `<strong></strong>` and italic `<i></i>` text.
   */
  public String getDescriptionHtml() {
    return descriptionHtml;
  }

  public void setDescriptionHtml(String descriptionHtml) {
    this.descriptionHtml = descriptionHtml;
  }

  /**
   * A unique, human-readable string of the product's title. A handle can contain
   * letters, hyphens (`-`), and numbers, but no spaces.
   * The handle is used in the online store URL for the product.
   * For example, if a product is titled "Black Sunglasses", then the handle is `black-sunglasses`.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * The [SEO title and description](https://help.shopify.com/manual/promoting-marketing/seo/adding-keywords)
   * that are associated with a product.
   */
  public SEOInput getSeo() {
    return seo;
  }

  public void setSeo(SEOInput seo) {
    this.seo = seo;
  }

  /**
   * The [product type](https://help.shopify.com/manual/products/details/product-type)
   * that merchants define.
   */
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  /**
   * The ID of the [category](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17)
   * that's associated with the product.
   */
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * A comma-separated list of searchable keywords that are
   * associated with the product. For example, a merchant might apply the `sports`
   * and `summer` tags to products that are associated with sportwear for summer.
   *   
   * Updating `tags` overwrites any existing tags that were previously added to the product.
   * To add new tags without overwriting existing tags, use the
   * [`tagsAdd`](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
   * mutation.
   */
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * The [theme template](https://shopify.dev/docs/storefronts/themes/architecture/templates)
   * that's used when customers view a product in a store.
   */
  public String getTemplateSuffix() {
    return templateSuffix;
  }

  public void setTemplateSuffix(String templateSuffix) {
    this.templateSuffix = templateSuffix;
  }

  /**
   * The [theme template](https://shopify.dev/docs/storefronts/themes/architecture/templates)
   * that's used when customers view a gift card in a store.
   */
  public String getGiftCardTemplateSuffix() {
    return giftCardTemplateSuffix;
  }

  public void setGiftCardTemplateSuffix(String giftCardTemplateSuffix) {
    this.giftCardTemplateSuffix = giftCardTemplateSuffix;
  }

  /**
   * The name for the product that displays to customers. The title is used to construct the product's handle.
   * For example, if a product is titled "Black Sunglasses", then the handle is `black-sunglasses`.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The name of the product's vendor.
   */
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  /**
   * Whether the product is a gift card.
   */
  public Boolean getGiftCard() {
    return giftCard;
  }

  public void setGiftCard(Boolean giftCard) {
    this.giftCard = giftCard;
  }

  /**
   * Whether a redirect is required after a new handle has been provided.
   * If `true`, then the old handle is redirected to the new one automatically.
   */
  public Boolean getRedirectNewHandle() {
    return redirectNewHandle;
  }

  public void setRedirectNewHandle(Boolean redirectNewHandle) {
    this.redirectNewHandle = redirectNewHandle;
  }

  /**
   * The IDs of collections that this product will be a member of.
   */
  public List<String> getCollections() {
    return collections;
  }

  public void setCollections(List<String> collections) {
    this.collections = collections;
  }

  /**
   * The metafields to associate with this product.
   */
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  /**
   * A list of variants associated with the product.
   */
  public List<ProductVariantSetInput> getVariants() {
    return variants;
  }

  public void setVariants(List<ProductVariantSetInput> variants) {
    this.variants = variants;
  }

  /**
   * The files to associate with the product.
   */
  public List<FileSetInput> getFiles() {
    return files;
  }

  public void setFiles(List<FileSetInput> files) {
    this.files = files;
  }

  /**
   * The status of the product.
   */
  public ProductStatus getStatus() {
    return status;
  }

  public void setStatus(ProductStatus status) {
    this.status = status;
  }

  /**
   * Whether the product can only be purchased with a selling plan (subscription).
   * Products that are sold exclusively on subscription can only be created on
   * online stores. If set to `true` on an already existing product, then the
   * product will be marked unavailable on channels that don't support subscriptions.
   */
  public Boolean getRequiresSellingPlan() {
    return requiresSellingPlan;
  }

  public void setRequiresSellingPlan(Boolean requiresSellingPlan) {
    this.requiresSellingPlan = requiresSellingPlan;
  }

  /**
   * List of custom product options and option values (maximum of 3 per product).
   */
  public List<OptionSetInput> getProductOptions() {
    return productOptions;
  }

  public void setProductOptions(List<OptionSetInput> productOptions) {
    this.productOptions = productOptions;
  }

  /**
   * The input field to enable an app to provide additional product features.
   * For example, you can specify
   * [`bundles: true`](https://shopify.dev/docs/api/admin-graphql/latest/input-objects/ProductClaimOwnershipInput#field-bundles)
   * in the `claimOwnership` field to let an app add a
   * [product configuration extension](https://shopify.dev/docs/apps/build/product-merchandising/bundles/product-configuration-extension/add-merchant-config-ui).
   */
  public ProductClaimOwnershipInput getClaimOwnership() {
    return claimOwnership;
  }

  public void setClaimOwnership(ProductClaimOwnershipInput claimOwnership) {
    this.claimOwnership = claimOwnership;
  }

  /**
   * The role of the product in a product grouping. It can only be set during creation.
   */
  public CombinedListingsRole getCombinedListingRole() {
    return combinedListingRole;
  }

  public void setCombinedListingRole(CombinedListingsRole combinedListingRole) {
    this.combinedListingRole = combinedListingRole;
  }

  @Override
  public String toString() {
    return "ProductSetInput{descriptionHtml='" + descriptionHtml + "', handle='" + handle + "', seo='" + seo + "', productType='" + productType + "', category='" + category + "', tags='" + tags + "', templateSuffix='" + templateSuffix + "', giftCardTemplateSuffix='" + giftCardTemplateSuffix + "', title='" + title + "', vendor='" + vendor + "', giftCard='" + giftCard + "', redirectNewHandle='" + redirectNewHandle + "', collections='" + collections + "', metafields='" + metafields + "', variants='" + variants + "', files='" + files + "', status='" + status + "', requiresSellingPlan='" + requiresSellingPlan + "', productOptions='" + productOptions + "', claimOwnership='" + claimOwnership + "', combinedListingRole='" + combinedListingRole + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductSetInput that = (ProductSetInput) o;
    return Objects.equals(descriptionHtml, that.descriptionHtml) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(seo, that.seo) &&
        Objects.equals(productType, that.productType) &&
        Objects.equals(category, that.category) &&
        Objects.equals(tags, that.tags) &&
        Objects.equals(templateSuffix, that.templateSuffix) &&
        Objects.equals(giftCardTemplateSuffix, that.giftCardTemplateSuffix) &&
        Objects.equals(title, that.title) &&
        Objects.equals(vendor, that.vendor) &&
        Objects.equals(giftCard, that.giftCard) &&
        Objects.equals(redirectNewHandle, that.redirectNewHandle) &&
        Objects.equals(collections, that.collections) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(variants, that.variants) &&
        Objects.equals(files, that.files) &&
        Objects.equals(status, that.status) &&
        Objects.equals(requiresSellingPlan, that.requiresSellingPlan) &&
        Objects.equals(productOptions, that.productOptions) &&
        Objects.equals(claimOwnership, that.claimOwnership) &&
        Objects.equals(combinedListingRole, that.combinedListingRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descriptionHtml, handle, seo, productType, category, tags, templateSuffix, giftCardTemplateSuffix, title, vendor, giftCard, redirectNewHandle, collections, metafields, variants, files, status, requiresSellingPlan, productOptions, claimOwnership, combinedListingRole);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The description of the product, with HTML tags.
     * For example, the description might include bold `<strong></strong>` and italic `<i></i>` text.
     */
    private String descriptionHtml;

    /**
     * A unique, human-readable string of the product's title. A handle can contain
     * letters, hyphens (`-`), and numbers, but no spaces.
     * The handle is used in the online store URL for the product.
     * For example, if a product is titled "Black Sunglasses", then the handle is `black-sunglasses`.
     */
    private String handle;

    /**
     * The [SEO title and description](https://help.shopify.com/manual/promoting-marketing/seo/adding-keywords)
     * that are associated with a product.
     */
    private SEOInput seo;

    /**
     * The [product type](https://help.shopify.com/manual/products/details/product-type)
     * that merchants define.
     */
    private String productType;

    /**
     * The ID of the [category](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17)
     * that's associated with the product.
     */
    private String category;

    /**
     * A comma-separated list of searchable keywords that are
     * associated with the product. For example, a merchant might apply the `sports`
     * and `summer` tags to products that are associated with sportwear for summer.
     *   
     * Updating `tags` overwrites any existing tags that were previously added to the product.
     * To add new tags without overwriting existing tags, use the
     * [`tagsAdd`](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
     * mutation.
     */
    private List<String> tags;

    /**
     * The [theme template](https://shopify.dev/docs/storefronts/themes/architecture/templates)
     * that's used when customers view a product in a store.
     */
    private String templateSuffix;

    /**
     * The [theme template](https://shopify.dev/docs/storefronts/themes/architecture/templates)
     * that's used when customers view a gift card in a store.
     */
    private String giftCardTemplateSuffix;

    /**
     * The name for the product that displays to customers. The title is used to construct the product's handle.
     * For example, if a product is titled "Black Sunglasses", then the handle is `black-sunglasses`.
     */
    private String title;

    /**
     * The name of the product's vendor.
     */
    private String vendor;

    /**
     * Whether the product is a gift card.
     */
    private Boolean giftCard;

    /**
     * Whether a redirect is required after a new handle has been provided.
     * If `true`, then the old handle is redirected to the new one automatically.
     */
    private Boolean redirectNewHandle;

    /**
     * The IDs of collections that this product will be a member of.
     */
    private List<String> collections;

    /**
     * The metafields to associate with this product.
     */
    private List<MetafieldInput> metafields;

    /**
     * A list of variants associated with the product.
     */
    private List<ProductVariantSetInput> variants;

    /**
     * The files to associate with the product.
     */
    private List<FileSetInput> files;

    /**
     * The status of the product.
     */
    private ProductStatus status;

    /**
     * Whether the product can only be purchased with a selling plan (subscription).
     * Products that are sold exclusively on subscription can only be created on
     * online stores. If set to `true` on an already existing product, then the
     * product will be marked unavailable on channels that don't support subscriptions.
     */
    private Boolean requiresSellingPlan;

    /**
     * List of custom product options and option values (maximum of 3 per product).
     */
    private List<OptionSetInput> productOptions;

    /**
     * The input field to enable an app to provide additional product features.
     * For example, you can specify
     * [`bundles: true`](https://shopify.dev/docs/api/admin-graphql/latest/input-objects/ProductClaimOwnershipInput#field-bundles)
     * in the `claimOwnership` field to let an app add a
     * [product configuration extension](https://shopify.dev/docs/apps/build/product-merchandising/bundles/product-configuration-extension/add-merchant-config-ui).
     */
    private ProductClaimOwnershipInput claimOwnership;

    /**
     * The role of the product in a product grouping. It can only be set during creation.
     */
    private CombinedListingsRole combinedListingRole;

    public ProductSetInput build() {
      ProductSetInput result = new ProductSetInput();
      result.descriptionHtml = this.descriptionHtml;
      result.handle = this.handle;
      result.seo = this.seo;
      result.productType = this.productType;
      result.category = this.category;
      result.tags = this.tags;
      result.templateSuffix = this.templateSuffix;
      result.giftCardTemplateSuffix = this.giftCardTemplateSuffix;
      result.title = this.title;
      result.vendor = this.vendor;
      result.giftCard = this.giftCard;
      result.redirectNewHandle = this.redirectNewHandle;
      result.collections = this.collections;
      result.metafields = this.metafields;
      result.variants = this.variants;
      result.files = this.files;
      result.status = this.status;
      result.requiresSellingPlan = this.requiresSellingPlan;
      result.productOptions = this.productOptions;
      result.claimOwnership = this.claimOwnership;
      result.combinedListingRole = this.combinedListingRole;
      return result;
    }

    /**
     * The description of the product, with HTML tags.
     * For example, the description might include bold `<strong></strong>` and italic `<i></i>` text.
     */
    public Builder descriptionHtml(String descriptionHtml) {
      this.descriptionHtml = descriptionHtml;
      return this;
    }

    /**
     * A unique, human-readable string of the product's title. A handle can contain
     * letters, hyphens (`-`), and numbers, but no spaces.
     * The handle is used in the online store URL for the product.
     * For example, if a product is titled "Black Sunglasses", then the handle is `black-sunglasses`.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * The [SEO title and description](https://help.shopify.com/manual/promoting-marketing/seo/adding-keywords)
     * that are associated with a product.
     */
    public Builder seo(SEOInput seo) {
      this.seo = seo;
      return this;
    }

    /**
     * The [product type](https://help.shopify.com/manual/products/details/product-type)
     * that merchants define.
     */
    public Builder productType(String productType) {
      this.productType = productType;
      return this;
    }

    /**
     * The ID of the [category](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17)
     * that's associated with the product.
     */
    public Builder category(String category) {
      this.category = category;
      return this;
    }

    /**
     * A comma-separated list of searchable keywords that are
     * associated with the product. For example, a merchant might apply the `sports`
     * and `summer` tags to products that are associated with sportwear for summer.
     *   
     * Updating `tags` overwrites any existing tags that were previously added to the product.
     * To add new tags without overwriting existing tags, use the
     * [`tagsAdd`](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
     * mutation.
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * The [theme template](https://shopify.dev/docs/storefronts/themes/architecture/templates)
     * that's used when customers view a product in a store.
     */
    public Builder templateSuffix(String templateSuffix) {
      this.templateSuffix = templateSuffix;
      return this;
    }

    /**
     * The [theme template](https://shopify.dev/docs/storefronts/themes/architecture/templates)
     * that's used when customers view a gift card in a store.
     */
    public Builder giftCardTemplateSuffix(String giftCardTemplateSuffix) {
      this.giftCardTemplateSuffix = giftCardTemplateSuffix;
      return this;
    }

    /**
     * The name for the product that displays to customers. The title is used to construct the product's handle.
     * For example, if a product is titled "Black Sunglasses", then the handle is `black-sunglasses`.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The name of the product's vendor.
     */
    public Builder vendor(String vendor) {
      this.vendor = vendor;
      return this;
    }

    /**
     * Whether the product is a gift card.
     */
    public Builder giftCard(Boolean giftCard) {
      this.giftCard = giftCard;
      return this;
    }

    /**
     * Whether a redirect is required after a new handle has been provided.
     * If `true`, then the old handle is redirected to the new one automatically.
     */
    public Builder redirectNewHandle(Boolean redirectNewHandle) {
      this.redirectNewHandle = redirectNewHandle;
      return this;
    }

    /**
     * The IDs of collections that this product will be a member of.
     */
    public Builder collections(List<String> collections) {
      this.collections = collections;
      return this;
    }

    /**
     * The metafields to associate with this product.
     */
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * A list of variants associated with the product.
     */
    public Builder variants(List<ProductVariantSetInput> variants) {
      this.variants = variants;
      return this;
    }

    /**
     * The files to associate with the product.
     */
    public Builder files(List<FileSetInput> files) {
      this.files = files;
      return this;
    }

    /**
     * The status of the product.
     */
    public Builder status(ProductStatus status) {
      this.status = status;
      return this;
    }

    /**
     * Whether the product can only be purchased with a selling plan (subscription).
     * Products that are sold exclusively on subscription can only be created on
     * online stores. If set to `true` on an already existing product, then the
     * product will be marked unavailable on channels that don't support subscriptions.
     */
    public Builder requiresSellingPlan(Boolean requiresSellingPlan) {
      this.requiresSellingPlan = requiresSellingPlan;
      return this;
    }

    /**
     * List of custom product options and option values (maximum of 3 per product).
     */
    public Builder productOptions(List<OptionSetInput> productOptions) {
      this.productOptions = productOptions;
      return this;
    }

    /**
     * The input field to enable an app to provide additional product features.
     * For example, you can specify
     * [`bundles: true`](https://shopify.dev/docs/api/admin-graphql/latest/input-objects/ProductClaimOwnershipInput#field-bundles)
     * in the `claimOwnership` field to let an app add a
     * [product configuration extension](https://shopify.dev/docs/apps/build/product-merchandising/bundles/product-configuration-extension/add-merchant-config-ui).
     */
    public Builder claimOwnership(ProductClaimOwnershipInput claimOwnership) {
      this.claimOwnership = claimOwnership;
      return this;
    }

    /**
     * The role of the product in a product grouping. It can only be set during creation.
     */
    public Builder combinedListingRole(CombinedListingsRole combinedListingRole) {
      this.combinedListingRole = combinedListingRole;
      return this;
    }
  }
}
