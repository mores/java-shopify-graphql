package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class PublicationFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public PublicationFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Publication"));
  }

  public PublicationFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<PublicationFragmentProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<PublicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public CatalogProjection<PublicationFragmentProjection<PARENT, ROOT>, ROOT> catalog() {
     CatalogProjection<PublicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new CatalogProjection<>(this, getRoot());
     getFields().put("catalog", projection);
     return projection;
  }

  public ResourcePublicationConnectionProjection<PublicationFragmentProjection<PARENT, ROOT>, ROOT> collectionPublicationsV3(
      ) {
     ResourcePublicationConnectionProjection<PublicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationConnectionProjection<>(this, getRoot());
     getFields().put("collectionPublicationsV3", projection);
     return projection;
  }

  public ResourcePublicationConnectionProjection<PublicationFragmentProjection<PARENT, ROOT>, ROOT> collectionPublicationsV3(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ResourcePublicationConnectionProjection<PublicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationConnectionProjection<>(this, getRoot());    
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

  public CollectionConnectionProjection<PublicationFragmentProjection<PARENT, ROOT>, ROOT> collections(
      ) {
     CollectionConnectionProjection<PublicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionConnectionProjection<>(this, getRoot());
     getFields().put("collections", projection);
     return projection;
  }

  public CollectionConnectionProjection<PublicationFragmentProjection<PARENT, ROOT>, ROOT> collections(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CollectionConnectionProjection<PublicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionConnectionProjection<>(this, getRoot());    
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

  public ProductConnectionProjection<PublicationFragmentProjection<PARENT, ROOT>, ROOT> includedProducts(
      ) {
     ProductConnectionProjection<PublicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());
     getFields().put("includedProducts", projection);
     return projection;
  }

  public ProductConnectionProjection<PublicationFragmentProjection<PARENT, ROOT>, ROOT> includedProducts(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductConnectionProjection<PublicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());    
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

  public PublicationOperationProjection<PublicationFragmentProjection<PARENT, ROOT>, ROOT> operation(
      ) {
     PublicationOperationProjection<PublicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new PublicationOperationProjection<>(this, getRoot());
     getFields().put("operation", projection);
     return projection;
  }

  public ResourcePublicationConnectionProjection<PublicationFragmentProjection<PARENT, ROOT>, ROOT> productPublicationsV3(
      ) {
     ResourcePublicationConnectionProjection<PublicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationConnectionProjection<>(this, getRoot());
     getFields().put("productPublicationsV3", projection);
     return projection;
  }

  public ResourcePublicationConnectionProjection<PublicationFragmentProjection<PARENT, ROOT>, ROOT> productPublicationsV3(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ResourcePublicationConnectionProjection<PublicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationConnectionProjection<>(this, getRoot());    
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

  public ProductConnectionProjection<PublicationFragmentProjection<PARENT, ROOT>, ROOT> products() {
     ProductConnectionProjection<PublicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());
     getFields().put("products", projection);
     return projection;
  }

  public ProductConnectionProjection<PublicationFragmentProjection<PARENT, ROOT>, ROOT> products(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductConnectionProjection<PublicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());    
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

  public PublicationFragmentProjection<PARENT, ROOT> autoPublish() {
    getFields().put("autoPublish", null);
    return this;
  }

  public PublicationFragmentProjection<PARENT, ROOT> hasCollection() {
    getFields().put("hasCollection", null);
    return this;
  }

  public PublicationFragmentProjection hasCollection(String id) {
    getFields().put("hasCollection", null);
    getInputArguments().computeIfAbsent("hasCollection", k -> new ArrayList<>());
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("hasCollection").add(idArg);
    return this;
  }

  public PublicationFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public PublicationFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public PublicationFragmentProjection<PARENT, ROOT> supportsFuturePublishing() {
    getFields().put("supportsFuturePublishing", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Publication {");
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
