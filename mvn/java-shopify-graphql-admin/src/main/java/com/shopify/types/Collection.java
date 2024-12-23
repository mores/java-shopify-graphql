package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Represents a group of products that can be displayed in online stores and other
 * sales channels in categories, which makes it easy for customers to find them.
 * For example, an athletics store might create different collections for running
 * attire, shoes, and accessories.
 *
 * Collections can be defined by conditions, such as whether they match certain
 * product tags. These are called smart or automated collections.
 *
 * Collections can also be created for a custom group of products. These are called custom or manual collections.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Collection implements MetafieldReference, MetafieldReferencer, com.shopify.types.HasEvents, com.shopify.types.HasMetafieldDefinitions, com.shopify.types.HasMetafields, com.shopify.types.HasPublishedTranslations, com.shopify.types.Node, com.shopify.types.Publishable {
  /**
   * The number of
   * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
   * that a resource is published to, without
   * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
   */
  private Count availablePublicationsCount;

  /**
   * A single-line, text-only description of the collection, stripped of any HTML
   * tags and formatting that were included in the description.
   */
  private String description;

  /**
   * The description of the collection, including any HTML tags and formatting.
   * This content is typically displayed to customers, such as on an online store,
   * depending on the theme.
   */
  private String descriptionHtml;

  /**
   * The paginated list of events associated with the host subject.
   */
  private EventConnection events;

  /**
   * Information about the collection that's provided through resource feedback.
   */
  private ResourceFeedback feedback;

  /**
   * A unique string that identifies the collection. If a handle isn't specified
   * when a collection is created, it's automatically generated from the
   * collection's original title, and typically includes words from the title
   * separated by hyphens. For example, a collection that was created with the
   * title `Summer Catalog 2022` might have the handle `summer-catalog-2022`.
   *   
   * If the title is changed, the handle doesn't automatically change.
   *   
   * The handle can be used in themes by the Liquid templating language to refer to
   * the collection, but using the ID is preferred because it never changes.
   */
  private String handle;

  /**
   * Whether the collection includes the specified product.
   */
  private boolean hasProduct;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The image associated with the collection.
   */
  private Image image;

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  private String legacyResourceId;

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
   * Returns a private metafield by namespace and key that belongs to the resource.
   */
  private PrivateMetafield privateMetafield;

  /**
   * List of private metafields that belong to the resource.
   */
  private PrivateMetafieldConnection privateMetafields;

  /**
   * The products that are included in the collection.
   */
  private ProductConnection products;

  /**
   * The number of products in the collection.
   */
  private Count productsCount;

  /**
   * The number of
   * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
   * that a resource is published to, without
   * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
   */
  private int publicationCount;

  /**
   * The channels where the collection is published.
   */
  private CollectionPublicationConnection publications;

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
   * For a smart (automated) collection, specifies the rules that determine whether a product is included.
   */
  private CollectionRuleSet ruleSet;

  /**
   * If the default SEO fields for page title and description have been modified, contains the modified information.
   */
  private SEO seo;

  /**
   * The order in which the products in the collection are displayed by default in
   * the Shopify admin and in sales channels, such as an online store.
   */
  private CollectionSortOrder sortOrder;

  /**
   * The Storefront GraphQL API ID of the `Collection`.
   *   
   * As of the `2022-04` version release, the Storefront GraphQL API will no longer
   * return Base64 encoded IDs to match the behavior of the Admin GraphQL API.
   * Therefore, you can safely use the `id` field's value instead.
   */
  private String storefrontId;

  /**
   * The suffix of the Liquid template being used to show the collection in an
   * online store. For example, if the value is `custom`, then the collection is
   * using the `collection.custom.liquid` template. If the value is `null`, then
   * the collection is using the default `collection.liquid` template.
   */
  private String templateSuffix;

  /**
   * The name of the collection. It's displayed in the Shopify admin and is
   * typically displayed in sales channels, such as an online store.
   */
  private String title;

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
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the collection was last modified.
   */
  private OffsetDateTime updatedAt;

  public Collection() {
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
   * A single-line, text-only description of the collection, stripped of any HTML
   * tags and formatting that were included in the description.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The description of the collection, including any HTML tags and formatting.
   * This content is typically displayed to customers, such as on an online store,
   * depending on the theme.
   */
  public String getDescriptionHtml() {
    return descriptionHtml;
  }

  public void setDescriptionHtml(String descriptionHtml) {
    this.descriptionHtml = descriptionHtml;
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
   * Information about the collection that's provided through resource feedback.
   */
  public ResourceFeedback getFeedback() {
    return feedback;
  }

  public void setFeedback(ResourceFeedback feedback) {
    this.feedback = feedback;
  }

  /**
   * A unique string that identifies the collection. If a handle isn't specified
   * when a collection is created, it's automatically generated from the
   * collection's original title, and typically includes words from the title
   * separated by hyphens. For example, a collection that was created with the
   * title `Summer Catalog 2022` might have the handle `summer-catalog-2022`.
   *   
   * If the title is changed, the handle doesn't automatically change.
   *   
   * The handle can be used in themes by the Liquid templating language to refer to
   * the collection, but using the ID is preferred because it never changes.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * Whether the collection includes the specified product.
   */
  public boolean getHasProduct() {
    return hasProduct;
  }

  public void setHasProduct(boolean hasProduct) {
    this.hasProduct = hasProduct;
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
   * The image associated with the collection.
   */
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
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
   * Returns a private metafield by namespace and key that belongs to the resource.
   */
  public PrivateMetafield getPrivateMetafield() {
    return privateMetafield;
  }

  public void setPrivateMetafield(PrivateMetafield privateMetafield) {
    this.privateMetafield = privateMetafield;
  }

  /**
   * List of private metafields that belong to the resource.
   */
  public PrivateMetafieldConnection getPrivateMetafields() {
    return privateMetafields;
  }

  public void setPrivateMetafields(PrivateMetafieldConnection privateMetafields) {
    this.privateMetafields = privateMetafields;
  }

  /**
   * The products that are included in the collection.
   */
  public ProductConnection getProducts() {
    return products;
  }

  public void setProducts(ProductConnection products) {
    this.products = products;
  }

  /**
   * The number of products in the collection.
   */
  public Count getProductsCount() {
    return productsCount;
  }

  public void setProductsCount(Count productsCount) {
    this.productsCount = productsCount;
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
   * The channels where the collection is published.
   */
  public CollectionPublicationConnection getPublications() {
    return publications;
  }

  public void setPublications(CollectionPublicationConnection publications) {
    this.publications = publications;
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
   * For a smart (automated) collection, specifies the rules that determine whether a product is included.
   */
  public CollectionRuleSet getRuleSet() {
    return ruleSet;
  }

  public void setRuleSet(CollectionRuleSet ruleSet) {
    this.ruleSet = ruleSet;
  }

  /**
   * If the default SEO fields for page title and description have been modified, contains the modified information.
   */
  public SEO getSeo() {
    return seo;
  }

  public void setSeo(SEO seo) {
    this.seo = seo;
  }

  /**
   * The order in which the products in the collection are displayed by default in
   * the Shopify admin and in sales channels, such as an online store.
   */
  public CollectionSortOrder getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(CollectionSortOrder sortOrder) {
    this.sortOrder = sortOrder;
  }

  /**
   * The Storefront GraphQL API ID of the `Collection`.
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
   * The suffix of the Liquid template being used to show the collection in an
   * online store. For example, if the value is `custom`, then the collection is
   * using the `collection.custom.liquid` template. If the value is `null`, then
   * the collection is using the default `collection.liquid` template.
   */
  public String getTemplateSuffix() {
    return templateSuffix;
  }

  public void setTemplateSuffix(String templateSuffix) {
    this.templateSuffix = templateSuffix;
  }

  /**
   * The name of the collection. It's displayed in the Shopify admin and is
   * typically displayed in sales channels, such as an online store.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the collection was last modified.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "Collection{availablePublicationsCount='" + availablePublicationsCount + "', description='" + description + "', descriptionHtml='" + descriptionHtml + "', events='" + events + "', feedback='" + feedback + "', handle='" + handle + "', hasProduct='" + hasProduct + "', id='" + id + "', image='" + image + "', legacyResourceId='" + legacyResourceId + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', privateMetafield='" + privateMetafield + "', privateMetafields='" + privateMetafields + "', products='" + products + "', productsCount='" + productsCount + "', publicationCount='" + publicationCount + "', publications='" + publications + "', publishedOnChannel='" + publishedOnChannel + "', publishedOnCurrentChannel='" + publishedOnCurrentChannel + "', publishedOnCurrentPublication='" + publishedOnCurrentPublication + "', publishedOnPublication='" + publishedOnPublication + "', resourcePublications='" + resourcePublications + "', resourcePublicationsCount='" + resourcePublicationsCount + "', resourcePublicationsV2='" + resourcePublicationsV2 + "', ruleSet='" + ruleSet + "', seo='" + seo + "', sortOrder='" + sortOrder + "', storefrontId='" + storefrontId + "', templateSuffix='" + templateSuffix + "', title='" + title + "', translations='" + translations + "', unpublishedChannels='" + unpublishedChannels + "', unpublishedPublications='" + unpublishedPublications + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Collection that = (Collection) o;
    return Objects.equals(availablePublicationsCount, that.availablePublicationsCount) &&
        Objects.equals(description, that.description) &&
        Objects.equals(descriptionHtml, that.descriptionHtml) &&
        Objects.equals(events, that.events) &&
        Objects.equals(feedback, that.feedback) &&
        Objects.equals(handle, that.handle) &&
        hasProduct == that.hasProduct &&
        Objects.equals(id, that.id) &&
        Objects.equals(image, that.image) &&
        Objects.equals(legacyResourceId, that.legacyResourceId) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafieldDefinitions, that.metafieldDefinitions) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(privateMetafield, that.privateMetafield) &&
        Objects.equals(privateMetafields, that.privateMetafields) &&
        Objects.equals(products, that.products) &&
        Objects.equals(productsCount, that.productsCount) &&
        publicationCount == that.publicationCount &&
        Objects.equals(publications, that.publications) &&
        publishedOnChannel == that.publishedOnChannel &&
        publishedOnCurrentChannel == that.publishedOnCurrentChannel &&
        publishedOnCurrentPublication == that.publishedOnCurrentPublication &&
        publishedOnPublication == that.publishedOnPublication &&
        Objects.equals(resourcePublications, that.resourcePublications) &&
        Objects.equals(resourcePublicationsCount, that.resourcePublicationsCount) &&
        Objects.equals(resourcePublicationsV2, that.resourcePublicationsV2) &&
        Objects.equals(ruleSet, that.ruleSet) &&
        Objects.equals(seo, that.seo) &&
        Objects.equals(sortOrder, that.sortOrder) &&
        Objects.equals(storefrontId, that.storefrontId) &&
        Objects.equals(templateSuffix, that.templateSuffix) &&
        Objects.equals(title, that.title) &&
        Objects.equals(translations, that.translations) &&
        Objects.equals(unpublishedChannels, that.unpublishedChannels) &&
        Objects.equals(unpublishedPublications, that.unpublishedPublications) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availablePublicationsCount, description, descriptionHtml, events, feedback, handle, hasProduct, id, image, legacyResourceId, metafield, metafieldDefinitions, metafields, privateMetafield, privateMetafields, products, productsCount, publicationCount, publications, publishedOnChannel, publishedOnCurrentChannel, publishedOnCurrentPublication, publishedOnPublication, resourcePublications, resourcePublicationsCount, resourcePublicationsV2, ruleSet, seo, sortOrder, storefrontId, templateSuffix, title, translations, unpublishedChannels, unpublishedPublications, updatedAt);
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
     * A single-line, text-only description of the collection, stripped of any HTML
     * tags and formatting that were included in the description.
     */
    private String description;

    /**
     * The description of the collection, including any HTML tags and formatting.
     * This content is typically displayed to customers, such as on an online store,
     * depending on the theme.
     */
    private String descriptionHtml;

    /**
     * The paginated list of events associated with the host subject.
     */
    private EventConnection events;

    /**
     * Information about the collection that's provided through resource feedback.
     */
    private ResourceFeedback feedback;

    /**
     * A unique string that identifies the collection. If a handle isn't specified
     * when a collection is created, it's automatically generated from the
     * collection's original title, and typically includes words from the title
     * separated by hyphens. For example, a collection that was created with the
     * title `Summer Catalog 2022` might have the handle `summer-catalog-2022`.
     *   
     * If the title is changed, the handle doesn't automatically change.
     *   
     * The handle can be used in themes by the Liquid templating language to refer to
     * the collection, but using the ID is preferred because it never changes.
     */
    private String handle;

    /**
     * Whether the collection includes the specified product.
     */
    private boolean hasProduct;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The image associated with the collection.
     */
    private Image image;

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    private String legacyResourceId;

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
     * Returns a private metafield by namespace and key that belongs to the resource.
     */
    private PrivateMetafield privateMetafield;

    /**
     * List of private metafields that belong to the resource.
     */
    private PrivateMetafieldConnection privateMetafields;

    /**
     * The products that are included in the collection.
     */
    private ProductConnection products;

    /**
     * The number of products in the collection.
     */
    private Count productsCount;

    /**
     * The number of
     * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
     * that a resource is published to, without
     * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
     */
    private int publicationCount;

    /**
     * The channels where the collection is published.
     */
    private CollectionPublicationConnection publications;

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
     * For a smart (automated) collection, specifies the rules that determine whether a product is included.
     */
    private CollectionRuleSet ruleSet;

    /**
     * If the default SEO fields for page title and description have been modified, contains the modified information.
     */
    private SEO seo;

    /**
     * The order in which the products in the collection are displayed by default in
     * the Shopify admin and in sales channels, such as an online store.
     */
    private CollectionSortOrder sortOrder;

    /**
     * The Storefront GraphQL API ID of the `Collection`.
     *   
     * As of the `2022-04` version release, the Storefront GraphQL API will no longer
     * return Base64 encoded IDs to match the behavior of the Admin GraphQL API.
     * Therefore, you can safely use the `id` field's value instead.
     */
    private String storefrontId;

    /**
     * The suffix of the Liquid template being used to show the collection in an
     * online store. For example, if the value is `custom`, then the collection is
     * using the `collection.custom.liquid` template. If the value is `null`, then
     * the collection is using the default `collection.liquid` template.
     */
    private String templateSuffix;

    /**
     * The name of the collection. It's displayed in the Shopify admin and is
     * typically displayed in sales channels, such as an online store.
     */
    private String title;

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
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the collection was last modified.
     */
    private OffsetDateTime updatedAt;

    public Collection build() {
      Collection result = new Collection();
      result.availablePublicationsCount = this.availablePublicationsCount;
      result.description = this.description;
      result.descriptionHtml = this.descriptionHtml;
      result.events = this.events;
      result.feedback = this.feedback;
      result.handle = this.handle;
      result.hasProduct = this.hasProduct;
      result.id = this.id;
      result.image = this.image;
      result.legacyResourceId = this.legacyResourceId;
      result.metafield = this.metafield;
      result.metafieldDefinitions = this.metafieldDefinitions;
      result.metafields = this.metafields;
      result.privateMetafield = this.privateMetafield;
      result.privateMetafields = this.privateMetafields;
      result.products = this.products;
      result.productsCount = this.productsCount;
      result.publicationCount = this.publicationCount;
      result.publications = this.publications;
      result.publishedOnChannel = this.publishedOnChannel;
      result.publishedOnCurrentChannel = this.publishedOnCurrentChannel;
      result.publishedOnCurrentPublication = this.publishedOnCurrentPublication;
      result.publishedOnPublication = this.publishedOnPublication;
      result.resourcePublications = this.resourcePublications;
      result.resourcePublicationsCount = this.resourcePublicationsCount;
      result.resourcePublicationsV2 = this.resourcePublicationsV2;
      result.ruleSet = this.ruleSet;
      result.seo = this.seo;
      result.sortOrder = this.sortOrder;
      result.storefrontId = this.storefrontId;
      result.templateSuffix = this.templateSuffix;
      result.title = this.title;
      result.translations = this.translations;
      result.unpublishedChannels = this.unpublishedChannels;
      result.unpublishedPublications = this.unpublishedPublications;
      result.updatedAt = this.updatedAt;
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
     * A single-line, text-only description of the collection, stripped of any HTML
     * tags and formatting that were included in the description.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * The description of the collection, including any HTML tags and formatting.
     * This content is typically displayed to customers, such as on an online store,
     * depending on the theme.
     */
    public Builder descriptionHtml(String descriptionHtml) {
      this.descriptionHtml = descriptionHtml;
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
     * Information about the collection that's provided through resource feedback.
     */
    public Builder feedback(ResourceFeedback feedback) {
      this.feedback = feedback;
      return this;
    }

    /**
     * A unique string that identifies the collection. If a handle isn't specified
     * when a collection is created, it's automatically generated from the
     * collection's original title, and typically includes words from the title
     * separated by hyphens. For example, a collection that was created with the
     * title `Summer Catalog 2022` might have the handle `summer-catalog-2022`.
     *   
     * If the title is changed, the handle doesn't automatically change.
     *   
     * The handle can be used in themes by the Liquid templating language to refer to
     * the collection, but using the ID is preferred because it never changes.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * Whether the collection includes the specified product.
     */
    public Builder hasProduct(boolean hasProduct) {
      this.hasProduct = hasProduct;
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
     * The image associated with the collection.
     */
    public Builder image(Image image) {
      this.image = image;
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
     * Returns a private metafield by namespace and key that belongs to the resource.
     */
    public Builder privateMetafield(PrivateMetafield privateMetafield) {
      this.privateMetafield = privateMetafield;
      return this;
    }

    /**
     * List of private metafields that belong to the resource.
     */
    public Builder privateMetafields(PrivateMetafieldConnection privateMetafields) {
      this.privateMetafields = privateMetafields;
      return this;
    }

    /**
     * The products that are included in the collection.
     */
    public Builder products(ProductConnection products) {
      this.products = products;
      return this;
    }

    /**
     * The number of products in the collection.
     */
    public Builder productsCount(Count productsCount) {
      this.productsCount = productsCount;
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
     * The channels where the collection is published.
     */
    public Builder publications(CollectionPublicationConnection publications) {
      this.publications = publications;
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
     * For a smart (automated) collection, specifies the rules that determine whether a product is included.
     */
    public Builder ruleSet(CollectionRuleSet ruleSet) {
      this.ruleSet = ruleSet;
      return this;
    }

    /**
     * If the default SEO fields for page title and description have been modified, contains the modified information.
     */
    public Builder seo(SEO seo) {
      this.seo = seo;
      return this;
    }

    /**
     * The order in which the products in the collection are displayed by default in
     * the Shopify admin and in sales channels, such as an online store.
     */
    public Builder sortOrder(CollectionSortOrder sortOrder) {
      this.sortOrder = sortOrder;
      return this;
    }

    /**
     * The Storefront GraphQL API ID of the `Collection`.
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
     * The suffix of the Liquid template being used to show the collection in an
     * online store. For example, if the value is `custom`, then the collection is
     * using the `collection.custom.liquid` template. If the value is `null`, then
     * the collection is using the default `collection.liquid` template.
     */
    public Builder templateSuffix(String templateSuffix) {
      this.templateSuffix = templateSuffix;
      return this;
    }

    /**
     * The name of the collection. It's displayed in the Shopify admin and is
     * typically displayed in sales channels, such as an online store.
     */
    public Builder title(String title) {
      this.title = title;
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
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the collection was last modified.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
