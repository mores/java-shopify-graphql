package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = Collection.class, name = "Collection"),
    @JsonSubTypes.Type(value = Product.class, name = "Product")
})
public interface Publishable {
  
  Count getAvailablePublicationsCount();

  
  int getPublicationCount();

  
  boolean getPublishedOnChannel();

  
  boolean getPublishedOnCurrentChannel();

  
  boolean getPublishedOnCurrentPublication();

  
  boolean getPublishedOnPublication();

  
  ResourcePublicationConnection getResourcePublications();

  
  Count getResourcePublicationsCount();

  
  ResourcePublicationV2Connection getResourcePublicationsV2();

  
  ChannelConnection getUnpublishedChannels();

  
  PublicationConnection getUnpublishedPublications();
}
