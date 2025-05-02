package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StoreAvailabilityEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StoreAvailabilityEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StoreAvailabilityEdge"));
  }

  public StoreAvailabilityEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StoreAvailabilityProjection<StoreAvailabilityEdgeProjection<PARENT, ROOT>, ROOT> node() {
     StoreAvailabilityProjection<StoreAvailabilityEdgeProjection<PARENT, ROOT>, ROOT> projection = new StoreAvailabilityProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public StoreAvailabilityEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
