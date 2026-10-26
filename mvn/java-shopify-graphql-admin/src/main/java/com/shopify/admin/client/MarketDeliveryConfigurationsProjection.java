package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketDeliveryConfigurationsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketDeliveryConfigurationsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketDeliveryConfigurations"));
  }

  public MarketDeliveryConfigurationsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShippingConfigurationProjection<MarketDeliveryConfigurationsProjection<PARENT, ROOT>, ROOT> shipping(
      ) {
     ShippingConfigurationProjection<MarketDeliveryConfigurationsProjection<PARENT, ROOT>, ROOT> projection = new ShippingConfigurationProjection<>(this, getRoot());
     getFields().put("shipping", projection);
     return projection;
  }
}
