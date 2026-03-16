package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PickupInStoreLocationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PickupInStoreLocationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PickupInStoreLocation"));
  }

  public PickupInStoreLocationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DistanceProjection<PickupInStoreLocationProjection<PARENT, ROOT>, ROOT> distanceFromBuyer(
      ) {
     DistanceProjection<PickupInStoreLocationProjection<PARENT, ROOT>, ROOT> projection = new DistanceProjection<>(this, getRoot());
     getFields().put("distanceFromBuyer", projection);
     return projection;
  }

  public PickupInStoreLocationProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }

  public PickupInStoreLocationProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public PickupInStoreLocationProjection<PARENT, ROOT> instructions() {
    getFields().put("instructions", null);
    return this;
  }

  public PickupInStoreLocationProjection<PARENT, ROOT> locationId() {
    getFields().put("locationId", null);
    return this;
  }

  public PickupInStoreLocationProjection<PARENT, ROOT> source() {
    getFields().put("source", null);
    return this;
  }

  public PickupInStoreLocationProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
