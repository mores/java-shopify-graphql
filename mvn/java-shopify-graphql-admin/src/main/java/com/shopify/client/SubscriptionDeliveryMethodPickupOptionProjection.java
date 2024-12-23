package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionDeliveryMethodPickupOptionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionDeliveryMethodPickupOptionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionDeliveryMethodPickupOption"));
  }

  public SubscriptionDeliveryMethodPickupOptionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationProjection<SubscriptionDeliveryMethodPickupOptionProjection<PARENT, ROOT>, ROOT> location(
      ) {
     LocationProjection<SubscriptionDeliveryMethodPickupOptionProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public SubscriptionDeliveryMethodPickupOptionProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }

  public SubscriptionDeliveryMethodPickupOptionProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public SubscriptionDeliveryMethodPickupOptionProjection<PARENT, ROOT> presentmentTitle() {
    getFields().put("presentmentTitle", null);
    return this;
  }

  public SubscriptionDeliveryMethodPickupOptionProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
