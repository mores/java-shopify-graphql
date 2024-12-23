package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerMergePreviewBlockingFieldsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerMergePreviewBlockingFieldsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerMergePreviewBlockingFields"));
  }

  public CustomerMergePreviewBlockingFieldsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerMergePreviewBlockingFieldsProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public CustomerMergePreviewBlockingFieldsProjection<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }
}
