package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StoreAvailabilityConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StoreAvailabilityConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StoreAvailabilityConnection"));
  }

  public StoreAvailabilityConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StoreAvailabilityEdgeProjection<StoreAvailabilityConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     StoreAvailabilityEdgeProjection<StoreAvailabilityConnectionProjection<PARENT, ROOT>, ROOT> projection = new StoreAvailabilityEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public StoreAvailabilityProjection<StoreAvailabilityConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     StoreAvailabilityProjection<StoreAvailabilityConnectionProjection<PARENT, ROOT>, ROOT> projection = new StoreAvailabilityProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<StoreAvailabilityConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<StoreAvailabilityConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
