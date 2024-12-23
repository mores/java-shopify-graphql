package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyFunctionConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyFunctionConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyFunctionConnection"));
  }

  public ShopifyFunctionConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyFunctionEdgeProjection<ShopifyFunctionConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     ShopifyFunctionEdgeProjection<ShopifyFunctionConnectionProjection<PARENT, ROOT>, ROOT> projection = new ShopifyFunctionEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ShopifyFunctionProjection<ShopifyFunctionConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     ShopifyFunctionProjection<ShopifyFunctionConnectionProjection<PARENT, ROOT>, ROOT> projection = new ShopifyFunctionProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ShopifyFunctionConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<ShopifyFunctionConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
