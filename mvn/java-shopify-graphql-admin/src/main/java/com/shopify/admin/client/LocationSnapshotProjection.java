package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocationSnapshotProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocationSnapshotProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LocationSnapshot"));
  }

  public LocationSnapshotProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationAddressProjection<LocationSnapshotProjection<PARENT, ROOT>, ROOT> address() {
     LocationAddressProjection<LocationSnapshotProjection<PARENT, ROOT>, ROOT> projection = new LocationAddressProjection<>(this, getRoot());
     getFields().put("address", projection);
     return projection;
  }

  public LocationProjection<LocationSnapshotProjection<PARENT, ROOT>, ROOT> location() {
     LocationProjection<LocationSnapshotProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public LocationSnapshotProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public LocationSnapshotProjection<PARENT, ROOT> snapshottedAt() {
    getFields().put("snapshottedAt", null);
    return this;
  }
}
