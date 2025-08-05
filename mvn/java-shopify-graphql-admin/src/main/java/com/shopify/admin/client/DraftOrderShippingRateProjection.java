package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrderShippingRateProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderShippingRateProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DraftOrderShippingRate"));
  }

  public DraftOrderShippingRateProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<DraftOrderShippingRateProjection<PARENT, ROOT>, ROOT> price() {
     MoneyV2Projection<DraftOrderShippingRateProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public DraftOrderShippingRateProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }

  public DraftOrderShippingRateProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public DraftOrderShippingRateProjection<PARENT, ROOT> source() {
    getFields().put("source", null);
    return this;
  }

  public DraftOrderShippingRateProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
