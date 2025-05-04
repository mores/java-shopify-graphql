package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OnlineStoreThemeFilesUserErrorsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OnlineStoreThemeFilesUserErrorsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OnlineStoreThemeFilesUserErrors"));
  }

  public OnlineStoreThemeFilesUserErrorsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OnlineStoreThemeFilesUserErrorsCodeProjection<OnlineStoreThemeFilesUserErrorsProjection<PARENT, ROOT>, ROOT> code(
      ) {
     OnlineStoreThemeFilesUserErrorsCodeProjection<OnlineStoreThemeFilesUserErrorsProjection<PARENT, ROOT>, ROOT> projection = new OnlineStoreThemeFilesUserErrorsCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public OnlineStoreThemeFilesUserErrorsProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public OnlineStoreThemeFilesUserErrorsProjection<PARENT, ROOT> filename() {
    getFields().put("filename", null);
    return this;
  }

  public OnlineStoreThemeFilesUserErrorsProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
