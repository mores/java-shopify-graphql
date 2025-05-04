package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StorefrontAccessTokenEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StorefrontAccessTokenEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StorefrontAccessTokenEdge"));
  }

  public StorefrontAccessTokenEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StorefrontAccessTokenProjection<StorefrontAccessTokenEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     StorefrontAccessTokenProjection<StorefrontAccessTokenEdgeProjection<PARENT, ROOT>, ROOT> projection = new StorefrontAccessTokenProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public StorefrontAccessTokenEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
