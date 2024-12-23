package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentCustomizationConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentCustomizationConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaymentCustomizationConnection"));
  }

  public PaymentCustomizationConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PaymentCustomizationEdgeProjection<PaymentCustomizationConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     PaymentCustomizationEdgeProjection<PaymentCustomizationConnectionProjection<PARENT, ROOT>, ROOT> projection = new PaymentCustomizationEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public PaymentCustomizationProjection<PaymentCustomizationConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     PaymentCustomizationProjection<PaymentCustomizationConnectionProjection<PARENT, ROOT>, ROOT> projection = new PaymentCustomizationProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<PaymentCustomizationConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<PaymentCustomizationConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
