package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SubscriptionPickupOptionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SubscriptionPickupOptionFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionPickupOption"));
  }

  public SubscriptionPickupOptionFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationProjection<SubscriptionPickupOptionFragmentProjection<PARENT, ROOT>, ROOT> location(
      ) {
     LocationProjection<SubscriptionPickupOptionFragmentProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public MoneyV2Projection<SubscriptionPickupOptionFragmentProjection<PARENT, ROOT>, ROOT> price() {
     MoneyV2Projection<SubscriptionPickupOptionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public SubscriptionPickupOptionFragmentProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }

  public SubscriptionPickupOptionFragmentProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public SubscriptionPickupOptionFragmentProjection<PARENT, ROOT> phoneRequired() {
    getFields().put("phoneRequired", null);
    return this;
  }

  public SubscriptionPickupOptionFragmentProjection<PARENT, ROOT> pickupTime() {
    getFields().put("pickupTime", null);
    return this;
  }

  public SubscriptionPickupOptionFragmentProjection<PARENT, ROOT> presentmentTitle() {
    getFields().put("presentmentTitle", null);
    return this;
  }

  public SubscriptionPickupOptionFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SubscriptionPickupOption {");
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
