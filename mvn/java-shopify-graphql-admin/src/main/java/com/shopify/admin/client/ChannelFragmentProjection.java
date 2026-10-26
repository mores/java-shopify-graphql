package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class ChannelFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ChannelFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Channel"));
  }

  public ChannelFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> activeRegions() {
     CountryCodeProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("activeRegions", projection);
     return projection;
  }

  public AppProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public ResourcePublicationConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> collectionPublicationsV3(
      ) {
     ResourcePublicationConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationConnectionProjection<>(this, getRoot());
     getFields().put("collectionPublicationsV3", projection);
     return projection;
  }

  public ResourcePublicationConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> collectionPublicationsV3(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ResourcePublicationConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationConnectionProjection<>(this, getRoot());    
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

  public ResourcePublicationConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> collectionPublicationsV3WithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ResourcePublicationConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationConnectionProjection<>(this, getRoot());    
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

  public CollectionConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> collections(
      ) {
     CollectionConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionConnectionProjection<>(this, getRoot());
     getFields().put("collections", projection);
     return projection;
  }

  public CollectionConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> collections(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CollectionConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionConnectionProjection<>(this, getRoot());    
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

  public CollectionConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> collectionsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    CollectionConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionConnectionProjection<>(this, getRoot());    
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

  public MarketConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> markets() {
     MarketConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketConnectionProjection<>(this, getRoot());
     getFields().put("markets", projection);
     return projection;
  }

  public MarketConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> markets(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketConnectionProjection<>(this, getRoot());    
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

  public MarketConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> marketsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    MarketConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketConnectionProjection<>(this, getRoot());    
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

  public CountProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> marketsCount() {
     CountProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("marketsCount", projection);
     return projection;
  }

  public NavigationItemProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> navigationItems() {
     NavigationItemProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> projection = new NavigationItemProjection<>(this, getRoot());
     getFields().put("navigationItems", projection);
     return projection;
  }

  public ProductPublicationConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> productPublications(
      ) {
     ProductPublicationConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductPublicationConnectionProjection<>(this, getRoot());
     getFields().put("productPublications", projection);
     return projection;
  }

  public ProductPublicationConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> productPublications(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductPublicationConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductPublicationConnectionProjection<>(this, getRoot());    
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

  public ProductPublicationConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> productPublicationsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ProductPublicationConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductPublicationConnectionProjection<>(this, getRoot());    
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

  public ResourcePublicationConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> productPublicationsV3(
      ) {
     ResourcePublicationConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationConnectionProjection<>(this, getRoot());
     getFields().put("productPublicationsV3", projection);
     return projection;
  }

  public ResourcePublicationConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> productPublicationsV3(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ResourcePublicationConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationConnectionProjection<>(this, getRoot());    
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

  public ResourcePublicationConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> productPublicationsV3WithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ResourcePublicationConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationConnectionProjection<>(this, getRoot());    
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

  public ProductConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> products() {
     ProductConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());
     getFields().put("products", projection);
     return projection;
  }

  public ProductConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> products(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());    
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

  public ProductConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> productsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ProductConnectionProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());    
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

  public CountProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> productsCount() {
     CountProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("productsCount", projection);
     return projection;
  }

  public CountProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> productsCount(String query,
      Integer limit) {
    CountProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("productsCount", projection);
    getInputArguments().computeIfAbsent("productsCount", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("productsCount").add(queryArg);
    InputArgument limitArg = new InputArgument("limit", limit, false, null);
    getInputArguments().get("productsCount").add(limitArg);
    return projection;
  }

  public CountProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> productsCountWithVariableReferences(
      String queryReference, String limitReference) {
    CountProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("productsCount", projection);
    getInputArguments().computeIfAbsent("productsCount", k -> new ArrayList<>());              
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("productsCount").add(queryArg);
    InputArgument limitArg = new InputArgument("limit", limitReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("productsCount").add(limitArg);
    return projection;
  }

  public AppFeedbackProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> resourceFeedback() {
     AppFeedbackProjection<ChannelFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppFeedbackProjection<>(this, getRoot());
     getFields().put("resourceFeedback", projection);
     return projection;
  }

  public ChannelFragmentProjection<PARENT, ROOT> accountId() {
    getFields().put("accountId", null);
    return this;
  }

  public ChannelFragmentProjection<PARENT, ROOT> accountName() {
    getFields().put("accountName", null);
    return this;
  }

  public ChannelFragmentProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public ChannelFragmentProjection<PARENT, ROOT> hasCollection() {
    getFields().put("hasCollection", null);
    return this;
  }

  public ChannelFragmentProjection hasCollection(String id) {
    getFields().put("hasCollection", null);
    getInputArguments().computeIfAbsent("hasCollection", k -> new ArrayList<>());
    InputArgument idArg = new InputArgument("id", id, false, null);
    getInputArguments().get("hasCollection").add(idArg);
    return this;
  }

  public ChannelFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ChannelFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public ChannelFragmentProjection<PARENT, ROOT> overviewPath() {
    getFields().put("overviewPath", null);
    return this;
  }

  public ChannelFragmentProjection<PARENT, ROOT> specificationHandle() {
    getFields().put("specificationHandle", null);
    return this;
  }

  public ChannelFragmentProjection<PARENT, ROOT> supportsFuturePublishing() {
    getFields().put("supportsFuturePublishing", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Channel {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
