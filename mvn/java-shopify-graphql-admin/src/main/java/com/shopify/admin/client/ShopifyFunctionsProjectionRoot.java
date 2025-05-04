package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyFunctionsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyFunctionsProjectionRoot() {
    super(null, null, java.util.Optional.of("ShopifyFunctionConnection"));
  }

  public ShopifyFunctionsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyFunctionEdgeProjection<ShopifyFunctionsProjectionRoot<PARENT, ROOT>, ShopifyFunctionsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    ShopifyFunctionEdgeProjection<ShopifyFunctionsProjectionRoot<PARENT, ROOT>, ShopifyFunctionsProjectionRoot<PARENT, ROOT>> projection = new ShopifyFunctionEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public ShopifyFunctionProjection<ShopifyFunctionsProjectionRoot<PARENT, ROOT>, ShopifyFunctionsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    ShopifyFunctionProjection<ShopifyFunctionsProjectionRoot<PARENT, ROOT>, ShopifyFunctionsProjectionRoot<PARENT, ROOT>> projection = new ShopifyFunctionProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<ShopifyFunctionsProjectionRoot<PARENT, ROOT>, ShopifyFunctionsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<ShopifyFunctionsProjectionRoot<PARENT, ROOT>, ShopifyFunctionsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
