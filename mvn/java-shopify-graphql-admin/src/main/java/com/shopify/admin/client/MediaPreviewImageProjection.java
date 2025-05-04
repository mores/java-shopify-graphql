package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MediaPreviewImageProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MediaPreviewImageProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MediaPreviewImage"));
  }

  public MediaPreviewImageProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ImageProjection<MediaPreviewImageProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<MediaPreviewImageProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public MediaPreviewImageStatusProjection<MediaPreviewImageProjection<PARENT, ROOT>, ROOT> status(
      ) {
     MediaPreviewImageStatusProjection<MediaPreviewImageProjection<PARENT, ROOT>, ROOT> projection = new MediaPreviewImageStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }
}
