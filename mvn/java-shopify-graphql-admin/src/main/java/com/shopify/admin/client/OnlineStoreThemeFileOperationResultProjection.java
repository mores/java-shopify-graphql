package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OnlineStoreThemeFileOperationResultProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OnlineStoreThemeFileOperationResultProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OnlineStoreThemeFileOperationResult"));
  }

  public OnlineStoreThemeFileOperationResultProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OnlineStoreThemeFileOperationResultProjection<PARENT, ROOT> checksumMd5() {
    getFields().put("checksumMd5", null);
    return this;
  }

  public OnlineStoreThemeFileOperationResultProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public OnlineStoreThemeFileOperationResultProjection<PARENT, ROOT> filename() {
    getFields().put("filename", null);
    return this;
  }

  public OnlineStoreThemeFileOperationResultProjection<PARENT, ROOT> size() {
    getFields().put("size", null);
    return this;
  }

  public OnlineStoreThemeFileOperationResultProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
