package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderCancelJobResultProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderCancelJobResultProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderCancelJobResult"));
  }

  public OrderCancelJobResultProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderCancelUserErrorProjection<OrderCancelJobResultProjection<PARENT, ROOT>, ROOT> errors(
      ) {
     OrderCancelUserErrorProjection<OrderCancelJobResultProjection<PARENT, ROOT>, ROOT> projection = new OrderCancelUserErrorProjection<>(this, getRoot());
     getFields().put("errors", projection);
     return projection;
  }

  public OrderProjection<OrderCancelJobResultProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<OrderCancelJobResultProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public OrderCancelStatusProjection<OrderCancelJobResultProjection<PARENT, ROOT>, ROOT> status() {
     OrderCancelStatusProjection<OrderCancelJobResultProjection<PARENT, ROOT>, ROOT> projection = new OrderCancelStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public OrderCancelJobResultProjection<PARENT, ROOT> done() {
    getFields().put("done", null);
    return this;
  }

  public OrderCancelJobResultProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
