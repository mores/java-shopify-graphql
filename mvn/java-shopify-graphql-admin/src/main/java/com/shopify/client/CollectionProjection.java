package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.CatalogType;
import com.shopify.types.EventSortKeys;
import com.shopify.types.MetafieldDefinitionPinnedStatus;
import com.shopify.types.MetafieldDefinitionSortKeys;
import com.shopify.types.ProductCollectionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class CollectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Collection"));
  }

  public CollectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountProjection<CollectionProjection<PARENT, ROOT>, ROOT> availablePublicationsCount() {
     CountProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("availablePublicationsCount", projection);
     return projection;
  }

  public EventConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> events() {
     EventConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());
     getFields().put("events", projection);
     return projection;
  }

  public EventConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> events(Integer first,
      String after, Integer last, String before, Boolean reverse, EventSortKeys sortKey,
      String query) {
    EventConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());    
    getFields().put("events", projection);
    getInputArguments().computeIfAbsent("events", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("events").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("events").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("events").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("events").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("events").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("events").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("events").add(queryArg);
    return projection;
  }

  public ResourceFeedbackProjection<CollectionProjection<PARENT, ROOT>, ROOT> feedback() {
     ResourceFeedbackProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new ResourceFeedbackProjection<>(this, getRoot());
     getFields().put("feedback", projection);
     return projection;
  }

  public ImageProjection<CollectionProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public MetafieldProjection<CollectionProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<CollectionProjection<PARENT, ROOT>, ROOT> metafield(String namespace,
      String key) {
    MetafieldProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      ) {
     MetafieldDefinitionConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());
     getFields().put("metafieldDefinitions", projection);
     return projection;
  }

  public MetafieldDefinitionConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());    
    getFields().put("metafieldDefinitions", projection);
    getInputArguments().computeIfAbsent("metafieldDefinitions", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafieldDefinitions").add(namespaceArg);
    InputArgument pinnedStatusArg = new InputArgument("pinnedStatus", pinnedStatus);
    getInputArguments().get("metafieldDefinitions").add(pinnedStatusArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafieldDefinitions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafieldDefinitions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafieldDefinitions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafieldDefinitions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafieldDefinitions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("metafieldDefinitions").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("metafieldDefinitions").add(queryArg);
    return projection;
  }

  public MetafieldConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafields").add(namespaceArg);
    InputArgument keysArg = new InputArgument("keys", keys);
    getInputArguments().get("metafields").add(keysArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafields").add(reverseArg);
    return projection;
  }

  public ProductConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> products() {
     ProductConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());
     getFields().put("products", projection);
     return projection;
  }

  public ProductConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> products(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductCollectionSortKeys sortKey) {
    ProductConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());    
    getFields().put("products", projection);
    getInputArguments().computeIfAbsent("products", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("products").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("products").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("products").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("products").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("products").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("products").add(sortKeyArg);
    return projection;
  }

  public CountProjection<CollectionProjection<PARENT, ROOT>, ROOT> productsCount() {
     CountProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("productsCount", projection);
     return projection;
  }

  public CollectionPublicationConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> publications(
      ) {
     CollectionPublicationConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new CollectionPublicationConnectionProjection<>(this, getRoot());
     getFields().put("publications", projection);
     return projection;
  }

  public CollectionPublicationConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> publications(
      Boolean onlyPublished, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    CollectionPublicationConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new CollectionPublicationConnectionProjection<>(this, getRoot());    
    getFields().put("publications", projection);
    getInputArguments().computeIfAbsent("publications", k -> new ArrayList<>());                      
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished);
    getInputArguments().get("publications").add(onlyPublishedArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("publications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("publications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("publications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("publications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("publications").add(reverseArg);
    return projection;
  }

  public ResourcePublicationConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> resourcePublications(
      ) {
     ResourcePublicationConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationConnectionProjection<>(this, getRoot());
     getFields().put("resourcePublications", projection);
     return projection;
  }

  public ResourcePublicationConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> resourcePublications(
      Boolean onlyPublished, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    ResourcePublicationConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationConnectionProjection<>(this, getRoot());    
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

  public CountProjection<CollectionProjection<PARENT, ROOT>, ROOT> resourcePublicationsCount() {
     CountProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("resourcePublicationsCount", projection);
     return projection;
  }

  public CountProjection<CollectionProjection<PARENT, ROOT>, ROOT> resourcePublicationsCount(
      Boolean onlyPublished) {
    CountProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("resourcePublicationsCount", projection);
    getInputArguments().computeIfAbsent("resourcePublicationsCount", k -> new ArrayList<>());                      
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished);
    getInputArguments().get("resourcePublicationsCount").add(onlyPublishedArg);
    return projection;
  }

  public ResourcePublicationV2ConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> resourcePublicationsV2(
      ) {
     ResourcePublicationV2ConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationV2ConnectionProjection<>(this, getRoot());
     getFields().put("resourcePublicationsV2", projection);
     return projection;
  }

  public ResourcePublicationV2ConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> resourcePublicationsV2(
      Boolean onlyPublished, CatalogType catalogType, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    ResourcePublicationV2ConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationV2ConnectionProjection<>(this, getRoot());    
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

  public CollectionRuleSetProjection<CollectionProjection<PARENT, ROOT>, ROOT> ruleSet() {
     CollectionRuleSetProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new CollectionRuleSetProjection<>(this, getRoot());
     getFields().put("ruleSet", projection);
     return projection;
  }

  public SEOProjection<CollectionProjection<PARENT, ROOT>, ROOT> seo() {
     SEOProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new SEOProjection<>(this, getRoot());
     getFields().put("seo", projection);
     return projection;
  }

  public CollectionSortOrderProjection<CollectionProjection<PARENT, ROOT>, ROOT> sortOrder() {
     CollectionSortOrderProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new CollectionSortOrderProjection<>(this, getRoot());
     getFields().put("sortOrder", projection);
     return projection;
  }

  public TranslationProjection<CollectionProjection<PARENT, ROOT>, ROOT> translations() {
     TranslationProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());
     getFields().put("translations", projection);
     return projection;
  }

  public TranslationProjection<CollectionProjection<PARENT, ROOT>, ROOT> translations(String locale,
      String marketId) {
    TranslationProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public ChannelConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> unpublishedChannels(
      ) {
     ChannelConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new ChannelConnectionProjection<>(this, getRoot());
     getFields().put("unpublishedChannels", projection);
     return projection;
  }

  public ChannelConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> unpublishedChannels(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ChannelConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new ChannelConnectionProjection<>(this, getRoot());    
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

  public PublicationConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> unpublishedPublications(
      ) {
     PublicationConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new PublicationConnectionProjection<>(this, getRoot());
     getFields().put("unpublishedPublications", projection);
     return projection;
  }

  public PublicationConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> unpublishedPublications(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    PublicationConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new PublicationConnectionProjection<>(this, getRoot());    
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

  public CollectionProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public CollectionProjection description(Integer truncateAt) {
    getFields().put("description", null);
    getInputArguments().computeIfAbsent("description", k -> new ArrayList<>());
    InputArgument truncateAtArg = new InputArgument("truncateAt", truncateAt);
    getInputArguments().get("description").add(truncateAtArg);
    return this;
  }

  public CollectionProjection<PARENT, ROOT> descriptionHtml() {
    getFields().put("descriptionHtml", null);
    return this;
  }

  public CollectionProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public CollectionProjection<PARENT, ROOT> hasProduct() {
    getFields().put("hasProduct", null);
    return this;
  }

  public CollectionProjection hasProduct(String id) {
    getFields().put("hasProduct", null);
    getInputArguments().computeIfAbsent("hasProduct", k -> new ArrayList<>());
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("hasProduct").add(idArg);
    return this;
  }

  public CollectionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CollectionProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public CollectionProjection<PARENT, ROOT> publicationCount() {
    getFields().put("publicationCount", null);
    return this;
  }

  public CollectionProjection publicationCount(Boolean onlyPublished) {
    getFields().put("publicationCount", null);
    getInputArguments().computeIfAbsent("publicationCount", k -> new ArrayList<>());
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished);
    getInputArguments().get("publicationCount").add(onlyPublishedArg);
    return this;
  }

  public CollectionProjection<PARENT, ROOT> publishedOnChannel() {
    getFields().put("publishedOnChannel", null);
    return this;
  }

  public CollectionProjection publishedOnChannel(String channelId) {
    getFields().put("publishedOnChannel", null);
    getInputArguments().computeIfAbsent("publishedOnChannel", k -> new ArrayList<>());
    InputArgument channelIdArg = new InputArgument("channelId", channelId);
    getInputArguments().get("publishedOnChannel").add(channelIdArg);
    return this;
  }

  public CollectionProjection<PARENT, ROOT> publishedOnCurrentChannel() {
    getFields().put("publishedOnCurrentChannel", null);
    return this;
  }

  public CollectionProjection<PARENT, ROOT> publishedOnCurrentPublication() {
    getFields().put("publishedOnCurrentPublication", null);
    return this;
  }

  public CollectionProjection<PARENT, ROOT> publishedOnPublication() {
    getFields().put("publishedOnPublication", null);
    return this;
  }

  public CollectionProjection publishedOnPublication(String publicationId) {
    getFields().put("publishedOnPublication", null);
    getInputArguments().computeIfAbsent("publishedOnPublication", k -> new ArrayList<>());
    InputArgument publicationIdArg = new InputArgument("publicationId", publicationId);
    getInputArguments().get("publishedOnPublication").add(publicationIdArg);
    return this;
  }

  public CollectionProjection<PARENT, ROOT> storefrontId() {
    getFields().put("storefrontId", null);
    return this;
  }

  public CollectionProjection<PARENT, ROOT> templateSuffix() {
    getFields().put("templateSuffix", null);
    return this;
  }

  public CollectionProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public CollectionProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
