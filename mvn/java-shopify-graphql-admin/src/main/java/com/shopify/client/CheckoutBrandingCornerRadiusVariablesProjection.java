package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingCornerRadiusVariablesProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingCornerRadiusVariablesProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingCornerRadiusVariables"));
  }

  public CheckoutBrandingCornerRadiusVariablesProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingCornerRadiusVariablesProjection<PARENT, ROOT> base() {
    getFields().put("base", null);
    return this;
  }

  public CheckoutBrandingCornerRadiusVariablesProjection<PARENT, ROOT> large() {
    getFields().put("large", null);
    return this;
  }

  public CheckoutBrandingCornerRadiusVariablesProjection<PARENT, ROOT> small() {
    getFields().put("small", null);
    return this;
  }
}
