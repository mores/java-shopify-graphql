package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionDeliveryMethodShippingOptionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionDeliveryMethodShippingOptionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionDeliveryMethodShippingOption"));
  }

  public SubscriptionDeliveryMethodShippingOptionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryCarrierServiceProjection<SubscriptionDeliveryMethodShippingOptionProjection<PARENT, ROOT>, ROOT> carrierService(
      ) {
     DeliveryCarrierServiceProjection<SubscriptionDeliveryMethodShippingOptionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCarrierServiceProjection<>(this, getRoot());
     getFields().put("carrierService", projection);
     return projection;
  }

  public SubscriptionDeliveryMethodShippingOptionProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }

  public SubscriptionDeliveryMethodShippingOptionProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public SubscriptionDeliveryMethodShippingOptionProjection<PARENT, ROOT> presentmentTitle() {
    getFields().put("presentmentTitle", null);
    return this;
  }

  public SubscriptionDeliveryMethodShippingOptionProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
