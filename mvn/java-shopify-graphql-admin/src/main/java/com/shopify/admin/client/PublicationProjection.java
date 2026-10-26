package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.ProductSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class PublicationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PublicationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Publication"));
  }

  public PublicationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<PublicationProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<PublicationProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public CatalogProjection<PublicationProjection<PARENT, ROOT>, ROOT> catalog() {
     CatalogProjection<PublicationProjection<PARENT, ROOT>, ROOT> projection = new CatalogProjection<>(this, getRoot());
     getFields().put("catalog", projection);
     return projection;
  }

  public ChannelConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> channels() {
     ChannelConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> projection = new ChannelConnectionProjection<>(this, getRoot());
     getFields().put("channels", projection);
     return projection;
  }

  public ChannelConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> channels(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ChannelConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> projection = new ChannelConnectionProjection<>(this, getRoot());    
    getFields().put("channels", projection);
    getInputArguments().computeIfAbsent("channels", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("channels").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("channels").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("channels").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("channels").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("channels").add(reverseArg);
    return projection;
  }

  public ChannelConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> channelsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ChannelConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> projection = new ChannelConnectionProjection<>(this, getRoot());    
    getFields().put("channels", projection);
    getInputArguments().computeIfAbsent("channels", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("channels").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("channels").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("channels").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("channels").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("channels").add(reverseArg);
    return projection;
  }

  public ResourcePublicationConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> collectionPublicationsV3(
      ) {
     ResourcePublicationConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationConnectionProjection<>(this, getRoot());
     getFields().put("collectionPublicationsV3", projection);
     return projection;
  }

  public ResourcePublicationConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> collectionPublicationsV3(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ResourcePublicationConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationConnectionProjection<>(this, getRoot());    
    getFields().put("collectionPublicationsV3", projection);
    getInputArguments().computeIfAbsent("collectionPublicationsV3", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("collectionPublicationsV3").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("collectionPublicationsV3").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("collectionPublicationsV3").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("collectionPublicationsV3").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("collectionPublicationsV3").add(reverseArg);
    return projection;
  }

  public ResourcePublicationConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> collectionPublicationsV3WithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ResourcePublicationConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationConnectionProjection<>(this, getRoot());    
    getFields().put("collectionPublicationsV3", projection);
    getInputArguments().computeIfAbsent("collectionPublicationsV3", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("collectionPublicationsV3").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("collectionPublicationsV3").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("collectionPublicationsV3").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("collectionPublicationsV3").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("collectionPublicationsV3").add(reverseArg);
    return projection;
  }

  public CollectionConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> collections() {
     CollectionConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> projection = new CollectionConnectionProjection<>(this, getRoot());
     getFields().put("collections", projection);
     return projection;
  }

  public CollectionConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> collections(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CollectionConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> projection = new CollectionConnectionProjection<>(this, getRoot());    
    getFields().put("collections", projection);
    getInputArguments().computeIfAbsent("collections", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("collections").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("collections").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("collections").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("collections").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("collections").add(reverseArg);
    return projection;
  }

  public CollectionConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> collectionsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    CollectionConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> projection = new CollectionConnectionProjection<>(this, getRoot());    
    getFields().put("collections", projection);
    getInputArguments().computeIfAbsent("collections", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("collections").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("collections").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("collections").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("collections").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("collections").add(reverseArg);
    return projection;
  }

  public ProductConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> includedProducts() {
     ProductConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());
     getFields().put("includedProducts", projection);
     return projection;
  }

  public ProductConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> includedProducts(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductSortKeys sortKey, String query, String savedSearchId) {
    ProductConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());    
    getFields().put("includedProducts", projection);
    getInputArguments().computeIfAbsent("includedProducts", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("includedProducts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("includedProducts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("includedProducts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("includedProducts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("includedProducts").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("includedProducts").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("includedProducts").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId, false, null);
    getInputArguments().get("includedProducts").add(savedSearchIdArg);
    return projection;
  }

  public ProductConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> includedProductsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference, String queryReference,
      String savedSearchIdReference) {
    ProductConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());    
    getFields().put("includedProducts", projection);
    getInputArguments().computeIfAbsent("includedProducts", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("includedProducts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("includedProducts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("includedProducts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("includedProducts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("includedProducts").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("ProductSortKeys"));
    getInputArguments().get("includedProducts").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("includedProducts").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchIdReference, true, new graphql.language.TypeName("ID"));
    getInputArguments().get("includedProducts").add(savedSearchIdArg);
    return projection;
  }

  public CountProjection<PublicationProjection<PARENT, ROOT>, ROOT> includedProductsCount() {
     CountProjection<PublicationProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("includedProductsCount", projection);
     return projection;
  }

  public CountProjection<PublicationProjection<PARENT, ROOT>, ROOT> includedProductsCount(
      String query, String savedSearchId, Integer limit) {
    CountProjection<PublicationProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("includedProductsCount", projection);
    getInputArguments().computeIfAbsent("includedProductsCount", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("includedProductsCount").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId, false, null);
    getInputArguments().get("includedProductsCount").add(savedSearchIdArg);
    InputArgument limitArg = new InputArgument("limit", limit, false, null);
    getInputArguments().get("includedProductsCount").add(limitArg);
    return projection;
  }

  public CountProjection<PublicationProjection<PARENT, ROOT>, ROOT> includedProductsCountWithVariableReferences(
      String queryReference, String savedSearchIdReference, String limitReference) {
    CountProjection<PublicationProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("includedProductsCount", projection);
    getInputArguments().computeIfAbsent("includedProductsCount", k -> new ArrayList<>());              
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("includedProductsCount").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchIdReference, true, new graphql.language.TypeName("ID"));
    getInputArguments().get("includedProductsCount").add(savedSearchIdArg);
    InputArgument limitArg = new InputArgument("limit", limitReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("includedProductsCount").add(limitArg);
    return projection;
  }

  public PublicationOperationProjection<PublicationProjection<PARENT, ROOT>, ROOT> operation() {
     PublicationOperationProjection<PublicationProjection<PARENT, ROOT>, ROOT> projection = new PublicationOperationProjection<>(this, getRoot());
     getFields().put("operation", projection);
     return projection;
  }

  public ResourcePublicationConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> productPublicationsV3(
      ) {
     ResourcePublicationConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationConnectionProjection<>(this, getRoot());
     getFields().put("productPublicationsV3", projection);
     return projection;
  }

  public ResourcePublicationConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> productPublicationsV3(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ResourcePublicationConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationConnectionProjection<>(this, getRoot());    
    getFields().put("productPublicationsV3", projection);
    getInputArguments().computeIfAbsent("productPublicationsV3", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("productPublicationsV3").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("productPublicationsV3").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("productPublicationsV3").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("productPublicationsV3").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("productPublicationsV3").add(reverseArg);
    return projection;
  }

  public ResourcePublicationConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> productPublicationsV3WithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ResourcePublicationConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationConnectionProjection<>(this, getRoot());    
    getFields().put("productPublicationsV3", projection);
    getInputArguments().computeIfAbsent("productPublicationsV3", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("productPublicationsV3").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("productPublicationsV3").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("productPublicationsV3").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("productPublicationsV3").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("productPublicationsV3").add(reverseArg);
    return projection;
  }

  public ProductConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> products() {
     ProductConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());
     getFields().put("products", projection);
     return projection;
  }

  public ProductConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> products(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductSortKeys sortKey, String query, String savedSearchId) {
    ProductConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());    
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
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("products").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId, false, null);
    getInputArguments().get("products").add(savedSearchIdArg);
    return projection;
  }

  public ProductConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> productsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference, String queryReference,
      String savedSearchIdReference) {
    ProductConnectionProjection<PublicationProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());    
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
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("ProductSortKeys"));
    getInputArguments().get("products").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("products").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchIdReference, true, new graphql.language.TypeName("ID"));
    getInputArguments().get("products").add(savedSearchIdArg);
    return projection;
  }

  public PublicationProjection<PARENT, ROOT> autoPublish() {
    getFields().put("autoPublish", null);
    return this;
  }

  public PublicationProjection<PARENT, ROOT> hasCollection() {
    getFields().put("hasCollection", null);
    return this;
  }

  public PublicationProjection hasCollection(String id) {
    getFields().put("hasCollection", null);
    getInputArguments().computeIfAbsent("hasCollection", k -> new ArrayList<>());
    InputArgument idArg = new InputArgument("id", id, false, null);
    getInputArguments().get("hasCollection").add(idArg);
    return this;
  }

  public PublicationProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public PublicationProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public PublicationProjection<PARENT, ROOT> supportsFuturePublishing() {
    getFields().put("supportsFuturePublishing", null);
    return this;
  }
}
