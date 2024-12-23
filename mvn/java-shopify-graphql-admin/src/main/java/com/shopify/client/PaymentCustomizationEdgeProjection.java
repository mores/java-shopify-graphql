package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentCustomizationEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentCustomizationEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaymentCustomizationEdge"));
  }

  public PaymentCustomizationEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PaymentCustomizationProjection<PaymentCustomizationEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     PaymentCustomizationProjection<PaymentCustomizationEdgeProjection<PARENT, ROOT>, ROOT> projection = new PaymentCustomizationProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public PaymentCustomizationEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
