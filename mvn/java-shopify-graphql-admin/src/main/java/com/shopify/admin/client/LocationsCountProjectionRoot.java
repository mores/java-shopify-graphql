package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocationsCountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocationsCountProjectionRoot() {
    super(null, null, java.util.Optional.of("Count"));
  }

  public LocationsCountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountPrecisionProjection<LocationsCountProjectionRoot<PARENT, ROOT>, LocationsCountProjectionRoot<PARENT, ROOT>> precision(
      ) {
    CountPrecisionProjection<LocationsCountProjectionRoot<PARENT, ROOT>, LocationsCountProjectionRoot<PARENT, ROOT>> projection = new CountPrecisionProjection<>(this, this);    
    getFields().put("precision", projection);
    return projection;
  }

  public LocationsCountProjectionRoot<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }
}
