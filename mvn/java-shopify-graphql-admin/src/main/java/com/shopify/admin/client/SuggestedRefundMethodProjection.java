package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SuggestedRefundMethodProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SuggestedRefundMethodProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SuggestedRefundMethod"));
  }

  public SuggestedRefundMethodProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<SuggestedRefundMethodProjection<PARENT, ROOT>, ROOT> amount() {
     MoneyBagProjection<SuggestedRefundMethodProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public MoneyBagProjection<SuggestedRefundMethodProjection<PARENT, ROOT>, ROOT> maximumRefundable(
      ) {
     MoneyBagProjection<SuggestedRefundMethodProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("maximumRefundable", projection);
     return projection;
  }

  public SuggestedStoreCreditRefundFragmentProjection<SuggestedRefundMethodProjection<PARENT, ROOT>, ROOT> onSuggestedStoreCreditRefund(
      ) {
    SuggestedStoreCreditRefundFragmentProjection<SuggestedRefundMethodProjection<PARENT, ROOT>, ROOT> fragment = new SuggestedStoreCreditRefundFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
