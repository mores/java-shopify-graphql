package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceRuleEntitlementToPrerequisiteQuantityRatioProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRuleEntitlementToPrerequisiteQuantityRatioProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceRuleEntitlementToPrerequisiteQuantityRatio"));
  }

  public PriceRuleEntitlementToPrerequisiteQuantityRatioProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceRuleEntitlementToPrerequisiteQuantityRatioProjection<PARENT, ROOT> entitlementQuantity(
      ) {
    getFields().put("entitlementQuantity", null);
    return this;
  }

  public PriceRuleEntitlementToPrerequisiteQuantityRatioProjection<PARENT, ROOT> prerequisiteQuantity(
      ) {
    getFields().put("prerequisiteQuantity", null);
    return this;
  }
}
