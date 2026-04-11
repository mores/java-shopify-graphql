package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingOrderSummaryProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingOrderSummaryProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingOrderSummary"));
  }

  public CheckoutAndAccountsConfigurationBrandingOrderSummaryProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingImageValueProjection<CheckoutAndAccountsConfigurationBrandingOrderSummaryProjection<PARENT, ROOT>, ROOT> backgroundImage(
      ) {
     CheckoutAndAccountsConfigurationBrandingImageValueProjection<CheckoutAndAccountsConfigurationBrandingOrderSummaryProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingImageValueProjection<>(this, getRoot());
     getFields().put("backgroundImage", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingColorsProjection<CheckoutAndAccountsConfigurationBrandingOrderSummaryProjection<PARENT, ROOT>, ROOT> colors(
      ) {
     CheckoutAndAccountsConfigurationBrandingColorsProjection<CheckoutAndAccountsConfigurationBrandingOrderSummaryProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingColorsProjection<>(this, getRoot());
     getFields().put("colors", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingContainerDividerProjection<CheckoutAndAccountsConfigurationBrandingOrderSummaryProjection<PARENT, ROOT>, ROOT> divider(
      ) {
     CheckoutAndAccountsConfigurationBrandingContainerDividerProjection<CheckoutAndAccountsConfigurationBrandingOrderSummaryProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingContainerDividerProjection<>(this, getRoot());
     getFields().put("divider", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingOrderSummarySectionProjection<CheckoutAndAccountsConfigurationBrandingOrderSummaryProjection<PARENT, ROOT>, ROOT> section(
      ) {
     CheckoutAndAccountsConfigurationBrandingOrderSummarySectionProjection<CheckoutAndAccountsConfigurationBrandingOrderSummaryProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingOrderSummarySectionProjection<>(this, getRoot());
     getFields().put("section", projection);
     return projection;
  }
}
