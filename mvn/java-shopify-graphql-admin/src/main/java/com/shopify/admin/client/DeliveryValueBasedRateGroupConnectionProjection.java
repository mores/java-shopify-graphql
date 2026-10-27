package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryValueBasedRateGroupConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryValueBasedRateGroupConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryValueBasedRateGroupConnection"));
  }

  public DeliveryValueBasedRateGroupConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryValueBasedRateGroupEdgeProjection<DeliveryValueBasedRateGroupConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     DeliveryValueBasedRateGroupEdgeProjection<DeliveryValueBasedRateGroupConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryValueBasedRateGroupEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public DeliveryValueBasedRateGroupProjection<DeliveryValueBasedRateGroupConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     DeliveryValueBasedRateGroupProjection<DeliveryValueBasedRateGroupConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryValueBasedRateGroupProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<DeliveryValueBasedRateGroupConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<DeliveryValueBasedRateGroupConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
