package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocationsAvailableForDeliveryProfilesConnectionProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocationsAvailableForDeliveryProfilesConnectionProjectionRoot() {
    super(null, null, java.util.Optional.of("LocationConnection"));
  }

  public LocationsAvailableForDeliveryProfilesConnectionProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationEdgeProjection<LocationsAvailableForDeliveryProfilesConnectionProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesConnectionProjectionRoot<PARENT, ROOT>> edges(
      ) {
    LocationEdgeProjection<LocationsAvailableForDeliveryProfilesConnectionProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesConnectionProjectionRoot<PARENT, ROOT>> projection = new LocationEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public LocationProjection<LocationsAvailableForDeliveryProfilesConnectionProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesConnectionProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    LocationProjection<LocationsAvailableForDeliveryProfilesConnectionProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesConnectionProjectionRoot<PARENT, ROOT>> projection = new LocationProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<LocationsAvailableForDeliveryProfilesConnectionProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesConnectionProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<LocationsAvailableForDeliveryProfilesConnectionProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesConnectionProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
