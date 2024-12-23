package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyFunctionEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyFunctionEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyFunctionEdge"));
  }

  public ShopifyFunctionEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyFunctionProjection<ShopifyFunctionEdgeProjection<PARENT, ROOT>, ROOT> node() {
     ShopifyFunctionProjection<ShopifyFunctionEdgeProjection<PARENT, ROOT>, ROOT> projection = new ShopifyFunctionProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ShopifyFunctionEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
