package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingControlProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingControlProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingControl"));
  }

  public CheckoutBrandingControlProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingSimpleBorderProjection<CheckoutBrandingControlProjection<PARENT, ROOT>, ROOT> border(
      ) {
     CheckoutBrandingSimpleBorderProjection<CheckoutBrandingControlProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingSimpleBorderProjection<>(this, getRoot());
     getFields().put("border", projection);
     return projection;
  }

  public CheckoutBrandingColorSelectionProjection<CheckoutBrandingControlProjection<PARENT, ROOT>, ROOT> color(
      ) {
     CheckoutBrandingColorSelectionProjection<CheckoutBrandingControlProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingColorSelectionProjection<>(this, getRoot());
     getFields().put("color", projection);
     return projection;
  }

  public CheckoutBrandingCornerRadiusProjection<CheckoutBrandingControlProjection<PARENT, ROOT>, ROOT> cornerRadius(
      ) {
     CheckoutBrandingCornerRadiusProjection<CheckoutBrandingControlProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingCornerRadiusProjection<>(this, getRoot());
     getFields().put("cornerRadius", projection);
     return projection;
  }

  public CheckoutBrandingLabelPositionProjection<CheckoutBrandingControlProjection<PARENT, ROOT>, ROOT> labelPosition(
      ) {
     CheckoutBrandingLabelPositionProjection<CheckoutBrandingControlProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingLabelPositionProjection<>(this, getRoot());
     getFields().put("labelPosition", projection);
     return projection;
  }
}
