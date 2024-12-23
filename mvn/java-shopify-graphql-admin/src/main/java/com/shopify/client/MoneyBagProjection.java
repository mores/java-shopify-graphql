package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MoneyBagProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MoneyBagProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MoneyBag"));
  }

  public MoneyBagProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<MoneyBagProjection<PARENT, ROOT>, ROOT> presentmentMoney() {
     MoneyV2Projection<MoneyBagProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("presentmentMoney", projection);
     return projection;
  }

  public MoneyV2Projection<MoneyBagProjection<PARENT, ROOT>, ROOT> shopMoney() {
     MoneyV2Projection<MoneyBagProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("shopMoney", projection);
     return projection;
  }
}
