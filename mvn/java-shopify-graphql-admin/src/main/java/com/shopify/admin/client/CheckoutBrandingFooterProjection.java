package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingFooterProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingFooterProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingFooter"));
  }

  public CheckoutBrandingFooterProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingFooterAlignmentProjection<CheckoutBrandingFooterProjection<PARENT, ROOT>, ROOT> alignment(
      ) {
     CheckoutBrandingFooterAlignmentProjection<CheckoutBrandingFooterProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingFooterAlignmentProjection<>(this, getRoot());
     getFields().put("alignment", projection);
     return projection;
  }

  public CheckoutBrandingColorSchemeSelectionProjection<CheckoutBrandingFooterProjection<PARENT, ROOT>, ROOT> colorScheme(
      ) {
     CheckoutBrandingColorSchemeSelectionProjection<CheckoutBrandingFooterProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingColorSchemeSelectionProjection<>(this, getRoot());
     getFields().put("colorScheme", projection);
     return projection;
  }

  public CheckoutBrandingFooterContentProjection<CheckoutBrandingFooterProjection<PARENT, ROOT>, ROOT> content(
      ) {
     CheckoutBrandingFooterContentProjection<CheckoutBrandingFooterProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingFooterContentProjection<>(this, getRoot());
     getFields().put("content", projection);
     return projection;
  }

  public CheckoutBrandingSpacingKeywordProjection<CheckoutBrandingFooterProjection<PARENT, ROOT>, ROOT> padding(
      ) {
     CheckoutBrandingSpacingKeywordProjection<CheckoutBrandingFooterProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingSpacingKeywordProjection<>(this, getRoot());
     getFields().put("padding", projection);
     return projection;
  }

  public CheckoutBrandingFooterPositionProjection<CheckoutBrandingFooterProjection<PARENT, ROOT>, ROOT> position(
      ) {
     CheckoutBrandingFooterPositionProjection<CheckoutBrandingFooterProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingFooterPositionProjection<>(this, getRoot());
     getFields().put("position", projection);
     return projection;
  }

  public CheckoutBrandingFooterProjection<PARENT, ROOT> divided() {
    getFields().put("divided", null);
    return this;
  }
}
