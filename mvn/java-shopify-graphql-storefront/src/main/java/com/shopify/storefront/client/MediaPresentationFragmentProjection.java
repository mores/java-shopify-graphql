package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.storefront.types.MediaPresentationFormat;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class MediaPresentationFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public MediaPresentationFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MediaPresentation"));
  }

  public MediaPresentationFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MediaPresentationFragmentProjection<PARENT, ROOT> asJson() {
    getFields().put("asJson", null);
    return this;
  }

  public MediaPresentationFragmentProjection asJson(MediaPresentationFormat format) {
    getFields().put("asJson", null);
    getInputArguments().computeIfAbsent("asJson", k -> new ArrayList<>());
    InputArgument formatArg = new InputArgument("format", format);
    getInputArguments().get("asJson").add(formatArg);
    return this;
  }

  public MediaPresentationFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on MediaPresentation {");
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
