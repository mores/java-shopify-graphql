package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ThemeFilesDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ThemeFilesDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("ThemeFilesDeletePayload"));
  }

  public ThemeFilesDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OnlineStoreThemeFileOperationResultProjection<ThemeFilesDeleteProjectionRoot<PARENT, ROOT>, ThemeFilesDeleteProjectionRoot<PARENT, ROOT>> deletedThemeFiles(
      ) {
    OnlineStoreThemeFileOperationResultProjection<ThemeFilesDeleteProjectionRoot<PARENT, ROOT>, ThemeFilesDeleteProjectionRoot<PARENT, ROOT>> projection = new OnlineStoreThemeFileOperationResultProjection<>(this, this);    
    getFields().put("deletedThemeFiles", projection);
    return projection;
  }

  public OnlineStoreThemeFilesUserErrorsProjection<ThemeFilesDeleteProjectionRoot<PARENT, ROOT>, ThemeFilesDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    OnlineStoreThemeFilesUserErrorsProjection<ThemeFilesDeleteProjectionRoot<PARENT, ROOT>, ThemeFilesDeleteProjectionRoot<PARENT, ROOT>> projection = new OnlineStoreThemeFilesUserErrorsProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
