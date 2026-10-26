package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ShippingLabelFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ShippingLabelFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShippingLabel"));
  }

  public ShippingLabelFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationProjection<ShippingLabelFragmentProjection<PARENT, ROOT>, ROOT> location() {
     LocationProjection<ShippingLabelFragmentProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public ShippingObjectsShippingDocumentProjection<ShippingLabelFragmentProjection<PARENT, ROOT>, ROOT> shippingDocuments(
      ) {
     ShippingObjectsShippingDocumentProjection<ShippingLabelFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShippingObjectsShippingDocumentProjection<>(this, getRoot());
     getFields().put("shippingDocuments", projection);
     return projection;
  }

  public FulfillmentTrackingInfoProjection<ShippingLabelFragmentProjection<PARENT, ROOT>, ROOT> trackingInfo(
      ) {
     FulfillmentTrackingInfoProjection<ShippingLabelFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentTrackingInfoProjection<>(this, getRoot());
     getFields().put("trackingInfo", projection);
     return projection;
  }

  public ShippingLabelFragmentProjection<PARENT, ROOT> cancellable() {
    getFields().put("cancellable", null);
    return this;
  }

  public ShippingLabelFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShippingLabelFragmentProjection<PARENT, ROOT> printed() {
    getFields().put("printed", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ShippingLabel {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
