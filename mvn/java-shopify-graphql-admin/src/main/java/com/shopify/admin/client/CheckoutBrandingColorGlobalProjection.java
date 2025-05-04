package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingColorGlobalProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingColorGlobalProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingColorGlobal"));
  }

  public CheckoutBrandingColorGlobalProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingColorGlobalProjection<PARENT, ROOT> accent() {
    getFields().put("accent", null);
    return this;
  }

  public CheckoutBrandingColorGlobalProjection<PARENT, ROOT> brand() {
    getFields().put("brand", null);
    return this;
  }

  public CheckoutBrandingColorGlobalProjection<PARENT, ROOT> critical() {
    getFields().put("critical", null);
    return this;
  }

  public CheckoutBrandingColorGlobalProjection<PARENT, ROOT> decorative() {
    getFields().put("decorative", null);
    return this;
  }

  public CheckoutBrandingColorGlobalProjection<PARENT, ROOT> info() {
    getFields().put("info", null);
    return this;
  }

  public CheckoutBrandingColorGlobalProjection<PARENT, ROOT> success() {
    getFields().put("success", null);
    return this;
  }

  public CheckoutBrandingColorGlobalProjection<PARENT, ROOT> warning() {
    getFields().put("warning", null);
    return this;
  }
}
