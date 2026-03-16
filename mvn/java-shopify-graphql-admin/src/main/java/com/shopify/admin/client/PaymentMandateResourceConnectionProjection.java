package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentMandateResourceConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentMandateResourceConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaymentMandateResourceConnection"));
  }

  public PaymentMandateResourceConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PaymentMandateResourceEdgeProjection<PaymentMandateResourceConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     PaymentMandateResourceEdgeProjection<PaymentMandateResourceConnectionProjection<PARENT, ROOT>, ROOT> projection = new PaymentMandateResourceEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public PaymentMandateResourceProjection<PaymentMandateResourceConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     PaymentMandateResourceProjection<PaymentMandateResourceConnectionProjection<PARENT, ROOT>, ROOT> projection = new PaymentMandateResourceProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<PaymentMandateResourceConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<PaymentMandateResourceConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
