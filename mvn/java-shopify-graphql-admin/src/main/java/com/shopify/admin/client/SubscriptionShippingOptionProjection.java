package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionShippingOptionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionShippingOptionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionShippingOption"));
  }

  public SubscriptionShippingOptionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryCarrierServiceProjection<SubscriptionShippingOptionProjection<PARENT, ROOT>, ROOT> carrierService(
      ) {
     DeliveryCarrierServiceProjection<SubscriptionShippingOptionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCarrierServiceProjection<>(this, getRoot());
     getFields().put("carrierService", projection);
     return projection;
  }

  public MoneyV2Projection<SubscriptionShippingOptionProjection<PARENT, ROOT>, ROOT> price() {
     MoneyV2Projection<SubscriptionShippingOptionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public SubscriptionShippingOptionProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }

  public SubscriptionShippingOptionProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public SubscriptionShippingOptionProjection<PARENT, ROOT> phoneRequired() {
    getFields().put("phoneRequired", null);
    return this;
  }

  public SubscriptionShippingOptionProjection<PARENT, ROOT> presentmentTitle() {
    getFields().put("presentmentTitle", null);
    return this;
  }

  public SubscriptionShippingOptionProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
