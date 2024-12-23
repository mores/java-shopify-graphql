package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReverseDeliveryConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReverseDeliveryConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReverseDeliveryConnection"));
  }

  public ReverseDeliveryConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReverseDeliveryEdgeProjection<ReverseDeliveryConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     ReverseDeliveryEdgeProjection<ReverseDeliveryConnectionProjection<PARENT, ROOT>, ROOT> projection = new ReverseDeliveryEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ReverseDeliveryProjection<ReverseDeliveryConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     ReverseDeliveryProjection<ReverseDeliveryConnectionProjection<PARENT, ROOT>, ROOT> projection = new ReverseDeliveryProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ReverseDeliveryConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<ReverseDeliveryConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
