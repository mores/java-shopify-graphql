package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderPaymentCollectionDetailsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderPaymentCollectionDetailsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderPaymentCollectionDetails"));
  }

  public OrderPaymentCollectionDetailsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PaymentMandateProjection<OrderPaymentCollectionDetailsProjection<PARENT, ROOT>, ROOT> vaultedPaymentMethods(
      ) {
     PaymentMandateProjection<OrderPaymentCollectionDetailsProjection<PARENT, ROOT>, ROOT> projection = new PaymentMandateProjection<>(this, getRoot());
     getFields().put("vaultedPaymentMethods", projection);
     return projection;
  }

  public OrderPaymentCollectionDetailsProjection<PARENT, ROOT> additionalPaymentCollectionUrl() {
    getFields().put("additionalPaymentCollectionUrl", null);
    return this;
  }
}
