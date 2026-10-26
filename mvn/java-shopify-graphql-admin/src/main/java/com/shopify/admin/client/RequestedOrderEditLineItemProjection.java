package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RequestedOrderEditLineItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RequestedOrderEditLineItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RequestedOrderEditLineItem"));
  }

  public RequestedOrderEditLineItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LineItemProjection<RequestedOrderEditLineItemProjection<PARENT, ROOT>, ROOT> lineItem() {
     LineItemProjection<RequestedOrderEditLineItemProjection<PARENT, ROOT>, ROOT> projection = new LineItemProjection<>(this, getRoot());
     getFields().put("lineItem", projection);
     return projection;
  }

  public RequestedOrderEditLineItemProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public RequestedOrderEditLineItemProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public RequestedOrderEditLineItemProjection<PARENT, ROOT> resolvedQuantity() {
    getFields().put("resolvedQuantity", null);
    return this;
  }
}
