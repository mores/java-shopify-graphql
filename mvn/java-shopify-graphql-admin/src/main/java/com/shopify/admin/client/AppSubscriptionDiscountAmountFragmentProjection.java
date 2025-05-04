package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class AppSubscriptionDiscountAmountFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public AppSubscriptionDiscountAmountFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppSubscriptionDiscountAmount"));
  }

  public AppSubscriptionDiscountAmountFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<AppSubscriptionDiscountAmountFragmentProjection<PARENT, ROOT>, ROOT> amount(
      ) {
     MoneyV2Projection<AppSubscriptionDiscountAmountFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on AppSubscriptionDiscountAmount {");
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
