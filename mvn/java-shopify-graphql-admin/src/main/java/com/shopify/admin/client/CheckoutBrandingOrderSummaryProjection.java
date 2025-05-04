package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingOrderSummaryProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingOrderSummaryProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingOrderSummary"));
  }

  public CheckoutBrandingOrderSummaryProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingImageProjection<CheckoutBrandingOrderSummaryProjection<PARENT, ROOT>, ROOT> backgroundImage(
      ) {
     CheckoutBrandingImageProjection<CheckoutBrandingOrderSummaryProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingImageProjection<>(this, getRoot());
     getFields().put("backgroundImage", projection);
     return projection;
  }

  public CheckoutBrandingColorSchemeSelectionProjection<CheckoutBrandingOrderSummaryProjection<PARENT, ROOT>, ROOT> colorScheme(
      ) {
     CheckoutBrandingColorSchemeSelectionProjection<CheckoutBrandingOrderSummaryProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingColorSchemeSelectionProjection<>(this, getRoot());
     getFields().put("colorScheme", projection);
     return projection;
  }

  public CheckoutBrandingContainerDividerProjection<CheckoutBrandingOrderSummaryProjection<PARENT, ROOT>, ROOT> divider(
      ) {
     CheckoutBrandingContainerDividerProjection<CheckoutBrandingOrderSummaryProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingContainerDividerProjection<>(this, getRoot());
     getFields().put("divider", projection);
     return projection;
  }

  public CheckoutBrandingOrderSummarySectionProjection<CheckoutBrandingOrderSummaryProjection<PARENT, ROOT>, ROOT> section(
      ) {
     CheckoutBrandingOrderSummarySectionProjection<CheckoutBrandingOrderSummaryProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingOrderSummarySectionProjection<>(this, getRoot());
     getFields().put("section", projection);
     return projection;
  }
}
