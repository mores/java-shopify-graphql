package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderCreateMandatePaymentJobResultProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderCreateMandatePaymentJobResultProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderCreateMandatePaymentJobResult"));
  }

  public OrderCreateMandatePaymentJobResultProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<OrderCreateMandatePaymentJobResultProjection<PARENT, ROOT>, ROOT> errors(
      ) {
     UserErrorProjection<OrderCreateMandatePaymentJobResultProjection<PARENT, ROOT>, ROOT> projection = new UserErrorProjection<>(this, getRoot());
     getFields().put("errors", projection);
     return projection;
  }

  public OrderProjection<OrderCreateMandatePaymentJobResultProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<OrderCreateMandatePaymentJobResultProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public OrderCreateMandatePaymentStatusProjection<OrderCreateMandatePaymentJobResultProjection<PARENT, ROOT>, ROOT> status(
      ) {
     OrderCreateMandatePaymentStatusProjection<OrderCreateMandatePaymentJobResultProjection<PARENT, ROOT>, ROOT> projection = new OrderCreateMandatePaymentStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public OrderCreateMandatePaymentJobResultProjection<PARENT, ROOT> done() {
    getFields().put("done", null);
    return this;
  }

  public OrderCreateMandatePaymentJobResultProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
