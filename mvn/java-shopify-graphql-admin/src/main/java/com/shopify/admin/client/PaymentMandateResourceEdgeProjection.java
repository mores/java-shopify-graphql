package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentMandateResourceEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentMandateResourceEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaymentMandateResourceEdge"));
  }

  public PaymentMandateResourceEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PaymentMandateResourceProjection<PaymentMandateResourceEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     PaymentMandateResourceProjection<PaymentMandateResourceEdgeProjection<PARENT, ROOT>, ROOT> projection = new PaymentMandateResourceProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public PaymentMandateResourceEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
