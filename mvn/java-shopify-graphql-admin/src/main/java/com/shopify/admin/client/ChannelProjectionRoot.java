package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class ChannelProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ChannelProjectionRoot() {
    super(null, null, java.util.Optional.of("Channel"));
  }

  public ChannelProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> activeRegions(
      ) {
    CountryCodeProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new CountryCodeProjection<>(this, this);    
    getFields().put("activeRegions", projection);
    return projection;
  }

  public AppProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> app(
      ) {
    AppProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new AppProjection<>(this, this);    
    getFields().put("app", projection);
    return projection;
  }

  public ResourcePublicationConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> collectionPublicationsV3(
      ) {
    ResourcePublicationConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationConnectionProjection<>(this, this);    
    getFields().put("collectionPublicationsV3", projection);
    return projection;
  }

  public ResourcePublicationConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> collectionPublicationsV3(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ResourcePublicationConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationConnectionProjection<>(this, this);    
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

  public ResourcePublicationConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> collectionPublicationsV3WithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ResourcePublicationConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationConnectionProjection<>(this, this);    
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

  public CollectionConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> collections(
      ) {
    CollectionConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new CollectionConnectionProjection<>(this, this);    
    getFields().put("collections", projection);
    return projection;
  }

  public CollectionConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> collections(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CollectionConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new CollectionConnectionProjection<>(this, this);    
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

  public CollectionConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> collectionsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    CollectionConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new CollectionConnectionProjection<>(this, this);    
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

  public BooleanProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> hasCollection(
      String id) {
    BooleanProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("hasCollection", projection);
    getInputArguments().computeIfAbsent("hasCollection", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id, false, null);
    getInputArguments().get("hasCollection").add(idArg);
    return projection;
  }

  public BooleanProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> hasCollectionWithVariableReferences(
      String idReference) {
    BooleanProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("hasCollection", projection);
    getInputArguments().computeIfAbsent("hasCollection", k -> new ArrayList<>());              
    InputArgument idArg = new InputArgument("id", idReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("ID")));
    getInputArguments().get("hasCollection").add(idArg);
    return projection;
  }

  public MarketConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> markets(
      ) {
    MarketConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new MarketConnectionProjection<>(this, this);    
    getFields().put("markets", projection);
    return projection;
  }

  public MarketConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> markets(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new MarketConnectionProjection<>(this, this);    
    getFields().put("markets", projection);
    getInputArguments().computeIfAbsent("markets", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("markets").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("markets").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("markets").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("markets").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("markets").add(reverseArg);
    return projection;
  }

  public MarketConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> marketsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    MarketConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new MarketConnectionProjection<>(this, this);    
    getFields().put("markets", projection);
    getInputArguments().computeIfAbsent("markets", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("markets").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("markets").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("markets").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("markets").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("markets").add(reverseArg);
    return projection;
  }

  public CountProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> marketsCount(
      ) {
    CountProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("marketsCount", projection);
    return projection;
  }

  public NavigationItemProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> navigationItems(
      ) {
    NavigationItemProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new NavigationItemProjection<>(this, this);    
    getFields().put("navigationItems", projection);
    return projection;
  }

  public ProductPublicationConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> productPublications(
      ) {
    ProductPublicationConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new ProductPublicationConnectionProjection<>(this, this);    
    getFields().put("productPublications", projection);
    return projection;
  }

  public ProductPublicationConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> productPublications(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductPublicationConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new ProductPublicationConnectionProjection<>(this, this);    
    getFields().put("productPublications", projection);
    getInputArguments().computeIfAbsent("productPublications", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("productPublications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("productPublications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("productPublications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("productPublications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("productPublications").add(reverseArg);
    return projection;
  }

  public ProductPublicationConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> productPublicationsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ProductPublicationConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new ProductPublicationConnectionProjection<>(this, this);    
    getFields().put("productPublications", projection);
    getInputArguments().computeIfAbsent("productPublications", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("productPublications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("productPublications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("productPublications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("productPublications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("productPublications").add(reverseArg);
    return projection;
  }

  public ResourcePublicationConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> productPublicationsV3(
      ) {
    ResourcePublicationConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationConnectionProjection<>(this, this);    
    getFields().put("productPublicationsV3", projection);
    return projection;
  }

  public ResourcePublicationConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> productPublicationsV3(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ResourcePublicationConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationConnectionProjection<>(this, this);    
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

  public ResourcePublicationConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> productPublicationsV3WithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ResourcePublicationConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationConnectionProjection<>(this, this);    
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

  public ProductConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> products(
      ) {
    ProductConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
    getFields().put("products", projection);
    return projection;
  }

  public ProductConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> products(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
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
    return projection;
  }

  public ProductConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> productsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ProductConnectionProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
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
    return projection;
  }

  public CountProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> productsCount(
      ) {
    CountProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("productsCount", projection);
    return projection;
  }

  public CountProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> productsCount(
      String query, Integer limit) {
    CountProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("productsCount", projection);
    getInputArguments().computeIfAbsent("productsCount", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("productsCount").add(queryArg);
    InputArgument limitArg = new InputArgument("limit", limit, false, null);
    getInputArguments().get("productsCount").add(limitArg);
    return projection;
  }

  public CountProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> productsCountWithVariableReferences(
      String queryReference, String limitReference) {
    CountProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("productsCount", projection);
    getInputArguments().computeIfAbsent("productsCount", k -> new ArrayList<>());              
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("productsCount").add(queryArg);
    InputArgument limitArg = new InputArgument("limit", limitReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("productsCount").add(limitArg);
    return projection;
  }

  public AppFeedbackProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> resourceFeedback(
      ) {
    AppFeedbackProjection<ChannelProjectionRoot<PARENT, ROOT>, ChannelProjectionRoot<PARENT, ROOT>> projection = new AppFeedbackProjection<>(this, this);    
    getFields().put("resourceFeedback", projection);
    return projection;
  }

  public ChannelProjectionRoot<PARENT, ROOT> accountId() {
    getFields().put("accountId", null);
    return this;
  }

  public ChannelProjectionRoot<PARENT, ROOT> accountName() {
    getFields().put("accountName", null);
    return this;
  }

  public ChannelProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public ChannelProjectionRoot<PARENT, ROOT> hasCollection() {
    getFields().put("hasCollection", null);
    return this;
  }

  public ChannelProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ChannelProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public ChannelProjectionRoot<PARENT, ROOT> overviewPath() {
    getFields().put("overviewPath", null);
    return this;
  }

  public ChannelProjectionRoot<PARENT, ROOT> specificationHandle() {
    getFields().put("specificationHandle", null);
    return this;
  }

  public ChannelProjectionRoot<PARENT, ROOT> supportsFuturePublishing() {
    getFields().put("supportsFuturePublishing", null);
    return this;
  }
}
