package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionAppliedCodeDiscountProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionAppliedCodeDiscountProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionAppliedCodeDiscount"));
  }

  public SubscriptionAppliedCodeDiscountProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionDiscountRejectionReasonProjection<SubscriptionAppliedCodeDiscountProjection<PARENT, ROOT>, ROOT> rejectionReason(
      ) {
     SubscriptionDiscountRejectionReasonProjection<SubscriptionAppliedCodeDiscountProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountRejectionReasonProjection<>(this, getRoot());
     getFields().put("rejectionReason", projection);
     return projection;
  }

  public SubscriptionAppliedCodeDiscountProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SubscriptionAppliedCodeDiscountProjection<PARENT, ROOT> redeemCode() {
    getFields().put("redeemCode", null);
    return this;
  }
}
