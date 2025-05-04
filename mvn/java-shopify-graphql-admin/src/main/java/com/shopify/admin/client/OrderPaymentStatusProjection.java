package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderPaymentStatusProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderPaymentStatusProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderPaymentStatus"));
  }

  public OrderPaymentStatusProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderPaymentStatusResultProjection<OrderPaymentStatusProjection<PARENT, ROOT>, ROOT> status(
      ) {
     OrderPaymentStatusResultProjection<OrderPaymentStatusProjection<PARENT, ROOT>, ROOT> projection = new OrderPaymentStatusResultProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public OrderTransactionProjection<OrderPaymentStatusProjection<PARENT, ROOT>, ROOT> transactions(
      ) {
     OrderTransactionProjection<OrderPaymentStatusProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionProjection<>(this, getRoot());
     getFields().put("transactions", projection);
     return projection;
  }

  public OrderPaymentStatusProjection<PARENT, ROOT> errorMessage() {
    getFields().put("errorMessage", null);
    return this;
  }

  public OrderPaymentStatusProjection<PARENT, ROOT> paymentReferenceId() {
    getFields().put("paymentReferenceId", null);
    return this;
  }

  public OrderPaymentStatusProjection<PARENT, ROOT> translatedErrorMessage() {
    getFields().put("translatedErrorMessage", null);
    return this;
  }
}
