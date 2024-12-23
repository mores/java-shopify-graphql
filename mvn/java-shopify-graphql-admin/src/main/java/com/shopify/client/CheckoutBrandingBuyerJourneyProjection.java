package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingBuyerJourneyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingBuyerJourneyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingBuyerJourney"));
  }

  public CheckoutBrandingBuyerJourneyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingVisibilityProjection<CheckoutBrandingBuyerJourneyProjection<PARENT, ROOT>, ROOT> visibility(
      ) {
     CheckoutBrandingVisibilityProjection<CheckoutBrandingBuyerJourneyProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingVisibilityProjection<>(this, getRoot());
     getFields().put("visibility", projection);
     return projection;
  }
}
