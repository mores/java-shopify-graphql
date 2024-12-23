package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartTransformConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartTransformConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartTransformConnection"));
  }

  public CartTransformConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartTransformEdgeProjection<CartTransformConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CartTransformEdgeProjection<CartTransformConnectionProjection<PARENT, ROOT>, ROOT> projection = new CartTransformEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CartTransformProjection<CartTransformConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     CartTransformProjection<CartTransformConnectionProjection<PARENT, ROOT>, ROOT> projection = new CartTransformProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CartTransformConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<CartTransformConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
