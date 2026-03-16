package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DistanceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DistanceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Distance"));
  }

  public DistanceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DistanceUnitProjection<DistanceProjection<PARENT, ROOT>, ROOT> unit() {
     DistanceUnitProjection<DistanceProjection<PARENT, ROOT>, ROOT> projection = new DistanceUnitProjection<>(this, getRoot());
     getFields().put("unit", projection);
     return projection;
  }

  public DistanceProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
