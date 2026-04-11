package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class ChannelByHandleProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ChannelByHandleProjectionRoot() {
    super(null, null, java.util.Optional.of("Channel"));
  }

  public ChannelByHandleProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> app(
      ) {
    AppProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> projection = new AppProjection<>(this, this);    
    getFields().put("app", projection);
    return projection;
  }

  public ResourcePublicationConnectionProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> collectionPublicationsV3(
      ) {
    ResourcePublicationConnectionProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationConnectionProjection<>(this, this);    
    getFields().put("collectionPublicationsV3", projection);
    return projection;
  }

  public ResourcePublicationConnectionProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> collectionPublicationsV3(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ResourcePublicationConnectionProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationConnectionProjection<>(this, this);    
    getFields().put("collectionPublicationsV3", projection);
    getInputArguments().computeIfAbsent("collectionPublicationsV3", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("collectionPublicationsV3").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("collectionPublicationsV3").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("collectionPublicationsV3").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("collectionPublicationsV3").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("collectionPublicationsV3").add(reverseArg);
    return projection;
  }

  public CollectionConnectionProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> collections(
      ) {
    CollectionConnectionProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> projection = new CollectionConnectionProjection<>(this, this);    
    getFields().put("collections", projection);
    return projection;
  }

  public CollectionConnectionProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> collections(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CollectionConnectionProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> projection = new CollectionConnectionProjection<>(this, this);    
    getFields().put("collections", projection);
    getInputArguments().computeIfAbsent("collections", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("collections").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("collections").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("collections").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("collections").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("collections").add(reverseArg);
    return projection;
  }

  public BooleanProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> hasCollection(
      String id) {
    BooleanProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("hasCollection", projection);
    getInputArguments().computeIfAbsent("hasCollection", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("hasCollection").add(idArg);
    return projection;
  }

  public NavigationItemProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> navigationItems(
      ) {
    NavigationItemProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> projection = new NavigationItemProjection<>(this, this);    
    getFields().put("navigationItems", projection);
    return projection;
  }

  public ProductPublicationConnectionProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> productPublications(
      ) {
    ProductPublicationConnectionProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductPublicationConnectionProjection<>(this, this);    
    getFields().put("productPublications", projection);
    return projection;
  }

  public ProductPublicationConnectionProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> productPublications(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductPublicationConnectionProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductPublicationConnectionProjection<>(this, this);    
    getFields().put("productPublications", projection);
    getInputArguments().computeIfAbsent("productPublications", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("productPublications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("productPublications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("productPublications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("productPublications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("productPublications").add(reverseArg);
    return projection;
  }

  public ResourcePublicationConnectionProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> productPublicationsV3(
      ) {
    ResourcePublicationConnectionProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationConnectionProjection<>(this, this);    
    getFields().put("productPublicationsV3", projection);
    return projection;
  }

  public ResourcePublicationConnectionProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> productPublicationsV3(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ResourcePublicationConnectionProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationConnectionProjection<>(this, this);    
    getFields().put("productPublicationsV3", projection);
    getInputArguments().computeIfAbsent("productPublicationsV3", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("productPublicationsV3").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("productPublicationsV3").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("productPublicationsV3").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("productPublicationsV3").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("productPublicationsV3").add(reverseArg);
    return projection;
  }

  public ProductConnectionProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> products(
      ) {
    ProductConnectionProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
    getFields().put("products", projection);
    return projection;
  }

  public ProductConnectionProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> products(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductConnectionProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
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
    return projection;
  }

  public CountProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> productsCount(
      ) {
    CountProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("productsCount", projection);
    return projection;
  }

  public CountProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> productsCount(
      String query, Integer limit) {
    CountProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("productsCount", projection);
    getInputArguments().computeIfAbsent("productsCount", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("productsCount").add(queryArg);
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("productsCount").add(limitArg);
    return projection;
  }

  public AppFeedbackProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> resourceFeedback(
      ) {
    AppFeedbackProjection<ChannelByHandleProjectionRoot<PARENT, ROOT>, ChannelByHandleProjectionRoot<PARENT, ROOT>> projection = new AppFeedbackProjection<>(this, this);    
    getFields().put("resourceFeedback", projection);
    return projection;
  }

  public ChannelByHandleProjectionRoot<PARENT, ROOT> accountId() {
    getFields().put("accountId", null);
    return this;
  }

  public ChannelByHandleProjectionRoot<PARENT, ROOT> accountName() {
    getFields().put("accountName", null);
    return this;
  }

  public ChannelByHandleProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public ChannelByHandleProjectionRoot<PARENT, ROOT> hasCollection() {
    getFields().put("hasCollection", null);
    return this;
  }

  public ChannelByHandleProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ChannelByHandleProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public ChannelByHandleProjectionRoot<PARENT, ROOT> overviewPath() {
    getFields().put("overviewPath", null);
    return this;
  }

  public ChannelByHandleProjectionRoot<PARENT, ROOT> specificationHandle() {
    getFields().put("specificationHandle", null);
    return this;
  }

  public ChannelByHandleProjectionRoot<PARENT, ROOT> supportsFuturePublishing() {
    getFields().put("supportsFuturePublishing", null);
    return this;
  }
}
