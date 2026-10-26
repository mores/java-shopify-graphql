package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShippingLabelProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShippingLabelProjectionRoot() {
    super(null, null, java.util.Optional.of("ShippingLabel"));
  }

  public ShippingLabelProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationProjection<ShippingLabelProjectionRoot<PARENT, ROOT>, ShippingLabelProjectionRoot<PARENT, ROOT>> location(
      ) {
    LocationProjection<ShippingLabelProjectionRoot<PARENT, ROOT>, ShippingLabelProjectionRoot<PARENT, ROOT>> projection = new LocationProjection<>(this, this);    
    getFields().put("location", projection);
    return projection;
  }

  public ShippingObjectsShippingDocumentProjection<ShippingLabelProjectionRoot<PARENT, ROOT>, ShippingLabelProjectionRoot<PARENT, ROOT>> shippingDocuments(
      ) {
    ShippingObjectsShippingDocumentProjection<ShippingLabelProjectionRoot<PARENT, ROOT>, ShippingLabelProjectionRoot<PARENT, ROOT>> projection = new ShippingObjectsShippingDocumentProjection<>(this, this);    
    getFields().put("shippingDocuments", projection);
    return projection;
  }

  public FulfillmentTrackingInfoProjection<ShippingLabelProjectionRoot<PARENT, ROOT>, ShippingLabelProjectionRoot<PARENT, ROOT>> trackingInfo(
      ) {
    FulfillmentTrackingInfoProjection<ShippingLabelProjectionRoot<PARENT, ROOT>, ShippingLabelProjectionRoot<PARENT, ROOT>> projection = new FulfillmentTrackingInfoProjection<>(this, this);    
    getFields().put("trackingInfo", projection);
    return projection;
  }

  public ShippingLabelProjectionRoot<PARENT, ROOT> cancellable() {
    getFields().put("cancellable", null);
    return this;
  }

  public ShippingLabelProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShippingLabelProjectionRoot<PARENT, ROOT> printed() {
    getFields().put("printed", null);
    return this;
  }
}
