package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RowCountProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RowCountProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RowCount"));
  }

  public RowCountProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RowCountProjection<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }

  public RowCountProjection<PARENT, ROOT> exceedsMax() {
    getFields().put("exceedsMax", null);
    return this;
  }
}
