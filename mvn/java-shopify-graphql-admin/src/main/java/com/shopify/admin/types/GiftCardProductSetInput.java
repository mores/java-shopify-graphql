package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for creating or updating a gift card product with the
 * [`giftCardProductSet`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/giftCardProductSet)
 * mutation.
 *
 * For list fields like
 * [`variants`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/giftCardProductSet#arguments-input.fields.variants),
 * the mutation creates new entries, updates existing ones, and deletes any entries not included
 * in the input. All other fields update only when explicitly provided, leaving omitted fields
 * unchanged.
 */
public class GiftCardProductSetInput {
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
   * The status of the product.
   */
  private ProductStatus status;

  /**
   * The IDs of collections that this product will be a member of.
   */
  private List<String> collections;

  /**
   * The metafields to associate with this product.
   *   
   * Complexity cost: 0.4 per metafield.
   */
  private List<MetafieldInput> metafields;

  /**
   * The files to associate with the product.
   *   
   * Complexity cost: 1.9 per file.
   */
  private List<FileSetInput> files;

  /**
   * List of custom product options and option values (maximum of 3 per product).
   */
  private List<OptionSetInput> productOptions;

  /**
   * The issuance currency for gift cards fulfilled from this product.
   *   
   * > Note
   * > This value can't be changed after the product is created.
   */
  private CurrencyCode issuanceCurrency;

  /**
   * Whether gift cards fulfilled from this product are redeemable in any payment currency supported by the store.
   *   
   * > Note
   * > This value can't be changed after the product is created.
   */
  private Boolean crossCurrencyRedeemable;

  /**
   * A list of variants associated with the gift card product.
   *   
   * Complexity cost: 0.2 per variant.
   */
  private List<GiftCardProductVariantSetInput> variants;

  public GiftCardProductSetInput() {
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
   * The status of the product.
   */
  public ProductStatus getStatus() {
    return status;
  }

  public void setStatus(ProductStatus status) {
    this.status = status;
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
   *   
   * Complexity cost: 0.4 per metafield.
   */
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  /**
   * The files to associate with the product.
   *   
   * Complexity cost: 1.9 per file.
   */
  public List<FileSetInput> getFiles() {
    return files;
  }

  public void setFiles(List<FileSetInput> files) {
    this.files = files;
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
   * The issuance currency for gift cards fulfilled from this product.
   *   
   * > Note
   * > This value can't be changed after the product is created.
   */
  public CurrencyCode getIssuanceCurrency() {
    return issuanceCurrency;
  }

  public void setIssuanceCurrency(CurrencyCode issuanceCurrency) {
    this.issuanceCurrency = issuanceCurrency;
  }

  /**
   * Whether gift cards fulfilled from this product are redeemable in any payment currency supported by the store.
   *   
   * > Note
   * > This value can't be changed after the product is created.
   */
  public Boolean getCrossCurrencyRedeemable() {
    return crossCurrencyRedeemable;
  }

  public void setCrossCurrencyRedeemable(Boolean crossCurrencyRedeemable) {
    this.crossCurrencyRedeemable = crossCurrencyRedeemable;
  }

  /**
   * A list of variants associated with the gift card product.
   *   
   * Complexity cost: 0.2 per variant.
   */
  public List<GiftCardProductVariantSetInput> getVariants() {
    return variants;
  }

  public void setVariants(List<GiftCardProductVariantSetInput> variants) {
    this.variants = variants;
  }

  @Override
  public String toString() {
    return "GiftCardProductSetInput{descriptionHtml='" + descriptionHtml + "', handle='" + handle + "', seo='" + seo + "', productType='" + productType + "', tags='" + tags + "', templateSuffix='" + templateSuffix + "', giftCardTemplateSuffix='" + giftCardTemplateSuffix + "', title='" + title + "', vendor='" + vendor + "', redirectNewHandle='" + redirectNewHandle + "', status='" + status + "', collections='" + collections + "', metafields='" + metafields + "', files='" + files + "', productOptions='" + productOptions + "', issuanceCurrency='" + issuanceCurrency + "', crossCurrencyRedeemable='" + crossCurrencyRedeemable + "', variants='" + variants + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GiftCardProductSetInput that = (GiftCardProductSetInput) o;
    return Objects.equals(descriptionHtml, that.descriptionHtml) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(seo, that.seo) &&
        Objects.equals(productType, that.productType) &&
        Objects.equals(tags, that.tags) &&
        Objects.equals(templateSuffix, that.templateSuffix) &&
        Objects.equals(giftCardTemplateSuffix, that.giftCardTemplateSuffix) &&
        Objects.equals(title, that.title) &&
        Objects.equals(vendor, that.vendor) &&
        Objects.equals(redirectNewHandle, that.redirectNewHandle) &&
        Objects.equals(status, that.status) &&
        Objects.equals(collections, that.collections) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(files, that.files) &&
        Objects.equals(productOptions, that.productOptions) &&
        Objects.equals(issuanceCurrency, that.issuanceCurrency) &&
        Objects.equals(crossCurrencyRedeemable, that.crossCurrencyRedeemable) &&
        Objects.equals(variants, that.variants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descriptionHtml, handle, seo, productType, tags, templateSuffix, giftCardTemplateSuffix, title, vendor, redirectNewHandle, status, collections, metafields, files, productOptions, issuanceCurrency, crossCurrencyRedeemable, variants);
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
     * The status of the product.
     */
    private ProductStatus status;

    /**
     * The IDs of collections that this product will be a member of.
     */
    private List<String> collections;

    /**
     * The metafields to associate with this product.
     *   
     * Complexity cost: 0.4 per metafield.
     */
    private List<MetafieldInput> metafields;

    /**
     * The files to associate with the product.
     *   
     * Complexity cost: 1.9 per file.
     */
    private List<FileSetInput> files;

    /**
     * List of custom product options and option values (maximum of 3 per product).
     */
    private List<OptionSetInput> productOptions;

    /**
     * The issuance currency for gift cards fulfilled from this product.
     *   
     * > Note
     * > This value can't be changed after the product is created.
     */
    private CurrencyCode issuanceCurrency;

    /**
     * Whether gift cards fulfilled from this product are redeemable in any payment currency supported by the store.
     *   
     * > Note
     * > This value can't be changed after the product is created.
     */
    private Boolean crossCurrencyRedeemable;

    /**
     * A list of variants associated with the gift card product.
     *   
     * Complexity cost: 0.2 per variant.
     */
    private List<GiftCardProductVariantSetInput> variants;

    public GiftCardProductSetInput build() {
      GiftCardProductSetInput result = new GiftCardProductSetInput();
      result.descriptionHtml = this.descriptionHtml;
      result.handle = this.handle;
      result.seo = this.seo;
      result.productType = this.productType;
      result.tags = this.tags;
      result.templateSuffix = this.templateSuffix;
      result.giftCardTemplateSuffix = this.giftCardTemplateSuffix;
      result.title = this.title;
      result.vendor = this.vendor;
      result.redirectNewHandle = this.redirectNewHandle;
      result.status = this.status;
      result.collections = this.collections;
      result.metafields = this.metafields;
      result.files = this.files;
      result.productOptions = this.productOptions;
      result.issuanceCurrency = this.issuanceCurrency;
      result.crossCurrencyRedeemable = this.crossCurrencyRedeemable;
      result.variants = this.variants;
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
     * The status of the product.
     */
    public Builder status(ProductStatus status) {
      this.status = status;
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
     *   
     * Complexity cost: 0.4 per metafield.
     */
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The files to associate with the product.
     *   
     * Complexity cost: 1.9 per file.
     */
    public Builder files(List<FileSetInput> files) {
      this.files = files;
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
     * The issuance currency for gift cards fulfilled from this product.
     *   
     * > Note
     * > This value can't be changed after the product is created.
     */
    public Builder issuanceCurrency(CurrencyCode issuanceCurrency) {
      this.issuanceCurrency = issuanceCurrency;
      return this;
    }

    /**
     * Whether gift cards fulfilled from this product are redeemable in any payment currency supported by the store.
     *   
     * > Note
     * > This value can't be changed after the product is created.
     */
    public Builder crossCurrencyRedeemable(Boolean crossCurrencyRedeemable) {
      this.crossCurrencyRedeemable = crossCurrencyRedeemable;
      return this;
    }

    /**
     * A list of variants associated with the gift card product.
     *   
     * Complexity cost: 0.2 per variant.
     */
    public Builder variants(List<GiftCardProductVariantSetInput> variants) {
      this.variants = variants;
      return this;
    }
  }
}
