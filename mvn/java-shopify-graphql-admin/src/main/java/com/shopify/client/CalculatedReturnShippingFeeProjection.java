package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CalculatedReturnShippingFeeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CalculatedReturnShippingFeeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CalculatedReturnShippingFee"));
  }

  public CalculatedReturnShippingFeeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<CalculatedReturnShippingFeeProjection<PARENT, ROOT>, ROOT> amountSet() {
     MoneyBagProjection<CalculatedReturnShippingFeeProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("amountSet", projection);
     return projection;
  }

  public CalculatedReturnShippingFeeProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
