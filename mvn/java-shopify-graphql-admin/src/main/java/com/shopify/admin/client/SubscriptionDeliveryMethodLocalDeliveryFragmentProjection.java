package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SubscriptionDeliveryMethodLocalDeliveryFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SubscriptionDeliveryMethodLocalDeliveryFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionDeliveryMethodLocalDelivery"));
  }

  public SubscriptionDeliveryMethodLocalDeliveryFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionMailingAddressProjection<SubscriptionDeliveryMethodLocalDeliveryFragmentProjection<PARENT, ROOT>, ROOT> address(
      ) {
     SubscriptionMailingAddressProjection<SubscriptionDeliveryMethodLocalDeliveryFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionMailingAddressProjection<>(this, getRoot());
     getFields().put("address", projection);
     return projection;
  }

  public SubscriptionDeliveryMethodLocalDeliveryOptionProjection<SubscriptionDeliveryMethodLocalDeliveryFragmentProjection<PARENT, ROOT>, ROOT> localDeliveryOption(
      ) {
     SubscriptionDeliveryMethodLocalDeliveryOptionProjection<SubscriptionDeliveryMethodLocalDeliveryFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDeliveryMethodLocalDeliveryOptionProjection<>(this, getRoot());
     getFields().put("localDeliveryOption", projection);
     return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SubscriptionDeliveryMethodLocalDelivery {");
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
