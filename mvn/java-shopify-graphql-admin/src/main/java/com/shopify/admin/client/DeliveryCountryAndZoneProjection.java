package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryCountryAndZoneProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryCountryAndZoneProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryCountryAndZone"));
  }

  public DeliveryCountryAndZoneProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryCountryProjection<DeliveryCountryAndZoneProjection<PARENT, ROOT>, ROOT> country() {
     DeliveryCountryProjection<DeliveryCountryAndZoneProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCountryProjection<>(this, getRoot());
     getFields().put("country", projection);
     return projection;
  }

  public DeliveryCountryAndZoneProjection<PARENT, ROOT> zone() {
    getFields().put("zone", null);
    return this;
  }
}
