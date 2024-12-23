package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryProfileConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryProfileConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryProfileConnection"));
  }

  public DeliveryProfileConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryProfileEdgeProjection<DeliveryProfileConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     DeliveryProfileEdgeProjection<DeliveryProfileConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProfileEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public DeliveryProfileProjection<DeliveryProfileConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     DeliveryProfileProjection<DeliveryProfileConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProfileProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<DeliveryProfileConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<DeliveryProfileConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
