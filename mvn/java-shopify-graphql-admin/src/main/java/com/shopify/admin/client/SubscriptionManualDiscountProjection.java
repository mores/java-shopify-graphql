package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionManualDiscountProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionManualDiscountProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionManualDiscount"));
  }

  public SubscriptionManualDiscountProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionDiscountEntitledLinesProjection<SubscriptionManualDiscountProjection<PARENT, ROOT>, ROOT> entitledLines(
      ) {
     SubscriptionDiscountEntitledLinesProjection<SubscriptionManualDiscountProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountEntitledLinesProjection<>(this, getRoot());
     getFields().put("entitledLines", projection);
     return projection;
  }

  public SubscriptionDiscountRejectionReasonProjection<SubscriptionManualDiscountProjection<PARENT, ROOT>, ROOT> rejectionReason(
      ) {
     SubscriptionDiscountRejectionReasonProjection<SubscriptionManualDiscountProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountRejectionReasonProjection<>(this, getRoot());
     getFields().put("rejectionReason", projection);
     return projection;
  }

  public DiscountTargetTypeProjection<SubscriptionManualDiscountProjection<PARENT, ROOT>, ROOT> targetType(
      ) {
     DiscountTargetTypeProjection<SubscriptionManualDiscountProjection<PARENT, ROOT>, ROOT> projection = new DiscountTargetTypeProjection<>(this, getRoot());
     getFields().put("targetType", projection);
     return projection;
  }

  public DiscountTypeProjection<SubscriptionManualDiscountProjection<PARENT, ROOT>, ROOT> type() {
     DiscountTypeProjection<SubscriptionManualDiscountProjection<PARENT, ROOT>, ROOT> projection = new DiscountTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public SubscriptionDiscountValueProjection<SubscriptionManualDiscountProjection<PARENT, ROOT>, ROOT> value(
      ) {
     SubscriptionDiscountValueProjection<SubscriptionManualDiscountProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountValueProjection<>(this, getRoot());
     getFields().put("value", projection);
     return projection;
  }

  public SubscriptionManualDiscountProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SubscriptionManualDiscountProjection<PARENT, ROOT> recurringCycleLimit() {
    getFields().put("recurringCycleLimit", null);
    return this;
  }

  public SubscriptionManualDiscountProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public SubscriptionManualDiscountProjection<PARENT, ROOT> usageCount() {
    getFields().put("usageCount", null);
    return this;
  }
}
