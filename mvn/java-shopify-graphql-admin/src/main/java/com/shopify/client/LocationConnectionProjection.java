package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocationConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocationConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LocationConnection"));
  }

  public LocationConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationEdgeProjection<LocationConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     LocationEdgeProjection<LocationConnectionProjection<PARENT, ROOT>, ROOT> projection = new LocationEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public LocationProjection<LocationConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     LocationProjection<LocationConnectionProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<LocationConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<LocationConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
