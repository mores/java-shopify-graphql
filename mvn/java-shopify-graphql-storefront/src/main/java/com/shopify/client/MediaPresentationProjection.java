package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.MediaPresentationFormat;
import java.util.ArrayList;

public class MediaPresentationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MediaPresentationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MediaPresentation"));
  }

  public MediaPresentationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MediaPresentationProjection<PARENT, ROOT> asJson() {
    getFields().put("asJson", null);
    return this;
  }

  public MediaPresentationProjection asJson(MediaPresentationFormat format) {
    getFields().put("asJson", null);
    getInputArguments().computeIfAbsent("asJson", k -> new ArrayList<>());
    InputArgument formatArg = new InputArgument("format", format);
    getInputArguments().get("asJson").add(formatArg);
    return this;
  }

  public MediaPresentationProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
