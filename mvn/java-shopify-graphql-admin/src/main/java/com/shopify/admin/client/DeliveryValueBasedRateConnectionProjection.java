package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryValueBasedRateConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryValueBasedRateConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryValueBasedRateConnection"));
  }

  public DeliveryValueBasedRateConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryValueBasedRateEdgeProjection<DeliveryValueBasedRateConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     DeliveryValueBasedRateEdgeProjection<DeliveryValueBasedRateConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryValueBasedRateEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public DeliveryValueBasedRateProjection<DeliveryValueBasedRateConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     DeliveryValueBasedRateProjection<DeliveryValueBasedRateConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryValueBasedRateProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<DeliveryValueBasedRateConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<DeliveryValueBasedRateConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
