package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentMandateResourceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentMandateResourceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaymentMandateResource"));
  }

  public PaymentMandateResourceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MandateResourceTypeProjection<PaymentMandateResourceProjection<PARENT, ROOT>, ROOT> resourceType(
      ) {
     MandateResourceTypeProjection<PaymentMandateResourceProjection<PARENT, ROOT>, ROOT> projection = new MandateResourceTypeProjection<>(this, getRoot());
     getFields().put("resourceType", projection);
     return projection;
  }

  public PaymentMandateResourceProjection<PARENT, ROOT> resourceId() {
    getFields().put("resourceId", null);
    return this;
  }
}
