package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanOptionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanOptionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanOption"));
  }

  public SellingPlanOptionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanOptionProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public SellingPlanOptionProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
