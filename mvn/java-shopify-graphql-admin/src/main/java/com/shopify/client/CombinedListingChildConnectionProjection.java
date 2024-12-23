package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CombinedListingChildConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CombinedListingChildConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CombinedListingChildConnection"));
  }

  public CombinedListingChildConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CombinedListingChildEdgeProjection<CombinedListingChildConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CombinedListingChildEdgeProjection<CombinedListingChildConnectionProjection<PARENT, ROOT>, ROOT> projection = new CombinedListingChildEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CombinedListingChildProjection<CombinedListingChildConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     CombinedListingChildProjection<CombinedListingChildConnectionProjection<PARENT, ROOT>, ROOT> projection = new CombinedListingChildProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CombinedListingChildConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<CombinedListingChildConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
