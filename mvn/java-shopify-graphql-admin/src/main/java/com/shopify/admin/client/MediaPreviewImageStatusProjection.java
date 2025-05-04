package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MediaPreviewImageStatusProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MediaPreviewImageStatusProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MediaPreviewImageStatus"));
  }

  public MediaPreviewImageStatusProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
