package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class PublicationProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PublicationProjectionRoot() {
    super(null, null, java.util.Optional.of("Publication"));
  }

  public PublicationProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> app(
      ) {
    AppProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> projection = new AppProjection<>(this, this);    
    getFields().put("app", projection);
    return projection;
  }

  public CatalogProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> catalog(
      ) {
    CatalogProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> projection = new CatalogProjection<>(this, this);    
    getFields().put("catalog", projection);
    return projection;
  }

  public ResourcePublicationConnectionProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> collectionPublicationsV3(
      ) {
    ResourcePublicationConnectionProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationConnectionProjection<>(this, this);    
    getFields().put("collectionPublicationsV3", projection);
    return projection;
  }

  public ResourcePublicationConnectionProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> collectionPublicationsV3(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ResourcePublicationConnectionProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationConnectionProjection<>(this, this);    
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

  public CollectionConnectionProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> collections(
      ) {
    CollectionConnectionProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> projection = new CollectionConnectionProjection<>(this, this);    
    getFields().put("collections", projection);
    return projection;
  }

  public CollectionConnectionProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> collections(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CollectionConnectionProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> projection = new CollectionConnectionProjection<>(this, this);    
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

  public BooleanProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> hasCollection(
      String id) {
    BooleanProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("hasCollection", projection);
    getInputArguments().computeIfAbsent("hasCollection", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("hasCollection").add(idArg);
    return projection;
  }

  public ProductConnectionProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> includedProducts(
      ) {
    ProductConnectionProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
    getFields().put("includedProducts", projection);
    return projection;
  }

  public ProductConnectionProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> includedProducts(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductConnectionProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
    getFields().put("includedProducts", projection);
    getInputArguments().computeIfAbsent("includedProducts", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("includedProducts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("includedProducts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("includedProducts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("includedProducts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("includedProducts").add(reverseArg);
    return projection;
  }

  public PublicationOperationProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> operation(
      ) {
    PublicationOperationProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> projection = new PublicationOperationProjection<>(this, this);    
    getFields().put("operation", projection);
    return projection;
  }

  public ResourcePublicationConnectionProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> productPublicationsV3(
      ) {
    ResourcePublicationConnectionProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationConnectionProjection<>(this, this);    
    getFields().put("productPublicationsV3", projection);
    return projection;
  }

  public ResourcePublicationConnectionProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> productPublicationsV3(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ResourcePublicationConnectionProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationConnectionProjection<>(this, this);    
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

  public ProductConnectionProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> products(
      ) {
    ProductConnectionProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
    getFields().put("products", projection);
    return projection;
  }

  public ProductConnectionProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> products(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductConnectionProjection<PublicationProjectionRoot<PARENT, ROOT>, PublicationProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
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

  public PublicationProjectionRoot<PARENT, ROOT> autoPublish() {
    getFields().put("autoPublish", null);
    return this;
  }

  public PublicationProjectionRoot<PARENT, ROOT> hasCollection() {
    getFields().put("hasCollection", null);
    return this;
  }

  public PublicationProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public PublicationProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public PublicationProjectionRoot<PARENT, ROOT> supportsFuturePublishing() {
    getFields().put("supportsFuturePublishing", null);
    return this;
  }
}
