package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryZoneProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryZoneProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryZone"));
  }

  public DeliveryZoneProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryCountryProjection<DeliveryZoneProjection<PARENT, ROOT>, ROOT> countries() {
     DeliveryCountryProjection<DeliveryZoneProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCountryProjection<>(this, getRoot());
     getFields().put("countries", projection);
     return projection;
  }

  public DeliveryZoneProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DeliveryZoneProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
