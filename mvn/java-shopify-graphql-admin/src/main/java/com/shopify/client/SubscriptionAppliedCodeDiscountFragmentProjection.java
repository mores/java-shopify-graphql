package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SubscriptionAppliedCodeDiscountFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SubscriptionAppliedCodeDiscountFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionAppliedCodeDiscount"));
  }

  public SubscriptionAppliedCodeDiscountFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionDiscountRejectionReasonProjection<SubscriptionAppliedCodeDiscountFragmentProjection<PARENT, ROOT>, ROOT> rejectionReason(
      ) {
     SubscriptionDiscountRejectionReasonProjection<SubscriptionAppliedCodeDiscountFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountRejectionReasonProjection<>(this, getRoot());
     getFields().put("rejectionReason", projection);
     return projection;
  }

  public SubscriptionAppliedCodeDiscountFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SubscriptionAppliedCodeDiscountFragmentProjection<PARENT, ROOT> redeemCode() {
    getFields().put("redeemCode", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SubscriptionAppliedCodeDiscount {");
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
