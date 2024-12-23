package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FunctionsErrorHistoryProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FunctionsErrorHistoryProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FunctionsErrorHistory"));
  }

  public FunctionsErrorHistoryProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FunctionsErrorHistoryProjection<PARENT, ROOT> errorsFirstOccurredAt() {
    getFields().put("errorsFirstOccurredAt", null);
    return this;
  }

  public FunctionsErrorHistoryProjection<PARENT, ROOT> firstOccurredAt() {
    getFields().put("firstOccurredAt", null);
    return this;
  }

  public FunctionsErrorHistoryProjection<PARENT, ROOT> hasBeenSharedSinceLastError() {
    getFields().put("hasBeenSharedSinceLastError", null);
    return this;
  }

  public FunctionsErrorHistoryProjection<PARENT, ROOT> hasSharedRecentErrors() {
    getFields().put("hasSharedRecentErrors", null);
    return this;
  }
}
