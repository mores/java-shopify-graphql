package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingContentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingContentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingContent"));
  }

  public CheckoutBrandingContentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingContainerDividerProjection<CheckoutBrandingContentProjection<PARENT, ROOT>, ROOT> divider(
      ) {
     CheckoutBrandingContainerDividerProjection<CheckoutBrandingContentProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingContainerDividerProjection<>(this, getRoot());
     getFields().put("divider", projection);
     return projection;
  }
}
