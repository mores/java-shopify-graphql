package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class WebPixelFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public WebPixelFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("WebPixel"));
  }

  public WebPixelFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public WebPixelFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public WebPixelFragmentProjection<PARENT, ROOT> settings() {
    getFields().put("settings", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on WebPixel {");
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
