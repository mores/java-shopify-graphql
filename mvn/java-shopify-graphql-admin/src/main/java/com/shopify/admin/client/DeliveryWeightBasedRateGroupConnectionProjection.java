package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryWeightBasedRateGroupConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryWeightBasedRateGroupConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryWeightBasedRateGroupConnection"));
  }

  public DeliveryWeightBasedRateGroupConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryWeightBasedRateGroupEdgeProjection<DeliveryWeightBasedRateGroupConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     DeliveryWeightBasedRateGroupEdgeProjection<DeliveryWeightBasedRateGroupConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryWeightBasedRateGroupEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public DeliveryWeightBasedRateGroupProjection<DeliveryWeightBasedRateGroupConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     DeliveryWeightBasedRateGroupProjection<DeliveryWeightBasedRateGroupConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryWeightBasedRateGroupProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<DeliveryWeightBasedRateGroupConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<DeliveryWeightBasedRateGroupConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
