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
public class Collection implements MetafieldReference, MetafieldReferencer, com.shopify.types.HasEvents, com.shopify.types.HasMetafieldDefinitions, com.shopify.types.HasMetafields, com.shopify.types.HasPublishedTranslations, com.shopify.types.Node, com.shopify.types.Publishable {
  
  private Count availablePublicationsCount;

  
  private String description;

  
  private String descriptionHtml;

  
  private EventConnection events;

  
  private ResourceFeedback feedback;

  
  private String handle;

  
  private boolean hasProduct;

  
  private String id;

  
  private Image image;

  
  private String legacyResourceId;

  
  private Metafield metafield;

  
  private MetafieldDefinitionConnection metafieldDefinitions;

  
  private MetafieldConnection metafields;

  
  private PrivateMetafield privateMetafield;

  
  private PrivateMetafieldConnection privateMetafields;

  
  private ProductConnection products;

  
  private Count productsCount;

  
  private int publicationCount;

  
  private CollectionPublicationConnection publications;

  
  private boolean publishedOnChannel;

  
  private boolean publishedOnCurrentChannel;

  
  private boolean publishedOnCurrentPublication;

  
  private boolean publishedOnPublication;

  
  private ResourcePublicationConnection resourcePublications;

  
  private Count resourcePublicationsCount;

  
  private ResourcePublicationV2Connection resourcePublicationsV2;

  
  private CollectionRuleSet ruleSet;

  
  private SEO seo;

  
  private CollectionSortOrder sortOrder;

  
  private String storefrontId;

  
  private String templateSuffix;

  
  private String title;

  
  private List<Translation> translations;

  
  private ChannelConnection unpublishedChannels;

  
  private PublicationConnection unpublishedPublications;

  
  private OffsetDateTime updatedAt;

  public Collection() {
  }

  
  public Count getAvailablePublicationsCount() {
    return availablePublicationsCount;
  }

  public void setAvailablePublicationsCount(Count availablePublicationsCount) {
    this.availablePublicationsCount = availablePublicationsCount;
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

  
  public EventConnection getEvents() {
    return events;
  }

  public void setEvents(EventConnection events) {
    this.events = events;
  }

  
  public ResourceFeedback getFeedback() {
    return feedback;
  }

  public void setFeedback(ResourceFeedback feedback) {
    this.feedback = feedback;
  }

  
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  
  public boolean getHasProduct() {
    return hasProduct;
  }

  public void setHasProduct(boolean hasProduct) {
    this.hasProduct = hasProduct;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
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

  
  public ProductConnection getProducts() {
    return products;
  }

  public void setProducts(ProductConnection products) {
    this.products = products;
  }

  
  public Count getProductsCount() {
    return productsCount;
  }

  public void setProductsCount(Count productsCount) {
    this.productsCount = productsCount;
  }

  
  public int getPublicationCount() {
    return publicationCount;
  }

  public void setPublicationCount(int publicationCount) {
    this.publicationCount = publicationCount;
  }

  
  public CollectionPublicationConnection getPublications() {
    return publications;
  }

  public void setPublications(CollectionPublicationConnection publications) {
    this.publications = publications;
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

  
  public CollectionRuleSet getRuleSet() {
    return ruleSet;
  }

  public void setRuleSet(CollectionRuleSet ruleSet) {
    this.ruleSet = ruleSet;
  }

  
  public SEO getSeo() {
    return seo;
  }

  public void setSeo(SEO seo) {
    this.seo = seo;
  }

  
  public CollectionSortOrder getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(CollectionSortOrder sortOrder) {
    this.sortOrder = sortOrder;
  }

  
  public String getStorefrontId() {
    return storefrontId;
  }

  public void setStorefrontId(String storefrontId) {
    this.storefrontId = storefrontId;
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
    
    private Count availablePublicationsCount;

    
    private String description;

    
    private String descriptionHtml;

    
    private EventConnection events;

    
    private ResourceFeedback feedback;

    
    private String handle;

    
    private boolean hasProduct;

    
    private String id;

    
    private Image image;

    
    private String legacyResourceId;

    
    private Metafield metafield;

    
    private MetafieldDefinitionConnection metafieldDefinitions;

    
    private MetafieldConnection metafields;

    
    private PrivateMetafield privateMetafield;

    
    private PrivateMetafieldConnection privateMetafields;

    
    private ProductConnection products;

    
    private Count productsCount;

    
    private int publicationCount;

    
    private CollectionPublicationConnection publications;

    
    private boolean publishedOnChannel;

    
    private boolean publishedOnCurrentChannel;

    
    private boolean publishedOnCurrentPublication;

    
    private boolean publishedOnPublication;

    
    private ResourcePublicationConnection resourcePublications;

    
    private Count resourcePublicationsCount;

    
    private ResourcePublicationV2Connection resourcePublicationsV2;

    
    private CollectionRuleSet ruleSet;

    
    private SEO seo;

    
    private CollectionSortOrder sortOrder;

    
    private String storefrontId;

    
    private String templateSuffix;

    
    private String title;

    
    private List<Translation> translations;

    
    private ChannelConnection unpublishedChannels;

    
    private PublicationConnection unpublishedPublications;

    
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

    
    public Builder availablePublicationsCount(Count availablePublicationsCount) {
      this.availablePublicationsCount = availablePublicationsCount;
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

    
    public Builder events(EventConnection events) {
      this.events = events;
      return this;
    }

    
    public Builder feedback(ResourceFeedback feedback) {
      this.feedback = feedback;
      return this;
    }

    
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    
    public Builder hasProduct(boolean hasProduct) {
      this.hasProduct = hasProduct;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder image(Image image) {
      this.image = image;
      return this;
    }

    
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
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

    
    public Builder privateMetafield(PrivateMetafield privateMetafield) {
      this.privateMetafield = privateMetafield;
      return this;
    }

    
    public Builder privateMetafields(PrivateMetafieldConnection privateMetafields) {
      this.privateMetafields = privateMetafields;
      return this;
    }

    
    public Builder products(ProductConnection products) {
      this.products = products;
      return this;
    }

    
    public Builder productsCount(Count productsCount) {
      this.productsCount = productsCount;
      return this;
    }

    
    public Builder publicationCount(int publicationCount) {
      this.publicationCount = publicationCount;
      return this;
    }

    
    public Builder publications(CollectionPublicationConnection publications) {
      this.publications = publications;
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

    
    public Builder ruleSet(CollectionRuleSet ruleSet) {
      this.ruleSet = ruleSet;
      return this;
    }

    
    public Builder seo(SEO seo) {
      this.seo = seo;
      return this;
    }

    
    public Builder sortOrder(CollectionSortOrder sortOrder) {
      this.sortOrder = sortOrder;
      return this;
    }

    
    public Builder storefrontId(String storefrontId) {
      this.storefrontId = storefrontId;
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
  }
}
