package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnShippingFeeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnShippingFeeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnShippingFee"));
  }

  public ReturnShippingFeeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<ReturnShippingFeeProjection<PARENT, ROOT>, ROOT> amountSet() {
     MoneyBagProjection<ReturnShippingFeeProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("amountSet", projection);
     return projection;
  }

  public ReturnShippingFeeProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
