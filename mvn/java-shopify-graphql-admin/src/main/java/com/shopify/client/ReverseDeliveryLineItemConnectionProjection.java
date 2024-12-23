package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReverseDeliveryLineItemConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReverseDeliveryLineItemConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReverseDeliveryLineItemConnection"));
  }

  public ReverseDeliveryLineItemConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReverseDeliveryLineItemEdgeProjection<ReverseDeliveryLineItemConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     ReverseDeliveryLineItemEdgeProjection<ReverseDeliveryLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new ReverseDeliveryLineItemEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ReverseDeliveryLineItemProjection<ReverseDeliveryLineItemConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     ReverseDeliveryLineItemProjection<ReverseDeliveryLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new ReverseDeliveryLineItemProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ReverseDeliveryLineItemConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<ReverseDeliveryLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
