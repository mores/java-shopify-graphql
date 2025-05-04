package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryProfileItemConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryProfileItemConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryProfileItemConnection"));
  }

  public DeliveryProfileItemConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryProfileItemEdgeProjection<DeliveryProfileItemConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     DeliveryProfileItemEdgeProjection<DeliveryProfileItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProfileItemEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public DeliveryProfileItemProjection<DeliveryProfileItemConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     DeliveryProfileItemProjection<DeliveryProfileItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProfileItemProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<DeliveryProfileItemConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<DeliveryProfileItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
