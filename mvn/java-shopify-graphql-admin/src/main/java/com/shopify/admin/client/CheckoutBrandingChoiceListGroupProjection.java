package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingChoiceListGroupProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingChoiceListGroupProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingChoiceListGroup"));
  }

  public CheckoutBrandingChoiceListGroupProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingSpacingKeywordProjection<CheckoutBrandingChoiceListGroupProjection<PARENT, ROOT>, ROOT> spacing(
      ) {
     CheckoutBrandingSpacingKeywordProjection<CheckoutBrandingChoiceListGroupProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingSpacingKeywordProjection<>(this, getRoot());
     getFields().put("spacing", projection);
     return projection;
  }
}
