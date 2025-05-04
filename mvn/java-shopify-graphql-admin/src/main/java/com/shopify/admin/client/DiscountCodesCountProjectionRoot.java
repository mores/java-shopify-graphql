package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountCodesCountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountCodesCountProjectionRoot() {
    super(null, null, java.util.Optional.of("Count"));
  }

  public DiscountCodesCountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountPrecisionProjection<DiscountCodesCountProjectionRoot<PARENT, ROOT>, DiscountCodesCountProjectionRoot<PARENT, ROOT>> precision(
      ) {
    CountPrecisionProjection<DiscountCodesCountProjectionRoot<PARENT, ROOT>, DiscountCodesCountProjectionRoot<PARENT, ROOT>> projection = new CountPrecisionProjection<>(this, this);    
    getFields().put("precision", projection);
    return projection;
  }

  public DiscountCodesCountProjectionRoot<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }
}
