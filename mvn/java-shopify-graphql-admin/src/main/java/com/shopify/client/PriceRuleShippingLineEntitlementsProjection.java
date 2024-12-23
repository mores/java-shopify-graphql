package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceRuleShippingLineEntitlementsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRuleShippingLineEntitlementsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceRuleShippingLineEntitlements"));
  }

  public PriceRuleShippingLineEntitlementsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<PriceRuleShippingLineEntitlementsProjection<PARENT, ROOT>, ROOT> countryCodes(
      ) {
     CountryCodeProjection<PriceRuleShippingLineEntitlementsProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("countryCodes", projection);
     return projection;
  }

  public PriceRuleShippingLineEntitlementsProjection<PARENT, ROOT> includeRestOfWorld() {
    getFields().put("includeRestOfWorld", null);
    return this;
  }

  public PriceRuleShippingLineEntitlementsProjection<PARENT, ROOT> targetAllShippingLines() {
    getFields().put("targetAllShippingLines", null);
    return this;
  }
}
