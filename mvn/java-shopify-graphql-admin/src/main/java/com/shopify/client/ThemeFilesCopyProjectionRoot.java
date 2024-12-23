package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ThemeFilesCopyProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ThemeFilesCopyProjectionRoot() {
    super(null, null, java.util.Optional.of("ThemeFilesCopyPayload"));
  }

  public ThemeFilesCopyProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OnlineStoreThemeFileOperationResultProjection<ThemeFilesCopyProjectionRoot<PARENT, ROOT>, ThemeFilesCopyProjectionRoot<PARENT, ROOT>> copiedThemeFiles(
      ) {
    OnlineStoreThemeFileOperationResultProjection<ThemeFilesCopyProjectionRoot<PARENT, ROOT>, ThemeFilesCopyProjectionRoot<PARENT, ROOT>> projection = new OnlineStoreThemeFileOperationResultProjection<>(this, this);    
    getFields().put("copiedThemeFiles", projection);
    return projection;
  }

  public OnlineStoreThemeFilesUserErrorsProjection<ThemeFilesCopyProjectionRoot<PARENT, ROOT>, ThemeFilesCopyProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    OnlineStoreThemeFilesUserErrorsProjection<ThemeFilesCopyProjectionRoot<PARENT, ROOT>, ThemeFilesCopyProjectionRoot<PARENT, ROOT>> projection = new OnlineStoreThemeFilesUserErrorsProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
