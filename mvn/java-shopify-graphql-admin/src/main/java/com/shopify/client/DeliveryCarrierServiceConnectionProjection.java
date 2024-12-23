package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryCarrierServiceConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryCarrierServiceConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryCarrierServiceConnection"));
  }

  public DeliveryCarrierServiceConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryCarrierServiceEdgeProjection<DeliveryCarrierServiceConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     DeliveryCarrierServiceEdgeProjection<DeliveryCarrierServiceConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCarrierServiceEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public DeliveryCarrierServiceProjection<DeliveryCarrierServiceConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     DeliveryCarrierServiceProjection<DeliveryCarrierServiceConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCarrierServiceProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<DeliveryCarrierServiceConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<DeliveryCarrierServiceConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
