package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.CatalogType;
import com.shopify.admin.types.EventSortKeys;
import com.shopify.admin.types.MetafieldDefinitionPinnedStatus;
import com.shopify.admin.types.MetafieldDefinitionSortKeys;
import com.shopify.admin.types.ProductCollectionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class CollectionByHandleProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionByHandleProjectionRoot() {
    super(null, null, java.util.Optional.of("Collection"));
  }

  public CollectionByHandleProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionOperationsProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> activeOperations(
      ) {
    CollectionOperationsProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new CollectionOperationsProjection<>(this, this);    
    getFields().put("activeOperations", projection);
    return projection;
  }

  public CountProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> availablePublicationsCount(
      ) {
    CountProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("availablePublicationsCount", projection);
    return projection;
  }

  public StringProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> description(
      Integer truncateAt) {
    StringProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new StringProjection<>(this, this);    
    getFields().put("description", projection);
    getInputArguments().computeIfAbsent("description", k -> new ArrayList<>());                      
    InputArgument truncateAtArg = new InputArgument("truncateAt", truncateAt, false, null);
    getInputArguments().get("description").add(truncateAtArg);
    return projection;
  }

  public StringProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> descriptionWithVariableReferences(
      String truncateAtReference) {
    StringProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new StringProjection<>(this, this);    
    getFields().put("description", projection);
    getInputArguments().computeIfAbsent("description", k -> new ArrayList<>());              
    InputArgument truncateAtArg = new InputArgument("truncateAt", truncateAtReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("description").add(truncateAtArg);
    return projection;
  }

  public EventConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> events(
      ) {
    EventConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
    getFields().put("events", projection);
    return projection;
  }

  public EventConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
    getFields().put("events", projection);
    getInputArguments().computeIfAbsent("events", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("events").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("events").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("events").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("events").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("events").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("events").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("events").add(queryArg);
    return projection;
  }

  public EventConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> eventsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference, String queryReference) {
    EventConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
    getFields().put("events", projection);
    getInputArguments().computeIfAbsent("events", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("events").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("events").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("events").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("events").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("events").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("EventSortKeys"));
    getInputArguments().get("events").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("events").add(queryArg);
    return projection;
  }

  public ResourceFeedbackProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> feedback(
      ) {
    ResourceFeedbackProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new ResourceFeedbackProjection<>(this, this);    
    getFields().put("feedback", projection);
    return projection;
  }

  public BooleanProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> hasProduct(
      String id) {
    BooleanProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("hasProduct", projection);
    getInputArguments().computeIfAbsent("hasProduct", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id, false, null);
    getInputArguments().get("hasProduct").add(idArg);
    return projection;
  }

  public BooleanProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> hasProductWithVariableReferences(
      String idReference) {
    BooleanProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("hasProduct", projection);
    getInputArguments().computeIfAbsent("hasProduct", k -> new ArrayList<>());              
    InputArgument idArg = new InputArgument("id", idReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("ID")));
    getInputArguments().get("hasProduct").add(idArg);
    return projection;
  }

  public ImageProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> image(
      ) {
    ImageProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("image", projection);
    return projection;
  }

  public MetafieldProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key, false, null);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> metafieldWithVariableReferences(
      String namespaceReference, String keyReference) {
    MetafieldProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", keyReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      ) {
    MetafieldDefinitionConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    getInputArguments().computeIfAbsent("metafieldDefinitions", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafieldDefinitions").add(namespaceArg);
    InputArgument pinnedStatusArg = new InputArgument("pinnedStatus", pinnedStatus, false, null);
    getInputArguments().get("metafieldDefinitions").add(pinnedStatusArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("metafieldDefinitions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("metafieldDefinitions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("metafieldDefinitions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("metafieldDefinitions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("metafieldDefinitions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("metafieldDefinitions").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("metafieldDefinitions").add(queryArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> metafieldDefinitionsWithVariableReferences(
      String namespaceReference, String pinnedStatusReference, String firstReference,
      String afterReference, String lastReference, String beforeReference, String reverseReference,
      String sortKeyReference, String queryReference) {
    MetafieldDefinitionConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    getInputArguments().computeIfAbsent("metafieldDefinitions", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafieldDefinitions").add(namespaceArg);
    InputArgument pinnedStatusArg = new InputArgument("pinnedStatus", pinnedStatusReference, true, new graphql.language.TypeName("MetafieldDefinitionPinnedStatus"));
    getInputArguments().get("metafieldDefinitions").add(pinnedStatusArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("metafieldDefinitions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafieldDefinitions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("metafieldDefinitions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafieldDefinitions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("metafieldDefinitions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("MetafieldDefinitionSortKeys"));
    getInputArguments().get("metafieldDefinitions").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafieldDefinitions").add(queryArg);
    return projection;
  }

  public MetafieldConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafields").add(namespaceArg);
    InputArgument keysArg = new InputArgument("keys", keys, false, null);
    getInputArguments().get("metafields").add(keysArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("metafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("metafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("metafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("metafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("metafields").add(reverseArg);
    return projection;
  }

  public MetafieldConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> metafieldsWithVariableReferences(
      String namespaceReference, String keysReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    MetafieldConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafields").add(namespaceArg);
    InputArgument keysArg = new InputArgument("keys", keysReference, true, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("String"))));
    getInputArguments().get("metafields").add(keysArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("metafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("metafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("metafields").add(reverseArg);
    return projection;
  }

  public ProductConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> products(
      ) {
    ProductConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
    getFields().put("products", projection);
    return projection;
  }

  public ProductConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> products(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductCollectionSortKeys sortKey) {
    ProductConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
    getFields().put("products", projection);
    getInputArguments().computeIfAbsent("products", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("products").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("products").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("products").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("products").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("products").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("products").add(sortKeyArg);
    return projection;
  }

  public ProductConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> productsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference) {
    ProductConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
    getFields().put("products", projection);
    getInputArguments().computeIfAbsent("products", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("products").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("products").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("products").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("products").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("products").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("ProductCollectionSortKeys"));
    getInputArguments().get("products").add(sortKeyArg);
    return projection;
  }

  public CountProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> productsCount(
      ) {
    CountProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("productsCount", projection);
    return projection;
  }

  public IntProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> publicationCount(
      Boolean onlyPublished) {
    IntProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new IntProjection<>(this, this);    
    getFields().put("publicationCount", projection);
    getInputArguments().computeIfAbsent("publicationCount", k -> new ArrayList<>());                      
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished, false, null);
    getInputArguments().get("publicationCount").add(onlyPublishedArg);
    return projection;
  }

  public IntProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> publicationCountWithVariableReferences(
      String onlyPublishedReference) {
    IntProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new IntProjection<>(this, this);    
    getFields().put("publicationCount", projection);
    getInputArguments().computeIfAbsent("publicationCount", k -> new ArrayList<>());              
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublishedReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("publicationCount").add(onlyPublishedArg);
    return projection;
  }

  public CollectionPublicationConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> publications(
      ) {
    CollectionPublicationConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new CollectionPublicationConnectionProjection<>(this, this);    
    getFields().put("publications", projection);
    return projection;
  }

  public CollectionPublicationConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> publications(
      Boolean onlyPublished, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    CollectionPublicationConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new CollectionPublicationConnectionProjection<>(this, this);    
    getFields().put("publications", projection);
    getInputArguments().computeIfAbsent("publications", k -> new ArrayList<>());                      
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished, false, null);
    getInputArguments().get("publications").add(onlyPublishedArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("publications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("publications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("publications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("publications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("publications").add(reverseArg);
    return projection;
  }

  public CollectionPublicationConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> publicationsWithVariableReferences(
      String onlyPublishedReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    CollectionPublicationConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new CollectionPublicationConnectionProjection<>(this, this);    
    getFields().put("publications", projection);
    getInputArguments().computeIfAbsent("publications", k -> new ArrayList<>());              
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublishedReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("publications").add(onlyPublishedArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("publications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("publications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("publications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("publications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("publications").add(reverseArg);
    return projection;
  }

  public BooleanProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> publishedOnChannel(
      String channelId) {
    BooleanProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("publishedOnChannel", projection);
    getInputArguments().computeIfAbsent("publishedOnChannel", k -> new ArrayList<>());                      
    InputArgument channelIdArg = new InputArgument("channelId", channelId, false, null);
    getInputArguments().get("publishedOnChannel").add(channelIdArg);
    return projection;
  }

  public BooleanProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> publishedOnChannelWithVariableReferences(
      String channelIdReference) {
    BooleanProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("publishedOnChannel", projection);
    getInputArguments().computeIfAbsent("publishedOnChannel", k -> new ArrayList<>());              
    InputArgument channelIdArg = new InputArgument("channelId", channelIdReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("ID")));
    getInputArguments().get("publishedOnChannel").add(channelIdArg);
    return projection;
  }

  public BooleanProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> publishedOnPublication(
      String publicationId) {
    BooleanProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("publishedOnPublication", projection);
    getInputArguments().computeIfAbsent("publishedOnPublication", k -> new ArrayList<>());                      
    InputArgument publicationIdArg = new InputArgument("publicationId", publicationId, false, null);
    getInputArguments().get("publishedOnPublication").add(publicationIdArg);
    return projection;
  }

  public BooleanProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> publishedOnPublicationWithVariableReferences(
      String publicationIdReference) {
    BooleanProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("publishedOnPublication", projection);
    getInputArguments().computeIfAbsent("publishedOnPublication", k -> new ArrayList<>());              
    InputArgument publicationIdArg = new InputArgument("publicationId", publicationIdReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("ID")));
    getInputArguments().get("publishedOnPublication").add(publicationIdArg);
    return projection;
  }

  public ResourcePublicationConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> resourcePublications(
      ) {
    ResourcePublicationConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationConnectionProjection<>(this, this);    
    getFields().put("resourcePublications", projection);
    return projection;
  }

  public ResourcePublicationConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> resourcePublications(
      Boolean onlyPublished, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    ResourcePublicationConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationConnectionProjection<>(this, this);    
    getFields().put("resourcePublications", projection);
    getInputArguments().computeIfAbsent("resourcePublications", k -> new ArrayList<>());                      
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished, false, null);
    getInputArguments().get("resourcePublications").add(onlyPublishedArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("resourcePublications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("resourcePublications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("resourcePublications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("resourcePublications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("resourcePublications").add(reverseArg);
    return projection;
  }

  public ResourcePublicationConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> resourcePublicationsWithVariableReferences(
      String onlyPublishedReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    ResourcePublicationConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationConnectionProjection<>(this, this);    
    getFields().put("resourcePublications", projection);
    getInputArguments().computeIfAbsent("resourcePublications", k -> new ArrayList<>());              
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublishedReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("resourcePublications").add(onlyPublishedArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("resourcePublications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("resourcePublications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("resourcePublications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("resourcePublications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("resourcePublications").add(reverseArg);
    return projection;
  }

  public CountProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> resourcePublicationsCount(
      ) {
    CountProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("resourcePublicationsCount", projection);
    return projection;
  }

  public CountProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> resourcePublicationsCount(
      Boolean onlyPublished) {
    CountProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("resourcePublicationsCount", projection);
    getInputArguments().computeIfAbsent("resourcePublicationsCount", k -> new ArrayList<>());                      
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished, false, null);
    getInputArguments().get("resourcePublicationsCount").add(onlyPublishedArg);
    return projection;
  }

  public CountProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> resourcePublicationsCountWithVariableReferences(
      String onlyPublishedReference) {
    CountProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("resourcePublicationsCount", projection);
    getInputArguments().computeIfAbsent("resourcePublicationsCount", k -> new ArrayList<>());              
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublishedReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("resourcePublicationsCount").add(onlyPublishedArg);
    return projection;
  }

  public ResourcePublicationV2ConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> resourcePublicationsV2(
      ) {
    ResourcePublicationV2ConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationV2ConnectionProjection<>(this, this);    
    getFields().put("resourcePublicationsV2", projection);
    return projection;
  }

  public ResourcePublicationV2ConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> resourcePublicationsV2(
      Boolean onlyPublished, CatalogType catalogType, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    ResourcePublicationV2ConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationV2ConnectionProjection<>(this, this);    
    getFields().put("resourcePublicationsV2", projection);
    getInputArguments().computeIfAbsent("resourcePublicationsV2", k -> new ArrayList<>());                      
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished, false, null);
    getInputArguments().get("resourcePublicationsV2").add(onlyPublishedArg);
    InputArgument catalogTypeArg = new InputArgument("catalogType", catalogType, false, null);
    getInputArguments().get("resourcePublicationsV2").add(catalogTypeArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("resourcePublicationsV2").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("resourcePublicationsV2").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("resourcePublicationsV2").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("resourcePublicationsV2").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("resourcePublicationsV2").add(reverseArg);
    return projection;
  }

  public ResourcePublicationV2ConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> resourcePublicationsV2WithVariableReferences(
      String onlyPublishedReference, String catalogTypeReference, String firstReference,
      String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ResourcePublicationV2ConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationV2ConnectionProjection<>(this, this);    
    getFields().put("resourcePublicationsV2", projection);
    getInputArguments().computeIfAbsent("resourcePublicationsV2", k -> new ArrayList<>());              
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublishedReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("resourcePublicationsV2").add(onlyPublishedArg);
    InputArgument catalogTypeArg = new InputArgument("catalogType", catalogTypeReference, true, new graphql.language.TypeName("CatalogType"));
    getInputArguments().get("resourcePublicationsV2").add(catalogTypeArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("resourcePublicationsV2").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("resourcePublicationsV2").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("resourcePublicationsV2").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("resourcePublicationsV2").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("resourcePublicationsV2").add(reverseArg);
    return projection;
  }

  public CollectionRuleSetProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> ruleSet(
      ) {
    CollectionRuleSetProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new CollectionRuleSetProjection<>(this, this);    
    getFields().put("ruleSet", projection);
    return projection;
  }

  public SEOProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> seo(
      ) {
    SEOProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new SEOProjection<>(this, this);    
    getFields().put("seo", projection);
    return projection;
  }

  public CollectionSortOrderProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> sortOrder(
      ) {
    CollectionSortOrderProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new CollectionSortOrderProjection<>(this, this);    
    getFields().put("sortOrder", projection);
    return projection;
  }

  public CollectionSourceProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> sources(
      ) {
    CollectionSourceProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new CollectionSourceProjection<>(this, this);    
    getFields().put("sources", projection);
    return projection;
  }

  public CollectionSubCollectionEligibilityProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> subCollectionEligibility(
      ) {
    CollectionSubCollectionEligibilityProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new CollectionSubCollectionEligibilityProjection<>(this, this);    
    getFields().put("subCollectionEligibility", projection);
    return projection;
  }

  public TranslationProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> translations(
      ) {
    TranslationProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    return projection;
  }

  public TranslationProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> translations(
      String locale, String marketId) {
    TranslationProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale, false, null);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId, false, null);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public TranslationProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> translationsWithVariableReferences(
      String localeReference, String marketIdReference) {
    TranslationProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());              
    InputArgument localeArg = new InputArgument("locale", localeReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketIdReference, true, new graphql.language.TypeName("ID"));
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public ChannelConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> unpublishedChannels(
      ) {
    ChannelConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new ChannelConnectionProjection<>(this, this);    
    getFields().put("unpublishedChannels", projection);
    return projection;
  }

  public ChannelConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> unpublishedChannels(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ChannelConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new ChannelConnectionProjection<>(this, this);    
    getFields().put("unpublishedChannels", projection);
    getInputArguments().computeIfAbsent("unpublishedChannels", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("unpublishedChannels").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("unpublishedChannels").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("unpublishedChannels").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("unpublishedChannels").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("unpublishedChannels").add(reverseArg);
    return projection;
  }

  public ChannelConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> unpublishedChannelsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ChannelConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new ChannelConnectionProjection<>(this, this);    
    getFields().put("unpublishedChannels", projection);
    getInputArguments().computeIfAbsent("unpublishedChannels", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("unpublishedChannels").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("unpublishedChannels").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("unpublishedChannels").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("unpublishedChannels").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("unpublishedChannels").add(reverseArg);
    return projection;
  }

  public PublicationConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> unpublishedPublications(
      ) {
    PublicationConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new PublicationConnectionProjection<>(this, this);    
    getFields().put("unpublishedPublications", projection);
    return projection;
  }

  public PublicationConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> unpublishedPublications(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    PublicationConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new PublicationConnectionProjection<>(this, this);    
    getFields().put("unpublishedPublications", projection);
    getInputArguments().computeIfAbsent("unpublishedPublications", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("unpublishedPublications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("unpublishedPublications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("unpublishedPublications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("unpublishedPublications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("unpublishedPublications").add(reverseArg);
    return projection;
  }

  public PublicationConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> unpublishedPublicationsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    PublicationConnectionProjection<CollectionByHandleProjectionRoot<PARENT, ROOT>, CollectionByHandleProjectionRoot<PARENT, ROOT>> projection = new PublicationConnectionProjection<>(this, this);    
    getFields().put("unpublishedPublications", projection);
    getInputArguments().computeIfAbsent("unpublishedPublications", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("unpublishedPublications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("unpublishedPublications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("unpublishedPublications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("unpublishedPublications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("unpublishedPublications").add(reverseArg);
    return projection;
  }

  public CollectionByHandleProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CollectionByHandleProjectionRoot<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public CollectionByHandleProjectionRoot<PARENT, ROOT> descriptionHtml() {
    getFields().put("descriptionHtml", null);
    return this;
  }

  public CollectionByHandleProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public CollectionByHandleProjectionRoot<PARENT, ROOT> hasProduct() {
    getFields().put("hasProduct", null);
    return this;
  }

  public CollectionByHandleProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CollectionByHandleProjectionRoot<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public CollectionByHandleProjectionRoot<PARENT, ROOT> publicationCount() {
    getFields().put("publicationCount", null);
    return this;
  }

  public CollectionByHandleProjectionRoot<PARENT, ROOT> publishedOnChannel() {
    getFields().put("publishedOnChannel", null);
    return this;
  }

  public CollectionByHandleProjectionRoot<PARENT, ROOT> publishedOnCurrentChannel() {
    getFields().put("publishedOnCurrentChannel", null);
    return this;
  }

  public CollectionByHandleProjectionRoot<PARENT, ROOT> publishedOnCurrentPublication() {
    getFields().put("publishedOnCurrentPublication", null);
    return this;
  }

  public CollectionByHandleProjectionRoot<PARENT, ROOT> publishedOnPublication() {
    getFields().put("publishedOnPublication", null);
    return this;
  }

  public CollectionByHandleProjectionRoot<PARENT, ROOT> storefrontId() {
    getFields().put("storefrontId", null);
    return this;
  }

  public CollectionByHandleProjectionRoot<PARENT, ROOT> templateSuffix() {
    getFields().put("templateSuffix", null);
    return this;
  }

  public CollectionByHandleProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public CollectionByHandleProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
