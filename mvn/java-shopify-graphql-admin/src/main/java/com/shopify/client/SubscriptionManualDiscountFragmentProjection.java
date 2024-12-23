package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SubscriptionManualDiscountFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SubscriptionManualDiscountFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionManualDiscount"));
  }

  public SubscriptionManualDiscountFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionDiscountEntitledLinesProjection<SubscriptionManualDiscountFragmentProjection<PARENT, ROOT>, ROOT> entitledLines(
      ) {
     SubscriptionDiscountEntitledLinesProjection<SubscriptionManualDiscountFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountEntitledLinesProjection<>(this, getRoot());
     getFields().put("entitledLines", projection);
     return projection;
  }

  public SubscriptionDiscountRejectionReasonProjection<SubscriptionManualDiscountFragmentProjection<PARENT, ROOT>, ROOT> rejectionReason(
      ) {
     SubscriptionDiscountRejectionReasonProjection<SubscriptionManualDiscountFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountRejectionReasonProjection<>(this, getRoot());
     getFields().put("rejectionReason", projection);
     return projection;
  }

  public DiscountTargetTypeProjection<SubscriptionManualDiscountFragmentProjection<PARENT, ROOT>, ROOT> targetType(
      ) {
     DiscountTargetTypeProjection<SubscriptionManualDiscountFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountTargetTypeProjection<>(this, getRoot());
     getFields().put("targetType", projection);
     return projection;
  }

  public DiscountTypeProjection<SubscriptionManualDiscountFragmentProjection<PARENT, ROOT>, ROOT> type(
      ) {
     DiscountTypeProjection<SubscriptionManualDiscountFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public SubscriptionDiscountValueProjection<SubscriptionManualDiscountFragmentProjection<PARENT, ROOT>, ROOT> value(
      ) {
     SubscriptionDiscountValueProjection<SubscriptionManualDiscountFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountValueProjection<>(this, getRoot());
     getFields().put("value", projection);
     return projection;
  }

  public SubscriptionManualDiscountFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SubscriptionManualDiscountFragmentProjection<PARENT, ROOT> recurringCycleLimit() {
    getFields().put("recurringCycleLimit", null);
    return this;
  }

  public SubscriptionManualDiscountFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public SubscriptionManualDiscountFragmentProjection<PARENT, ROOT> usageCount() {
    getFields().put("usageCount", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SubscriptionManualDiscount {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
