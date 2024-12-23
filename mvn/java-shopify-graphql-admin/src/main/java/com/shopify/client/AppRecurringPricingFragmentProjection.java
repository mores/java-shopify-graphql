package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class AppRecurringPricingFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public AppRecurringPricingFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppRecurringPricing"));
  }

  public AppRecurringPricingFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppSubscriptionDiscountProjection<AppRecurringPricingFragmentProjection<PARENT, ROOT>, ROOT> discount(
      ) {
     AppSubscriptionDiscountProjection<AppRecurringPricingFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppSubscriptionDiscountProjection<>(this, getRoot());
     getFields().put("discount", projection);
     return projection;
  }

  public AppPricingIntervalProjection<AppRecurringPricingFragmentProjection<PARENT, ROOT>, ROOT> interval(
      ) {
     AppPricingIntervalProjection<AppRecurringPricingFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppPricingIntervalProjection<>(this, getRoot());
     getFields().put("interval", projection);
     return projection;
  }

  public MoneyV2Projection<AppRecurringPricingFragmentProjection<PARENT, ROOT>, ROOT> price() {
     MoneyV2Projection<AppRecurringPricingFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on AppRecurringPricing {");
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
