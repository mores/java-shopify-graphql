package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SubscriptionDeliveryOptionResultSuccessFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SubscriptionDeliveryOptionResultSuccessFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionDeliveryOptionResultSuccess"));
  }

  public SubscriptionDeliveryOptionResultSuccessFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionDeliveryOptionProjection<SubscriptionDeliveryOptionResultSuccessFragmentProjection<PARENT, ROOT>, ROOT> deliveryOptions(
      ) {
     SubscriptionDeliveryOptionProjection<SubscriptionDeliveryOptionResultSuccessFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDeliveryOptionProjection<>(this, getRoot());
     getFields().put("deliveryOptions", projection);
     return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SubscriptionDeliveryOptionResultSuccess {");
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
