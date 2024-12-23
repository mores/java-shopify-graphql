package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyFunctionProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyFunctionProjectionRoot() {
    super(null, null, java.util.Optional.of("ShopifyFunction"));
  }

  public ShopifyFunctionProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<ShopifyFunctionProjectionRoot<PARENT, ROOT>, ShopifyFunctionProjectionRoot<PARENT, ROOT>> app(
      ) {
    AppProjection<ShopifyFunctionProjectionRoot<PARENT, ROOT>, ShopifyFunctionProjectionRoot<PARENT, ROOT>> projection = new AppProjection<>(this, this);    
    getFields().put("app", projection);
    return projection;
  }

  public FunctionsAppBridgeProjection<ShopifyFunctionProjectionRoot<PARENT, ROOT>, ShopifyFunctionProjectionRoot<PARENT, ROOT>> appBridge(
      ) {
    FunctionsAppBridgeProjection<ShopifyFunctionProjectionRoot<PARENT, ROOT>, ShopifyFunctionProjectionRoot<PARENT, ROOT>> projection = new FunctionsAppBridgeProjection<>(this, this);    
    getFields().put("appBridge", projection);
    return projection;
  }

  public ShopifyFunctionProjectionRoot<PARENT, ROOT> apiType() {
    getFields().put("apiType", null);
    return this;
  }

  public ShopifyFunctionProjectionRoot<PARENT, ROOT> apiVersion() {
    getFields().put("apiVersion", null);
    return this;
  }

  public ShopifyFunctionProjectionRoot<PARENT, ROOT> appKey() {
    getFields().put("appKey", null);
    return this;
  }

  public ShopifyFunctionProjectionRoot<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public ShopifyFunctionProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopifyFunctionProjectionRoot<PARENT, ROOT> inputQuery() {
    getFields().put("inputQuery", null);
    return this;
  }

  public ShopifyFunctionProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ShopifyFunctionProjectionRoot<PARENT, ROOT> useCreationUi() {
    getFields().put("useCreationUi", null);
    return this;
  }
}
