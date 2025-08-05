package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPlanProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPlanProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPlan"));
  }

  public ShopPlanProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopPlanProjection<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public ShopPlanProjection<PARENT, ROOT> partnerDevelopment() {
    getFields().put("partnerDevelopment", null);
    return this;
  }

  public ShopPlanProjection<PARENT, ROOT> publicDisplayName() {
    getFields().put("publicDisplayName", null);
    return this;
  }

  public ShopPlanProjection<PARENT, ROOT> shopifyPlus() {
    getFields().put("shopifyPlus", null);
    return this;
  }
}
