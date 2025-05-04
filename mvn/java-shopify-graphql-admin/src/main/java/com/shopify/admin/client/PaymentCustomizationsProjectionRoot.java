package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentCustomizationsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentCustomizationsProjectionRoot() {
    super(null, null, java.util.Optional.of("PaymentCustomizationConnection"));
  }

  public PaymentCustomizationsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PaymentCustomizationEdgeProjection<PaymentCustomizationsProjectionRoot<PARENT, ROOT>, PaymentCustomizationsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    PaymentCustomizationEdgeProjection<PaymentCustomizationsProjectionRoot<PARENT, ROOT>, PaymentCustomizationsProjectionRoot<PARENT, ROOT>> projection = new PaymentCustomizationEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public PaymentCustomizationProjection<PaymentCustomizationsProjectionRoot<PARENT, ROOT>, PaymentCustomizationsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    PaymentCustomizationProjection<PaymentCustomizationsProjectionRoot<PARENT, ROOT>, PaymentCustomizationsProjectionRoot<PARENT, ROOT>> projection = new PaymentCustomizationProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<PaymentCustomizationsProjectionRoot<PARENT, ROOT>, PaymentCustomizationsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<PaymentCustomizationsProjectionRoot<PARENT, ROOT>, PaymentCustomizationsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
