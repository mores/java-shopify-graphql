package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class RequestedOrderEditLineItemFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public RequestedOrderEditLineItemFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RequestedOrderEditLineItem"));
  }

  public RequestedOrderEditLineItemFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LineItemProjection<RequestedOrderEditLineItemFragmentProjection<PARENT, ROOT>, ROOT> lineItem(
      ) {
     LineItemProjection<RequestedOrderEditLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new LineItemProjection<>(this, getRoot());
     getFields().put("lineItem", projection);
     return projection;
  }

  public RequestedOrderEditLineItemFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public RequestedOrderEditLineItemFragmentProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public RequestedOrderEditLineItemFragmentProjection<PARENT, ROOT> resolvedQuantity() {
    getFields().put("resolvedQuantity", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on RequestedOrderEditLineItem {");
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
