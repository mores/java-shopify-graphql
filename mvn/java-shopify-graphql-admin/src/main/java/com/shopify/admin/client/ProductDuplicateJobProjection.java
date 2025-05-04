package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductDuplicateJobProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductDuplicateJobProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductDuplicateJob"));
  }

  public ProductDuplicateJobProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductDuplicateJobProjection<PARENT, ROOT> done() {
    getFields().put("done", null);
    return this;
  }

  public ProductDuplicateJobProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
