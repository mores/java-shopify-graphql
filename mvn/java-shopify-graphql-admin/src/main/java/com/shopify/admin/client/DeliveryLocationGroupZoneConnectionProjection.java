package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryLocationGroupZoneConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryLocationGroupZoneConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryLocationGroupZoneConnection"));
  }

  public DeliveryLocationGroupZoneConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryLocationGroupZoneEdgeProjection<DeliveryLocationGroupZoneConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     DeliveryLocationGroupZoneEdgeProjection<DeliveryLocationGroupZoneConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryLocationGroupZoneEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public DeliveryLocationGroupZoneProjection<DeliveryLocationGroupZoneConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     DeliveryLocationGroupZoneProjection<DeliveryLocationGroupZoneConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryLocationGroupZoneProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<DeliveryLocationGroupZoneConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<DeliveryLocationGroupZoneConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
