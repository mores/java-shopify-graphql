package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubCollectionIneligibleReasonProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubCollectionIneligibleReasonProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubCollectionIneligibleReason"));
  }

  public SubCollectionIneligibleReasonProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
