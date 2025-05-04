package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryLocationGroupZoneEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryLocationGroupZoneEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryLocationGroupZoneEdge"));
  }

  public DeliveryLocationGroupZoneEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryLocationGroupZoneProjection<DeliveryLocationGroupZoneEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     DeliveryLocationGroupZoneProjection<DeliveryLocationGroupZoneEdgeProjection<PARENT, ROOT>, ROOT> projection = new DeliveryLocationGroupZoneProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public DeliveryLocationGroupZoneEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
