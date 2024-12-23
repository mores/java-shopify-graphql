package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CalculatedRestockingFeeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CalculatedRestockingFeeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CalculatedRestockingFee"));
  }

  public CalculatedRestockingFeeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<CalculatedRestockingFeeProjection<PARENT, ROOT>, ROOT> amountSet() {
     MoneyBagProjection<CalculatedRestockingFeeProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("amountSet", projection);
     return projection;
  }

  public CalculatedRestockingFeeProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CalculatedRestockingFeeProjection<PARENT, ROOT> percentage() {
    getFields().put("percentage", null);
    return this;
  }
}
