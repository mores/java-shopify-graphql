package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StoreAvailabilityProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StoreAvailabilityProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StoreAvailability"));
  }

  public StoreAvailabilityProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationProjection<StoreAvailabilityProjection<PARENT, ROOT>, ROOT> location() {
     LocationProjection<StoreAvailabilityProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public StoreAvailabilityProjection<PARENT, ROOT> available() {
    getFields().put("available", null);
    return this;
  }

  public StoreAvailabilityProjection<PARENT, ROOT> pickUpTime() {
    getFields().put("pickUpTime", null);
    return this;
  }

  public StoreAvailabilityProjection<PARENT, ROOT> quantityAvailable() {
    getFields().put("quantityAvailable", null);
    return this;
  }
}
