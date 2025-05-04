package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Represents a resource that can be published to a channel.
 * A publishable resource can be either a Product or Collection.
 */
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
  /**
   * The number of
   * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
   * that a resource is published to, without
   * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
   */
  Count getAvailablePublicationsCount();

  /**
   * The number of
   * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
   * that a resource is published to, without
   * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
   */
  int getPublicationCount();

  /**
   * Whether the resource is published to a specific channel.
   */
  boolean getPublishedOnChannel();

  /**
   * Whether the resource is published to a
   * [channel](https://shopify.dev/docs/api/admin-graphql/latest/objects/Channel).
   * For example, the resource might be published to the online store channel.
   */
  boolean getPublishedOnCurrentChannel();

  /**
   * Whether the resource is published to the app's
   * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
   * For example, the resource might be published to the app's online store channel.
   */
  boolean getPublishedOnCurrentPublication();

  /**
   * Whether the resource is published to a specified
   * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
   */
  boolean getPublishedOnPublication();

  /**
   * The list of resources that are published to a
   * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
   */
  ResourcePublicationConnection getResourcePublications();

  /**
   * The number of
   * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
   * that a resource is published to, without
   * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
   */
  Count getResourcePublicationsCount();

  /**
   * The list of resources that are either published or staged to be published to a
   * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
   */
  ResourcePublicationV2Connection getResourcePublicationsV2();

  /**
   * The list of channels that the resource is not published to.
   */
  ChannelConnection getUnpublishedChannels();

  /**
   * The list of [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
   * that the resource isn't published to.
   */
  PublicationConnection getUnpublishedPublications();
}
