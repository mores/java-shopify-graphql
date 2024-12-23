package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingDesignSystemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingDesignSystemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingDesignSystem"));
  }

  public CheckoutBrandingDesignSystemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingColorsProjection<CheckoutBrandingDesignSystemProjection<PARENT, ROOT>, ROOT> colors(
      ) {
     CheckoutBrandingColorsProjection<CheckoutBrandingDesignSystemProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingColorsProjection<>(this, getRoot());
     getFields().put("colors", projection);
     return projection;
  }

  public CheckoutBrandingCornerRadiusVariablesProjection<CheckoutBrandingDesignSystemProjection<PARENT, ROOT>, ROOT> cornerRadius(
      ) {
     CheckoutBrandingCornerRadiusVariablesProjection<CheckoutBrandingDesignSystemProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingCornerRadiusVariablesProjection<>(this, getRoot());
     getFields().put("cornerRadius", projection);
     return projection;
  }

  public CheckoutBrandingTypographyProjection<CheckoutBrandingDesignSystemProjection<PARENT, ROOT>, ROOT> typography(
      ) {
     CheckoutBrandingTypographyProjection<CheckoutBrandingDesignSystemProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingTypographyProjection<>(this, getRoot());
     getFields().put("typography", projection);
     return projection;
  }
}
