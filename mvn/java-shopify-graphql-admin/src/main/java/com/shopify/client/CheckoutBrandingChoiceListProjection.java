package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingChoiceListProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingChoiceListProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingChoiceList"));
  }

  public CheckoutBrandingChoiceListProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingChoiceListGroupProjection<CheckoutBrandingChoiceListProjection<PARENT, ROOT>, ROOT> group(
      ) {
     CheckoutBrandingChoiceListGroupProjection<CheckoutBrandingChoiceListProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingChoiceListGroupProjection<>(this, getRoot());
     getFields().put("group", projection);
     return projection;
  }
}
