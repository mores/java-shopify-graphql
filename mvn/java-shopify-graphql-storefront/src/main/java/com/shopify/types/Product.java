package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * The `Product` object lets you manage products in a merchant’s store.
 *
 * Products are the goods and services that merchants offer to customers.
 * They can include various details such as title, description, price, images, and options such as size or color.
 * You can use [product variants](/docs/api/storefront/latest/objects/ProductVariant)
 * to create or update different versions of the same product.
 * You can also add or update product [media](/docs/api/storefront/latest/interfaces/Media).
 * Products can be organized by grouping them into a [collection](/docs/api/storefront/latest/objects/Collection).
 *
 * Learn more about working with [products and collections](/docs/storefronts/headless/building-with-the-storefront-api/products-collections).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Product implements MenuItemResource, MetafieldParentResource, MetafieldReference, SearchResultItem, com.shopify.types.HasMetafields, com.shopify.types.Node, com.shopify.types.OnlineStorePublishable, com.shopify.types.Trackable {
  /**
   * A list of variants whose selected options differ with the provided selected options by one, ordered by variant id.
   * If selected options are not provided, adjacent variants to the first available variant is returned.
   *   
   * Note that this field returns an array of variants. In most cases, the number of variants in this array will be low.
   * However, with a low number of options and a high number of values per option, the number of variants returned
   * here can be high. In such cases, it recommended to avoid using this field.
   *   
   * This list of variants can be used in combination with the `options` field to build a rich variant picker that
   * includes variant availability or other variant information.
   */
  private List<ProductVariant> adjacentVariants;

  /**
   * Indicates if at least one product variant is available for sale.
   */
  private boolean availableForSale;

  /**
   * The category of a product from [Shopify's Standard Product Taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17).
   */
  private TaxonomyCategory category;

  /**
   * A list of [collections](/docs/api/storefront/latest/objects/Collection) that include the product.
   */
  private CollectionConnection collections;

  /**
   * The [compare-at price range](https://help.shopify.com/manual/products/details/product-pricing/sale-pricing)
   * of the product in the shop's default currency.
   */
  private ProductPriceRange compareAtPriceRange;

  /**
   * The date and time when the product was created.
   */
  private OffsetDateTime createdAt;

  /**
   * A single-line description of the product, with [HTML tags](https://developer.mozilla.org/en-US/docs/Web/HTML) removed.
   */
  private String description;

  /**
   * The description of the product, with
   * HTML tags. For example, the description might include
   * bold `<strong></strong>` and italic `<i></i>` text.
   */
  private String descriptionHtml;

  /**
   * An encoded string containing all option value combinations
   * with a corresponding variant that is currently available for sale.
   *   
   * Integers represent option and values:
   * [0,1] represents option_value at array index 0 for the option at array index 0
   *   
   * `:`, `,`, ` ` and `-` are control characters.
   * `:` indicates a new option. ex: 0:1 indicates value 0 for the option in position 1, value 1 for the option in position 2.
   * `,` indicates the end of a repeated prefix, mulitple consecutive commas indicate the end of multiple repeated prefixes.
   * ` ` indicates a gap in the sequence of option values. ex: 0 4 indicates option values in position 0 and 4 are present.
   * `-` indicates a continuous range of option values. ex: 0 1-3 4
   *   
   * Decoding process:
   *   
   * Example options: [Size, Color, Material]
   * Example values: [[Small, Medium, Large], [Red, Blue], [Cotton, Wool]]
   * Example encoded string: "0:0:0,1:0-1,,1:0:0-1,1:1,,2:0:1,1:0,,"
   *   
   * Step 1: Expand ranges into the numbers they represent: "0:0:0,1:0 1,,1:0:0 1,1:1,,2:0:1,1:0,,"
   * Step 2: Expand repeated prefixes: "0:0:0,0:1:0 1,1:0:0 1,1:1:1,2:0:1,2:1:0,"
   * Step 3: Expand shared prefixes so data is encoded as a string: "0:0:0,0:1:0,0:1:1,1:0:0,1:0:1,1:1:1,2:0:1,2:1:0,"
   * Step 4: Map to options + option values to determine existing variants:
   *   
   * [Small, Red, Cotton] (0:0:0), [Small, Blue, Cotton] (0:1:0), [Small, Blue, Wool] (0:1:1),
   * [Medium, Red, Cotton] (1:0:0), [Medium, Red, Wool] (1:0:1), [Medium, Blue, Wool] (1:1:1),
   * [Large, Red, Wool] (2:0:1), [Large, Blue, Cotton] (2:1:0).
   */
  private String encodedVariantAvailability;

  /**
   * An encoded string containing all option value combinations with a corresponding variant.
   *   
   * Integers represent option and values:
   * [0,1] represents option_value at array index 0 for the option at array index 0
   *   
   * `:`, `,`, ` ` and `-` are control characters.
   * `:` indicates a new option. ex: 0:1 indicates value 0 for the option in position 1, value 1 for the option in position 2.
   * `,` indicates the end of a repeated prefix, mulitple consecutive commas indicate the end of multiple repeated prefixes.
   * ` ` indicates a gap in the sequence of option values. ex: 0 4 indicates option values in position 0 and 4 are present.
   * `-` indicates a continuous range of option values. ex: 0 1-3 4
   *   
   * Decoding process:
   *   
   * Example options: [Size, Color, Material]
   * Example values: [[Small, Medium, Large], [Red, Blue], [Cotton, Wool]]
   * Example encoded string: "0:0:0,1:0-1,,1:0:0-1,1:1,,2:0:1,1:0,,"
   *   
   * Step 1: Expand ranges into the numbers they represent: "0:0:0,1:0 1,,1:0:0 1,1:1,,2:0:1,1:0,,"
   * Step 2: Expand repeated prefixes: "0:0:0,0:1:0 1,1:0:0 1,1:1:1,2:0:1,2:1:0,"
   * Step 3: Expand shared prefixes so data is encoded as a string: "0:0:0,0:1:0,0:1:1,1:0:0,1:0:1,1:1:1,2:0:1,2:1:0,"
   * Step 4: Map to options + option values to determine existing variants:
   *   
   * [Small, Red, Cotton] (0:0:0), [Small, Blue, Cotton] (0:1:0), [Small, Blue, Wool] (0:1:1),
   * [Medium, Red, Cotton] (1:0:0), [Medium, Red, Wool] (1:0:1), [Medium, Blue, Wool] (1:1:1),
   * [Large, Red, Wool] (2:0:1), [Large, Blue, Cotton] (2:1:0).
   */
  private String encodedVariantExistence;

  /**
   * The featured image for the product.
   *   
   * This field is functionally equivalent to `images(first: 1)`.
   */
  private Image featuredImage;

  /**
   * A unique, human-readable string of the product's title.
   * A handle can contain letters, hyphens (`-`), and numbers, but no spaces.
   * The handle is used in the online store URL for the product.
   */
  private String handle;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * List of images associated with the product.
   */
  private ImageConnection images;

  /**
   * Whether the product is a gift card.
   */
  private boolean isGiftCard;

  /**
   * The [media](/docs/apps/build/online-store/product-media) that are associated
   * with the product. Valid media are images, 3D models, videos.
   */
  private MediaConnection media;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
   * its `namespace` and `key`, that's associated with a Shopify resource for the
   * purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
   */
  private List<Metafield> metafields;

  /**
   * The product's URL on the online store.
   * If `null`, then the product isn't published to the online store sales channel.
   */
  private String onlineStoreUrl;

  /**
   * A list of product options. The limit is defined by the [shop's resource limits for product
   * options](/docs/api/admin-graphql/latest/objects/Shop#field-resourcelimits)
   * (`Shop.resourceLimits.maxProductOptions`).
   */
  private List<ProductOption> options;

  /**
   * The minimum and maximum prices of a product, expressed in decimal numbers.
   * For example, if the product is priced between $10.00 and $50.00,
   * then the price range is $10.00 - $50.00.
   */
  private ProductPriceRange priceRange;

  /**
   * The [product type](https://help.shopify.com/manual/products/details/product-type)
   * that merchants define.
   */
  private String productType;

  /**
   * The date and time when the product was published to the channel.
   */
  private OffsetDateTime publishedAt;

  /**
   * Whether the product can only be purchased with a [selling
   * plan](/docs/apps/build/purchase-options/subscriptions/selling-plans). Products
   * that are sold on subscription (`requiresSellingPlan: true`) can be updated
   * only for online stores. If you update a product to be subscription-only
   * (`requiresSellingPlan:false`), then the product is unpublished from all
   * channels, except the online store.
   */
  private boolean requiresSellingPlan;

  /**
   * Find an active product variant based on selected options, availability or the first variant.
   *   
   * All arguments are optional. If no selected options are provided, the first available variant is returned.
   * If no variants are available, the first variant is returned.
   */
  private ProductVariant selectedOrFirstAvailableVariant;

  /**
   * A list of all [selling plan groups](/docs/apps/build/purchase-options/subscriptions/selling-plans/build-a-selling-plan)
   * that are associated with the product either directly, or through the product's variants.
   */
  private SellingPlanGroupConnection sellingPlanGroups;

  /**
   * The [SEO title and description](https://help.shopify.com/manual/promoting-marketing/seo/adding-keywords)
   * that are associated with a product.
   */
  private SEO seo;

  /**
   * A comma-separated list of searchable keywords that are
   * associated with the product. For example, a merchant might apply the `sports`
   * and `summer` tags to products that are associated with sportwear for summer.
   * Updating `tags` overwrites any existing tags that were previously added to the product.
   * To add new tags without overwriting existing tags,
   * use the GraphQL Admin API's [`tagsAdd`](/docs/api/admin-graphql/latest/mutations/tagsadd)
   * mutation.
   */
  private List<String> tags;

  /**
   * The name for the product that displays to customers. The title is used to construct the product's handle.
   * For example, if a product is titled "Black Sunglasses", then the handle is `black-sunglasses`.
   */
  private String title;

  /**
   * The quantity of inventory that's in stock.
   */
  private Integer totalInventory;

  /**
   * URL parameters to be added to a page URL to track the origin of on-site search
   * traffic for [analytics reporting](https://help.shopify.com/manual/reports-and-analytics/shopify-reports/report-types/default-reports/behaviour-reports).
   * Returns a result when accessed through the
   * [search](https://shopify.dev/docs/api/storefront/current/queries/search) or [predictiveSearch](https://shopify.dev/docs/api/storefront/current/queries/predictiveSearch)
   * queries, otherwise returns null.
   */
  private String trackingParameters;

  /**
   * The date and time when the product was last modified.
   * A product's `updatedAt` value can change for different reasons. For example, if an order
   * is placed for a product that has inventory tracking set up, then the inventory adjustment
   * is counted as an update.
   */
  private OffsetDateTime updatedAt;

  /**
   * Find a product’s variant based on its selected options.
   * This is useful for converting a user’s selection of product options into a single matching variant.
   * If there is not a variant for the selected options, `null` will be returned.
   */
  private ProductVariant variantBySelectedOptions;

  /**
   * A list of [variants](/docs/api/storefront/latest/objects/ProductVariant) that are associated with the product.
   */
  private ProductVariantConnection variants;

  /**
   * The number of [variants](/docs/api/storefront/latest/objects/ProductVariant) that are associated with the product.
   */
  private Count variantsCount;

  /**
   * The name of the product's vendor.
   */
  private String vendor;

  public Product() {
  }

  /**
   * A list of variants whose selected options differ with the provided selected options by one, ordered by variant id.
   * If selected options are not provided, adjacent variants to the first available variant is returned.
   *   
   * Note that this field returns an array of variants. In most cases, the number of variants in this array will be low.
   * However, with a low number of options and a high number of values per option, the number of variants returned
   * here can be high. In such cases, it recommended to avoid using this field.
   *   
   * This list of variants can be used in combination with the `options` field to build a rich variant picker that
   * includes variant availability or other variant information.
   */
  public List<ProductVariant> getAdjacentVariants() {
    return adjacentVariants;
  }

  public void setAdjacentVariants(List<ProductVariant> adjacentVariants) {
    this.adjacentVariants = adjacentVariants;
  }

  /**
   * Indicates if at least one product variant is available for sale.
   */
  public boolean getAvailableForSale() {
    return availableForSale;
  }

  public void setAvailableForSale(boolean availableForSale) {
    this.availableForSale = availableForSale;
  }

  /**
   * The category of a product from [Shopify's Standard Product Taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17).
   */
  public TaxonomyCategory getCategory() {
    return category;
  }

  public void setCategory(TaxonomyCategory category) {
    this.category = category;
  }

  /**
   * A list of [collections](/docs/api/storefront/latest/objects/Collection) that include the product.
   */
  public CollectionConnection getCollections() {
    return collections;
  }

  public void setCollections(CollectionConnection collections) {
    this.collections = collections;
  }

  /**
   * The [compare-at price range](https://help.shopify.com/manual/products/details/product-pricing/sale-pricing)
   * of the product in the shop's default currency.
   */
  public ProductPriceRange getCompareAtPriceRange() {
    return compareAtPriceRange;
  }

  public void setCompareAtPriceRange(ProductPriceRange compareAtPriceRange) {
    this.compareAtPriceRange = compareAtPriceRange;
  }

  /**
   * The date and time when the product was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * A single-line description of the product, with [HTML tags](https://developer.mozilla.org/en-US/docs/Web/HTML) removed.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The description of the product, with
   * HTML tags. For example, the description might include
   * bold `<strong></strong>` and italic `<i></i>` text.
   */
  public String getDescriptionHtml() {
    return descriptionHtml;
  }

  public void setDescriptionHtml(String descriptionHtml) {
    this.descriptionHtml = descriptionHtml;
  }

  /**
   * An encoded string containing all option value combinations
   * with a corresponding variant that is currently available for sale.
   *   
   * Integers represent option and values:
   * [0,1] represents option_value at array index 0 for the option at array index 0
   *   
   * `:`, `,`, ` ` and `-` are control characters.
   * `:` indicates a new option. ex: 0:1 indicates value 0 for the option in position 1, value 1 for the option in position 2.
   * `,` indicates the end of a repeated prefix, mulitple consecutive commas indicate the end of multiple repeated prefixes.
   * ` ` indicates a gap in the sequence of option values. ex: 0 4 indicates option values in position 0 and 4 are present.
   * `-` indicates a continuous range of option values. ex: 0 1-3 4
   *   
   * Decoding process:
   *   
   * Example options: [Size, Color, Material]
   * Example values: [[Small, Medium, Large], [Red, Blue], [Cotton, Wool]]
   * Example encoded string: "0:0:0,1:0-1,,1:0:0-1,1:1,,2:0:1,1:0,,"
   *   
   * Step 1: Expand ranges into the numbers they represent: "0:0:0,1:0 1,,1:0:0 1,1:1,,2:0:1,1:0,,"
   * Step 2: Expand repeated prefixes: "0:0:0,0:1:0 1,1:0:0 1,1:1:1,2:0:1,2:1:0,"
   * Step 3: Expand shared prefixes so data is encoded as a string: "0:0:0,0:1:0,0:1:1,1:0:0,1:0:1,1:1:1,2:0:1,2:1:0,"
   * Step 4: Map to options + option values to determine existing variants:
   *   
   * [Small, Red, Cotton] (0:0:0), [Small, Blue, Cotton] (0:1:0), [Small, Blue, Wool] (0:1:1),
   * [Medium, Red, Cotton] (1:0:0), [Medium, Red, Wool] (1:0:1), [Medium, Blue, Wool] (1:1:1),
   * [Large, Red, Wool] (2:0:1), [Large, Blue, Cotton] (2:1:0).
   */
  public String getEncodedVariantAvailability() {
    return encodedVariantAvailability;
  }

  public void setEncodedVariantAvailability(String encodedVariantAvailability) {
    this.encodedVariantAvailability = encodedVariantAvailability;
  }

  /**
   * An encoded string containing all option value combinations with a corresponding variant.
   *   
   * Integers represent option and values:
   * [0,1] represents option_value at array index 0 for the option at array index 0
   *   
   * `:`, `,`, ` ` and `-` are control characters.
   * `:` indicates a new option. ex: 0:1 indicates value 0 for the option in position 1, value 1 for the option in position 2.
   * `,` indicates the end of a repeated prefix, mulitple consecutive commas indicate the end of multiple repeated prefixes.
   * ` ` indicates a gap in the sequence of option values. ex: 0 4 indicates option values in position 0 and 4 are present.
   * `-` indicates a continuous range of option values. ex: 0 1-3 4
   *   
   * Decoding process:
   *   
   * Example options: [Size, Color, Material]
   * Example values: [[Small, Medium, Large], [Red, Blue], [Cotton, Wool]]
   * Example encoded string: "0:0:0,1:0-1,,1:0:0-1,1:1,,2:0:1,1:0,,"
   *   
   * Step 1: Expand ranges into the numbers they represent: "0:0:0,1:0 1,,1:0:0 1,1:1,,2:0:1,1:0,,"
   * Step 2: Expand repeated prefixes: "0:0:0,0:1:0 1,1:0:0 1,1:1:1,2:0:1,2:1:0,"
   * Step 3: Expand shared prefixes so data is encoded as a string: "0:0:0,0:1:0,0:1:1,1:0:0,1:0:1,1:1:1,2:0:1,2:1:0,"
   * Step 4: Map to options + option values to determine existing variants:
   *   
   * [Small, Red, Cotton] (0:0:0), [Small, Blue, Cotton] (0:1:0), [Small, Blue, Wool] (0:1:1),
   * [Medium, Red, Cotton] (1:0:0), [Medium, Red, Wool] (1:0:1), [Medium, Blue, Wool] (1:1:1),
   * [Large, Red, Wool] (2:0:1), [Large, Blue, Cotton] (2:1:0).
   */
  public String getEncodedVariantExistence() {
    return encodedVariantExistence;
  }

  public void setEncodedVariantExistence(String encodedVariantExistence) {
    this.encodedVariantExistence = encodedVariantExistence;
  }

  /**
   * The featured image for the product.
   *   
   * This field is functionally equivalent to `images(first: 1)`.
   */
  public Image getFeaturedImage() {
    return featuredImage;
  }

  public void setFeaturedImage(Image featuredImage) {
    this.featuredImage = featuredImage;
  }

  /**
   * A unique, human-readable string of the product's title.
   * A handle can contain letters, hyphens (`-`), and numbers, but no spaces.
   * The handle is used in the online store URL for the product.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
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
   * List of images associated with the product.
   */
  public ImageConnection getImages() {
    return images;
  }

  public void setImages(ImageConnection images) {
    this.images = images;
  }

  /**
   * Whether the product is a gift card.
   */
  public boolean getIsGiftCard() {
    return isGiftCard;
  }

  public void setIsGiftCard(boolean isGiftCard) {
    this.isGiftCard = isGiftCard;
  }

  /**
   * The [media](/docs/apps/build/online-store/product-media) that are associated
   * with the product. Valid media are images, 3D models, videos.
   */
  public MediaConnection getMedia() {
    return media;
  }

  public void setMedia(MediaConnection media) {
    this.media = media;
  }

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
   * its `namespace` and `key`, that's associated with a Shopify resource for the
   * purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
   */
  public List<Metafield> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<Metafield> metafields) {
    this.metafields = metafields;
  }

  /**
   * The product's URL on the online store.
   * If `null`, then the product isn't published to the online store sales channel.
   */
  public String getOnlineStoreUrl() {
    return onlineStoreUrl;
  }

  public void setOnlineStoreUrl(String onlineStoreUrl) {
    this.onlineStoreUrl = onlineStoreUrl;
  }

  /**
   * A list of product options. The limit is defined by the [shop's resource limits for product
   * options](/docs/api/admin-graphql/latest/objects/Shop#field-resourcelimits)
   * (`Shop.resourceLimits.maxProductOptions`).
   */
  public List<ProductOption> getOptions() {
    return options;
  }

  public void setOptions(List<ProductOption> options) {
    this.options = options;
  }

  /**
   * The minimum and maximum prices of a product, expressed in decimal numbers.
   * For example, if the product is priced between $10.00 and $50.00,
   * then the price range is $10.00 - $50.00.
   */
  public ProductPriceRange getPriceRange() {
    return priceRange;
  }

  public void setPriceRange(ProductPriceRange priceRange) {
    this.priceRange = priceRange;
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
   * The date and time when the product was published to the channel.
   */
  public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
  }

  /**
   * Whether the product can only be purchased with a [selling
   * plan](/docs/apps/build/purchase-options/subscriptions/selling-plans). Products
   * that are sold on subscription (`requiresSellingPlan: true`) can be updated
   * only for online stores. If you update a product to be subscription-only
   * (`requiresSellingPlan:false`), then the product is unpublished from all
   * channels, except the online store.
   */
  public boolean getRequiresSellingPlan() {
    return requiresSellingPlan;
  }

  public void setRequiresSellingPlan(boolean requiresSellingPlan) {
    this.requiresSellingPlan = requiresSellingPlan;
  }

  /**
   * Find an active product variant based on selected options, availability or the first variant.
   *   
   * All arguments are optional. If no selected options are provided, the first available variant is returned.
   * If no variants are available, the first variant is returned.
   */
  public ProductVariant getSelectedOrFirstAvailableVariant() {
    return selectedOrFirstAvailableVariant;
  }

  public void setSelectedOrFirstAvailableVariant(ProductVariant selectedOrFirstAvailableVariant) {
    this.selectedOrFirstAvailableVariant = selectedOrFirstAvailableVariant;
  }

  /**
   * A list of all [selling plan groups](/docs/apps/build/purchase-options/subscriptions/selling-plans/build-a-selling-plan)
   * that are associated with the product either directly, or through the product's variants.
   */
  public SellingPlanGroupConnection getSellingPlanGroups() {
    return sellingPlanGroups;
  }

  public void setSellingPlanGroups(SellingPlanGroupConnection sellingPlanGroups) {
    this.sellingPlanGroups = sellingPlanGroups;
  }

  /**
   * The [SEO title and description](https://help.shopify.com/manual/promoting-marketing/seo/adding-keywords)
   * that are associated with a product.
   */
  public SEO getSeo() {
    return seo;
  }

  public void setSeo(SEO seo) {
    this.seo = seo;
  }

  /**
   * A comma-separated list of searchable keywords that are
   * associated with the product. For example, a merchant might apply the `sports`
   * and `summer` tags to products that are associated with sportwear for summer.
   * Updating `tags` overwrites any existing tags that were previously added to the product.
   * To add new tags without overwriting existing tags,
   * use the GraphQL Admin API's [`tagsAdd`](/docs/api/admin-graphql/latest/mutations/tagsadd)
   * mutation.
   */
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
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
   * The quantity of inventory that's in stock.
   */
  public Integer getTotalInventory() {
    return totalInventory;
  }

  public void setTotalInventory(Integer totalInventory) {
    this.totalInventory = totalInventory;
  }

  /**
   * URL parameters to be added to a page URL to track the origin of on-site search
   * traffic for [analytics reporting](https://help.shopify.com/manual/reports-and-analytics/shopify-reports/report-types/default-reports/behaviour-reports).
   * Returns a result when accessed through the
   * [search](https://shopify.dev/docs/api/storefront/current/queries/search) or [predictiveSearch](https://shopify.dev/docs/api/storefront/current/queries/predictiveSearch)
   * queries, otherwise returns null.
   */
  public String getTrackingParameters() {
    return trackingParameters;
  }

  public void setTrackingParameters(String trackingParameters) {
    this.trackingParameters = trackingParameters;
  }

  /**
   * The date and time when the product was last modified.
   * A product's `updatedAt` value can change for different reasons. For example, if an order
   * is placed for a product that has inventory tracking set up, then the inventory adjustment
   * is counted as an update.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Find a product’s variant based on its selected options.
   * This is useful for converting a user’s selection of product options into a single matching variant.
   * If there is not a variant for the selected options, `null` will be returned.
   */
  public ProductVariant getVariantBySelectedOptions() {
    return variantBySelectedOptions;
  }

  public void setVariantBySelectedOptions(ProductVariant variantBySelectedOptions) {
    this.variantBySelectedOptions = variantBySelectedOptions;
  }

  /**
   * A list of [variants](/docs/api/storefront/latest/objects/ProductVariant) that are associated with the product.
   */
  public ProductVariantConnection getVariants() {
    return variants;
  }

  public void setVariants(ProductVariantConnection variants) {
    this.variants = variants;
  }

  /**
   * The number of [variants](/docs/api/storefront/latest/objects/ProductVariant) that are associated with the product.
   */
  public Count getVariantsCount() {
    return variantsCount;
  }

  public void setVariantsCount(Count variantsCount) {
    this.variantsCount = variantsCount;
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

  @Override
  public String toString() {
    return "Product{adjacentVariants='" + adjacentVariants + "', availableForSale='" + availableForSale + "', category='" + category + "', collections='" + collections + "', compareAtPriceRange='" + compareAtPriceRange + "', createdAt='" + createdAt + "', description='" + description + "', descriptionHtml='" + descriptionHtml + "', encodedVariantAvailability='" + encodedVariantAvailability + "', encodedVariantExistence='" + encodedVariantExistence + "', featuredImage='" + featuredImage + "', handle='" + handle + "', id='" + id + "', images='" + images + "', isGiftCard='" + isGiftCard + "', media='" + media + "', metafield='" + metafield + "', metafields='" + metafields + "', onlineStoreUrl='" + onlineStoreUrl + "', options='" + options + "', priceRange='" + priceRange + "', productType='" + productType + "', publishedAt='" + publishedAt + "', requiresSellingPlan='" + requiresSellingPlan + "', selectedOrFirstAvailableVariant='" + selectedOrFirstAvailableVariant + "', sellingPlanGroups='" + sellingPlanGroups + "', seo='" + seo + "', tags='" + tags + "', title='" + title + "', totalInventory='" + totalInventory + "', trackingParameters='" + trackingParameters + "', updatedAt='" + updatedAt + "', variantBySelectedOptions='" + variantBySelectedOptions + "', variants='" + variants + "', variantsCount='" + variantsCount + "', vendor='" + vendor + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Product that = (Product) o;
    return Objects.equals(adjacentVariants, that.adjacentVariants) &&
        availableForSale == that.availableForSale &&
        Objects.equals(category, that.category) &&
        Objects.equals(collections, that.collections) &&
        Objects.equals(compareAtPriceRange, that.compareAtPriceRange) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(description, that.description) &&
        Objects.equals(descriptionHtml, that.descriptionHtml) &&
        Objects.equals(encodedVariantAvailability, that.encodedVariantAvailability) &&
        Objects.equals(encodedVariantExistence, that.encodedVariantExistence) &&
        Objects.equals(featuredImage, that.featuredImage) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(id, that.id) &&
        Objects.equals(images, that.images) &&
        isGiftCard == that.isGiftCard &&
        Objects.equals(media, that.media) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(onlineStoreUrl, that.onlineStoreUrl) &&
        Objects.equals(options, that.options) &&
        Objects.equals(priceRange, that.priceRange) &&
        Objects.equals(productType, that.productType) &&
        Objects.equals(publishedAt, that.publishedAt) &&
        requiresSellingPlan == that.requiresSellingPlan &&
        Objects.equals(selectedOrFirstAvailableVariant, that.selectedOrFirstAvailableVariant) &&
        Objects.equals(sellingPlanGroups, that.sellingPlanGroups) &&
        Objects.equals(seo, that.seo) &&
        Objects.equals(tags, that.tags) &&
        Objects.equals(title, that.title) &&
        Objects.equals(totalInventory, that.totalInventory) &&
        Objects.equals(trackingParameters, that.trackingParameters) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(variantBySelectedOptions, that.variantBySelectedOptions) &&
        Objects.equals(variants, that.variants) &&
        Objects.equals(variantsCount, that.variantsCount) &&
        Objects.equals(vendor, that.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjacentVariants, availableForSale, category, collections, compareAtPriceRange, createdAt, description, descriptionHtml, encodedVariantAvailability, encodedVariantExistence, featuredImage, handle, id, images, isGiftCard, media, metafield, metafields, onlineStoreUrl, options, priceRange, productType, publishedAt, requiresSellingPlan, selectedOrFirstAvailableVariant, sellingPlanGroups, seo, tags, title, totalInventory, trackingParameters, updatedAt, variantBySelectedOptions, variants, variantsCount, vendor);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of variants whose selected options differ with the provided selected options by one, ordered by variant id.
     * If selected options are not provided, adjacent variants to the first available variant is returned.
     *   
     * Note that this field returns an array of variants. In most cases, the number of variants in this array will be low.
     * However, with a low number of options and a high number of values per option, the number of variants returned
     * here can be high. In such cases, it recommended to avoid using this field.
     *   
     * This list of variants can be used in combination with the `options` field to build a rich variant picker that
     * includes variant availability or other variant information.
     */
    private List<ProductVariant> adjacentVariants;

    /**
     * Indicates if at least one product variant is available for sale.
     */
    private boolean availableForSale;

    /**
     * The category of a product from [Shopify's Standard Product Taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17).
     */
    private TaxonomyCategory category;

    /**
     * A list of [collections](/docs/api/storefront/latest/objects/Collection) that include the product.
     */
    private CollectionConnection collections;

    /**
     * The [compare-at price range](https://help.shopify.com/manual/products/details/product-pricing/sale-pricing)
     * of the product in the shop's default currency.
     */
    private ProductPriceRange compareAtPriceRange;

    /**
     * The date and time when the product was created.
     */
    private OffsetDateTime createdAt;

    /**
     * A single-line description of the product, with [HTML tags](https://developer.mozilla.org/en-US/docs/Web/HTML) removed.
     */
    private String description;

    /**
     * The description of the product, with
     * HTML tags. For example, the description might include
     * bold `<strong></strong>` and italic `<i></i>` text.
     */
    private String descriptionHtml;

    /**
     * An encoded string containing all option value combinations
     * with a corresponding variant that is currently available for sale.
     *   
     * Integers represent option and values:
     * [0,1] represents option_value at array index 0 for the option at array index 0
     *   
     * `:`, `,`, ` ` and `-` are control characters.
     * `:` indicates a new option. ex: 0:1 indicates value 0 for the option in position 1, value 1 for the option in position 2.
     * `,` indicates the end of a repeated prefix, mulitple consecutive commas indicate the end of multiple repeated prefixes.
     * ` ` indicates a gap in the sequence of option values. ex: 0 4 indicates option values in position 0 and 4 are present.
     * `-` indicates a continuous range of option values. ex: 0 1-3 4
     *   
     * Decoding process:
     *   
     * Example options: [Size, Color, Material]
     * Example values: [[Small, Medium, Large], [Red, Blue], [Cotton, Wool]]
     * Example encoded string: "0:0:0,1:0-1,,1:0:0-1,1:1,,2:0:1,1:0,,"
     *   
     * Step 1: Expand ranges into the numbers they represent: "0:0:0,1:0 1,,1:0:0 1,1:1,,2:0:1,1:0,,"
     * Step 2: Expand repeated prefixes: "0:0:0,0:1:0 1,1:0:0 1,1:1:1,2:0:1,2:1:0,"
     * Step 3: Expand shared prefixes so data is encoded as a string: "0:0:0,0:1:0,0:1:1,1:0:0,1:0:1,1:1:1,2:0:1,2:1:0,"
     * Step 4: Map to options + option values to determine existing variants:
     *   
     * [Small, Red, Cotton] (0:0:0), [Small, Blue, Cotton] (0:1:0), [Small, Blue, Wool] (0:1:1),
     * [Medium, Red, Cotton] (1:0:0), [Medium, Red, Wool] (1:0:1), [Medium, Blue, Wool] (1:1:1),
     * [Large, Red, Wool] (2:0:1), [Large, Blue, Cotton] (2:1:0).
     */
    private String encodedVariantAvailability;

    /**
     * An encoded string containing all option value combinations with a corresponding variant.
     *   
     * Integers represent option and values:
     * [0,1] represents option_value at array index 0 for the option at array index 0
     *   
     * `:`, `,`, ` ` and `-` are control characters.
     * `:` indicates a new option. ex: 0:1 indicates value 0 for the option in position 1, value 1 for the option in position 2.
     * `,` indicates the end of a repeated prefix, mulitple consecutive commas indicate the end of multiple repeated prefixes.
     * ` ` indicates a gap in the sequence of option values. ex: 0 4 indicates option values in position 0 and 4 are present.
     * `-` indicates a continuous range of option values. ex: 0 1-3 4
     *   
     * Decoding process:
     *   
     * Example options: [Size, Color, Material]
     * Example values: [[Small, Medium, Large], [Red, Blue], [Cotton, Wool]]
     * Example encoded string: "0:0:0,1:0-1,,1:0:0-1,1:1,,2:0:1,1:0,,"
     *   
     * Step 1: Expand ranges into the numbers they represent: "0:0:0,1:0 1,,1:0:0 1,1:1,,2:0:1,1:0,,"
     * Step 2: Expand repeated prefixes: "0:0:0,0:1:0 1,1:0:0 1,1:1:1,2:0:1,2:1:0,"
     * Step 3: Expand shared prefixes so data is encoded as a string: "0:0:0,0:1:0,0:1:1,1:0:0,1:0:1,1:1:1,2:0:1,2:1:0,"
     * Step 4: Map to options + option values to determine existing variants:
     *   
     * [Small, Red, Cotton] (0:0:0), [Small, Blue, Cotton] (0:1:0), [Small, Blue, Wool] (0:1:1),
     * [Medium, Red, Cotton] (1:0:0), [Medium, Red, Wool] (1:0:1), [Medium, Blue, Wool] (1:1:1),
     * [Large, Red, Wool] (2:0:1), [Large, Blue, Cotton] (2:1:0).
     */
    private String encodedVariantExistence;

    /**
     * The featured image for the product.
     *   
     * This field is functionally equivalent to `images(first: 1)`.
     */
    private Image featuredImage;

    /**
     * A unique, human-readable string of the product's title.
     * A handle can contain letters, hyphens (`-`), and numbers, but no spaces.
     * The handle is used in the online store URL for the product.
     */
    private String handle;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * List of images associated with the product.
     */
    private ImageConnection images;

    /**
     * Whether the product is a gift card.
     */
    private boolean isGiftCard;

    /**
     * The [media](/docs/apps/build/online-store/product-media) that are associated
     * with the product. Valid media are images, 3D models, videos.
     */
    private MediaConnection media;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
     * its `namespace` and `key`, that's associated with a Shopify resource for the
     * purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
     */
    private List<Metafield> metafields;

    /**
     * The product's URL on the online store.
     * If `null`, then the product isn't published to the online store sales channel.
     */
    private String onlineStoreUrl;

    /**
     * A list of product options. The limit is defined by the [shop's resource limits for product
     * options](/docs/api/admin-graphql/latest/objects/Shop#field-resourcelimits)
     * (`Shop.resourceLimits.maxProductOptions`).
     */
    private List<ProductOption> options;

    /**
     * The minimum and maximum prices of a product, expressed in decimal numbers.
     * For example, if the product is priced between $10.00 and $50.00,
     * then the price range is $10.00 - $50.00.
     */
    private ProductPriceRange priceRange;

    /**
     * The [product type](https://help.shopify.com/manual/products/details/product-type)
     * that merchants define.
     */
    private String productType;

    /**
     * The date and time when the product was published to the channel.
     */
    private OffsetDateTime publishedAt;

    /**
     * Whether the product can only be purchased with a [selling
     * plan](/docs/apps/build/purchase-options/subscriptions/selling-plans). Products
     * that are sold on subscription (`requiresSellingPlan: true`) can be updated
     * only for online stores. If you update a product to be subscription-only
     * (`requiresSellingPlan:false`), then the product is unpublished from all
     * channels, except the online store.
     */
    private boolean requiresSellingPlan;

    /**
     * Find an active product variant based on selected options, availability or the first variant.
     *   
     * All arguments are optional. If no selected options are provided, the first available variant is returned.
     * If no variants are available, the first variant is returned.
     */
    private ProductVariant selectedOrFirstAvailableVariant;

    /**
     * A list of all [selling plan groups](/docs/apps/build/purchase-options/subscriptions/selling-plans/build-a-selling-plan)
     * that are associated with the product either directly, or through the product's variants.
     */
    private SellingPlanGroupConnection sellingPlanGroups;

    /**
     * The [SEO title and description](https://help.shopify.com/manual/promoting-marketing/seo/adding-keywords)
     * that are associated with a product.
     */
    private SEO seo;

    /**
     * A comma-separated list of searchable keywords that are
     * associated with the product. For example, a merchant might apply the `sports`
     * and `summer` tags to products that are associated with sportwear for summer.
     * Updating `tags` overwrites any existing tags that were previously added to the product.
     * To add new tags without overwriting existing tags,
     * use the GraphQL Admin API's [`tagsAdd`](/docs/api/admin-graphql/latest/mutations/tagsadd)
     * mutation.
     */
    private List<String> tags;

    /**
     * The name for the product that displays to customers. The title is used to construct the product's handle.
     * For example, if a product is titled "Black Sunglasses", then the handle is `black-sunglasses`.
     */
    private String title;

    /**
     * The quantity of inventory that's in stock.
     */
    private Integer totalInventory;

    /**
     * URL parameters to be added to a page URL to track the origin of on-site search
     * traffic for [analytics reporting](https://help.shopify.com/manual/reports-and-analytics/shopify-reports/report-types/default-reports/behaviour-reports).
     * Returns a result when accessed through the
     * [search](https://shopify.dev/docs/api/storefront/current/queries/search) or [predictiveSearch](https://shopify.dev/docs/api/storefront/current/queries/predictiveSearch)
     * queries, otherwise returns null.
     */
    private String trackingParameters;

    /**
     * The date and time when the product was last modified.
     * A product's `updatedAt` value can change for different reasons. For example, if an order
     * is placed for a product that has inventory tracking set up, then the inventory adjustment
     * is counted as an update.
     */
    private OffsetDateTime updatedAt;

    /**
     * Find a product’s variant based on its selected options.
     * This is useful for converting a user’s selection of product options into a single matching variant.
     * If there is not a variant for the selected options, `null` will be returned.
     */
    private ProductVariant variantBySelectedOptions;

    /**
     * A list of [variants](/docs/api/storefront/latest/objects/ProductVariant) that are associated with the product.
     */
    private ProductVariantConnection variants;

    /**
     * The number of [variants](/docs/api/storefront/latest/objects/ProductVariant) that are associated with the product.
     */
    private Count variantsCount;

    /**
     * The name of the product's vendor.
     */
    private String vendor;

    public Product build() {
      Product result = new Product();
      result.adjacentVariants = this.adjacentVariants;
      result.availableForSale = this.availableForSale;
      result.category = this.category;
      result.collections = this.collections;
      result.compareAtPriceRange = this.compareAtPriceRange;
      result.createdAt = this.createdAt;
      result.description = this.description;
      result.descriptionHtml = this.descriptionHtml;
      result.encodedVariantAvailability = this.encodedVariantAvailability;
      result.encodedVariantExistence = this.encodedVariantExistence;
      result.featuredImage = this.featuredImage;
      result.handle = this.handle;
      result.id = this.id;
      result.images = this.images;
      result.isGiftCard = this.isGiftCard;
      result.media = this.media;
      result.metafield = this.metafield;
      result.metafields = this.metafields;
      result.onlineStoreUrl = this.onlineStoreUrl;
      result.options = this.options;
      result.priceRange = this.priceRange;
      result.productType = this.productType;
      result.publishedAt = this.publishedAt;
      result.requiresSellingPlan = this.requiresSellingPlan;
      result.selectedOrFirstAvailableVariant = this.selectedOrFirstAvailableVariant;
      result.sellingPlanGroups = this.sellingPlanGroups;
      result.seo = this.seo;
      result.tags = this.tags;
      result.title = this.title;
      result.totalInventory = this.totalInventory;
      result.trackingParameters = this.trackingParameters;
      result.updatedAt = this.updatedAt;
      result.variantBySelectedOptions = this.variantBySelectedOptions;
      result.variants = this.variants;
      result.variantsCount = this.variantsCount;
      result.vendor = this.vendor;
      return result;
    }

    /**
     * A list of variants whose selected options differ with the provided selected options by one, ordered by variant id.
     * If selected options are not provided, adjacent variants to the first available variant is returned.
     *   
     * Note that this field returns an array of variants. In most cases, the number of variants in this array will be low.
     * However, with a low number of options and a high number of values per option, the number of variants returned
     * here can be high. In such cases, it recommended to avoid using this field.
     *   
     * This list of variants can be used in combination with the `options` field to build a rich variant picker that
     * includes variant availability or other variant information.
     */
    public Builder adjacentVariants(List<ProductVariant> adjacentVariants) {
      this.adjacentVariants = adjacentVariants;
      return this;
    }

    /**
     * Indicates if at least one product variant is available for sale.
     */
    public Builder availableForSale(boolean availableForSale) {
      this.availableForSale = availableForSale;
      return this;
    }

    /**
     * The category of a product from [Shopify's Standard Product Taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17).
     */
    public Builder category(TaxonomyCategory category) {
      this.category = category;
      return this;
    }

    /**
     * A list of [collections](/docs/api/storefront/latest/objects/Collection) that include the product.
     */
    public Builder collections(CollectionConnection collections) {
      this.collections = collections;
      return this;
    }

    /**
     * The [compare-at price range](https://help.shopify.com/manual/products/details/product-pricing/sale-pricing)
     * of the product in the shop's default currency.
     */
    public Builder compareAtPriceRange(ProductPriceRange compareAtPriceRange) {
      this.compareAtPriceRange = compareAtPriceRange;
      return this;
    }

    /**
     * The date and time when the product was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * A single-line description of the product, with [HTML tags](https://developer.mozilla.org/en-US/docs/Web/HTML) removed.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * The description of the product, with
     * HTML tags. For example, the description might include
     * bold `<strong></strong>` and italic `<i></i>` text.
     */
    public Builder descriptionHtml(String descriptionHtml) {
      this.descriptionHtml = descriptionHtml;
      return this;
    }

    /**
     * An encoded string containing all option value combinations
     * with a corresponding variant that is currently available for sale.
     *   
     * Integers represent option and values:
     * [0,1] represents option_value at array index 0 for the option at array index 0
     *   
     * `:`, `,`, ` ` and `-` are control characters.
     * `:` indicates a new option. ex: 0:1 indicates value 0 for the option in position 1, value 1 for the option in position 2.
     * `,` indicates the end of a repeated prefix, mulitple consecutive commas indicate the end of multiple repeated prefixes.
     * ` ` indicates a gap in the sequence of option values. ex: 0 4 indicates option values in position 0 and 4 are present.
     * `-` indicates a continuous range of option values. ex: 0 1-3 4
     *   
     * Decoding process:
     *   
     * Example options: [Size, Color, Material]
     * Example values: [[Small, Medium, Large], [Red, Blue], [Cotton, Wool]]
     * Example encoded string: "0:0:0,1:0-1,,1:0:0-1,1:1,,2:0:1,1:0,,"
     *   
     * Step 1: Expand ranges into the numbers they represent: "0:0:0,1:0 1,,1:0:0 1,1:1,,2:0:1,1:0,,"
     * Step 2: Expand repeated prefixes: "0:0:0,0:1:0 1,1:0:0 1,1:1:1,2:0:1,2:1:0,"
     * Step 3: Expand shared prefixes so data is encoded as a string: "0:0:0,0:1:0,0:1:1,1:0:0,1:0:1,1:1:1,2:0:1,2:1:0,"
     * Step 4: Map to options + option values to determine existing variants:
     *   
     * [Small, Red, Cotton] (0:0:0), [Small, Blue, Cotton] (0:1:0), [Small, Blue, Wool] (0:1:1),
     * [Medium, Red, Cotton] (1:0:0), [Medium, Red, Wool] (1:0:1), [Medium, Blue, Wool] (1:1:1),
     * [Large, Red, Wool] (2:0:1), [Large, Blue, Cotton] (2:1:0).
     */
    public Builder encodedVariantAvailability(String encodedVariantAvailability) {
      this.encodedVariantAvailability = encodedVariantAvailability;
      return this;
    }

    /**
     * An encoded string containing all option value combinations with a corresponding variant.
     *   
     * Integers represent option and values:
     * [0,1] represents option_value at array index 0 for the option at array index 0
     *   
     * `:`, `,`, ` ` and `-` are control characters.
     * `:` indicates a new option. ex: 0:1 indicates value 0 for the option in position 1, value 1 for the option in position 2.
     * `,` indicates the end of a repeated prefix, mulitple consecutive commas indicate the end of multiple repeated prefixes.
     * ` ` indicates a gap in the sequence of option values. ex: 0 4 indicates option values in position 0 and 4 are present.
     * `-` indicates a continuous range of option values. ex: 0 1-3 4
     *   
     * Decoding process:
     *   
     * Example options: [Size, Color, Material]
     * Example values: [[Small, Medium, Large], [Red, Blue], [Cotton, Wool]]
     * Example encoded string: "0:0:0,1:0-1,,1:0:0-1,1:1,,2:0:1,1:0,,"
     *   
     * Step 1: Expand ranges into the numbers they represent: "0:0:0,1:0 1,,1:0:0 1,1:1,,2:0:1,1:0,,"
     * Step 2: Expand repeated prefixes: "0:0:0,0:1:0 1,1:0:0 1,1:1:1,2:0:1,2:1:0,"
     * Step 3: Expand shared prefixes so data is encoded as a string: "0:0:0,0:1:0,0:1:1,1:0:0,1:0:1,1:1:1,2:0:1,2:1:0,"
     * Step 4: Map to options + option values to determine existing variants:
     *   
     * [Small, Red, Cotton] (0:0:0), [Small, Blue, Cotton] (0:1:0), [Small, Blue, Wool] (0:1:1),
     * [Medium, Red, Cotton] (1:0:0), [Medium, Red, Wool] (1:0:1), [Medium, Blue, Wool] (1:1:1),
     * [Large, Red, Wool] (2:0:1), [Large, Blue, Cotton] (2:1:0).
     */
    public Builder encodedVariantExistence(String encodedVariantExistence) {
      this.encodedVariantExistence = encodedVariantExistence;
      return this;
    }

    /**
     * The featured image for the product.
     *   
     * This field is functionally equivalent to `images(first: 1)`.
     */
    public Builder featuredImage(Image featuredImage) {
      this.featuredImage = featuredImage;
      return this;
    }

    /**
     * A unique, human-readable string of the product's title.
     * A handle can contain letters, hyphens (`-`), and numbers, but no spaces.
     * The handle is used in the online store URL for the product.
     */
    public Builder handle(String handle) {
      this.handle = handle;
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
     * List of images associated with the product.
     */
    public Builder images(ImageConnection images) {
      this.images = images;
      return this;
    }

    /**
     * Whether the product is a gift card.
     */
    public Builder isGiftCard(boolean isGiftCard) {
      this.isGiftCard = isGiftCard;
      return this;
    }

    /**
     * The [media](/docs/apps/build/online-store/product-media) that are associated
     * with the product. Valid media are images, 3D models, videos.
     */
    public Builder media(MediaConnection media) {
      this.media = media;
      return this;
    }

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
     * its `namespace` and `key`, that's associated with a Shopify resource for the
     * purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
     */
    public Builder metafields(List<Metafield> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The product's URL on the online store.
     * If `null`, then the product isn't published to the online store sales channel.
     */
    public Builder onlineStoreUrl(String onlineStoreUrl) {
      this.onlineStoreUrl = onlineStoreUrl;
      return this;
    }

    /**
     * A list of product options. The limit is defined by the [shop's resource limits for product
     * options](/docs/api/admin-graphql/latest/objects/Shop#field-resourcelimits)
     * (`Shop.resourceLimits.maxProductOptions`).
     */
    public Builder options(List<ProductOption> options) {
      this.options = options;
      return this;
    }

    /**
     * The minimum and maximum prices of a product, expressed in decimal numbers.
     * For example, if the product is priced between $10.00 and $50.00,
     * then the price range is $10.00 - $50.00.
     */
    public Builder priceRange(ProductPriceRange priceRange) {
      this.priceRange = priceRange;
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
     * The date and time when the product was published to the channel.
     */
    public Builder publishedAt(OffsetDateTime publishedAt) {
      this.publishedAt = publishedAt;
      return this;
    }

    /**
     * Whether the product can only be purchased with a [selling
     * plan](/docs/apps/build/purchase-options/subscriptions/selling-plans). Products
     * that are sold on subscription (`requiresSellingPlan: true`) can be updated
     * only for online stores. If you update a product to be subscription-only
     * (`requiresSellingPlan:false`), then the product is unpublished from all
     * channels, except the online store.
     */
    public Builder requiresSellingPlan(boolean requiresSellingPlan) {
      this.requiresSellingPlan = requiresSellingPlan;
      return this;
    }

    /**
     * Find an active product variant based on selected options, availability or the first variant.
     *   
     * All arguments are optional. If no selected options are provided, the first available variant is returned.
     * If no variants are available, the first variant is returned.
     */
    public Builder selectedOrFirstAvailableVariant(ProductVariant selectedOrFirstAvailableVariant) {
      this.selectedOrFirstAvailableVariant = selectedOrFirstAvailableVariant;
      return this;
    }

    /**
     * A list of all [selling plan groups](/docs/apps/build/purchase-options/subscriptions/selling-plans/build-a-selling-plan)
     * that are associated with the product either directly, or through the product's variants.
     */
    public Builder sellingPlanGroups(SellingPlanGroupConnection sellingPlanGroups) {
      this.sellingPlanGroups = sellingPlanGroups;
      return this;
    }

    /**
     * The [SEO title and description](https://help.shopify.com/manual/promoting-marketing/seo/adding-keywords)
     * that are associated with a product.
     */
    public Builder seo(SEO seo) {
      this.seo = seo;
      return this;
    }

    /**
     * A comma-separated list of searchable keywords that are
     * associated with the product. For example, a merchant might apply the `sports`
     * and `summer` tags to products that are associated with sportwear for summer.
     * Updating `tags` overwrites any existing tags that were previously added to the product.
     * To add new tags without overwriting existing tags,
     * use the GraphQL Admin API's [`tagsAdd`](/docs/api/admin-graphql/latest/mutations/tagsadd)
     * mutation.
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
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
     * The quantity of inventory that's in stock.
     */
    public Builder totalInventory(Integer totalInventory) {
      this.totalInventory = totalInventory;
      return this;
    }

    /**
     * URL parameters to be added to a page URL to track the origin of on-site search
     * traffic for [analytics reporting](https://help.shopify.com/manual/reports-and-analytics/shopify-reports/report-types/default-reports/behaviour-reports).
     * Returns a result when accessed through the
     * [search](https://shopify.dev/docs/api/storefront/current/queries/search) or [predictiveSearch](https://shopify.dev/docs/api/storefront/current/queries/predictiveSearch)
     * queries, otherwise returns null.
     */
    public Builder trackingParameters(String trackingParameters) {
      this.trackingParameters = trackingParameters;
      return this;
    }

    /**
     * The date and time when the product was last modified.
     * A product's `updatedAt` value can change for different reasons. For example, if an order
     * is placed for a product that has inventory tracking set up, then the inventory adjustment
     * is counted as an update.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     * Find a product’s variant based on its selected options.
     * This is useful for converting a user’s selection of product options into a single matching variant.
     * If there is not a variant for the selected options, `null` will be returned.
     */
    public Builder variantBySelectedOptions(ProductVariant variantBySelectedOptions) {
      this.variantBySelectedOptions = variantBySelectedOptions;
      return this;
    }

    /**
     * A list of [variants](/docs/api/storefront/latest/objects/ProductVariant) that are associated with the product.
     */
    public Builder variants(ProductVariantConnection variants) {
      this.variants = variants;
      return this;
    }

    /**
     * The number of [variants](/docs/api/storefront/latest/objects/ProductVariant) that are associated with the product.
     */
    public Builder variantsCount(Count variantsCount) {
      this.variantsCount = variantsCount;
      return this;
    }

    /**
     * The name of the product's vendor.
     */
    public Builder vendor(String vendor) {
      this.vendor = vendor;
      return this;
    }
  }
}
