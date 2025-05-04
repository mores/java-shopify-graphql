package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class OnlineStoreThemeFileBodyUrlFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public OnlineStoreThemeFileBodyUrlFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OnlineStoreThemeFileBodyUrl"));
  }

  public OnlineStoreThemeFileBodyUrlFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OnlineStoreThemeFileBodyUrlFragmentProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on OnlineStoreThemeFileBodyUrl {");
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
