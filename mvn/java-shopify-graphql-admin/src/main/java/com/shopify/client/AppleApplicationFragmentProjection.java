package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class AppleApplicationFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public AppleApplicationFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppleApplication"));
  }

  public AppleApplicationFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppleApplicationFragmentProjection<PARENT, ROOT> appClipApplicationId() {
    getFields().put("appClipApplicationId", null);
    return this;
  }

  public AppleApplicationFragmentProjection<PARENT, ROOT> appClipsEnabled() {
    getFields().put("appClipsEnabled", null);
    return this;
  }

  public AppleApplicationFragmentProjection<PARENT, ROOT> appId() {
    getFields().put("appId", null);
    return this;
  }

  public AppleApplicationFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AppleApplicationFragmentProjection<PARENT, ROOT> sharedWebCredentialsEnabled() {
    getFields().put("sharedWebCredentialsEnabled", null);
    return this;
  }

  public AppleApplicationFragmentProjection<PARENT, ROOT> universalLinksEnabled() {
    getFields().put("universalLinksEnabled", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on AppleApplication {");
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
