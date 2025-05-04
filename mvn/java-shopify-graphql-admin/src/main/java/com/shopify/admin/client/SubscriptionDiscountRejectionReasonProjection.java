package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionDiscountRejectionReasonProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionDiscountRejectionReasonProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionDiscountRejectionReason"));
  }

  public SubscriptionDiscountRejectionReasonProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
