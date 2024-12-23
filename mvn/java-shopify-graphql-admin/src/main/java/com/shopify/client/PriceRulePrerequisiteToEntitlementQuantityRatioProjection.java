package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceRulePrerequisiteToEntitlementQuantityRatioProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRulePrerequisiteToEntitlementQuantityRatioProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceRulePrerequisiteToEntitlementQuantityRatio"));
  }

  public PriceRulePrerequisiteToEntitlementQuantityRatioProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceRulePrerequisiteToEntitlementQuantityRatioProjection<PARENT, ROOT> entitlementQuantity(
      ) {
    getFields().put("entitlementQuantity", null);
    return this;
  }

  public PriceRulePrerequisiteToEntitlementQuantityRatioProjection<PARENT, ROOT> prerequisiteQuantity(
      ) {
    getFields().put("prerequisiteQuantity", null);
    return this;
  }
}
