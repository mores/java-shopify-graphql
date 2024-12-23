package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CommentEventAttachmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CommentEventAttachmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CommentEventAttachment"));
  }

  public CommentEventAttachmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ImageProjection<CommentEventAttachmentProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<CommentEventAttachmentProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public CommentEventAttachmentProjection<PARENT, ROOT> fileExtension() {
    getFields().put("fileExtension", null);
    return this;
  }

  public CommentEventAttachmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CommentEventAttachmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CommentEventAttachmentProjection<PARENT, ROOT> size() {
    getFields().put("size", null);
    return this;
  }

  public CommentEventAttachmentProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
