package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CheckoutBrandingCustomFontFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CheckoutBrandingCustomFontFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingCustomFont"));
  }

  public CheckoutBrandingCustomFontFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingCustomFontFragmentProjection<PARENT, ROOT> genericFileId() {
    getFields().put("genericFileId", null);
    return this;
  }

  public CheckoutBrandingCustomFontFragmentProjection<PARENT, ROOT> sources() {
    getFields().put("sources", null);
    return this;
  }

  public CheckoutBrandingCustomFontFragmentProjection<PARENT, ROOT> weight() {
    getFields().put("weight", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CheckoutBrandingCustomFont {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
