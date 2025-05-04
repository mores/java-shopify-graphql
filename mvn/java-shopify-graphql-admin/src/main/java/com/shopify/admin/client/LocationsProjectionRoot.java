package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocationsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocationsProjectionRoot() {
    super(null, null, java.util.Optional.of("LocationConnection"));
  }

  public LocationsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationEdgeProjection<LocationsProjectionRoot<PARENT, ROOT>, LocationsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    LocationEdgeProjection<LocationsProjectionRoot<PARENT, ROOT>, LocationsProjectionRoot<PARENT, ROOT>> projection = new LocationEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public LocationProjection<LocationsProjectionRoot<PARENT, ROOT>, LocationsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    LocationProjection<LocationsProjectionRoot<PARENT, ROOT>, LocationsProjectionRoot<PARENT, ROOT>> projection = new LocationProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<LocationsProjectionRoot<PARENT, ROOT>, LocationsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<LocationsProjectionRoot<PARENT, ROOT>, LocationsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
