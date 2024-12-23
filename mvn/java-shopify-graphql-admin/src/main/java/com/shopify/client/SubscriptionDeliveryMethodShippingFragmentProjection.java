package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SubscriptionDeliveryMethodShippingFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SubscriptionDeliveryMethodShippingFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionDeliveryMethodShipping"));
  }

  public SubscriptionDeliveryMethodShippingFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionMailingAddressProjection<SubscriptionDeliveryMethodShippingFragmentProjection<PARENT, ROOT>, ROOT> address(
      ) {
     SubscriptionMailingAddressProjection<SubscriptionDeliveryMethodShippingFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionMailingAddressProjection<>(this, getRoot());
     getFields().put("address", projection);
     return projection;
  }

  public SubscriptionDeliveryMethodShippingOptionProjection<SubscriptionDeliveryMethodShippingFragmentProjection<PARENT, ROOT>, ROOT> shippingOption(
      ) {
     SubscriptionDeliveryMethodShippingOptionProjection<SubscriptionDeliveryMethodShippingFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDeliveryMethodShippingOptionProjection<>(this, getRoot());
     getFields().put("shippingOption", projection);
     return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SubscriptionDeliveryMethodShipping {");
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
