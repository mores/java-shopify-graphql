package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyFunctionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyFunctionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyFunction"));
  }

  public ShopifyFunctionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<ShopifyFunctionProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<ShopifyFunctionProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public FunctionsAppBridgeProjection<ShopifyFunctionProjection<PARENT, ROOT>, ROOT> appBridge() {
     FunctionsAppBridgeProjection<ShopifyFunctionProjection<PARENT, ROOT>, ROOT> projection = new FunctionsAppBridgeProjection<>(this, getRoot());
     getFields().put("appBridge", projection);
     return projection;
  }

  public ShopifyFunctionProjection<PARENT, ROOT> apiType() {
    getFields().put("apiType", null);
    return this;
  }

  public ShopifyFunctionProjection<PARENT, ROOT> apiVersion() {
    getFields().put("apiVersion", null);
    return this;
  }

  public ShopifyFunctionProjection<PARENT, ROOT> appKey() {
    getFields().put("appKey", null);
    return this;
  }

  public ShopifyFunctionProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public ShopifyFunctionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopifyFunctionProjection<PARENT, ROOT> inputQuery() {
    getFields().put("inputQuery", null);
    return this;
  }

  public ShopifyFunctionProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ShopifyFunctionProjection<PARENT, ROOT> useCreationUi() {
    getFields().put("useCreationUi", null);
    return this;
  }
}
