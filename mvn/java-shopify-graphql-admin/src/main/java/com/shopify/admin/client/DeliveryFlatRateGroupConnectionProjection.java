package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryFlatRateGroupConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryFlatRateGroupConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryFlatRateGroupConnection"));
  }

  public DeliveryFlatRateGroupConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryFlatRateGroupEdgeProjection<DeliveryFlatRateGroupConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     DeliveryFlatRateGroupEdgeProjection<DeliveryFlatRateGroupConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryFlatRateGroupEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public DeliveryFlatRateGroupProjection<DeliveryFlatRateGroupConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     DeliveryFlatRateGroupProjection<DeliveryFlatRateGroupConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryFlatRateGroupProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<DeliveryFlatRateGroupConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<DeliveryFlatRateGroupConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
