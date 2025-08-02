package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrderAvailableDeliveryOptionsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderAvailableDeliveryOptionsProjectionRoot() {
    super(null, null, java.util.Optional.of("DraftOrderAvailableDeliveryOptions"));
  }

  public DraftOrderAvailableDeliveryOptionsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DraftOrderShippingRateProjection<DraftOrderAvailableDeliveryOptionsProjectionRoot<PARENT, ROOT>, DraftOrderAvailableDeliveryOptionsProjectionRoot<PARENT, ROOT>> availableLocalDeliveryRates(
      ) {
    DraftOrderShippingRateProjection<DraftOrderAvailableDeliveryOptionsProjectionRoot<PARENT, ROOT>, DraftOrderAvailableDeliveryOptionsProjectionRoot<PARENT, ROOT>> projection = new DraftOrderShippingRateProjection<>(this, this);    
    getFields().put("availableLocalDeliveryRates", projection);
    return projection;
  }

  public PickupInStoreLocationProjection<DraftOrderAvailableDeliveryOptionsProjectionRoot<PARENT, ROOT>, DraftOrderAvailableDeliveryOptionsProjectionRoot<PARENT, ROOT>> availableLocalPickupOptions(
      ) {
    PickupInStoreLocationProjection<DraftOrderAvailableDeliveryOptionsProjectionRoot<PARENT, ROOT>, DraftOrderAvailableDeliveryOptionsProjectionRoot<PARENT, ROOT>> projection = new PickupInStoreLocationProjection<>(this, this);    
    getFields().put("availableLocalPickupOptions", projection);
    return projection;
  }

  public DraftOrderShippingRateProjection<DraftOrderAvailableDeliveryOptionsProjectionRoot<PARENT, ROOT>, DraftOrderAvailableDeliveryOptionsProjectionRoot<PARENT, ROOT>> availableShippingRates(
      ) {
    DraftOrderShippingRateProjection<DraftOrderAvailableDeliveryOptionsProjectionRoot<PARENT, ROOT>, DraftOrderAvailableDeliveryOptionsProjectionRoot<PARENT, ROOT>> projection = new DraftOrderShippingRateProjection<>(this, this);    
    getFields().put("availableShippingRates", projection);
    return projection;
  }

  public PageInfoProjection<DraftOrderAvailableDeliveryOptionsProjectionRoot<PARENT, ROOT>, DraftOrderAvailableDeliveryOptionsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<DraftOrderAvailableDeliveryOptionsProjectionRoot<PARENT, ROOT>, DraftOrderAvailableDeliveryOptionsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
