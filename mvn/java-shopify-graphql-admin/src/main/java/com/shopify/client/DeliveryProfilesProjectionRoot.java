package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryProfilesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryProfilesProjectionRoot() {
    super(null, null, java.util.Optional.of("DeliveryProfileConnection"));
  }

  public DeliveryProfilesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryProfileEdgeProjection<DeliveryProfilesProjectionRoot<PARENT, ROOT>, DeliveryProfilesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    DeliveryProfileEdgeProjection<DeliveryProfilesProjectionRoot<PARENT, ROOT>, DeliveryProfilesProjectionRoot<PARENT, ROOT>> projection = new DeliveryProfileEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public DeliveryProfileProjection<DeliveryProfilesProjectionRoot<PARENT, ROOT>, DeliveryProfilesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    DeliveryProfileProjection<DeliveryProfilesProjectionRoot<PARENT, ROOT>, DeliveryProfilesProjectionRoot<PARENT, ROOT>> projection = new DeliveryProfileProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<DeliveryProfilesProjectionRoot<PARENT, ROOT>, DeliveryProfilesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<DeliveryProfilesProjectionRoot<PARENT, ROOT>, DeliveryProfilesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
