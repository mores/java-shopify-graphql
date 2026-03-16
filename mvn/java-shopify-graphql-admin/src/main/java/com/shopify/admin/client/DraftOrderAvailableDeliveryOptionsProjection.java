package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrderAvailableDeliveryOptionsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderAvailableDeliveryOptionsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DraftOrderAvailableDeliveryOptions"));
  }

  public DraftOrderAvailableDeliveryOptionsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DraftOrderShippingRateProjection<DraftOrderAvailableDeliveryOptionsProjection<PARENT, ROOT>, ROOT> availableLocalDeliveryRates(
      ) {
     DraftOrderShippingRateProjection<DraftOrderAvailableDeliveryOptionsProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderShippingRateProjection<>(this, getRoot());
     getFields().put("availableLocalDeliveryRates", projection);
     return projection;
  }

  public PickupInStoreLocationProjection<DraftOrderAvailableDeliveryOptionsProjection<PARENT, ROOT>, ROOT> availableLocalPickupOptions(
      ) {
     PickupInStoreLocationProjection<DraftOrderAvailableDeliveryOptionsProjection<PARENT, ROOT>, ROOT> projection = new PickupInStoreLocationProjection<>(this, getRoot());
     getFields().put("availableLocalPickupOptions", projection);
     return projection;
  }

  public DraftOrderShippingRateProjection<DraftOrderAvailableDeliveryOptionsProjection<PARENT, ROOT>, ROOT> availableShippingRates(
      ) {
     DraftOrderShippingRateProjection<DraftOrderAvailableDeliveryOptionsProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderShippingRateProjection<>(this, getRoot());
     getFields().put("availableShippingRates", projection);
     return projection;
  }

  public PageInfoProjection<DraftOrderAvailableDeliveryOptionsProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<DraftOrderAvailableDeliveryOptionsProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
