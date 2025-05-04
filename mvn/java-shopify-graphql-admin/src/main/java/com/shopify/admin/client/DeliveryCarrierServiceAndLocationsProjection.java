package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryCarrierServiceAndLocationsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryCarrierServiceAndLocationsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryCarrierServiceAndLocations"));
  }

  public DeliveryCarrierServiceAndLocationsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryCarrierServiceProjection<DeliveryCarrierServiceAndLocationsProjection<PARENT, ROOT>, ROOT> carrierService(
      ) {
     DeliveryCarrierServiceProjection<DeliveryCarrierServiceAndLocationsProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCarrierServiceProjection<>(this, getRoot());
     getFields().put("carrierService", projection);
     return projection;
  }

  public LocationProjection<DeliveryCarrierServiceAndLocationsProjection<PARENT, ROOT>, ROOT> locations(
      ) {
     LocationProjection<DeliveryCarrierServiceAndLocationsProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("locations", projection);
     return projection;
  }
}
