package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SubscriptionDeliveryMethodPickupFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SubscriptionDeliveryMethodPickupFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionDeliveryMethodPickup"));
  }

  public SubscriptionDeliveryMethodPickupFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionDeliveryMethodPickupOptionProjection<SubscriptionDeliveryMethodPickupFragmentProjection<PARENT, ROOT>, ROOT> pickupOption(
      ) {
     SubscriptionDeliveryMethodPickupOptionProjection<SubscriptionDeliveryMethodPickupFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDeliveryMethodPickupOptionProjection<>(this, getRoot());
     getFields().put("pickupOption", projection);
     return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SubscriptionDeliveryMethodPickup {");
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
