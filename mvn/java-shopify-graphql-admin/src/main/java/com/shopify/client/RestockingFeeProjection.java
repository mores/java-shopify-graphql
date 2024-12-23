package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RestockingFeeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RestockingFeeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RestockingFee"));
  }

  public RestockingFeeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<RestockingFeeProjection<PARENT, ROOT>, ROOT> amountSet() {
     MoneyBagProjection<RestockingFeeProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("amountSet", projection);
     return projection;
  }

  public RestockingFeeProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public RestockingFeeProjection<PARENT, ROOT> percentage() {
    getFields().put("percentage", null);
    return this;
  }
}
