package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class UrlRedirectFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public UrlRedirectFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("UrlRedirect"));
  }

  public UrlRedirectFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UrlRedirectFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public UrlRedirectFragmentProjection<PARENT, ROOT> path() {
    getFields().put("path", null);
    return this;
  }

  public UrlRedirectFragmentProjection<PARENT, ROOT> target() {
    getFields().put("target", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on UrlRedirect {");
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
