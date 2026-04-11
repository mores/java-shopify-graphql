package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingCheckoutComponentsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingCheckoutComponentsProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingCheckoutComponents"));
  }

  public CheckoutAndAccountsConfigurationBrandingCheckoutComponentsProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingBuyerJourneyProjection<CheckoutAndAccountsConfigurationBrandingCheckoutComponentsProjection<PARENT, ROOT>, ROOT> buyerJourney(
      ) {
     CheckoutAndAccountsConfigurationBrandingBuyerJourneyProjection<CheckoutAndAccountsConfigurationBrandingCheckoutComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingBuyerJourneyProjection<>(this, getRoot());
     getFields().put("buyerJourney", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingCartLinkProjection<CheckoutAndAccountsConfigurationBrandingCheckoutComponentsProjection<PARENT, ROOT>, ROOT> cartLink(
      ) {
     CheckoutAndAccountsConfigurationBrandingCartLinkProjection<CheckoutAndAccountsConfigurationBrandingCheckoutComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingCartLinkProjection<>(this, getRoot());
     getFields().put("cartLink", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingContentProjection<CheckoutAndAccountsConfigurationBrandingCheckoutComponentsProjection<PARENT, ROOT>, ROOT> content(
      ) {
     CheckoutAndAccountsConfigurationBrandingContentProjection<CheckoutAndAccountsConfigurationBrandingCheckoutComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingContentProjection<>(this, getRoot());
     getFields().put("content", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingExpressCheckoutProjection<CheckoutAndAccountsConfigurationBrandingCheckoutComponentsProjection<PARENT, ROOT>, ROOT> expressCheckout(
      ) {
     CheckoutAndAccountsConfigurationBrandingExpressCheckoutProjection<CheckoutAndAccountsConfigurationBrandingCheckoutComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingExpressCheckoutProjection<>(this, getRoot());
     getFields().put("expressCheckout", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingCheckoutFooterProjection<CheckoutAndAccountsConfigurationBrandingCheckoutComponentsProjection<PARENT, ROOT>, ROOT> footer(
      ) {
     CheckoutAndAccountsConfigurationBrandingCheckoutFooterProjection<CheckoutAndAccountsConfigurationBrandingCheckoutComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingCheckoutFooterProjection<>(this, getRoot());
     getFields().put("footer", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingCheckoutHeaderProjection<CheckoutAndAccountsConfigurationBrandingCheckoutComponentsProjection<PARENT, ROOT>, ROOT> header(
      ) {
     CheckoutAndAccountsConfigurationBrandingCheckoutHeaderProjection<CheckoutAndAccountsConfigurationBrandingCheckoutComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingCheckoutHeaderProjection<>(this, getRoot());
     getFields().put("header", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingMainProjection<CheckoutAndAccountsConfigurationBrandingCheckoutComponentsProjection<PARENT, ROOT>, ROOT> main(
      ) {
     CheckoutAndAccountsConfigurationBrandingMainProjection<CheckoutAndAccountsConfigurationBrandingCheckoutComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingMainProjection<>(this, getRoot());
     getFields().put("main", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingOrderSummaryProjection<CheckoutAndAccountsConfigurationBrandingCheckoutComponentsProjection<PARENT, ROOT>, ROOT> orderSummary(
      ) {
     CheckoutAndAccountsConfigurationBrandingOrderSummaryProjection<CheckoutAndAccountsConfigurationBrandingCheckoutComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingOrderSummaryProjection<>(this, getRoot());
     getFields().put("orderSummary", projection);
     return projection;
  }
}
