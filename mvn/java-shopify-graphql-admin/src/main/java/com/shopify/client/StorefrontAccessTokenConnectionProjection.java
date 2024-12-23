package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StorefrontAccessTokenConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StorefrontAccessTokenConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StorefrontAccessTokenConnection"));
  }

  public StorefrontAccessTokenConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StorefrontAccessTokenEdgeProjection<StorefrontAccessTokenConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     StorefrontAccessTokenEdgeProjection<StorefrontAccessTokenConnectionProjection<PARENT, ROOT>, ROOT> projection = new StorefrontAccessTokenEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public StorefrontAccessTokenProjection<StorefrontAccessTokenConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     StorefrontAccessTokenProjection<StorefrontAccessTokenConnectionProjection<PARENT, ROOT>, ROOT> projection = new StorefrontAccessTokenProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<StorefrontAccessTokenConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<StorefrontAccessTokenConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
