package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * The `Product` object lets you manage products in a merchant’s store.
 *
 * Products are the goods and services that merchants offer to customers. They can
 * include various details such as title, description, price, images, and options
 * such as size or color.
 * You can use [product variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/productvariant)
 * to create or update different versions of the same product.
 * You can also add or update product [media](https://shopify.dev/docs/api/admin-graphql/latest/interfaces/media).
 * Products can be organized by grouping them into a [collection](https://shopify.dev/docs/api/admin-graphql/latest/objects/collection).
 *
 * Learn more about working with [Shopify's product model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/product-model-components),
 * including limitations and considerations.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Product implements CommentEventEmbed, MetafieldReference, MetafieldReferencer, com.shopify.admin.types.HasEvents, com.shopify.admin.types.HasMetafieldDefinitions, com.shopify.admin.types.HasMetafields, com.shopify.admin.types.HasPublishedTranslations, com.shopify.admin.types.LegacyInteroperability, com.shopify.admin.types.Navigable, com.shopify.admin.types.Node, com.shopify.admin.types.OnlineStorePreviewable, com.shopify.admin.types.Publishable {
  /**
   * The number of
   * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
   * that a resource is published to, without
   * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
   */
  private Count availablePublicationsCount;

  /**
   * The description of the product, with
   * HTML tags. For example, the description might include
   * bold `<strong></strong>` and italic `<i></i>` text.
   */
  private String bodyHtml;

  /**
   * A list of [components](https://shopify.dev/docs/apps/build/product-merchandising/bundles/add-product-fixed-bundle)
   * that are associated with a product in a bundle.
   */
  private ProductBundleComponentConnection bundleComponents;

  /**
   * The category of a product
   * from [Shopify's Standard Product Taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17).
   */
  private TaxonomyCategory category;

  /**
   * A list of [collections](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection)
   * that include the product.
   */
  private CollectionConnection collections;

  /**
   * A special product type that combines separate products from a store into a single product listing.
   * [Combined listings](https://shopify.dev/apps/build/product-merchandising/combined-listings) are connected
   * by a shared option, such as color, model, or dimension.
   */
  private CombinedListing combinedListing;

  /**
   * The [role of the product](https://shopify.dev/docs/apps/build/product-merchandising/combined-listings/build-for-combined-listings)
   * in a combined listing.
   *   
   * If `null`, then the product isn't part of any combined listing.
   */
  private CombinedListingsRole combinedListingRole;

  /**
   * The [compare-at price range](https://help.shopify.com/manual/products/details/product-pricing/sale-pricing)
   * of the product in the shop's default currency.
   */
  private ProductCompareAtPriceRange compareAtPriceRange;

  /**
   * The pricing that applies to a customer in a specific context. For example, a
   * price might vary depending on the customer's location. As of API version
   * 2025-04, only active markets are considered in the price resolution.
   */
  private ProductContextualPricing contextualPricing;

  /**
   * The date and time when the product was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The custom product type specified by the merchant.
   */
  private String customProductType;

  /**
   * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
   * returns the single next record, sorted ascending by ID.
   */
  private String defaultCursor;

  /**
   * A single-line description of the product,
   * with [HTML tags](https://developer.mozilla.org/en-US/docs/Web/HTML) removed.
   */
  private String description;

  /**
   * The description of the product, with
   * HTML tags. For example, the description might include
   * bold `<strong></strong>` and italic `<i></i>` text.
   */
  private String descriptionHtml;

  /**
   * Stripped description of the product, single line with HTML tags removed.
   * Truncated to 60 characters.
   */
  private String descriptionPlainSummary;

  /**
   * The paginated list of events associated with the host subject.
   */
  private EventConnection events;

  /**
   * The featured image for the product.
   */
  private Image featuredImage;

  /**
   * The featured [media](https://shopify.dev/docs/apps/build/online-store/product-media)
   * associated with the product.
   */
  private Media featuredMedia;

  /**
   * The information that lets merchants know what steps they need to take
   * to make sure that the app is set up correctly.
   *   
   * For example, if a merchant hasn't set up a product correctly in the app,
   * then the feedback might include a message that says "You need to add a price
   * to this product".
   */
  private ResourceFeedback feedback;

  /**
   * The [theme template](https://shopify.dev/docs/storefronts/themes/architecture/templates)
   * that's used when customers view the gift card in a store.
   */
  private String giftCardTemplateSuffix;

  /**
   * A unique, human-readable string of the product's title. A handle can contain
   * letters, hyphens (`-`), and numbers, but no spaces.
   * The handle is used in the online store URL for the product.
   */
  private String handle;

  /**
   * Whether the product has only a single variant with the default option and value.
   */
  private boolean hasOnlyDefaultVariant;

  /**
   * Whether the product has variants that are out of stock.
   */
  private boolean hasOutOfStockVariants;

  /**
   * Whether at least one of the product variants requires
   * [bundle components](https://shopify.dev/docs/apps/build/product-merchandising/bundles/add-product-fixed-bundle).
   *   
   * Learn more about
   * [store eligibility for bundles](https://shopify.dev/docs/apps/build/product-merchandising/bundles#store-eligibility).
   */
  private boolean hasVariantsThatRequiresComponents;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The images associated with the product.
   */
  private ImageConnection images;

  /**
   * Whether the product
   * is in a specified
   * [collection](https://shopify.dev/docs/api/admin-graphql/latest/objects/collection).
   */
  private boolean inCollection;

  /**
   * Whether the product is a gift card.
   */
  private boolean isGiftCard;

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  private String legacyResourceId;

  /**
   * The [media](https://shopify.dev/docs/apps/build/online-store/product-media)
   * associated with the product. Valid media are images, 3D models, videos.
   */
  private MediaConnection media;

  /**
   * The total count of [media](https://shopify.dev/docs/apps/build/online-store/product-media)
   * that's associated with a product.
   */
  private Count mediaCount;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * List of metafield definitions.
   */
  private MetafieldDefinitionConnection metafieldDefinitions;

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  private MetafieldConnection metafields;

  /**
   * The [preview URL](https://help.shopify.com/manual/online-store/setting-up#preview-your-store) for the online store.
   */
  private String onlineStorePreviewUrl;

  /**
   * The product's URL on the online store.
   * If `null`, then the product isn't published to the online store sales channel.
   */
  private String onlineStoreUrl;

  /**
   * A list of product options. The limit is defined by the
   * [shop's resource limits for product options](https://shopify.dev/docs/api/admin-graphql/latest/objects/Shop#field-resourcelimits)
   * (`Shop.resourceLimits.maxProductOptions`).
   */
  private List<ProductOption> options;

  /**
   * The price range of the product.
   */
  private ProductPriceRange priceRange;

  /**
   * The minimum and maximum prices of a product, expressed in decimal numbers.
   * For example, if the product is priced between $10.00 and $50.00,
   * then the price range is $10.00 - $50.00.
   */
  private ProductPriceRangeV2 priceRangeV2;

  /**
   * The product category specified by the merchant.
   */
  private ProductCategory productCategory;

  /**
   * A list of the channels where the product is published.
   */
  private ProductPublicationConnection productPublications;

  /**
   * The [product type](https://help.shopify.com/manual/products/details/product-type)
   * that merchants define.
   */
  private String productType;

  /**
   * The number of
   * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
   * that a resource is published to, without
   * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
   */
  private int publicationCount;

  /**
   * A list of the channels where the product is published.
   */
  private ProductPublicationConnection publications;

  /**
   * The date and time when the product was published to the online store.
   */
  private OffsetDateTime publishedAt;

  /**
   * Whether the product is published for a customer only in a specified context.
   * For example, a product might be published for a customer only in a specific location.
   */
  private boolean publishedInContext;

  /**
   * Whether the resource is published to a specific channel.
   */
  private boolean publishedOnChannel;

  /**
   * Whether the resource is published to a
   * [channel](https://shopify.dev/docs/api/admin-graphql/latest/objects/Channel).
   * For example, the resource might be published to the online store channel.
   */
  private boolean publishedOnCurrentChannel;

  /**
   * Whether the resource is published to the app's
   * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
   * For example, the resource might be published to the app's online store channel.
   */
  private boolean publishedOnCurrentPublication;

  /**
   * Whether the resource is published to a specified
   * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
   */
  private boolean publishedOnPublication;

  /**
   * Whether the product can only be purchased with
   * a [selling plan](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans).
   * Products that are sold on subscription (`requiresSellingPlan: true`) can be updated only for online stores.
   * If you update a product to be subscription-only (`requiresSellingPlan:false`),
   * then the product is unpublished from all channels, except the online store.
   */
  private boolean requiresSellingPlan;

  /**
   * The resource that's either published or staged to be published to
   * the [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
   */
  private ResourcePublicationV2 resourcePublicationOnCurrentPublication;

  /**
   * The list of resources that are published to a
   * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
   */
  private ResourcePublicationConnection resourcePublications;

  /**
   * The number of
   * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
   * that a resource is published to, without
   * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
   */
  private Count resourcePublicationsCount;

  /**
   * The list of resources that are either published or staged to be published to a
   * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
   */
  private ResourcePublicationV2Connection resourcePublicationsV2;

  /**
   * Whether the merchant can make changes to the product when they
   * [edit the order](https://shopify.dev/docs/apps/build/orders-fulfillment/order-management-apps/edit-orders)
   * associated with the product. For example, a merchant might be restricted from changing product details when they
   * edit an order.
   */
  private RestrictedForResource restrictedForResource;

  /**
   * A count of [selling plan groups](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans/build-a-selling-plan)
   * that are associated with the product.
   */
  private int sellingPlanGroupCount;

  /**
   * A list of all [selling plan groups](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans/build-a-selling-plan)
   * that are associated with the product either directly, or through the product's variants.
   */
  private SellingPlanGroupConnection sellingPlanGroups;

  /**
   * A count of [selling plan groups](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans/build-a-selling-plan)
   * that are associated with the product.
   */
  private Count sellingPlanGroupsCount;

  /**
   * The [SEO title and description](https://help.shopify.com/manual/promoting-marketing/seo/adding-keywords)
   * that are associated with a product.
   */
  private SEO seo;

  /**
   * The standardized product type in the Shopify product taxonomy.
   */
  private StandardizedProductType standardizedProductType;

  /**
   * The [product status](https://help.shopify.com/manual/products/details/product-details-page#product-status),
   * which controls visibility across all sales channels.
   */
  private ProductStatus status;

  /**
   * The Storefront GraphQL API ID of the `Product`.
   *   
   * As of the `2022-04` version release, the Storefront GraphQL API will no longer
   * return Base64 encoded IDs to match the behavior of the Admin GraphQL API.
   * Therefore, you can safely use the `id` field's value instead.
   */
  private String storefrontId;

  /**
   * A comma-separated list of searchable keywords that are
   * associated with the product. For example, a merchant might apply the `sports`
   * and `summer` tags to products that are associated with sportwear for summer.
   *   
   * Updating `tags` overwrites
   * any existing tags that were previously added to the product. To add new tags without overwriting
   * existing tags, use the [`tagsAdd`](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
   * mutation.
   */
  private List<String> tags;

  /**
   * The [theme template](https://shopify.dev/docs/storefronts/themes/architecture/templates)
   * that's used when customers view the product in a store.
   */
  private String templateSuffix;

  /**
   * The name for the product that displays to customers. The title is used to construct the product's handle.
   * For example, if a product is titled "Black Sunglasses", then the handle is `black-sunglasses`.
   */
  private String title;

  /**
   * The quantity of inventory that's in stock.
   */
  private int totalInventory;

  /**
   * The number of [variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
   * that are associated with the product.
   */
  private int totalVariants;

  /**
   * Whether [inventory tracking](https://help.shopify.com/manual/products/inventory/getting-started-with-inventory/set-up-inventory-tracking)
   * has been enabled for the product.
   */
  private boolean tracksInventory;

  /**
   * The published translations associated with the resource.
   */
  private List<Translation> translations;

  /**
   * The list of channels that the resource is not published to.
   */
  private ChannelConnection unpublishedChannels;

  /**
   * The list of [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
   * that the resource isn't published to.
   */
  private PublicationConnection unpublishedPublications;

  /**
   * The date and time when the product was last modified.
   * A product's `updatedAt` value can change for different reasons. For example, if an order
   * is placed for a product that has inventory tracking set up, then the inventory adjustment
   * is counted as an update.
   */
  private OffsetDateTime updatedAt;

  /**
   * A list of [variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant) associated with the product.
   * If querying a single product at the root, you can fetch up to 2000 variants.
   */
  private ProductVariantConnection variants;

  /**
   * The number of [variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
   * that are associated with the product.
   */
  private Count variantsCount;

  /**
   * The name of the product's vendor.
   */
  private String vendor;

  public Product() {
  }

  /**
   * The number of
   * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
   * that a resource is published to, without
   * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
   */
  public Count getAvailablePublicationsCount() {
    return availablePublicationsCount;
  }

  public void setAvailablePublicationsCount(Count availablePublicationsCount) {
    this.availablePublicationsCount = availablePublicationsCount;
  }

  /**
   * The description of the product, with
   * HTML tags. For example, the description might include
   * bold `<strong></strong>` and italic `<i></i>` text.
   */
  public String getBodyHtml() {
    return bodyHtml;
  }

  public void setBodyHtml(String bodyHtml) {
    this.bodyHtml = bodyHtml;
  }

  /**
   * A list of [components](https://shopify.dev/docs/apps/build/product-merchandising/bundles/add-product-fixed-bundle)
   * that are associated with a product in a bundle.
   */
  public ProductBundleComponentConnection getBundleComponents() {
    return bundleComponents;
  }

  public void setBundleComponents(ProductBundleComponentConnection bundleComponents) {
    this.bundleComponents = bundleComponents;
  }

  /**
   * The category of a product
   * from [Shopify's Standard Product Taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17).
   */
  public TaxonomyCategory getCategory() {
    return category;
  }

  public void setCategory(TaxonomyCategory category) {
    this.category = category;
  }

  /**
   * A list of [collections](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection)
   * that include the product.
   */
  public CollectionConnection getCollections() {
    return collections;
  }

  public void setCollections(CollectionConnection collections) {
    this.collections = collections;
  }

  /**
   * A special product type that combines separate products from a store into a single product listing.
   * [Combined listings](https://shopify.dev/apps/build/product-merchandising/combined-listings) are connected
   * by a shared option, such as color, model, or dimension.
   */
  public CombinedListing getCombinedListing() {
    return combinedListing;
  }

  public void setCombinedListing(CombinedListing combinedListing) {
    this.combinedListing = combinedListing;
  }

  /**
   * The [role of the product](https://shopify.dev/docs/apps/build/product-merchandising/combined-listings/build-for-combined-listings)
   * in a combined listing.
   *   
   * If `null`, then the product isn't part of any combined listing.
   */
  public CombinedListingsRole getCombinedListingRole() {
    return combinedListingRole;
  }

  public void setCombinedListingRole(CombinedListingsRole combinedListingRole) {
    this.combinedListingRole = combinedListingRole;
  }

  /**
   * The [compare-at price range](https://help.shopify.com/manual/products/details/product-pricing/sale-pricing)
   * of the product in the shop's default currency.
   */
  public ProductCompareAtPriceRange getCompareAtPriceRange() {
    return compareAtPriceRange;
  }

  public void setCompareAtPriceRange(ProductCompareAtPriceRange compareAtPriceRange) {
    this.compareAtPriceRange = compareAtPriceRange;
  }

  /**
   * The pricing that applies to a customer in a specific context. For example, a
   * price might vary depending on the customer's location. As of API version
   * 2025-04, only active markets are considered in the price resolution.
   */
  public ProductContextualPricing getContextualPricing() {
    return contextualPricing;
  }

  public void setContextualPricing(ProductContextualPricing contextualPricing) {
    this.contextualPricing = contextualPricing;
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
   * The custom product type specified by the merchant.
   */
  public String getCustomProductType() {
    return customProductType;
  }

  public void setCustomProductType(String customProductType) {
    this.customProductType = customProductType;
  }

  /**
   * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
   * returns the single next record, sorted ascending by ID.
   */
  public String getDefaultCursor() {
    return defaultCursor;
  }

  public void setDefaultCursor(String defaultCursor) {
    this.defaultCursor = defaultCursor;
  }

  /**
   * A single-line description of the product,
   * with [HTML tags](https://developer.mozilla.org/en-US/docs/Web/HTML) removed.
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
   * Stripped description of the product, single line with HTML tags removed.
   * Truncated to 60 characters.
   */
  public String getDescriptionPlainSummary() {
    return descriptionPlainSummary;
  }

  public void setDescriptionPlainSummary(String descriptionPlainSummary) {
    this.descriptionPlainSummary = descriptionPlainSummary;
  }

  /**
   * The paginated list of events associated with the host subject.
   */
  public EventConnection getEvents() {
    return events;
  }

  public void setEvents(EventConnection events) {
    this.events = events;
  }

  /**
   * The featured image for the product.
   */
  public Image getFeaturedImage() {
    return featuredImage;
  }

  public void setFeaturedImage(Image featuredImage) {
    this.featuredImage = featuredImage;
  }

  /**
   * The featured [media](https://shopify.dev/docs/apps/build/online-store/product-media)
   * associated with the product.
   */
  public Media getFeaturedMedia() {
    return featuredMedia;
  }

  public void setFeaturedMedia(Media featuredMedia) {
    this.featuredMedia = featuredMedia;
  }

  /**
   * The information that lets merchants know what steps they need to take
   * to make sure that the app is set up correctly.
   *   
   * For example, if a merchant hasn't set up a product correctly in the app,
   * then the feedback might include a message that says "You need to add a price
   * to this product".
   */
  public ResourceFeedback getFeedback() {
    return feedback;
  }

  public void setFeedback(ResourceFeedback feedback) {
    this.feedback = feedback;
  }

  /**
   * The [theme template](https://shopify.dev/docs/storefronts/themes/architecture/templates)
   * that's used when customers view the gift card in a store.
   */
  public String getGiftCardTemplateSuffix() {
    return giftCardTemplateSuffix;
  }

  public void setGiftCardTemplateSuffix(String giftCardTemplateSuffix) {
    this.giftCardTemplateSuffix = giftCardTemplateSuffix;
  }

  /**
   * A unique, human-readable string of the product's title. A handle can contain
   * letters, hyphens (`-`), and numbers, but no spaces.
   * The handle is used in the online store URL for the product.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * Whether the product has only a single variant with the default option and value.
   */
  public boolean getHasOnlyDefaultVariant() {
    return hasOnlyDefaultVariant;
  }

  public void setHasOnlyDefaultVariant(boolean hasOnlyDefaultVariant) {
    this.hasOnlyDefaultVariant = hasOnlyDefaultVariant;
  }

  /**
   * Whether the product has variants that are out of stock.
   */
  public boolean getHasOutOfStockVariants() {
    return hasOutOfStockVariants;
  }

  public void setHasOutOfStockVariants(boolean hasOutOfStockVariants) {
    this.hasOutOfStockVariants = hasOutOfStockVariants;
  }

  /**
   * Whether at least one of the product variants requires
   * [bundle components](https://shopify.dev/docs/apps/build/product-merchandising/bundles/add-product-fixed-bundle).
   *   
   * Learn more about
   * [store eligibility for bundles](https://shopify.dev/docs/apps/build/product-merchandising/bundles#store-eligibility).
   */
  public boolean getHasVariantsThatRequiresComponents() {
    return hasVariantsThatRequiresComponents;
  }

  public void setHasVariantsThatRequiresComponents(boolean hasVariantsThatRequiresComponents) {
    this.hasVariantsThatRequiresComponents = hasVariantsThatRequiresComponents;
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
   * The images associated with the product.
   */
  public ImageConnection getImages() {
    return images;
  }

  public void setImages(ImageConnection images) {
    this.images = images;
  }

  /**
   * Whether the product
   * is in a specified
   * [collection](https://shopify.dev/docs/api/admin-graphql/latest/objects/collection).
   */
  public boolean getInCollection() {
    return inCollection;
  }

  public void setInCollection(boolean inCollection) {
    this.inCollection = inCollection;
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
   * The ID of the corresponding resource in the REST Admin API.
   */
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  /**
   * The [media](https://shopify.dev/docs/apps/build/online-store/product-media)
   * associated with the product. Valid media are images, 3D models, videos.
   */
  public MediaConnection getMedia() {
    return media;
  }

  public void setMedia(MediaConnection media) {
    this.media = media;
  }

  /**
   * The total count of [media](https://shopify.dev/docs/apps/build/online-store/product-media)
   * that's associated with a product.
   */
  public Count getMediaCount() {
    return mediaCount;
  }

  public void setMediaCount(Count mediaCount) {
    this.mediaCount = mediaCount;
  }

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * List of metafield definitions.
   */
  public MetafieldDefinitionConnection getMetafieldDefinitions() {
    return metafieldDefinitions;
  }

  public void setMetafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
    this.metafieldDefinitions = metafieldDefinitions;
  }

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  /**
   * The [preview URL](https://help.shopify.com/manual/online-store/setting-up#preview-your-store) for the online store.
   */
  public String getOnlineStorePreviewUrl() {
    return onlineStorePreviewUrl;
  }

  public void setOnlineStorePreviewUrl(String onlineStorePreviewUrl) {
    this.onlineStorePreviewUrl = onlineStorePreviewUrl;
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
   * A list of product options. The limit is defined by the
   * [shop's resource limits for product options](https://shopify.dev/docs/api/admin-graphql/latest/objects/Shop#field-resourcelimits)
   * (`Shop.resourceLimits.maxProductOptions`).
   */
  public List<ProductOption> getOptions() {
    return options;
  }

  public void setOptions(List<ProductOption> options) {
    this.options = options;
  }

  /**
   * The price range of the product.
   */
  public ProductPriceRange getPriceRange() {
    return priceRange;
  }

  public void setPriceRange(ProductPriceRange priceRange) {
    this.priceRange = priceRange;
  }

  /**
   * The minimum and maximum prices of a product, expressed in decimal numbers.
   * For example, if the product is priced between $10.00 and $50.00,
   * then the price range is $10.00 - $50.00.
   */
  public ProductPriceRangeV2 getPriceRangeV2() {
    return priceRangeV2;
  }

  public void setPriceRangeV2(ProductPriceRangeV2 priceRangeV2) {
    this.priceRangeV2 = priceRangeV2;
  }

  /**
   * The product category specified by the merchant.
   */
  public ProductCategory getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(ProductCategory productCategory) {
    this.productCategory = productCategory;
  }

  /**
   * A list of the channels where the product is published.
   */
  public ProductPublicationConnection getProductPublications() {
    return productPublications;
  }

  public void setProductPublications(ProductPublicationConnection productPublications) {
    this.productPublications = productPublications;
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
   * The number of
   * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
   * that a resource is published to, without
   * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
   */
  public int getPublicationCount() {
    return publicationCount;
  }

  public void setPublicationCount(int publicationCount) {
    this.publicationCount = publicationCount;
  }

  /**
   * A list of the channels where the product is published.
   */
  public ProductPublicationConnection getPublications() {
    return publications;
  }

  public void setPublications(ProductPublicationConnection publications) {
    this.publications = publications;
  }

  /**
   * The date and time when the product was published to the online store.
   */
  public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
  }

  /**
   * Whether the product is published for a customer only in a specified context.
   * For example, a product might be published for a customer only in a specific location.
   */
  public boolean getPublishedInContext() {
    return publishedInContext;
  }

  public void setPublishedInContext(boolean publishedInContext) {
    this.publishedInContext = publishedInContext;
  }

  /**
   * Whether the resource is published to a specific channel.
   */
  public boolean getPublishedOnChannel() {
    return publishedOnChannel;
  }

  public void setPublishedOnChannel(boolean publishedOnChannel) {
    this.publishedOnChannel = publishedOnChannel;
  }

  /**
   * Whether the resource is published to a
   * [channel](https://shopify.dev/docs/api/admin-graphql/latest/objects/Channel).
   * For example, the resource might be published to the online store channel.
   */
  public boolean getPublishedOnCurrentChannel() {
    return publishedOnCurrentChannel;
  }

  public void setPublishedOnCurrentChannel(boolean publishedOnCurrentChannel) {
    this.publishedOnCurrentChannel = publishedOnCurrentChannel;
  }

  /**
   * Whether the resource is published to the app's
   * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
   * For example, the resource might be published to the app's online store channel.
   */
  public boolean getPublishedOnCurrentPublication() {
    return publishedOnCurrentPublication;
  }

  public void setPublishedOnCurrentPublication(boolean publishedOnCurrentPublication) {
    this.publishedOnCurrentPublication = publishedOnCurrentPublication;
  }

  /**
   * Whether the resource is published to a specified
   * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
   */
  public boolean getPublishedOnPublication() {
    return publishedOnPublication;
  }

  public void setPublishedOnPublication(boolean publishedOnPublication) {
    this.publishedOnPublication = publishedOnPublication;
  }

  /**
   * Whether the product can only be purchased with
   * a [selling plan](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans).
   * Products that are sold on subscription (`requiresSellingPlan: true`) can be updated only for online stores.
   * If you update a product to be subscription-only (`requiresSellingPlan:false`),
   * then the product is unpublished from all channels, except the online store.
   */
  public boolean getRequiresSellingPlan() {
    return requiresSellingPlan;
  }

  public void setRequiresSellingPlan(boolean requiresSellingPlan) {
    this.requiresSellingPlan = requiresSellingPlan;
  }

  /**
   * The resource that's either published or staged to be published to
   * the [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
   */
  public ResourcePublicationV2 getResourcePublicationOnCurrentPublication() {
    return resourcePublicationOnCurrentPublication;
  }

  public void setResourcePublicationOnCurrentPublication(
      ResourcePublicationV2 resourcePublicationOnCurrentPublication) {
    this.resourcePublicationOnCurrentPublication = resourcePublicationOnCurrentPublication;
  }

  /**
   * The list of resources that are published to a
   * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
   */
  public ResourcePublicationConnection getResourcePublications() {
    return resourcePublications;
  }

  public void setResourcePublications(ResourcePublicationConnection resourcePublications) {
    this.resourcePublications = resourcePublications;
  }

  /**
   * The number of
   * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
   * that a resource is published to, without
   * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
   */
  public Count getResourcePublicationsCount() {
    return resourcePublicationsCount;
  }

  public void setResourcePublicationsCount(Count resourcePublicationsCount) {
    this.resourcePublicationsCount = resourcePublicationsCount;
  }

  /**
   * The list of resources that are either published or staged to be published to a
   * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
   */
  public ResourcePublicationV2Connection getResourcePublicationsV2() {
    return resourcePublicationsV2;
  }

  public void setResourcePublicationsV2(ResourcePublicationV2Connection resourcePublicationsV2) {
    this.resourcePublicationsV2 = resourcePublicationsV2;
  }

  /**
   * Whether the merchant can make changes to the product when they
   * [edit the order](https://shopify.dev/docs/apps/build/orders-fulfillment/order-management-apps/edit-orders)
   * associated with the product. For example, a merchant might be restricted from changing product details when they
   * edit an order.
   */
  public RestrictedForResource getRestrictedForResource() {
    return restrictedForResource;
  }

  public void setRestrictedForResource(RestrictedForResource restrictedForResource) {
    this.restrictedForResource = restrictedForResource;
  }

  /**
   * A count of [selling plan groups](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans/build-a-selling-plan)
   * that are associated with the product.
   */
  public int getSellingPlanGroupCount() {
    return sellingPlanGroupCount;
  }

  public void setSellingPlanGroupCount(int sellingPlanGroupCount) {
    this.sellingPlanGroupCount = sellingPlanGroupCount;
  }

  /**
   * A list of all [selling plan groups](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans/build-a-selling-plan)
   * that are associated with the product either directly, or through the product's variants.
   */
  public SellingPlanGroupConnection getSellingPlanGroups() {
    return sellingPlanGroups;
  }

  public void setSellingPlanGroups(SellingPlanGroupConnection sellingPlanGroups) {
    this.sellingPlanGroups = sellingPlanGroups;
  }

  /**
   * A count of [selling plan groups](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans/build-a-selling-plan)
   * that are associated with the product.
   */
  public Count getSellingPlanGroupsCount() {
    return sellingPlanGroupsCount;
  }

  public void setSellingPlanGroupsCount(Count sellingPlanGroupsCount) {
    this.sellingPlanGroupsCount = sellingPlanGroupsCount;
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
   * The standardized product type in the Shopify product taxonomy.
   */
  public StandardizedProductType getStandardizedProductType() {
    return standardizedProductType;
  }

  public void setStandardizedProductType(StandardizedProductType standardizedProductType) {
    this.standardizedProductType = standardizedProductType;
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
   * The Storefront GraphQL API ID of the `Product`.
   *   
   * As of the `2022-04` version release, the Storefront GraphQL API will no longer
   * return Base64 encoded IDs to match the behavior of the Admin GraphQL API.
   * Therefore, you can safely use the `id` field's value instead.
   */
  public String getStorefrontId() {
    return storefrontId;
  }

  public void setStorefrontId(String storefrontId) {
    this.storefrontId = storefrontId;
  }

  /**
   * A comma-separated list of searchable keywords that are
   * associated with the product. For example, a merchant might apply the `sports`
   * and `summer` tags to products that are associated with sportwear for summer.
   *   
   * Updating `tags` overwrites
   * any existing tags that were previously added to the product. To add new tags without overwriting
   * existing tags, use the [`tagsAdd`](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
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
   * that's used when customers view the product in a store.
   */
  public String getTemplateSuffix() {
    return templateSuffix;
  }

  public void setTemplateSuffix(String templateSuffix) {
    this.templateSuffix = templateSuffix;
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
  public int getTotalInventory() {
    return totalInventory;
  }

  public void setTotalInventory(int totalInventory) {
    this.totalInventory = totalInventory;
  }

  /**
   * The number of [variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
   * that are associated with the product.
   */
  public int getTotalVariants() {
    return totalVariants;
  }

  public void setTotalVariants(int totalVariants) {
    this.totalVariants = totalVariants;
  }

  /**
   * Whether [inventory tracking](https://help.shopify.com/manual/products/inventory/getting-started-with-inventory/set-up-inventory-tracking)
   * has been enabled for the product.
   */
  public boolean getTracksInventory() {
    return tracksInventory;
  }

  public void setTracksInventory(boolean tracksInventory) {
    this.tracksInventory = tracksInventory;
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

  /**
   * The list of channels that the resource is not published to.
   */
  public ChannelConnection getUnpublishedChannels() {
    return unpublishedChannels;
  }

  public void setUnpublishedChannels(ChannelConnection unpublishedChannels) {
    this.unpublishedChannels = unpublishedChannels;
  }

  /**
   * The list of [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
   * that the resource isn't published to.
   */
  public PublicationConnection getUnpublishedPublications() {
    return unpublishedPublications;
  }

  public void setUnpublishedPublications(PublicationConnection unpublishedPublications) {
    this.unpublishedPublications = unpublishedPublications;
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
   * A list of [variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant) associated with the product.
   * If querying a single product at the root, you can fetch up to 2000 variants.
   */
  public ProductVariantConnection getVariants() {
    return variants;
  }

  public void setVariants(ProductVariantConnection variants) {
    this.variants = variants;
  }

  /**
   * The number of [variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
   * that are associated with the product.
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
    return "Product{availablePublicationsCount='" + availablePublicationsCount + "', bodyHtml='" + bodyHtml + "', bundleComponents='" + bundleComponents + "', category='" + category + "', collections='" + collections + "', combinedListing='" + combinedListing + "', combinedListingRole='" + combinedListingRole + "', compareAtPriceRange='" + compareAtPriceRange + "', contextualPricing='" + contextualPricing + "', createdAt='" + createdAt + "', customProductType='" + customProductType + "', defaultCursor='" + defaultCursor + "', description='" + description + "', descriptionHtml='" + descriptionHtml + "', descriptionPlainSummary='" + descriptionPlainSummary + "', events='" + events + "', featuredImage='" + featuredImage + "', featuredMedia='" + featuredMedia + "', feedback='" + feedback + "', giftCardTemplateSuffix='" + giftCardTemplateSuffix + "', handle='" + handle + "', hasOnlyDefaultVariant='" + hasOnlyDefaultVariant + "', hasOutOfStockVariants='" + hasOutOfStockVariants + "', hasVariantsThatRequiresComponents='" + hasVariantsThatRequiresComponents + "', id='" + id + "', images='" + images + "', inCollection='" + inCollection + "', isGiftCard='" + isGiftCard + "', legacyResourceId='" + legacyResourceId + "', media='" + media + "', mediaCount='" + mediaCount + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', onlineStorePreviewUrl='" + onlineStorePreviewUrl + "', onlineStoreUrl='" + onlineStoreUrl + "', options='" + options + "', priceRange='" + priceRange + "', priceRangeV2='" + priceRangeV2 + "', productCategory='" + productCategory + "', productPublications='" + productPublications + "', productType='" + productType + "', publicationCount='" + publicationCount + "', publications='" + publications + "', publishedAt='" + publishedAt + "', publishedInContext='" + publishedInContext + "', publishedOnChannel='" + publishedOnChannel + "', publishedOnCurrentChannel='" + publishedOnCurrentChannel + "', publishedOnCurrentPublication='" + publishedOnCurrentPublication + "', publishedOnPublication='" + publishedOnPublication + "', requiresSellingPlan='" + requiresSellingPlan + "', resourcePublicationOnCurrentPublication='" + resourcePublicationOnCurrentPublication + "', resourcePublications='" + resourcePublications + "', resourcePublicationsCount='" + resourcePublicationsCount + "', resourcePublicationsV2='" + resourcePublicationsV2 + "', restrictedForResource='" + restrictedForResource + "', sellingPlanGroupCount='" + sellingPlanGroupCount + "', sellingPlanGroups='" + sellingPlanGroups + "', sellingPlanGroupsCount='" + sellingPlanGroupsCount + "', seo='" + seo + "', standardizedProductType='" + standardizedProductType + "', status='" + status + "', storefrontId='" + storefrontId + "', tags='" + tags + "', templateSuffix='" + templateSuffix + "', title='" + title + "', totalInventory='" + totalInventory + "', totalVariants='" + totalVariants + "', tracksInventory='" + tracksInventory + "', translations='" + translations + "', unpublishedChannels='" + unpublishedChannels + "', unpublishedPublications='" + unpublishedPublications + "', updatedAt='" + updatedAt + "', variants='" + variants + "', variantsCount='" + variantsCount + "', vendor='" + vendor + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Product that = (Product) o;
    return Objects.equals(availablePublicationsCount, that.availablePublicationsCount) &&
        Objects.equals(bodyHtml, that.bodyHtml) &&
        Objects.equals(bundleComponents, that.bundleComponents) &&
        Objects.equals(category, that.category) &&
        Objects.equals(collections, that.collections) &&
        Objects.equals(combinedListing, that.combinedListing) &&
        Objects.equals(combinedListingRole, that.combinedListingRole) &&
        Objects.equals(compareAtPriceRange, that.compareAtPriceRange) &&
        Objects.equals(contextualPricing, that.contextualPricing) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(customProductType, that.customProductType) &&
        Objects.equals(defaultCursor, that.defaultCursor) &&
        Objects.equals(description, that.description) &&
        Objects.equals(descriptionHtml, that.descriptionHtml) &&
        Objects.equals(descriptionPlainSummary, that.descriptionPlainSummary) &&
        Objects.equals(events, that.events) &&
        Objects.equals(featuredImage, that.featuredImage) &&
        Objects.equals(featuredMedia, that.featuredMedia) &&
        Objects.equals(feedback, that.feedback) &&
        Objects.equals(giftCardTemplateSuffix, that.giftCardTemplateSuffix) &&
        Objects.equals(handle, that.handle) &&
        hasOnlyDefaultVariant == that.hasOnlyDefaultVariant &&
        hasOutOfStockVariants == that.hasOutOfStockVariants &&
        hasVariantsThatRequiresComponents == that.hasVariantsThatRequiresComponents &&
        Objects.equals(id, that.id) &&
        Objects.equals(images, that.images) &&
        inCollection == that.inCollection &&
        isGiftCard == that.isGiftCard &&
        Objects.equals(legacyResourceId, that.legacyResourceId) &&
        Objects.equals(media, that.media) &&
        Objects.equals(mediaCount, that.mediaCount) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafieldDefinitions, that.metafieldDefinitions) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(onlineStorePreviewUrl, that.onlineStorePreviewUrl) &&
        Objects.equals(onlineStoreUrl, that.onlineStoreUrl) &&
        Objects.equals(options, that.options) &&
        Objects.equals(priceRange, that.priceRange) &&
        Objects.equals(priceRangeV2, that.priceRangeV2) &&
        Objects.equals(productCategory, that.productCategory) &&
        Objects.equals(productPublications, that.productPublications) &&
        Objects.equals(productType, that.productType) &&
        publicationCount == that.publicationCount &&
        Objects.equals(publications, that.publications) &&
        Objects.equals(publishedAt, that.publishedAt) &&
        publishedInContext == that.publishedInContext &&
        publishedOnChannel == that.publishedOnChannel &&
        publishedOnCurrentChannel == that.publishedOnCurrentChannel &&
        publishedOnCurrentPublication == that.publishedOnCurrentPublication &&
        publishedOnPublication == that.publishedOnPublication &&
        requiresSellingPlan == that.requiresSellingPlan &&
        Objects.equals(resourcePublicationOnCurrentPublication, that.resourcePublicationOnCurrentPublication) &&
        Objects.equals(resourcePublications, that.resourcePublications) &&
        Objects.equals(resourcePublicationsCount, that.resourcePublicationsCount) &&
        Objects.equals(resourcePublicationsV2, that.resourcePublicationsV2) &&
        Objects.equals(restrictedForResource, that.restrictedForResource) &&
        sellingPlanGroupCount == that.sellingPlanGroupCount &&
        Objects.equals(sellingPlanGroups, that.sellingPlanGroups) &&
        Objects.equals(sellingPlanGroupsCount, that.sellingPlanGroupsCount) &&
        Objects.equals(seo, that.seo) &&
        Objects.equals(standardizedProductType, that.standardizedProductType) &&
        Objects.equals(status, that.status) &&
        Objects.equals(storefrontId, that.storefrontId) &&
        Objects.equals(tags, that.tags) &&
        Objects.equals(templateSuffix, that.templateSuffix) &&
        Objects.equals(title, that.title) &&
        totalInventory == that.totalInventory &&
        totalVariants == that.totalVariants &&
        tracksInventory == that.tracksInventory &&
        Objects.equals(translations, that.translations) &&
        Objects.equals(unpublishedChannels, that.unpublishedChannels) &&
        Objects.equals(unpublishedPublications, that.unpublishedPublications) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(variants, that.variants) &&
        Objects.equals(variantsCount, that.variantsCount) &&
        Objects.equals(vendor, that.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availablePublicationsCount, bodyHtml, bundleComponents, category, collections, combinedListing, combinedListingRole, compareAtPriceRange, contextualPricing, createdAt, customProductType, defaultCursor, description, descriptionHtml, descriptionPlainSummary, events, featuredImage, featuredMedia, feedback, giftCardTemplateSuffix, handle, hasOnlyDefaultVariant, hasOutOfStockVariants, hasVariantsThatRequiresComponents, id, images, inCollection, isGiftCard, legacyResourceId, media, mediaCount, metafield, metafieldDefinitions, metafields, onlineStorePreviewUrl, onlineStoreUrl, options, priceRange, priceRangeV2, productCategory, productPublications, productType, publicationCount, publications, publishedAt, publishedInContext, publishedOnChannel, publishedOnCurrentChannel, publishedOnCurrentPublication, publishedOnPublication, requiresSellingPlan, resourcePublicationOnCurrentPublication, resourcePublications, resourcePublicationsCount, resourcePublicationsV2, restrictedForResource, sellingPlanGroupCount, sellingPlanGroups, sellingPlanGroupsCount, seo, standardizedProductType, status, storefrontId, tags, templateSuffix, title, totalInventory, totalVariants, tracksInventory, translations, unpublishedChannels, unpublishedPublications, updatedAt, variants, variantsCount, vendor);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The number of
     * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
     * that a resource is published to, without
     * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
     */
    private Count availablePublicationsCount;

    /**
     * The description of the product, with
     * HTML tags. For example, the description might include
     * bold `<strong></strong>` and italic `<i></i>` text.
     */
    private String bodyHtml;

    /**
     * A list of [components](https://shopify.dev/docs/apps/build/product-merchandising/bundles/add-product-fixed-bundle)
     * that are associated with a product in a bundle.
     */
    private ProductBundleComponentConnection bundleComponents;

    /**
     * The category of a product
     * from [Shopify's Standard Product Taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17).
     */
    private TaxonomyCategory category;

    /**
     * A list of [collections](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection)
     * that include the product.
     */
    private CollectionConnection collections;

    /**
     * A special product type that combines separate products from a store into a single product listing.
     * [Combined listings](https://shopify.dev/apps/build/product-merchandising/combined-listings) are connected
     * by a shared option, such as color, model, or dimension.
     */
    private CombinedListing combinedListing;

    /**
     * The [role of the product](https://shopify.dev/docs/apps/build/product-merchandising/combined-listings/build-for-combined-listings)
     * in a combined listing.
     *   
     * If `null`, then the product isn't part of any combined listing.
     */
    private CombinedListingsRole combinedListingRole;

    /**
     * The [compare-at price range](https://help.shopify.com/manual/products/details/product-pricing/sale-pricing)
     * of the product in the shop's default currency.
     */
    private ProductCompareAtPriceRange compareAtPriceRange;

    /**
     * The pricing that applies to a customer in a specific context. For example, a
     * price might vary depending on the customer's location. As of API version
     * 2025-04, only active markets are considered in the price resolution.
     */
    private ProductContextualPricing contextualPricing;

    /**
     * The date and time when the product was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The custom product type specified by the merchant.
     */
    private String customProductType;

    /**
     * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
     * returns the single next record, sorted ascending by ID.
     */
    private String defaultCursor;

    /**
     * A single-line description of the product,
     * with [HTML tags](https://developer.mozilla.org/en-US/docs/Web/HTML) removed.
     */
    private String description;

    /**
     * The description of the product, with
     * HTML tags. For example, the description might include
     * bold `<strong></strong>` and italic `<i></i>` text.
     */
    private String descriptionHtml;

    /**
     * Stripped description of the product, single line with HTML tags removed.
     * Truncated to 60 characters.
     */
    private String descriptionPlainSummary;

    /**
     * The paginated list of events associated with the host subject.
     */
    private EventConnection events;

    /**
     * The featured image for the product.
     */
    private Image featuredImage;

    /**
     * The featured [media](https://shopify.dev/docs/apps/build/online-store/product-media)
     * associated with the product.
     */
    private Media featuredMedia;

    /**
     * The information that lets merchants know what steps they need to take
     * to make sure that the app is set up correctly.
     *   
     * For example, if a merchant hasn't set up a product correctly in the app,
     * then the feedback might include a message that says "You need to add a price
     * to this product".
     */
    private ResourceFeedback feedback;

    /**
     * The [theme template](https://shopify.dev/docs/storefronts/themes/architecture/templates)
     * that's used when customers view the gift card in a store.
     */
    private String giftCardTemplateSuffix;

    /**
     * A unique, human-readable string of the product's title. A handle can contain
     * letters, hyphens (`-`), and numbers, but no spaces.
     * The handle is used in the online store URL for the product.
     */
    private String handle;

    /**
     * Whether the product has only a single variant with the default option and value.
     */
    private boolean hasOnlyDefaultVariant;

    /**
     * Whether the product has variants that are out of stock.
     */
    private boolean hasOutOfStockVariants;

    /**
     * Whether at least one of the product variants requires
     * [bundle components](https://shopify.dev/docs/apps/build/product-merchandising/bundles/add-product-fixed-bundle).
     *   
     * Learn more about
     * [store eligibility for bundles](https://shopify.dev/docs/apps/build/product-merchandising/bundles#store-eligibility).
     */
    private boolean hasVariantsThatRequiresComponents;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The images associated with the product.
     */
    private ImageConnection images;

    /**
     * Whether the product
     * is in a specified
     * [collection](https://shopify.dev/docs/api/admin-graphql/latest/objects/collection).
     */
    private boolean inCollection;

    /**
     * Whether the product is a gift card.
     */
    private boolean isGiftCard;

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    private String legacyResourceId;

    /**
     * The [media](https://shopify.dev/docs/apps/build/online-store/product-media)
     * associated with the product. Valid media are images, 3D models, videos.
     */
    private MediaConnection media;

    /**
     * The total count of [media](https://shopify.dev/docs/apps/build/online-store/product-media)
     * that's associated with a product.
     */
    private Count mediaCount;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * List of metafield definitions.
     */
    private MetafieldDefinitionConnection metafieldDefinitions;

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    private MetafieldConnection metafields;

    /**
     * The [preview URL](https://help.shopify.com/manual/online-store/setting-up#preview-your-store) for the online store.
     */
    private String onlineStorePreviewUrl;

    /**
     * The product's URL on the online store.
     * If `null`, then the product isn't published to the online store sales channel.
     */
    private String onlineStoreUrl;

    /**
     * A list of product options. The limit is defined by the
     * [shop's resource limits for product options](https://shopify.dev/docs/api/admin-graphql/latest/objects/Shop#field-resourcelimits)
     * (`Shop.resourceLimits.maxProductOptions`).
     */
    private List<ProductOption> options;

    /**
     * The price range of the product.
     */
    private ProductPriceRange priceRange;

    /**
     * The minimum and maximum prices of a product, expressed in decimal numbers.
     * For example, if the product is priced between $10.00 and $50.00,
     * then the price range is $10.00 - $50.00.
     */
    private ProductPriceRangeV2 priceRangeV2;

    /**
     * The product category specified by the merchant.
     */
    private ProductCategory productCategory;

    /**
     * A list of the channels where the product is published.
     */
    private ProductPublicationConnection productPublications;

    /**
     * The [product type](https://help.shopify.com/manual/products/details/product-type)
     * that merchants define.
     */
    private String productType;

    /**
     * The number of
     * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
     * that a resource is published to, without
     * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
     */
    private int publicationCount;

    /**
     * A list of the channels where the product is published.
     */
    private ProductPublicationConnection publications;

    /**
     * The date and time when the product was published to the online store.
     */
    private OffsetDateTime publishedAt;

    /**
     * Whether the product is published for a customer only in a specified context.
     * For example, a product might be published for a customer only in a specific location.
     */
    private boolean publishedInContext;

    /**
     * Whether the resource is published to a specific channel.
     */
    private boolean publishedOnChannel;

    /**
     * Whether the resource is published to a
     * [channel](https://shopify.dev/docs/api/admin-graphql/latest/objects/Channel).
     * For example, the resource might be published to the online store channel.
     */
    private boolean publishedOnCurrentChannel;

    /**
     * Whether the resource is published to the app's
     * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
     * For example, the resource might be published to the app's online store channel.
     */
    private boolean publishedOnCurrentPublication;

    /**
     * Whether the resource is published to a specified
     * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
     */
    private boolean publishedOnPublication;

    /**
     * Whether the product can only be purchased with
     * a [selling plan](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans).
     * Products that are sold on subscription (`requiresSellingPlan: true`) can be updated only for online stores.
     * If you update a product to be subscription-only (`requiresSellingPlan:false`),
     * then the product is unpublished from all channels, except the online store.
     */
    private boolean requiresSellingPlan;

    /**
     * The resource that's either published or staged to be published to
     * the [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
     */
    private ResourcePublicationV2 resourcePublicationOnCurrentPublication;

    /**
     * The list of resources that are published to a
     * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
     */
    private ResourcePublicationConnection resourcePublications;

    /**
     * The number of
     * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
     * that a resource is published to, without
     * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
     */
    private Count resourcePublicationsCount;

    /**
     * The list of resources that are either published or staged to be published to a
     * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
     */
    private ResourcePublicationV2Connection resourcePublicationsV2;

    /**
     * Whether the merchant can make changes to the product when they
     * [edit the order](https://shopify.dev/docs/apps/build/orders-fulfillment/order-management-apps/edit-orders)
     * associated with the product. For example, a merchant might be restricted from changing product details when they
     * edit an order.
     */
    private RestrictedForResource restrictedForResource;

    /**
     * A count of [selling plan groups](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans/build-a-selling-plan)
     * that are associated with the product.
     */
    private int sellingPlanGroupCount;

    /**
     * A list of all [selling plan groups](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans/build-a-selling-plan)
     * that are associated with the product either directly, or through the product's variants.
     */
    private SellingPlanGroupConnection sellingPlanGroups;

    /**
     * A count of [selling plan groups](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans/build-a-selling-plan)
     * that are associated with the product.
     */
    private Count sellingPlanGroupsCount;

    /**
     * The [SEO title and description](https://help.shopify.com/manual/promoting-marketing/seo/adding-keywords)
     * that are associated with a product.
     */
    private SEO seo;

    /**
     * The standardized product type in the Shopify product taxonomy.
     */
    private StandardizedProductType standardizedProductType;

    /**
     * The [product status](https://help.shopify.com/manual/products/details/product-details-page#product-status),
     * which controls visibility across all sales channels.
     */
    private ProductStatus status;

    /**
     * The Storefront GraphQL API ID of the `Product`.
     *   
     * As of the `2022-04` version release, the Storefront GraphQL API will no longer
     * return Base64 encoded IDs to match the behavior of the Admin GraphQL API.
     * Therefore, you can safely use the `id` field's value instead.
     */
    private String storefrontId;

    /**
     * A comma-separated list of searchable keywords that are
     * associated with the product. For example, a merchant might apply the `sports`
     * and `summer` tags to products that are associated with sportwear for summer.
     *   
     * Updating `tags` overwrites
     * any existing tags that were previously added to the product. To add new tags without overwriting
     * existing tags, use the [`tagsAdd`](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
     * mutation.
     */
    private List<String> tags;

    /**
     * The [theme template](https://shopify.dev/docs/storefronts/themes/architecture/templates)
     * that's used when customers view the product in a store.
     */
    private String templateSuffix;

    /**
     * The name for the product that displays to customers. The title is used to construct the product's handle.
     * For example, if a product is titled "Black Sunglasses", then the handle is `black-sunglasses`.
     */
    private String title;

    /**
     * The quantity of inventory that's in stock.
     */
    private int totalInventory;

    /**
     * The number of [variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
     * that are associated with the product.
     */
    private int totalVariants;

    /**
     * Whether [inventory tracking](https://help.shopify.com/manual/products/inventory/getting-started-with-inventory/set-up-inventory-tracking)
     * has been enabled for the product.
     */
    private boolean tracksInventory;

    /**
     * The published translations associated with the resource.
     */
    private List<Translation> translations;

    /**
     * The list of channels that the resource is not published to.
     */
    private ChannelConnection unpublishedChannels;

    /**
     * The list of [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
     * that the resource isn't published to.
     */
    private PublicationConnection unpublishedPublications;

    /**
     * The date and time when the product was last modified.
     * A product's `updatedAt` value can change for different reasons. For example, if an order
     * is placed for a product that has inventory tracking set up, then the inventory adjustment
     * is counted as an update.
     */
    private OffsetDateTime updatedAt;

    /**
     * A list of [variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant) associated with the product.
     * If querying a single product at the root, you can fetch up to 2000 variants.
     */
    private ProductVariantConnection variants;

    /**
     * The number of [variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
     * that are associated with the product.
     */
    private Count variantsCount;

    /**
     * The name of the product's vendor.
     */
    private String vendor;

    public Product build() {
      Product result = new Product();
      result.availablePublicationsCount = this.availablePublicationsCount;
      result.bodyHtml = this.bodyHtml;
      result.bundleComponents = this.bundleComponents;
      result.category = this.category;
      result.collections = this.collections;
      result.combinedListing = this.combinedListing;
      result.combinedListingRole = this.combinedListingRole;
      result.compareAtPriceRange = this.compareAtPriceRange;
      result.contextualPricing = this.contextualPricing;
      result.createdAt = this.createdAt;
      result.customProductType = this.customProductType;
      result.defaultCursor = this.defaultCursor;
      result.description = this.description;
      result.descriptionHtml = this.descriptionHtml;
      result.descriptionPlainSummary = this.descriptionPlainSummary;
      result.events = this.events;
      result.featuredImage = this.featuredImage;
      result.featuredMedia = this.featuredMedia;
      result.feedback = this.feedback;
      result.giftCardTemplateSuffix = this.giftCardTemplateSuffix;
      result.handle = this.handle;
      result.hasOnlyDefaultVariant = this.hasOnlyDefaultVariant;
      result.hasOutOfStockVariants = this.hasOutOfStockVariants;
      result.hasVariantsThatRequiresComponents = this.hasVariantsThatRequiresComponents;
      result.id = this.id;
      result.images = this.images;
      result.inCollection = this.inCollection;
      result.isGiftCard = this.isGiftCard;
      result.legacyResourceId = this.legacyResourceId;
      result.media = this.media;
      result.mediaCount = this.mediaCount;
      result.metafield = this.metafield;
      result.metafieldDefinitions = this.metafieldDefinitions;
      result.metafields = this.metafields;
      result.onlineStorePreviewUrl = this.onlineStorePreviewUrl;
      result.onlineStoreUrl = this.onlineStoreUrl;
      result.options = this.options;
      result.priceRange = this.priceRange;
      result.priceRangeV2 = this.priceRangeV2;
      result.productCategory = this.productCategory;
      result.productPublications = this.productPublications;
      result.productType = this.productType;
      result.publicationCount = this.publicationCount;
      result.publications = this.publications;
      result.publishedAt = this.publishedAt;
      result.publishedInContext = this.publishedInContext;
      result.publishedOnChannel = this.publishedOnChannel;
      result.publishedOnCurrentChannel = this.publishedOnCurrentChannel;
      result.publishedOnCurrentPublication = this.publishedOnCurrentPublication;
      result.publishedOnPublication = this.publishedOnPublication;
      result.requiresSellingPlan = this.requiresSellingPlan;
      result.resourcePublicationOnCurrentPublication = this.resourcePublicationOnCurrentPublication;
      result.resourcePublications = this.resourcePublications;
      result.resourcePublicationsCount = this.resourcePublicationsCount;
      result.resourcePublicationsV2 = this.resourcePublicationsV2;
      result.restrictedForResource = this.restrictedForResource;
      result.sellingPlanGroupCount = this.sellingPlanGroupCount;
      result.sellingPlanGroups = this.sellingPlanGroups;
      result.sellingPlanGroupsCount = this.sellingPlanGroupsCount;
      result.seo = this.seo;
      result.standardizedProductType = this.standardizedProductType;
      result.status = this.status;
      result.storefrontId = this.storefrontId;
      result.tags = this.tags;
      result.templateSuffix = this.templateSuffix;
      result.title = this.title;
      result.totalInventory = this.totalInventory;
      result.totalVariants = this.totalVariants;
      result.tracksInventory = this.tracksInventory;
      result.translations = this.translations;
      result.unpublishedChannels = this.unpublishedChannels;
      result.unpublishedPublications = this.unpublishedPublications;
      result.updatedAt = this.updatedAt;
      result.variants = this.variants;
      result.variantsCount = this.variantsCount;
      result.vendor = this.vendor;
      return result;
    }

    /**
     * The number of
     * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
     * that a resource is published to, without
     * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
     */
    public Builder availablePublicationsCount(Count availablePublicationsCount) {
      this.availablePublicationsCount = availablePublicationsCount;
      return this;
    }

    /**
     * The description of the product, with
     * HTML tags. For example, the description might include
     * bold `<strong></strong>` and italic `<i></i>` text.
     */
    public Builder bodyHtml(String bodyHtml) {
      this.bodyHtml = bodyHtml;
      return this;
    }

    /**
     * A list of [components](https://shopify.dev/docs/apps/build/product-merchandising/bundles/add-product-fixed-bundle)
     * that are associated with a product in a bundle.
     */
    public Builder bundleComponents(ProductBundleComponentConnection bundleComponents) {
      this.bundleComponents = bundleComponents;
      return this;
    }

    /**
     * The category of a product
     * from [Shopify's Standard Product Taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17).
     */
    public Builder category(TaxonomyCategory category) {
      this.category = category;
      return this;
    }

    /**
     * A list of [collections](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection)
     * that include the product.
     */
    public Builder collections(CollectionConnection collections) {
      this.collections = collections;
      return this;
    }

    /**
     * A special product type that combines separate products from a store into a single product listing.
     * [Combined listings](https://shopify.dev/apps/build/product-merchandising/combined-listings) are connected
     * by a shared option, such as color, model, or dimension.
     */
    public Builder combinedListing(CombinedListing combinedListing) {
      this.combinedListing = combinedListing;
      return this;
    }

    /**
     * The [role of the product](https://shopify.dev/docs/apps/build/product-merchandising/combined-listings/build-for-combined-listings)
     * in a combined listing.
     *   
     * If `null`, then the product isn't part of any combined listing.
     */
    public Builder combinedListingRole(CombinedListingsRole combinedListingRole) {
      this.combinedListingRole = combinedListingRole;
      return this;
    }

    /**
     * The [compare-at price range](https://help.shopify.com/manual/products/details/product-pricing/sale-pricing)
     * of the product in the shop's default currency.
     */
    public Builder compareAtPriceRange(ProductCompareAtPriceRange compareAtPriceRange) {
      this.compareAtPriceRange = compareAtPriceRange;
      return this;
    }

    /**
     * The pricing that applies to a customer in a specific context. For example, a
     * price might vary depending on the customer's location. As of API version
     * 2025-04, only active markets are considered in the price resolution.
     */
    public Builder contextualPricing(ProductContextualPricing contextualPricing) {
      this.contextualPricing = contextualPricing;
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
     * The custom product type specified by the merchant.
     */
    public Builder customProductType(String customProductType) {
      this.customProductType = customProductType;
      return this;
    }

    /**
     * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
     * returns the single next record, sorted ascending by ID.
     */
    public Builder defaultCursor(String defaultCursor) {
      this.defaultCursor = defaultCursor;
      return this;
    }

    /**
     * A single-line description of the product,
     * with [HTML tags](https://developer.mozilla.org/en-US/docs/Web/HTML) removed.
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
     * Stripped description of the product, single line with HTML tags removed.
     * Truncated to 60 characters.
     */
    public Builder descriptionPlainSummary(String descriptionPlainSummary) {
      this.descriptionPlainSummary = descriptionPlainSummary;
      return this;
    }

    /**
     * The paginated list of events associated with the host subject.
     */
    public Builder events(EventConnection events) {
      this.events = events;
      return this;
    }

    /**
     * The featured image for the product.
     */
    public Builder featuredImage(Image featuredImage) {
      this.featuredImage = featuredImage;
      return this;
    }

    /**
     * The featured [media](https://shopify.dev/docs/apps/build/online-store/product-media)
     * associated with the product.
     */
    public Builder featuredMedia(Media featuredMedia) {
      this.featuredMedia = featuredMedia;
      return this;
    }

    /**
     * The information that lets merchants know what steps they need to take
     * to make sure that the app is set up correctly.
     *   
     * For example, if a merchant hasn't set up a product correctly in the app,
     * then the feedback might include a message that says "You need to add a price
     * to this product".
     */
    public Builder feedback(ResourceFeedback feedback) {
      this.feedback = feedback;
      return this;
    }

    /**
     * The [theme template](https://shopify.dev/docs/storefronts/themes/architecture/templates)
     * that's used when customers view the gift card in a store.
     */
    public Builder giftCardTemplateSuffix(String giftCardTemplateSuffix) {
      this.giftCardTemplateSuffix = giftCardTemplateSuffix;
      return this;
    }

    /**
     * A unique, human-readable string of the product's title. A handle can contain
     * letters, hyphens (`-`), and numbers, but no spaces.
     * The handle is used in the online store URL for the product.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * Whether the product has only a single variant with the default option and value.
     */
    public Builder hasOnlyDefaultVariant(boolean hasOnlyDefaultVariant) {
      this.hasOnlyDefaultVariant = hasOnlyDefaultVariant;
      return this;
    }

    /**
     * Whether the product has variants that are out of stock.
     */
    public Builder hasOutOfStockVariants(boolean hasOutOfStockVariants) {
      this.hasOutOfStockVariants = hasOutOfStockVariants;
      return this;
    }

    /**
     * Whether at least one of the product variants requires
     * [bundle components](https://shopify.dev/docs/apps/build/product-merchandising/bundles/add-product-fixed-bundle).
     *   
     * Learn more about
     * [store eligibility for bundles](https://shopify.dev/docs/apps/build/product-merchandising/bundles#store-eligibility).
     */
    public Builder hasVariantsThatRequiresComponents(boolean hasVariantsThatRequiresComponents) {
      this.hasVariantsThatRequiresComponents = hasVariantsThatRequiresComponents;
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
     * The images associated with the product.
     */
    public Builder images(ImageConnection images) {
      this.images = images;
      return this;
    }

    /**
     * Whether the product
     * is in a specified
     * [collection](https://shopify.dev/docs/api/admin-graphql/latest/objects/collection).
     */
    public Builder inCollection(boolean inCollection) {
      this.inCollection = inCollection;
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
     * The ID of the corresponding resource in the REST Admin API.
     */
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    /**
     * The [media](https://shopify.dev/docs/apps/build/online-store/product-media)
     * associated with the product. Valid media are images, 3D models, videos.
     */
    public Builder media(MediaConnection media) {
      this.media = media;
      return this;
    }

    /**
     * The total count of [media](https://shopify.dev/docs/apps/build/online-store/product-media)
     * that's associated with a product.
     */
    public Builder mediaCount(Count mediaCount) {
      this.mediaCount = mediaCount;
      return this;
    }

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * List of metafield definitions.
     */
    public Builder metafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
      this.metafieldDefinitions = metafieldDefinitions;
      return this;
    }

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The [preview URL](https://help.shopify.com/manual/online-store/setting-up#preview-your-store) for the online store.
     */
    public Builder onlineStorePreviewUrl(String onlineStorePreviewUrl) {
      this.onlineStorePreviewUrl = onlineStorePreviewUrl;
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
     * A list of product options. The limit is defined by the
     * [shop's resource limits for product options](https://shopify.dev/docs/api/admin-graphql/latest/objects/Shop#field-resourcelimits)
     * (`Shop.resourceLimits.maxProductOptions`).
     */
    public Builder options(List<ProductOption> options) {
      this.options = options;
      return this;
    }

    /**
     * The price range of the product.
     */
    public Builder priceRange(ProductPriceRange priceRange) {
      this.priceRange = priceRange;
      return this;
    }

    /**
     * The minimum and maximum prices of a product, expressed in decimal numbers.
     * For example, if the product is priced between $10.00 and $50.00,
     * then the price range is $10.00 - $50.00.
     */
    public Builder priceRangeV2(ProductPriceRangeV2 priceRangeV2) {
      this.priceRangeV2 = priceRangeV2;
      return this;
    }

    /**
     * The product category specified by the merchant.
     */
    public Builder productCategory(ProductCategory productCategory) {
      this.productCategory = productCategory;
      return this;
    }

    /**
     * A list of the channels where the product is published.
     */
    public Builder productPublications(ProductPublicationConnection productPublications) {
      this.productPublications = productPublications;
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
     * The number of
     * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
     * that a resource is published to, without
     * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
     */
    public Builder publicationCount(int publicationCount) {
      this.publicationCount = publicationCount;
      return this;
    }

    /**
     * A list of the channels where the product is published.
     */
    public Builder publications(ProductPublicationConnection publications) {
      this.publications = publications;
      return this;
    }

    /**
     * The date and time when the product was published to the online store.
     */
    public Builder publishedAt(OffsetDateTime publishedAt) {
      this.publishedAt = publishedAt;
      return this;
    }

    /**
     * Whether the product is published for a customer only in a specified context.
     * For example, a product might be published for a customer only in a specific location.
     */
    public Builder publishedInContext(boolean publishedInContext) {
      this.publishedInContext = publishedInContext;
      return this;
    }

    /**
     * Whether the resource is published to a specific channel.
     */
    public Builder publishedOnChannel(boolean publishedOnChannel) {
      this.publishedOnChannel = publishedOnChannel;
      return this;
    }

    /**
     * Whether the resource is published to a
     * [channel](https://shopify.dev/docs/api/admin-graphql/latest/objects/Channel).
     * For example, the resource might be published to the online store channel.
     */
    public Builder publishedOnCurrentChannel(boolean publishedOnCurrentChannel) {
      this.publishedOnCurrentChannel = publishedOnCurrentChannel;
      return this;
    }

    /**
     * Whether the resource is published to the app's
     * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
     * For example, the resource might be published to the app's online store channel.
     */
    public Builder publishedOnCurrentPublication(boolean publishedOnCurrentPublication) {
      this.publishedOnCurrentPublication = publishedOnCurrentPublication;
      return this;
    }

    /**
     * Whether the resource is published to a specified
     * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
     */
    public Builder publishedOnPublication(boolean publishedOnPublication) {
      this.publishedOnPublication = publishedOnPublication;
      return this;
    }

    /**
     * Whether the product can only be purchased with
     * a [selling plan](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans).
     * Products that are sold on subscription (`requiresSellingPlan: true`) can be updated only for online stores.
     * If you update a product to be subscription-only (`requiresSellingPlan:false`),
     * then the product is unpublished from all channels, except the online store.
     */
    public Builder requiresSellingPlan(boolean requiresSellingPlan) {
      this.requiresSellingPlan = requiresSellingPlan;
      return this;
    }

    /**
     * The resource that's either published or staged to be published to
     * the [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
     */
    public Builder resourcePublicationOnCurrentPublication(
        ResourcePublicationV2 resourcePublicationOnCurrentPublication) {
      this.resourcePublicationOnCurrentPublication = resourcePublicationOnCurrentPublication;
      return this;
    }

    /**
     * The list of resources that are published to a
     * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
     */
    public Builder resourcePublications(ResourcePublicationConnection resourcePublications) {
      this.resourcePublications = resourcePublications;
      return this;
    }

    /**
     * The number of
     * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
     * that a resource is published to, without
     * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
     */
    public Builder resourcePublicationsCount(Count resourcePublicationsCount) {
      this.resourcePublicationsCount = resourcePublicationsCount;
      return this;
    }

    /**
     * The list of resources that are either published or staged to be published to a
     * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
     */
    public Builder resourcePublicationsV2(ResourcePublicationV2Connection resourcePublicationsV2) {
      this.resourcePublicationsV2 = resourcePublicationsV2;
      return this;
    }

    /**
     * Whether the merchant can make changes to the product when they
     * [edit the order](https://shopify.dev/docs/apps/build/orders-fulfillment/order-management-apps/edit-orders)
     * associated with the product. For example, a merchant might be restricted from changing product details when they
     * edit an order.
     */
    public Builder restrictedForResource(RestrictedForResource restrictedForResource) {
      this.restrictedForResource = restrictedForResource;
      return this;
    }

    /**
     * A count of [selling plan groups](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans/build-a-selling-plan)
     * that are associated with the product.
     */
    public Builder sellingPlanGroupCount(int sellingPlanGroupCount) {
      this.sellingPlanGroupCount = sellingPlanGroupCount;
      return this;
    }

    /**
     * A list of all [selling plan groups](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans/build-a-selling-plan)
     * that are associated with the product either directly, or through the product's variants.
     */
    public Builder sellingPlanGroups(SellingPlanGroupConnection sellingPlanGroups) {
      this.sellingPlanGroups = sellingPlanGroups;
      return this;
    }

    /**
     * A count of [selling plan groups](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans/build-a-selling-plan)
     * that are associated with the product.
     */
    public Builder sellingPlanGroupsCount(Count sellingPlanGroupsCount) {
      this.sellingPlanGroupsCount = sellingPlanGroupsCount;
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
     * The standardized product type in the Shopify product taxonomy.
     */
    public Builder standardizedProductType(StandardizedProductType standardizedProductType) {
      this.standardizedProductType = standardizedProductType;
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
     * The Storefront GraphQL API ID of the `Product`.
     *   
     * As of the `2022-04` version release, the Storefront GraphQL API will no longer
     * return Base64 encoded IDs to match the behavior of the Admin GraphQL API.
     * Therefore, you can safely use the `id` field's value instead.
     */
    public Builder storefrontId(String storefrontId) {
      this.storefrontId = storefrontId;
      return this;
    }

    /**
     * A comma-separated list of searchable keywords that are
     * associated with the product. For example, a merchant might apply the `sports`
     * and `summer` tags to products that are associated with sportwear for summer.
     *   
     * Updating `tags` overwrites
     * any existing tags that were previously added to the product. To add new tags without overwriting
     * existing tags, use the [`tagsAdd`](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
     * mutation.
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * The [theme template](https://shopify.dev/docs/storefronts/themes/architecture/templates)
     * that's used when customers view the product in a store.
     */
    public Builder templateSuffix(String templateSuffix) {
      this.templateSuffix = templateSuffix;
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
    public Builder totalInventory(int totalInventory) {
      this.totalInventory = totalInventory;
      return this;
    }

    /**
     * The number of [variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
     * that are associated with the product.
     */
    public Builder totalVariants(int totalVariants) {
      this.totalVariants = totalVariants;
      return this;
    }

    /**
     * Whether [inventory tracking](https://help.shopify.com/manual/products/inventory/getting-started-with-inventory/set-up-inventory-tracking)
     * has been enabled for the product.
     */
    public Builder tracksInventory(boolean tracksInventory) {
      this.tracksInventory = tracksInventory;
      return this;
    }

    /**
     * The published translations associated with the resource.
     */
    public Builder translations(List<Translation> translations) {
      this.translations = translations;
      return this;
    }

    /**
     * The list of channels that the resource is not published to.
     */
    public Builder unpublishedChannels(ChannelConnection unpublishedChannels) {
      this.unpublishedChannels = unpublishedChannels;
      return this;
    }

    /**
     * The list of [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
     * that the resource isn't published to.
     */
    public Builder unpublishedPublications(PublicationConnection unpublishedPublications) {
      this.unpublishedPublications = unpublishedPublications;
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
     * A list of [variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant) associated with the product.
     * If querying a single product at the root, you can fetch up to 2000 variants.
     */
    public Builder variants(ProductVariantConnection variants) {
      this.variants = variants;
      return this;
    }

    /**
     * The number of [variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
     * that are associated with the product.
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
