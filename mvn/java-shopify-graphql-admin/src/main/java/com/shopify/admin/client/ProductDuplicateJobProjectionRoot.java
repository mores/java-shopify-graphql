package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductDuplicateJobProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductDuplicateJobProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductDuplicateJob"));
  }

  public ProductDuplicateJobProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductDuplicateJobProjectionRoot<PARENT, ROOT> done() {
    getFields().put("done", null);
    return this;
  }

  public ProductDuplicateJobProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
