package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShippingRateProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShippingRateProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShippingRate"));
  }

  public ShippingRateProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<ShippingRateProjection<PARENT, ROOT>, ROOT> price() {
     MoneyV2Projection<ShippingRateProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public ShippingRateProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public ShippingRateProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
