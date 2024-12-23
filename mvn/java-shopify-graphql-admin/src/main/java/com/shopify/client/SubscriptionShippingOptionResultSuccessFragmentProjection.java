package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SubscriptionShippingOptionResultSuccessFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SubscriptionShippingOptionResultSuccessFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionShippingOptionResultSuccess"));
  }

  public SubscriptionShippingOptionResultSuccessFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionShippingOptionProjection<SubscriptionShippingOptionResultSuccessFragmentProjection<PARENT, ROOT>, ROOT> shippingOptions(
      ) {
     SubscriptionShippingOptionProjection<SubscriptionShippingOptionResultSuccessFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionShippingOptionProjection<>(this, getRoot());
     getFields().put("shippingOptions", projection);
     return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SubscriptionShippingOptionResultSuccess {");
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
