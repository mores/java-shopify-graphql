package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for updating a product.
 */
public class ProductUpdateInput {
  /**
   * The description of the product, with HTML tags.
   * For example, the description might include bold `<strong></strong>` and italic `<i></i>` text.
   */
  private String descriptionHtml;

  /**
   * A unique, human-readable string that's used to identify the product in URLs. A
   * handle can contain letters, hyphens (`-`), and numbers, but no spaces.
   * If no handle is explicitly provided, then the title is used to construct the product's handle.
   * For example, if a product is titled "Black Sunglasses" and no handle is
   * provided, then the handle `black-sunglasses` is generated (unless that handle
   * is already taken, in which case a suffix is added to make the handle unique).
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
   * A list of searchable keywords that are
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
   * The name for the product that displays to customers. If no handle is
   * explicitly provided, then the title is used to construct the product's handle.
   * For example, if a product is titled "Black Sunglasses" and no handle is
   * provided, then the handle `black-sunglasses` is generated.
   */
  private String title;

  /**
   * The name of the product's vendor.
   */
  private String vendor;

  /**
   * Whether a redirect is required after a new handle has been provided.
   * If `true`, then the old handle is redirected to the new one automatically.
   */
  private Boolean redirectNewHandle;

  /**
   * The product's ID.
   */
  private String id;

  /**
   * A list of collection IDs to associate with the product.
   */
  private List<String> collectionsToJoin;

  /**
   * The collection IDs to disassociate from the product.
   */
  private List<String> collectionsToLeave;

  /**
   * Whether to delete metafields whose constraints don't match the product's category.
   * Can only be used when updating the product's category.
   */
  private Boolean deleteConflictingConstrainedMetafields = false;

  /**
   * The [custom fields](https://shopify.dev/docs/apps/build/custom-data) to associate with the product
   * for the purposes of adding and storing additional information.
   */
  private List<MetafieldInput> metafields;

  /**
   * The [product status](https://help.shopify.com/manual/products/details/product-details-page#product-status),
   * which controls visibility across all sales channels.
   */
  private ProductStatus status;

  /**
   * Whether the product can only be purchased with
   * a [selling plan](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans).
   * Products that are sold on subscription (`requiresSellingPlan: true`) can be updated only for online stores.
   * If you update a product to be subscription-only (`requiresSellingPlan:false`),
   * then the product is unpublished from all channels except the online store.
   */
  private Boolean requiresSellingPlan;

  public ProductUpdateInput() {
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
   * A unique, human-readable string that's used to identify the product in URLs. A
   * handle can contain letters, hyphens (`-`), and numbers, but no spaces.
   * If no handle is explicitly provided, then the title is used to construct the product's handle.
   * For example, if a product is titled "Black Sunglasses" and no handle is
   * provided, then the handle `black-sunglasses` is generated (unless that handle
   * is already taken, in which case a suffix is added to make the handle unique).
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
   * A list of searchable keywords that are
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
   * The name for the product that displays to customers. If no handle is
   * explicitly provided, then the title is used to construct the product's handle.
   * For example, if a product is titled "Black Sunglasses" and no handle is
   * provided, then the handle `black-sunglasses` is generated.
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
   * The product's ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * A list of collection IDs to associate with the product.
   */
  public List<String> getCollectionsToJoin() {
    return collectionsToJoin;
  }

  public void setCollectionsToJoin(List<String> collectionsToJoin) {
    this.collectionsToJoin = collectionsToJoin;
  }

  /**
   * The collection IDs to disassociate from the product.
   */
  public List<String> getCollectionsToLeave() {
    return collectionsToLeave;
  }

  public void setCollectionsToLeave(List<String> collectionsToLeave) {
    this.collectionsToLeave = collectionsToLeave;
  }

  /**
   * Whether to delete metafields whose constraints don't match the product's category.
   * Can only be used when updating the product's category.
   */
  public Boolean getDeleteConflictingConstrainedMetafields() {
    return deleteConflictingConstrainedMetafields;
  }

  public void setDeleteConflictingConstrainedMetafields(
      Boolean deleteConflictingConstrainedMetafields) {
    this.deleteConflictingConstrainedMetafields = deleteConflictingConstrainedMetafields;
  }

  /**
   * The [custom fields](https://shopify.dev/docs/apps/build/custom-data) to associate with the product
   * for the purposes of adding and storing additional information.
   */
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  /**
   * The [product status](https://help.shopify.com/manual/products/details/product-details-page#product-status),
   * which controls visibility across all sales channels.
   */
  public ProductStatus getStatus() {
    return status;
  }

  public void setStatus(ProductStatus status) {
    this.status = status;
  }

  /**
   * Whether the product can only be purchased with
   * a [selling plan](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans).
   * Products that are sold on subscription (`requiresSellingPlan: true`) can be updated only for online stores.
   * If you update a product to be subscription-only (`requiresSellingPlan:false`),
   * then the product is unpublished from all channels except the online store.
   */
  public Boolean getRequiresSellingPlan() {
    return requiresSellingPlan;
  }

  public void setRequiresSellingPlan(Boolean requiresSellingPlan) {
    this.requiresSellingPlan = requiresSellingPlan;
  }

  @Override
  public String toString() {
    return "ProductUpdateInput{descriptionHtml='" + descriptionHtml + "', handle='" + handle + "', seo='" + seo + "', productType='" + productType + "', category='" + category + "', tags='" + tags + "', templateSuffix='" + templateSuffix + "', giftCardTemplateSuffix='" + giftCardTemplateSuffix + "', title='" + title + "', vendor='" + vendor + "', redirectNewHandle='" + redirectNewHandle + "', id='" + id + "', collectionsToJoin='" + collectionsToJoin + "', collectionsToLeave='" + collectionsToLeave + "', deleteConflictingConstrainedMetafields='" + deleteConflictingConstrainedMetafields + "', metafields='" + metafields + "', status='" + status + "', requiresSellingPlan='" + requiresSellingPlan + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductUpdateInput that = (ProductUpdateInput) o;
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
        Objects.equals(redirectNewHandle, that.redirectNewHandle) &&
        Objects.equals(id, that.id) &&
        Objects.equals(collectionsToJoin, that.collectionsToJoin) &&
        Objects.equals(collectionsToLeave, that.collectionsToLeave) &&
        Objects.equals(deleteConflictingConstrainedMetafields, that.deleteConflictingConstrainedMetafields) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(status, that.status) &&
        Objects.equals(requiresSellingPlan, that.requiresSellingPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descriptionHtml, handle, seo, productType, category, tags, templateSuffix, giftCardTemplateSuffix, title, vendor, redirectNewHandle, id, collectionsToJoin, collectionsToLeave, deleteConflictingConstrainedMetafields, metafields, status, requiresSellingPlan);
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
     * A unique, human-readable string that's used to identify the product in URLs. A
     * handle can contain letters, hyphens (`-`), and numbers, but no spaces.
     * If no handle is explicitly provided, then the title is used to construct the product's handle.
     * For example, if a product is titled "Black Sunglasses" and no handle is
     * provided, then the handle `black-sunglasses` is generated (unless that handle
     * is already taken, in which case a suffix is added to make the handle unique).
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
     * A list of searchable keywords that are
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
     * The name for the product that displays to customers. If no handle is
     * explicitly provided, then the title is used to construct the product's handle.
     * For example, if a product is titled "Black Sunglasses" and no handle is
     * provided, then the handle `black-sunglasses` is generated.
     */
    private String title;

    /**
     * The name of the product's vendor.
     */
    private String vendor;

    /**
     * Whether a redirect is required after a new handle has been provided.
     * If `true`, then the old handle is redirected to the new one automatically.
     */
    private Boolean redirectNewHandle;

    /**
     * The product's ID.
     */
    private String id;

    /**
     * A list of collection IDs to associate with the product.
     */
    private List<String> collectionsToJoin;

    /**
     * The collection IDs to disassociate from the product.
     */
    private List<String> collectionsToLeave;

    /**
     * Whether to delete metafields whose constraints don't match the product's category.
     * Can only be used when updating the product's category.
     */
    private Boolean deleteConflictingConstrainedMetafields = false;

    /**
     * The [custom fields](https://shopify.dev/docs/apps/build/custom-data) to associate with the product
     * for the purposes of adding and storing additional information.
     */
    private List<MetafieldInput> metafields;

    /**
     * The [product status](https://help.shopify.com/manual/products/details/product-details-page#product-status),
     * which controls visibility across all sales channels.
     */
    private ProductStatus status;

    /**
     * Whether the product can only be purchased with
     * a [selling plan](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans).
     * Products that are sold on subscription (`requiresSellingPlan: true`) can be updated only for online stores.
     * If you update a product to be subscription-only (`requiresSellingPlan:false`),
     * then the product is unpublished from all channels except the online store.
     */
    private Boolean requiresSellingPlan;

    public ProductUpdateInput build() {
      ProductUpdateInput result = new ProductUpdateInput();
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
      result.redirectNewHandle = this.redirectNewHandle;
      result.id = this.id;
      result.collectionsToJoin = this.collectionsToJoin;
      result.collectionsToLeave = this.collectionsToLeave;
      result.deleteConflictingConstrainedMetafields = this.deleteConflictingConstrainedMetafields;
      result.metafields = this.metafields;
      result.status = this.status;
      result.requiresSellingPlan = this.requiresSellingPlan;
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
     * A unique, human-readable string that's used to identify the product in URLs. A
     * handle can contain letters, hyphens (`-`), and numbers, but no spaces.
     * If no handle is explicitly provided, then the title is used to construct the product's handle.
     * For example, if a product is titled "Black Sunglasses" and no handle is
     * provided, then the handle `black-sunglasses` is generated (unless that handle
     * is already taken, in which case a suffix is added to make the handle unique).
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
     * A list of searchable keywords that are
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
     * The name for the product that displays to customers. If no handle is
     * explicitly provided, then the title is used to construct the product's handle.
     * For example, if a product is titled "Black Sunglasses" and no handle is
     * provided, then the handle `black-sunglasses` is generated.
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
     * Whether a redirect is required after a new handle has been provided.
     * If `true`, then the old handle is redirected to the new one automatically.
     */
    public Builder redirectNewHandle(Boolean redirectNewHandle) {
      this.redirectNewHandle = redirectNewHandle;
      return this;
    }

    /**
     * The product's ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * A list of collection IDs to associate with the product.
     */
    public Builder collectionsToJoin(List<String> collectionsToJoin) {
      this.collectionsToJoin = collectionsToJoin;
      return this;
    }

    /**
     * The collection IDs to disassociate from the product.
     */
    public Builder collectionsToLeave(List<String> collectionsToLeave) {
      this.collectionsToLeave = collectionsToLeave;
      return this;
    }

    /**
     * Whether to delete metafields whose constraints don't match the product's category.
     * Can only be used when updating the product's category.
     */
    public Builder deleteConflictingConstrainedMetafields(
        Boolean deleteConflictingConstrainedMetafields) {
      this.deleteConflictingConstrainedMetafields = deleteConflictingConstrainedMetafields;
      return this;
    }

    /**
     * The [custom fields](https://shopify.dev/docs/apps/build/custom-data) to associate with the product
     * for the purposes of adding and storing additional information.
     */
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The [product status](https://help.shopify.com/manual/products/details/product-details-page#product-status),
     * which controls visibility across all sales channels.
     */
    public Builder status(ProductStatus status) {
      this.status = status;
      return this;
    }

    /**
     * Whether the product can only be purchased with
     * a [selling plan](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans).
     * Products that are sold on subscription (`requiresSellingPlan: true`) can be updated only for online stores.
     * If you update a product to be subscription-only (`requiresSellingPlan:false`),
     * then the product is unpublished from all channels except the online store.
     */
    public Builder requiresSellingPlan(Boolean requiresSellingPlan) {
      this.requiresSellingPlan = requiresSellingPlan;
      return this;
    }
  }
}
