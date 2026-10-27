package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class OrderCreateMandatePaymentJobResultFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public OrderCreateMandatePaymentJobResultFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderCreateMandatePaymentJobResult"));
  }

  public OrderCreateMandatePaymentJobResultFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<OrderCreateMandatePaymentJobResultFragmentProjection<PARENT, ROOT>, ROOT> errors(
      ) {
     UserErrorProjection<OrderCreateMandatePaymentJobResultFragmentProjection<PARENT, ROOT>, ROOT> projection = new UserErrorProjection<>(this, getRoot());
     getFields().put("errors", projection);
     return projection;
  }

  public OrderProjection<OrderCreateMandatePaymentJobResultFragmentProjection<PARENT, ROOT>, ROOT> order(
      ) {
     OrderProjection<OrderCreateMandatePaymentJobResultFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public OrderCreateMandatePaymentStatusProjection<OrderCreateMandatePaymentJobResultFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     OrderCreateMandatePaymentStatusProjection<OrderCreateMandatePaymentJobResultFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderCreateMandatePaymentStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public OrderCreateMandatePaymentJobResultFragmentProjection<PARENT, ROOT> done() {
    getFields().put("done", null);
    return this;
  }

  public OrderCreateMandatePaymentJobResultFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on OrderCreateMandatePaymentJobResult {");
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
