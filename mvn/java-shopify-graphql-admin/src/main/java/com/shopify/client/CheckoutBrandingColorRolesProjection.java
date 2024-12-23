package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingColorRolesProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingColorRolesProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingColorRoles"));
  }

  public CheckoutBrandingColorRolesProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingColorRolesProjection<PARENT, ROOT> accent() {
    getFields().put("accent", null);
    return this;
  }

  public CheckoutBrandingColorRolesProjection<PARENT, ROOT> background() {
    getFields().put("background", null);
    return this;
  }

  public CheckoutBrandingColorRolesProjection<PARENT, ROOT> border() {
    getFields().put("border", null);
    return this;
  }

  public CheckoutBrandingColorRolesProjection<PARENT, ROOT> decorative() {
    getFields().put("decorative", null);
    return this;
  }

  public CheckoutBrandingColorRolesProjection<PARENT, ROOT> icon() {
    getFields().put("icon", null);
    return this;
  }

  public CheckoutBrandingColorRolesProjection<PARENT, ROOT> text() {
    getFields().put("text", null);
    return this;
  }
}
