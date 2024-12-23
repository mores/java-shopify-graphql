package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CombinedListingChildEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CombinedListingChildEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CombinedListingChildEdge"));
  }

  public CombinedListingChildEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CombinedListingChildProjection<CombinedListingChildEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     CombinedListingChildProjection<CombinedListingChildEdgeProjection<PARENT, ROOT>, ROOT> projection = new CombinedListingChildProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CombinedListingChildEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
