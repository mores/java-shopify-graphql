package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RefundDutyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RefundDutyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RefundDuty"));
  }

  public RefundDutyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<RefundDutyProjection<PARENT, ROOT>, ROOT> amountSet() {
     MoneyBagProjection<RefundDutyProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("amountSet", projection);
     return projection;
  }

  public DutyProjection<RefundDutyProjection<PARENT, ROOT>, ROOT> originalDuty() {
     DutyProjection<RefundDutyProjection<PARENT, ROOT>, ROOT> projection = new DutyProjection<>(this, getRoot());
     getFields().put("originalDuty", projection);
     return projection;
  }
}
