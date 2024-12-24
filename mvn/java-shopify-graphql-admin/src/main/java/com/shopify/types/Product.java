package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Product implements CommentEventEmbed, MetafieldReference, MetafieldReferencer, com.shopify.types.HasEvents, com.shopify.types.HasMetafieldDefinitions, com.shopify.types.HasMetafields, com.shopify.types.HasPublishedTranslations, com.shopify.types.LegacyInteroperability, com.shopify.types.Navigable, com.shopify.types.Node, com.shopify.types.OnlineStorePreviewable, com.shopify.types.Publishable {
  
  private Count availablePublicationsCount;

  
  private String bodyHtml;

  
  private ProductBundleComponentConnection bundleComponents;

  
  private TaxonomyCategory category;

  
  private CollectionConnection collections;

  
  private CombinedListing combinedListing;

  
  private CombinedListingsRole combinedListingRole;

  
  private ProductCompareAtPriceRange compareAtPriceRange;

  
  private ProductContextualPricing contextualPricing;

  
  private OffsetDateTime createdAt;

  
  private String customProductType;

  
  private String defaultCursor;

  
  private String description;

  
  private String descriptionHtml;

  
  private String descriptionPlainSummary;

  
  private EventConnection events;

  
  private Image featuredImage;

  
  private Media featuredMedia;

  
  private ResourceFeedback feedback;

  
  private String giftCardTemplateSuffix;

  
  private String handle;

  
  private boolean hasOnlyDefaultVariant;

  
  private boolean hasOutOfStockVariants;

  
  private boolean hasVariantsThatRequiresComponents;

  
  private String id;

  
  private ImageConnection images;

  
  private boolean inCollection;

  
  private boolean isGiftCard;

  
  private String legacyResourceId;

  
  private MediaConnection media;

  
  private Count mediaCount;

  
  private Metafield metafield;

  
  private MetafieldDefinitionConnection metafieldDefinitions;

  
  private MetafieldConnection metafields;

  
  private String onlineStorePreviewUrl;

  
  private String onlineStoreUrl;

  
  private List<ProductOption> options;

  
  private ProductPriceRange priceRange;

  
  private ProductPriceRangeV2 priceRangeV2;

  
  private PrivateMetafield privateMetafield;

  
  private PrivateMetafieldConnection privateMetafields;

  
  private ProductCategory productCategory;

  
  private ProductPublicationConnection productPublications;

  
  private String productType;

  
  private int publicationCount;

  
  private ProductPublicationConnection publications;

  
  private OffsetDateTime publishedAt;

  
  private boolean publishedInContext;

  
  private boolean publishedOnChannel;

  
  private boolean publishedOnCurrentChannel;

  
  private boolean publishedOnCurrentPublication;

  
  private boolean publishedOnPublication;

  
  private boolean requiresSellingPlan;

  
  private ResourcePublicationV2 resourcePublicationOnCurrentPublication;

  
  private ResourcePublicationConnection resourcePublications;

  
  private Count resourcePublicationsCount;

  
  private ResourcePublicationV2Connection resourcePublicationsV2;

  
  private RestrictedForResource restrictedForResource;

  
  private int sellingPlanGroupCount;

  
  private SellingPlanGroupConnection sellingPlanGroups;

  
  private Count sellingPlanGroupsCount;

  
  private SEO seo;

  
  private StandardizedProductType standardizedProductType;

  
  private ProductStatus status;

  
  private String storefrontId;

  
  private List<String> tags;

  
  private String templateSuffix;

  
  private String title;

  
  private int totalInventory;

  
  private int totalVariants;

  
  private boolean tracksInventory;

  
  private List<Translation> translations;

  
  private ChannelConnection unpublishedChannels;

  
  private PublicationConnection unpublishedPublications;

  
  private OffsetDateTime updatedAt;

  
  private ProductVariantConnection variants;

  
  private Count variantsCount;

  
  private String vendor;

  public Product() {
  }

  
  public Count getAvailablePublicationsCount() {
    return availablePublicationsCount;
  }

  public void setAvailablePublicationsCount(Count availablePublicationsCount) {
    this.availablePublicationsCount = availablePublicationsCount;
  }

  
  public String getBodyHtml() {
    return bodyHtml;
  }

  public void setBodyHtml(String bodyHtml) {
    this.bodyHtml = bodyHtml;
  }

  
  public ProductBundleComponentConnection getBundleComponents() {
    return bundleComponents;
  }

  public void setBundleComponents(ProductBundleComponentConnection bundleComponents) {
    this.bundleComponents = bundleComponents;
  }

  
  public TaxonomyCategory getCategory() {
    return category;
  }

  public void setCategory(TaxonomyCategory category) {
    this.category = category;
  }

  
  public CollectionConnection getCollections() {
    return collections;
  }

  public void setCollections(CollectionConnection collections) {
    this.collections = collections;
  }

  
  public CombinedListing getCombinedListing() {
    return combinedListing;
  }

  public void setCombinedListing(CombinedListing combinedListing) {
    this.combinedListing = combinedListing;
  }

  
  public CombinedListingsRole getCombinedListingRole() {
    return combinedListingRole;
  }

  public void setCombinedListingRole(CombinedListingsRole combinedListingRole) {
    this.combinedListingRole = combinedListingRole;
  }

  
  public ProductCompareAtPriceRange getCompareAtPriceRange() {
    return compareAtPriceRange;
  }

  public void setCompareAtPriceRange(ProductCompareAtPriceRange compareAtPriceRange) {
    this.compareAtPriceRange = compareAtPriceRange;
  }

  
  public ProductContextualPricing getContextualPricing() {
    return contextualPricing;
  }

  public void setContextualPricing(ProductContextualPricing contextualPricing) {
    this.contextualPricing = contextualPricing;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public String getCustomProductType() {
    return customProductType;
  }

  public void setCustomProductType(String customProductType) {
    this.customProductType = customProductType;
  }

  
  public String getDefaultCursor() {
    return defaultCursor;
  }

  public void setDefaultCursor(String defaultCursor) {
    this.defaultCursor = defaultCursor;
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public String getDescriptionHtml() {
    return descriptionHtml;
  }

  public void setDescriptionHtml(String descriptionHtml) {
    this.descriptionHtml = descriptionHtml;
  }

  
  public String getDescriptionPlainSummary() {
    return descriptionPlainSummary;
  }

  public void setDescriptionPlainSummary(String descriptionPlainSummary) {
    this.descriptionPlainSummary = descriptionPlainSummary;
  }

  
  public EventConnection getEvents() {
    return events;
  }

  public void setEvents(EventConnection events) {
    this.events = events;
  }

  
  public Image getFeaturedImage() {
    return featuredImage;
  }

  public void setFeaturedImage(Image featuredImage) {
    this.featuredImage = featuredImage;
  }

  
  public Media getFeaturedMedia() {
    return featuredMedia;
  }

  public void setFeaturedMedia(Media featuredMedia) {
    this.featuredMedia = featuredMedia;
  }

  
  public ResourceFeedback getFeedback() {
    return feedback;
  }

  public void setFeedback(ResourceFeedback feedback) {
    this.feedback = feedback;
  }

  
  public String getGiftCardTemplateSuffix() {
    return giftCardTemplateSuffix;
  }

  public void setGiftCardTemplateSuffix(String giftCardTemplateSuffix) {
    this.giftCardTemplateSuffix = giftCardTemplateSuffix;
  }

  
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  
  public boolean getHasOnlyDefaultVariant() {
    return hasOnlyDefaultVariant;
  }

  public void setHasOnlyDefaultVariant(boolean hasOnlyDefaultVariant) {
    this.hasOnlyDefaultVariant = hasOnlyDefaultVariant;
  }

  
  public boolean getHasOutOfStockVariants() {
    return hasOutOfStockVariants;
  }

  public void setHasOutOfStockVariants(boolean hasOutOfStockVariants) {
    this.hasOutOfStockVariants = hasOutOfStockVariants;
  }

  
  public boolean getHasVariantsThatRequiresComponents() {
    return hasVariantsThatRequiresComponents;
  }

  public void setHasVariantsThatRequiresComponents(boolean hasVariantsThatRequiresComponents) {
    this.hasVariantsThatRequiresComponents = hasVariantsThatRequiresComponents;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public ImageConnection getImages() {
    return images;
  }

  public void setImages(ImageConnection images) {
    this.images = images;
  }

  
  public boolean getInCollection() {
    return inCollection;
  }

  public void setInCollection(boolean inCollection) {
    this.inCollection = inCollection;
  }

  
  public boolean getIsGiftCard() {
    return isGiftCard;
  }

  public void setIsGiftCard(boolean isGiftCard) {
    this.isGiftCard = isGiftCard;
  }

  
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  
  public MediaConnection getMedia() {
    return media;
  }

  public void setMedia(MediaConnection media) {
    this.media = media;
  }

  
  public Count getMediaCount() {
    return mediaCount;
  }

  public void setMediaCount(Count mediaCount) {
    this.mediaCount = mediaCount;
  }

  
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  
  public MetafieldDefinitionConnection getMetafieldDefinitions() {
    return metafieldDefinitions;
  }

  public void setMetafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
    this.metafieldDefinitions = metafieldDefinitions;
  }

  
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  
  public String getOnlineStorePreviewUrl() {
    return onlineStorePreviewUrl;
  }

  public void setOnlineStorePreviewUrl(String onlineStorePreviewUrl) {
    this.onlineStorePreviewUrl = onlineStorePreviewUrl;
  }

  
  public String getOnlineStoreUrl() {
    return onlineStoreUrl;
  }

  public void setOnlineStoreUrl(String onlineStoreUrl) {
    this.onlineStoreUrl = onlineStoreUrl;
  }

  
  public List<ProductOption> getOptions() {
    return options;
  }

  public void setOptions(List<ProductOption> options) {
    this.options = options;
  }

  
  public ProductPriceRange getPriceRange() {
    return priceRange;
  }

  public void setPriceRange(ProductPriceRange priceRange) {
    this.priceRange = priceRange;
  }

  
  public ProductPriceRangeV2 getPriceRangeV2() {
    return priceRangeV2;
  }

  public void setPriceRangeV2(ProductPriceRangeV2 priceRangeV2) {
    this.priceRangeV2 = priceRangeV2;
  }

  
  public PrivateMetafield getPrivateMetafield() {
    return privateMetafield;
  }

  public void setPrivateMetafield(PrivateMetafield privateMetafield) {
    this.privateMetafield = privateMetafield;
  }

  
  public PrivateMetafieldConnection getPrivateMetafields() {
    return privateMetafields;
  }

  public void setPrivateMetafields(PrivateMetafieldConnection privateMetafields) {
    this.privateMetafields = privateMetafields;
  }

  
  public ProductCategory getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(ProductCategory productCategory) {
    this.productCategory = productCategory;
  }

  
  public ProductPublicationConnection getProductPublications() {
    return productPublications;
  }

  public void setProductPublications(ProductPublicationConnection productPublications) {
    this.productPublications = productPublications;
  }

  
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  
  public int getPublicationCount() {
    return publicationCount;
  }

  public void setPublicationCount(int publicationCount) {
    this.publicationCount = publicationCount;
  }

  
  public ProductPublicationConnection getPublications() {
    return publications;
  }

  public void setPublications(ProductPublicationConnection publications) {
    this.publications = publications;
  }

  
  public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
  }

  
  public boolean getPublishedInContext() {
    return publishedInContext;
  }

  public void setPublishedInContext(boolean publishedInContext) {
    this.publishedInContext = publishedInContext;
  }

  
  public boolean getPublishedOnChannel() {
    return publishedOnChannel;
  }

  public void setPublishedOnChannel(boolean publishedOnChannel) {
    this.publishedOnChannel = publishedOnChannel;
  }

  
  public boolean getPublishedOnCurrentChannel() {
    return publishedOnCurrentChannel;
  }

  public void setPublishedOnCurrentChannel(boolean publishedOnCurrentChannel) {
    this.publishedOnCurrentChannel = publishedOnCurrentChannel;
  }

  
  public boolean getPublishedOnCurrentPublication() {
    return publishedOnCurrentPublication;
  }

  public void setPublishedOnCurrentPublication(boolean publishedOnCurrentPublication) {
    this.publishedOnCurrentPublication = publishedOnCurrentPublication;
  }

  
  public boolean getPublishedOnPublication() {
    return publishedOnPublication;
  }

  public void setPublishedOnPublication(boolean publishedOnPublication) {
    this.publishedOnPublication = publishedOnPublication;
  }

  
  public boolean getRequiresSellingPlan() {
    return requiresSellingPlan;
  }

  public void setRequiresSellingPlan(boolean requiresSellingPlan) {
    this.requiresSellingPlan = requiresSellingPlan;
  }

  
  public ResourcePublicationV2 getResourcePublicationOnCurrentPublication() {
    return resourcePublicationOnCurrentPublication;
  }

  public void setResourcePublicationOnCurrentPublication(
      ResourcePublicationV2 resourcePublicationOnCurrentPublication) {
    this.resourcePublicationOnCurrentPublication = resourcePublicationOnCurrentPublication;
  }

  
  public ResourcePublicationConnection getResourcePublications() {
    return resourcePublications;
  }

  public void setResourcePublications(ResourcePublicationConnection resourcePublications) {
    this.resourcePublications = resourcePublications;
  }

  
  public Count getResourcePublicationsCount() {
    return resourcePublicationsCount;
  }

  public void setResourcePublicationsCount(Count resourcePublicationsCount) {
    this.resourcePublicationsCount = resourcePublicationsCount;
  }

  
  public ResourcePublicationV2Connection getResourcePublicationsV2() {
    return resourcePublicationsV2;
  }

  public void setResourcePublicationsV2(ResourcePublicationV2Connection resourcePublicationsV2) {
    this.resourcePublicationsV2 = resourcePublicationsV2;
  }

  
  public RestrictedForResource getRestrictedForResource() {
    return restrictedForResource;
  }

  public void setRestrictedForResource(RestrictedForResource restrictedForResource) {
    this.restrictedForResource = restrictedForResource;
  }

  
  public int getSellingPlanGroupCount() {
    return sellingPlanGroupCount;
  }

  public void setSellingPlanGroupCount(int sellingPlanGroupCount) {
    this.sellingPlanGroupCount = sellingPlanGroupCount;
  }

  
  public SellingPlanGroupConnection getSellingPlanGroups() {
    return sellingPlanGroups;
  }

  public void setSellingPlanGroups(SellingPlanGroupConnection sellingPlanGroups) {
    this.sellingPlanGroups = sellingPlanGroups;
  }

  
  public Count getSellingPlanGroupsCount() {
    return sellingPlanGroupsCount;
  }

  public void setSellingPlanGroupsCount(Count sellingPlanGroupsCount) {
    this.sellingPlanGroupsCount = sellingPlanGroupsCount;
  }

  
  public SEO getSeo() {
    return seo;
  }

  public void setSeo(SEO seo) {
    this.seo = seo;
  }

  
  public StandardizedProductType getStandardizedProductType() {
    return standardizedProductType;
  }

  public void setStandardizedProductType(StandardizedProductType standardizedProductType) {
    this.standardizedProductType = standardizedProductType;
  }

  
  public ProductStatus getStatus() {
    return status;
  }

  public void setStatus(ProductStatus status) {
    this.status = status;
  }

  
  public String getStorefrontId() {
    return storefrontId;
  }

  public void setStorefrontId(String storefrontId) {
    this.storefrontId = storefrontId;
  }

  
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  
  public String getTemplateSuffix() {
    return templateSuffix;
  }

  public void setTemplateSuffix(String templateSuffix) {
    this.templateSuffix = templateSuffix;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public int getTotalInventory() {
    return totalInventory;
  }

  public void setTotalInventory(int totalInventory) {
    this.totalInventory = totalInventory;
  }

  
  public int getTotalVariants() {
    return totalVariants;
  }

  public void setTotalVariants(int totalVariants) {
    this.totalVariants = totalVariants;
  }

  
  public boolean getTracksInventory() {
    return tracksInventory;
  }

  public void setTracksInventory(boolean tracksInventory) {
    this.tracksInventory = tracksInventory;
  }

  
  public List<Translation> getTranslations() {
    return translations;
  }

  public void setTranslations(List<Translation> translations) {
    this.translations = translations;
  }

  
  public ChannelConnection getUnpublishedChannels() {
    return unpublishedChannels;
  }

  public void setUnpublishedChannels(ChannelConnection unpublishedChannels) {
    this.unpublishedChannels = unpublishedChannels;
  }

  
  public PublicationConnection getUnpublishedPublications() {
    return unpublishedPublications;
  }

  public void setUnpublishedPublications(PublicationConnection unpublishedPublications) {
    this.unpublishedPublications = unpublishedPublications;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  
  public ProductVariantConnection getVariants() {
    return variants;
  }

  public void setVariants(ProductVariantConnection variants) {
    this.variants = variants;
  }

  
  public Count getVariantsCount() {
    return variantsCount;
  }

  public void setVariantsCount(Count variantsCount) {
    this.variantsCount = variantsCount;
  }

  
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  @Override
  public String toString() {
    return "Product{availablePublicationsCount='" + availablePublicationsCount + "', bodyHtml='" + bodyHtml + "', bundleComponents='" + bundleComponents + "', category='" + category + "', collections='" + collections + "', combinedListing='" + combinedListing + "', combinedListingRole='" + combinedListingRole + "', compareAtPriceRange='" + compareAtPriceRange + "', contextualPricing='" + contextualPricing + "', createdAt='" + createdAt + "', customProductType='" + customProductType + "', defaultCursor='" + defaultCursor + "', description='" + description + "', descriptionHtml='" + descriptionHtml + "', descriptionPlainSummary='" + descriptionPlainSummary + "', events='" + events + "', featuredImage='" + featuredImage + "', featuredMedia='" + featuredMedia + "', feedback='" + feedback + "', giftCardTemplateSuffix='" + giftCardTemplateSuffix + "', handle='" + handle + "', hasOnlyDefaultVariant='" + hasOnlyDefaultVariant + "', hasOutOfStockVariants='" + hasOutOfStockVariants + "', hasVariantsThatRequiresComponents='" + hasVariantsThatRequiresComponents + "', id='" + id + "', images='" + images + "', inCollection='" + inCollection + "', isGiftCard='" + isGiftCard + "', legacyResourceId='" + legacyResourceId + "', media='" + media + "', mediaCount='" + mediaCount + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', onlineStorePreviewUrl='" + onlineStorePreviewUrl + "', onlineStoreUrl='" + onlineStoreUrl + "', options='" + options + "', priceRange='" + priceRange + "', priceRangeV2='" + priceRangeV2 + "', privateMetafield='" + privateMetafield + "', privateMetafields='" + privateMetafields + "', productCategory='" + productCategory + "', productPublications='" + productPublications + "', productType='" + productType + "', publicationCount='" + publicationCount + "', publications='" + publications + "', publishedAt='" + publishedAt + "', publishedInContext='" + publishedInContext + "', publishedOnChannel='" + publishedOnChannel + "', publishedOnCurrentChannel='" + publishedOnCurrentChannel + "', publishedOnCurrentPublication='" + publishedOnCurrentPublication + "', publishedOnPublication='" + publishedOnPublication + "', requiresSellingPlan='" + requiresSellingPlan + "', resourcePublicationOnCurrentPublication='" + resourcePublicationOnCurrentPublication + "', resourcePublications='" + resourcePublications + "', resourcePublicationsCount='" + resourcePublicationsCount + "', resourcePublicationsV2='" + resourcePublicationsV2 + "', restrictedForResource='" + restrictedForResource + "', sellingPlanGroupCount='" + sellingPlanGroupCount + "', sellingPlanGroups='" + sellingPlanGroups + "', sellingPlanGroupsCount='" + sellingPlanGroupsCount + "', seo='" + seo + "', standardizedProductType='" + standardizedProductType + "', status='" + status + "', storefrontId='" + storefrontId + "', tags='" + tags + "', templateSuffix='" + templateSuffix + "', title='" + title + "', totalInventory='" + totalInventory + "', totalVariants='" + totalVariants + "', tracksInventory='" + tracksInventory + "', translations='" + translations + "', unpublishedChannels='" + unpublishedChannels + "', unpublishedPublications='" + unpublishedPublications + "', updatedAt='" + updatedAt + "', variants='" + variants + "', variantsCount='" + variantsCount + "', vendor='" + vendor + "'}";
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
        Objects.equals(privateMetafield, that.privateMetafield) &&
        Objects.equals(privateMetafields, that.privateMetafields) &&
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
    return Objects.hash(availablePublicationsCount, bodyHtml, bundleComponents, category, collections, combinedListing, combinedListingRole, compareAtPriceRange, contextualPricing, createdAt, customProductType, defaultCursor, description, descriptionHtml, descriptionPlainSummary, events, featuredImage, featuredMedia, feedback, giftCardTemplateSuffix, handle, hasOnlyDefaultVariant, hasOutOfStockVariants, hasVariantsThatRequiresComponents, id, images, inCollection, isGiftCard, legacyResourceId, media, mediaCount, metafield, metafieldDefinitions, metafields, onlineStorePreviewUrl, onlineStoreUrl, options, priceRange, priceRangeV2, privateMetafield, privateMetafields, productCategory, productPublications, productType, publicationCount, publications, publishedAt, publishedInContext, publishedOnChannel, publishedOnCurrentChannel, publishedOnCurrentPublication, publishedOnPublication, requiresSellingPlan, resourcePublicationOnCurrentPublication, resourcePublications, resourcePublicationsCount, resourcePublicationsV2, restrictedForResource, sellingPlanGroupCount, sellingPlanGroups, sellingPlanGroupsCount, seo, standardizedProductType, status, storefrontId, tags, templateSuffix, title, totalInventory, totalVariants, tracksInventory, translations, unpublishedChannels, unpublishedPublications, updatedAt, variants, variantsCount, vendor);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Count availablePublicationsCount;

    
    private String bodyHtml;

    
    private ProductBundleComponentConnection bundleComponents;

    
    private TaxonomyCategory category;

    
    private CollectionConnection collections;

    
    private CombinedListing combinedListing;

    
    private CombinedListingsRole combinedListingRole;

    
    private ProductCompareAtPriceRange compareAtPriceRange;

    
    private ProductContextualPricing contextualPricing;

    
    private OffsetDateTime createdAt;

    
    private String customProductType;

    
    private String defaultCursor;

    
    private String description;

    
    private String descriptionHtml;

    
    private String descriptionPlainSummary;

    
    private EventConnection events;

    
    private Image featuredImage;

    
    private Media featuredMedia;

    
    private ResourceFeedback feedback;

    
    private String giftCardTemplateSuffix;

    
    private String handle;

    
    private boolean hasOnlyDefaultVariant;

    
    private boolean hasOutOfStockVariants;

    
    private boolean hasVariantsThatRequiresComponents;

    
    private String id;

    
    private ImageConnection images;

    
    private boolean inCollection;

    
    private boolean isGiftCard;

    
    private String legacyResourceId;

    
    private MediaConnection media;

    
    private Count mediaCount;

    
    private Metafield metafield;

    
    private MetafieldDefinitionConnection metafieldDefinitions;

    
    private MetafieldConnection metafields;

    
    private String onlineStorePreviewUrl;

    
    private String onlineStoreUrl;

    
    private List<ProductOption> options;

    
    private ProductPriceRange priceRange;

    
    private ProductPriceRangeV2 priceRangeV2;

    
    private PrivateMetafield privateMetafield;

    
    private PrivateMetafieldConnection privateMetafields;

    
    private ProductCategory productCategory;

    
    private ProductPublicationConnection productPublications;

    
    private String productType;

    
    private int publicationCount;

    
    private ProductPublicationConnection publications;

    
    private OffsetDateTime publishedAt;

    
    private boolean publishedInContext;

    
    private boolean publishedOnChannel;

    
    private boolean publishedOnCurrentChannel;

    
    private boolean publishedOnCurrentPublication;

    
    private boolean publishedOnPublication;

    
    private boolean requiresSellingPlan;

    
    private ResourcePublicationV2 resourcePublicationOnCurrentPublication;

    
    private ResourcePublicationConnection resourcePublications;

    
    private Count resourcePublicationsCount;

    
    private ResourcePublicationV2Connection resourcePublicationsV2;

    
    private RestrictedForResource restrictedForResource;

    
    private int sellingPlanGroupCount;

    
    private SellingPlanGroupConnection sellingPlanGroups;

    
    private Count sellingPlanGroupsCount;

    
    private SEO seo;

    
    private StandardizedProductType standardizedProductType;

    
    private ProductStatus status;

    
    private String storefrontId;

    
    private List<String> tags;

    
    private String templateSuffix;

    
    private String title;

    
    private int totalInventory;

    
    private int totalVariants;

    
    private boolean tracksInventory;

    
    private List<Translation> translations;

    
    private ChannelConnection unpublishedChannels;

    
    private PublicationConnection unpublishedPublications;

    
    private OffsetDateTime updatedAt;

    
    private ProductVariantConnection variants;

    
    private Count variantsCount;

    
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
      result.privateMetafield = this.privateMetafield;
      result.privateMetafields = this.privateMetafields;
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

    
    public Builder availablePublicationsCount(Count availablePublicationsCount) {
      this.availablePublicationsCount = availablePublicationsCount;
      return this;
    }

    
    public Builder bodyHtml(String bodyHtml) {
      this.bodyHtml = bodyHtml;
      return this;
    }

    
    public Builder bundleComponents(ProductBundleComponentConnection bundleComponents) {
      this.bundleComponents = bundleComponents;
      return this;
    }

    
    public Builder category(TaxonomyCategory category) {
      this.category = category;
      return this;
    }

    
    public Builder collections(CollectionConnection collections) {
      this.collections = collections;
      return this;
    }

    
    public Builder combinedListing(CombinedListing combinedListing) {
      this.combinedListing = combinedListing;
      return this;
    }

    
    public Builder combinedListingRole(CombinedListingsRole combinedListingRole) {
      this.combinedListingRole = combinedListingRole;
      return this;
    }

    
    public Builder compareAtPriceRange(ProductCompareAtPriceRange compareAtPriceRange) {
      this.compareAtPriceRange = compareAtPriceRange;
      return this;
    }

    
    public Builder contextualPricing(ProductContextualPricing contextualPricing) {
      this.contextualPricing = contextualPricing;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder customProductType(String customProductType) {
      this.customProductType = customProductType;
      return this;
    }

    
    public Builder defaultCursor(String defaultCursor) {
      this.defaultCursor = defaultCursor;
      return this;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder descriptionHtml(String descriptionHtml) {
      this.descriptionHtml = descriptionHtml;
      return this;
    }

    
    public Builder descriptionPlainSummary(String descriptionPlainSummary) {
      this.descriptionPlainSummary = descriptionPlainSummary;
      return this;
    }

    
    public Builder events(EventConnection events) {
      this.events = events;
      return this;
    }

    
    public Builder featuredImage(Image featuredImage) {
      this.featuredImage = featuredImage;
      return this;
    }

    
    public Builder featuredMedia(Media featuredMedia) {
      this.featuredMedia = featuredMedia;
      return this;
    }

    
    public Builder feedback(ResourceFeedback feedback) {
      this.feedback = feedback;
      return this;
    }

    
    public Builder giftCardTemplateSuffix(String giftCardTemplateSuffix) {
      this.giftCardTemplateSuffix = giftCardTemplateSuffix;
      return this;
    }

    
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    
    public Builder hasOnlyDefaultVariant(boolean hasOnlyDefaultVariant) {
      this.hasOnlyDefaultVariant = hasOnlyDefaultVariant;
      return this;
    }

    
    public Builder hasOutOfStockVariants(boolean hasOutOfStockVariants) {
      this.hasOutOfStockVariants = hasOutOfStockVariants;
      return this;
    }

    
    public Builder hasVariantsThatRequiresComponents(boolean hasVariantsThatRequiresComponents) {
      this.hasVariantsThatRequiresComponents = hasVariantsThatRequiresComponents;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder images(ImageConnection images) {
      this.images = images;
      return this;
    }

    
    public Builder inCollection(boolean inCollection) {
      this.inCollection = inCollection;
      return this;
    }

    
    public Builder isGiftCard(boolean isGiftCard) {
      this.isGiftCard = isGiftCard;
      return this;
    }

    
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    
    public Builder media(MediaConnection media) {
      this.media = media;
      return this;
    }

    
    public Builder mediaCount(Count mediaCount) {
      this.mediaCount = mediaCount;
      return this;
    }

    
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    
    public Builder metafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
      this.metafieldDefinitions = metafieldDefinitions;
      return this;
    }

    
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder onlineStorePreviewUrl(String onlineStorePreviewUrl) {
      this.onlineStorePreviewUrl = onlineStorePreviewUrl;
      return this;
    }

    
    public Builder onlineStoreUrl(String onlineStoreUrl) {
      this.onlineStoreUrl = onlineStoreUrl;
      return this;
    }

    
    public Builder options(List<ProductOption> options) {
      this.options = options;
      return this;
    }

    
    public Builder priceRange(ProductPriceRange priceRange) {
      this.priceRange = priceRange;
      return this;
    }

    
    public Builder priceRangeV2(ProductPriceRangeV2 priceRangeV2) {
      this.priceRangeV2 = priceRangeV2;
      return this;
    }

    
    public Builder privateMetafield(PrivateMetafield privateMetafield) {
      this.privateMetafield = privateMetafield;
      return this;
    }

    
    public Builder privateMetafields(PrivateMetafieldConnection privateMetafields) {
      this.privateMetafields = privateMetafields;
      return this;
    }

    
    public Builder productCategory(ProductCategory productCategory) {
      this.productCategory = productCategory;
      return this;
    }

    
    public Builder productPublications(ProductPublicationConnection productPublications) {
      this.productPublications = productPublications;
      return this;
    }

    
    public Builder productType(String productType) {
      this.productType = productType;
      return this;
    }

    
    public Builder publicationCount(int publicationCount) {
      this.publicationCount = publicationCount;
      return this;
    }

    
    public Builder publications(ProductPublicationConnection publications) {
      this.publications = publications;
      return this;
    }

    
    public Builder publishedAt(OffsetDateTime publishedAt) {
      this.publishedAt = publishedAt;
      return this;
    }

    
    public Builder publishedInContext(boolean publishedInContext) {
      this.publishedInContext = publishedInContext;
      return this;
    }

    
    public Builder publishedOnChannel(boolean publishedOnChannel) {
      this.publishedOnChannel = publishedOnChannel;
      return this;
    }

    
    public Builder publishedOnCurrentChannel(boolean publishedOnCurrentChannel) {
      this.publishedOnCurrentChannel = publishedOnCurrentChannel;
      return this;
    }

    
    public Builder publishedOnCurrentPublication(boolean publishedOnCurrentPublication) {
      this.publishedOnCurrentPublication = publishedOnCurrentPublication;
      return this;
    }

    
    public Builder publishedOnPublication(boolean publishedOnPublication) {
      this.publishedOnPublication = publishedOnPublication;
      return this;
    }

    
    public Builder requiresSellingPlan(boolean requiresSellingPlan) {
      this.requiresSellingPlan = requiresSellingPlan;
      return this;
    }

    
    public Builder resourcePublicationOnCurrentPublication(
        ResourcePublicationV2 resourcePublicationOnCurrentPublication) {
      this.resourcePublicationOnCurrentPublication = resourcePublicationOnCurrentPublication;
      return this;
    }

    
    public Builder resourcePublications(ResourcePublicationConnection resourcePublications) {
      this.resourcePublications = resourcePublications;
      return this;
    }

    
    public Builder resourcePublicationsCount(Count resourcePublicationsCount) {
      this.resourcePublicationsCount = resourcePublicationsCount;
      return this;
    }

    
    public Builder resourcePublicationsV2(ResourcePublicationV2Connection resourcePublicationsV2) {
      this.resourcePublicationsV2 = resourcePublicationsV2;
      return this;
    }

    
    public Builder restrictedForResource(RestrictedForResource restrictedForResource) {
      this.restrictedForResource = restrictedForResource;
      return this;
    }

    
    public Builder sellingPlanGroupCount(int sellingPlanGroupCount) {
      this.sellingPlanGroupCount = sellingPlanGroupCount;
      return this;
    }

    
    public Builder sellingPlanGroups(SellingPlanGroupConnection sellingPlanGroups) {
      this.sellingPlanGroups = sellingPlanGroups;
      return this;
    }

    
    public Builder sellingPlanGroupsCount(Count sellingPlanGroupsCount) {
      this.sellingPlanGroupsCount = sellingPlanGroupsCount;
      return this;
    }

    
    public Builder seo(SEO seo) {
      this.seo = seo;
      return this;
    }

    
    public Builder standardizedProductType(StandardizedProductType standardizedProductType) {
      this.standardizedProductType = standardizedProductType;
      return this;
    }

    
    public Builder status(ProductStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder storefrontId(String storefrontId) {
      this.storefrontId = storefrontId;
      return this;
    }

    
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    
    public Builder templateSuffix(String templateSuffix) {
      this.templateSuffix = templateSuffix;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder totalInventory(int totalInventory) {
      this.totalInventory = totalInventory;
      return this;
    }

    
    public Builder totalVariants(int totalVariants) {
      this.totalVariants = totalVariants;
      return this;
    }

    
    public Builder tracksInventory(boolean tracksInventory) {
      this.tracksInventory = tracksInventory;
      return this;
    }

    
    public Builder translations(List<Translation> translations) {
      this.translations = translations;
      return this;
    }

    
    public Builder unpublishedChannels(ChannelConnection unpublishedChannels) {
      this.unpublishedChannels = unpublishedChannels;
      return this;
    }

    
    public Builder unpublishedPublications(PublicationConnection unpublishedPublications) {
      this.unpublishedPublications = unpublishedPublications;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    
    public Builder variants(ProductVariantConnection variants) {
      this.variants = variants;
      return this;
    }

    
    public Builder variantsCount(Count variantsCount) {
      this.variantsCount = variantsCount;
      return this;
    }

    
    public Builder vendor(String vendor) {
      this.vendor = vendor;
      return this;
    }
  }
}
