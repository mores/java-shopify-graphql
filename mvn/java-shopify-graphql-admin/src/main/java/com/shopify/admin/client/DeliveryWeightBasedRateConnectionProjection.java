package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryWeightBasedRateConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryWeightBasedRateConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryWeightBasedRateConnection"));
  }

  public DeliveryWeightBasedRateConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryWeightBasedRateEdgeProjection<DeliveryWeightBasedRateConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     DeliveryWeightBasedRateEdgeProjection<DeliveryWeightBasedRateConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryWeightBasedRateEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public DeliveryWeightBasedRateProjection<DeliveryWeightBasedRateConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     DeliveryWeightBasedRateProjection<DeliveryWeightBasedRateConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryWeightBasedRateProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<DeliveryWeightBasedRateConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<DeliveryWeightBasedRateConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
