package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingBuyerJourneyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingBuyerJourneyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingBuyerJourney"));
  }

  public CheckoutAndAccountsConfigurationBrandingBuyerJourneyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingVisibilityProjection<CheckoutAndAccountsConfigurationBrandingBuyerJourneyProjection<PARENT, ROOT>, ROOT> visibility(
      ) {
     CheckoutAndAccountsConfigurationBrandingVisibilityProjection<CheckoutAndAccountsConfigurationBrandingBuyerJourneyProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingVisibilityProjection<>(this, getRoot());
     getFields().put("visibility", projection);
     return projection;
  }
}
