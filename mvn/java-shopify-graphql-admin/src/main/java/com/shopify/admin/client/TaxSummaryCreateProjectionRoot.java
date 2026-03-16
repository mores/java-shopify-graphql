package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TaxSummaryCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TaxSummaryCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("TaxSummaryCreatePayload"));
  }

  public TaxSummaryCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderProjection<TaxSummaryCreateProjectionRoot<PARENT, ROOT>, TaxSummaryCreateProjectionRoot<PARENT, ROOT>> enqueuedOrders(
      ) {
    OrderProjection<TaxSummaryCreateProjectionRoot<PARENT, ROOT>, TaxSummaryCreateProjectionRoot<PARENT, ROOT>> projection = new OrderProjection<>(this, this);    
    getFields().put("enqueuedOrders", projection);
    return projection;
  }

  public TaxSummaryCreateUserErrorProjection<TaxSummaryCreateProjectionRoot<PARENT, ROOT>, TaxSummaryCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    TaxSummaryCreateUserErrorProjection<TaxSummaryCreateProjectionRoot<PARENT, ROOT>, TaxSummaryCreateProjectionRoot<PARENT, ROOT>> projection = new TaxSummaryCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
