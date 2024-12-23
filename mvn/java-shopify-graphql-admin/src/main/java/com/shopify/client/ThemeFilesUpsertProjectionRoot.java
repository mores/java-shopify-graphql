package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ThemeFilesUpsertProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ThemeFilesUpsertProjectionRoot() {
    super(null, null, java.util.Optional.of("ThemeFilesUpsertPayload"));
  }

  public ThemeFilesUpsertProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<ThemeFilesUpsertProjectionRoot<PARENT, ROOT>, ThemeFilesUpsertProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<ThemeFilesUpsertProjectionRoot<PARENT, ROOT>, ThemeFilesUpsertProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public OnlineStoreThemeFileOperationResultProjection<ThemeFilesUpsertProjectionRoot<PARENT, ROOT>, ThemeFilesUpsertProjectionRoot<PARENT, ROOT>> upsertedThemeFiles(
      ) {
    OnlineStoreThemeFileOperationResultProjection<ThemeFilesUpsertProjectionRoot<PARENT, ROOT>, ThemeFilesUpsertProjectionRoot<PARENT, ROOT>> projection = new OnlineStoreThemeFileOperationResultProjection<>(this, this);    
    getFields().put("upsertedThemeFiles", projection);
    return projection;
  }

  public OnlineStoreThemeFilesUserErrorsProjection<ThemeFilesUpsertProjectionRoot<PARENT, ROOT>, ThemeFilesUpsertProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    OnlineStoreThemeFilesUserErrorsProjection<ThemeFilesUpsertProjectionRoot<PARENT, ROOT>, ThemeFilesUpsertProjectionRoot<PARENT, ROOT>> projection = new OnlineStoreThemeFilesUserErrorsProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
