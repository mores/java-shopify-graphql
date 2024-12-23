package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CarrierServicesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CarrierServicesProjectionRoot() {
    super(null, null, java.util.Optional.of("DeliveryCarrierServiceConnection"));
  }

  public CarrierServicesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryCarrierServiceEdgeProjection<CarrierServicesProjectionRoot<PARENT, ROOT>, CarrierServicesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    DeliveryCarrierServiceEdgeProjection<CarrierServicesProjectionRoot<PARENT, ROOT>, CarrierServicesProjectionRoot<PARENT, ROOT>> projection = new DeliveryCarrierServiceEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public DeliveryCarrierServiceProjection<CarrierServicesProjectionRoot<PARENT, ROOT>, CarrierServicesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    DeliveryCarrierServiceProjection<CarrierServicesProjectionRoot<PARENT, ROOT>, CarrierServicesProjectionRoot<PARENT, ROOT>> projection = new DeliveryCarrierServiceProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<CarrierServicesProjectionRoot<PARENT, ROOT>, CarrierServicesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<CarrierServicesProjectionRoot<PARENT, ROOT>, CarrierServicesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
