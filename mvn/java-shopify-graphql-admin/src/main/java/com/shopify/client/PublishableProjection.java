package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.CatalogType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class PublishableProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PublishableProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Publishable"));
  }

  public PublishableProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountProjection<PublishableProjection<PARENT, ROOT>, ROOT> availablePublicationsCount() {
     CountProjection<PublishableProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("availablePublicationsCount", projection);
     return projection;
  }

  public ResourcePublicationConnectionProjection<PublishableProjection<PARENT, ROOT>, ROOT> resourcePublications(
      ) {
     ResourcePublicationConnectionProjection<PublishableProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationConnectionProjection<>(this, getRoot());
     getFields().put("resourcePublications", projection);
     return projection;
  }

  public ResourcePublicationConnectionProjection<PublishableProjection<PARENT, ROOT>, ROOT> resourcePublications(
      Boolean onlyPublished, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    ResourcePublicationConnectionProjection<PublishableProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationConnectionProjection<>(this, getRoot());    
    getFields().put("resourcePublications", projection);
    getInputArguments().computeIfAbsent("resourcePublications", k -> new ArrayList<>());                      
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished);
    getInputArguments().get("resourcePublications").add(onlyPublishedArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("resourcePublications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("resourcePublications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("resourcePublications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("resourcePublications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("resourcePublications").add(reverseArg);
    return projection;
  }

  public CountProjection<PublishableProjection<PARENT, ROOT>, ROOT> resourcePublicationsCount() {
     CountProjection<PublishableProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("resourcePublicationsCount", projection);
     return projection;
  }

  public CountProjection<PublishableProjection<PARENT, ROOT>, ROOT> resourcePublicationsCount(
      Boolean onlyPublished) {
    CountProjection<PublishableProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("resourcePublicationsCount", projection);
    getInputArguments().computeIfAbsent("resourcePublicationsCount", k -> new ArrayList<>());                      
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished);
    getInputArguments().get("resourcePublicationsCount").add(onlyPublishedArg);
    return projection;
  }

  public ResourcePublicationV2ConnectionProjection<PublishableProjection<PARENT, ROOT>, ROOT> resourcePublicationsV2(
      ) {
     ResourcePublicationV2ConnectionProjection<PublishableProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationV2ConnectionProjection<>(this, getRoot());
     getFields().put("resourcePublicationsV2", projection);
     return projection;
  }

  public ResourcePublicationV2ConnectionProjection<PublishableProjection<PARENT, ROOT>, ROOT> resourcePublicationsV2(
      Boolean onlyPublished, CatalogType catalogType, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    ResourcePublicationV2ConnectionProjection<PublishableProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationV2ConnectionProjection<>(this, getRoot());    
    getFields().put("resourcePublicationsV2", projection);
    getInputArguments().computeIfAbsent("resourcePublicationsV2", k -> new ArrayList<>());                      
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished);
    getInputArguments().get("resourcePublicationsV2").add(onlyPublishedArg);
    InputArgument catalogTypeArg = new InputArgument("catalogType", catalogType);
    getInputArguments().get("resourcePublicationsV2").add(catalogTypeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("resourcePublicationsV2").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("resourcePublicationsV2").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("resourcePublicationsV2").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("resourcePublicationsV2").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("resourcePublicationsV2").add(reverseArg);
    return projection;
  }

  public ChannelConnectionProjection<PublishableProjection<PARENT, ROOT>, ROOT> unpublishedChannels(
      ) {
     ChannelConnectionProjection<PublishableProjection<PARENT, ROOT>, ROOT> projection = new ChannelConnectionProjection<>(this, getRoot());
     getFields().put("unpublishedChannels", projection);
     return projection;
  }

  public ChannelConnectionProjection<PublishableProjection<PARENT, ROOT>, ROOT> unpublishedChannels(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ChannelConnectionProjection<PublishableProjection<PARENT, ROOT>, ROOT> projection = new ChannelConnectionProjection<>(this, getRoot());    
    getFields().put("unpublishedChannels", projection);
    getInputArguments().computeIfAbsent("unpublishedChannels", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("unpublishedChannels").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("unpublishedChannels").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("unpublishedChannels").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("unpublishedChannels").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("unpublishedChannels").add(reverseArg);
    return projection;
  }

  public PublicationConnectionProjection<PublishableProjection<PARENT, ROOT>, ROOT> unpublishedPublications(
      ) {
     PublicationConnectionProjection<PublishableProjection<PARENT, ROOT>, ROOT> projection = new PublicationConnectionProjection<>(this, getRoot());
     getFields().put("unpublishedPublications", projection);
     return projection;
  }

  public PublicationConnectionProjection<PublishableProjection<PARENT, ROOT>, ROOT> unpublishedPublications(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    PublicationConnectionProjection<PublishableProjection<PARENT, ROOT>, ROOT> projection = new PublicationConnectionProjection<>(this, getRoot());    
    getFields().put("unpublishedPublications", projection);
    getInputArguments().computeIfAbsent("unpublishedPublications", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("unpublishedPublications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("unpublishedPublications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("unpublishedPublications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("unpublishedPublications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("unpublishedPublications").add(reverseArg);
    return projection;
  }

  public PublishableProjection<PARENT, ROOT> publicationCount() {
    getFields().put("publicationCount", null);
    return this;
  }

  public PublishableProjection publicationCount(Boolean onlyPublished) {
    getFields().put("publicationCount", null);
    getInputArguments().computeIfAbsent("publicationCount", k -> new ArrayList<>());
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished);
    getInputArguments().get("publicationCount").add(onlyPublishedArg);
    return this;
  }

  public PublishableProjection<PARENT, ROOT> publishedOnChannel() {
    getFields().put("publishedOnChannel", null);
    return this;
  }

  public PublishableProjection publishedOnChannel(String channelId) {
    getFields().put("publishedOnChannel", null);
    getInputArguments().computeIfAbsent("publishedOnChannel", k -> new ArrayList<>());
    InputArgument channelIdArg = new InputArgument("channelId", channelId);
    getInputArguments().get("publishedOnChannel").add(channelIdArg);
    return this;
  }

  public PublishableProjection<PARENT, ROOT> publishedOnCurrentChannel() {
    getFields().put("publishedOnCurrentChannel", null);
    return this;
  }

  public PublishableProjection<PARENT, ROOT> publishedOnCurrentPublication() {
    getFields().put("publishedOnCurrentPublication", null);
    return this;
  }

  public PublishableProjection<PARENT, ROOT> publishedOnPublication() {
    getFields().put("publishedOnPublication", null);
    return this;
  }

  public PublishableProjection publishedOnPublication(String publicationId) {
    getFields().put("publishedOnPublication", null);
    getInputArguments().computeIfAbsent("publishedOnPublication", k -> new ArrayList<>());
    InputArgument publicationIdArg = new InputArgument("publicationId", publicationId);
    getInputArguments().get("publishedOnPublication").add(publicationIdArg);
    return this;
  }

  public CollectionFragmentProjection<PublishableProjection<PARENT, ROOT>, ROOT> onCollection() {
    CollectionFragmentProjection<PublishableProjection<PARENT, ROOT>, ROOT> fragment = new CollectionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductFragmentProjection<PublishableProjection<PARENT, ROOT>, ROOT> onProduct() {
    ProductFragmentProjection<PublishableProjection<PARENT, ROOT>, ROOT> fragment = new ProductFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
