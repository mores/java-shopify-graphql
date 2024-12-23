package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopResourceLimitsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopResourceLimitsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopResourceLimits"));
  }

  public ShopResourceLimitsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopResourceLimitsProjection<PARENT, ROOT> locationLimit() {
    getFields().put("locationLimit", null);
    return this;
  }

  public ShopResourceLimitsProjection<PARENT, ROOT> maxProductOptions() {
    getFields().put("maxProductOptions", null);
    return this;
  }

  public ShopResourceLimitsProjection<PARENT, ROOT> maxProductVariants() {
    getFields().put("maxProductVariants", null);
    return this;
  }

  public ShopResourceLimitsProjection<PARENT, ROOT> redirectLimitReached() {
    getFields().put("redirectLimitReached", null);
    return this;
  }
}
