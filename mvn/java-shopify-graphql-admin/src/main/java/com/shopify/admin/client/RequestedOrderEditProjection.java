package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RequestedOrderEditProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RequestedOrderEditProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RequestedOrderEdit"));
  }

  public RequestedOrderEditProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RequestedOrderEditLineItemsProjection<RequestedOrderEditProjection<PARENT, ROOT>, ROOT> lineItems(
      ) {
     RequestedOrderEditLineItemsProjection<RequestedOrderEditProjection<PARENT, ROOT>, ROOT> projection = new RequestedOrderEditLineItemsProjection<>(this, getRoot());
     getFields().put("lineItems", projection);
     return projection;
  }

  public OrderProjection<RequestedOrderEditProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<RequestedOrderEditProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public RequestedOrderEditStatusProjection<RequestedOrderEditProjection<PARENT, ROOT>, ROOT> status(
      ) {
     RequestedOrderEditStatusProjection<RequestedOrderEditProjection<PARENT, ROOT>, ROOT> projection = new RequestedOrderEditStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public RequestedOrderEditProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public RequestedOrderEditProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public RequestedOrderEditProjection<PARENT, ROOT> requestDeclinedAt() {
    getFields().put("requestDeclinedAt", null);
    return this;
  }

  public RequestedOrderEditProjection<PARENT, ROOT> requestResolvedAt() {
    getFields().put("requestResolvedAt", null);
    return this;
  }

  public RequestedOrderEditProjection<PARENT, ROOT> requestedAt() {
    getFields().put("requestedAt", null);
    return this;
  }

  public RequestedOrderEditProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
