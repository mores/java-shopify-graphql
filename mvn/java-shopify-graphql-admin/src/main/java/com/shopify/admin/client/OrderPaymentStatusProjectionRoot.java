package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderPaymentStatusProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderPaymentStatusProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderPaymentStatus"));
  }

  public OrderPaymentStatusProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderPaymentStatusResultProjection<OrderPaymentStatusProjectionRoot<PARENT, ROOT>, OrderPaymentStatusProjectionRoot<PARENT, ROOT>> status(
      ) {
    OrderPaymentStatusResultProjection<OrderPaymentStatusProjectionRoot<PARENT, ROOT>, OrderPaymentStatusProjectionRoot<PARENT, ROOT>> projection = new OrderPaymentStatusResultProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public OrderTransactionProjection<OrderPaymentStatusProjectionRoot<PARENT, ROOT>, OrderPaymentStatusProjectionRoot<PARENT, ROOT>> transactions(
      ) {
    OrderTransactionProjection<OrderPaymentStatusProjectionRoot<PARENT, ROOT>, OrderPaymentStatusProjectionRoot<PARENT, ROOT>> projection = new OrderTransactionProjection<>(this, this);    
    getFields().put("transactions", projection);
    return projection;
  }

  public OrderPaymentStatusProjectionRoot<PARENT, ROOT> errorMessage() {
    getFields().put("errorMessage", null);
    return this;
  }

  public OrderPaymentStatusProjectionRoot<PARENT, ROOT> paymentReferenceId() {
    getFields().put("paymentReferenceId", null);
    return this;
  }

  public OrderPaymentStatusProjectionRoot<PARENT, ROOT> translatedErrorMessage() {
    getFields().put("translatedErrorMessage", null);
    return this;
  }
}
