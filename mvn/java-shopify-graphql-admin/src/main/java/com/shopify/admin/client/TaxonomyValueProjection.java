package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TaxonomyValueProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TaxonomyValueProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TaxonomyValue"));
  }

  public TaxonomyValueProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TaxonomyValueProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public TaxonomyValueProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
