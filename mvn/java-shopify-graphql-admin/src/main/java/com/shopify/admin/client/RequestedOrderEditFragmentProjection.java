package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class RequestedOrderEditFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public RequestedOrderEditFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RequestedOrderEdit"));
  }

  public RequestedOrderEditFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RequestedOrderEditLineItemsProjection<RequestedOrderEditFragmentProjection<PARENT, ROOT>, ROOT> lineItems(
      ) {
     RequestedOrderEditLineItemsProjection<RequestedOrderEditFragmentProjection<PARENT, ROOT>, ROOT> projection = new RequestedOrderEditLineItemsProjection<>(this, getRoot());
     getFields().put("lineItems", projection);
     return projection;
  }

  public OrderProjection<RequestedOrderEditFragmentProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<RequestedOrderEditFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public RequestedOrderEditStatusProjection<RequestedOrderEditFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     RequestedOrderEditStatusProjection<RequestedOrderEditFragmentProjection<PARENT, ROOT>, ROOT> projection = new RequestedOrderEditStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public RequestedOrderEditFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public RequestedOrderEditFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public RequestedOrderEditFragmentProjection<PARENT, ROOT> requestDeclinedAt() {
    getFields().put("requestDeclinedAt", null);
    return this;
  }

  public RequestedOrderEditFragmentProjection<PARENT, ROOT> requestResolvedAt() {
    getFields().put("requestResolvedAt", null);
    return this;
  }

  public RequestedOrderEditFragmentProjection<PARENT, ROOT> requestedAt() {
    getFields().put("requestedAt", null);
    return this;
  }

  public RequestedOrderEditFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on RequestedOrderEdit {");
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
