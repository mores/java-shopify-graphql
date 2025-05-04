package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectThumbnailProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectThumbnailProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetaobjectThumbnail"));
  }

  public MetaobjectThumbnailProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FileProjection<MetaobjectThumbnailProjection<PARENT, ROOT>, ROOT> file() {
     FileProjection<MetaobjectThumbnailProjection<PARENT, ROOT>, ROOT> projection = new FileProjection<>(this, getRoot());
     getFields().put("file", projection);
     return projection;
  }

  public MetaobjectThumbnailProjection<PARENT, ROOT> hex() {
    getFields().put("hex", null);
    return this;
  }
}
