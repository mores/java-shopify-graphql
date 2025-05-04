package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartTransformsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartTransformsProjectionRoot() {
    super(null, null, java.util.Optional.of("CartTransformConnection"));
  }

  public CartTransformsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartTransformEdgeProjection<CartTransformsProjectionRoot<PARENT, ROOT>, CartTransformsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    CartTransformEdgeProjection<CartTransformsProjectionRoot<PARENT, ROOT>, CartTransformsProjectionRoot<PARENT, ROOT>> projection = new CartTransformEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public CartTransformProjection<CartTransformsProjectionRoot<PARENT, ROOT>, CartTransformsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    CartTransformProjection<CartTransformsProjectionRoot<PARENT, ROOT>, CartTransformsProjectionRoot<PARENT, ROOT>> projection = new CartTransformProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<CartTransformsProjectionRoot<PARENT, ROOT>, CartTransformsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<CartTransformsProjectionRoot<PARENT, ROOT>, CartTransformsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
