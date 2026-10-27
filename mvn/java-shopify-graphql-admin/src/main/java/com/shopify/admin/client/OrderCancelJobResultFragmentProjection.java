package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class OrderCancelJobResultFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public OrderCancelJobResultFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderCancelJobResult"));
  }

  public OrderCancelJobResultFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderCancelUserErrorProjection<OrderCancelJobResultFragmentProjection<PARENT, ROOT>, ROOT> errors(
      ) {
     OrderCancelUserErrorProjection<OrderCancelJobResultFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderCancelUserErrorProjection<>(this, getRoot());
     getFields().put("errors", projection);
     return projection;
  }

  public OrderProjection<OrderCancelJobResultFragmentProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<OrderCancelJobResultFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public OrderCancelStatusProjection<OrderCancelJobResultFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     OrderCancelStatusProjection<OrderCancelJobResultFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderCancelStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public OrderCancelJobResultFragmentProjection<PARENT, ROOT> done() {
    getFields().put("done", null);
    return this;
  }

  public OrderCancelJobResultFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on OrderCancelJobResult {");
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
