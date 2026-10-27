package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryCarrierCalculatedRateGroupConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryCarrierCalculatedRateGroupConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryCarrierCalculatedRateGroupConnection"));
  }

  public DeliveryCarrierCalculatedRateGroupConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryCarrierCalculatedRateGroupEdgeProjection<DeliveryCarrierCalculatedRateGroupConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     DeliveryCarrierCalculatedRateGroupEdgeProjection<DeliveryCarrierCalculatedRateGroupConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCarrierCalculatedRateGroupEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public DeliveryCarrierCalculatedRateGroupProjection<DeliveryCarrierCalculatedRateGroupConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     DeliveryCarrierCalculatedRateGroupProjection<DeliveryCarrierCalculatedRateGroupConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCarrierCalculatedRateGroupProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<DeliveryCarrierCalculatedRateGroupConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<DeliveryCarrierCalculatedRateGroupConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
