package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TaxonomyCategoryProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TaxonomyCategoryProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TaxonomyCategory"));
  }

  public TaxonomyCategoryProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TaxonomyCategoryProjection<TaxonomyCategoryProjection<PARENT, ROOT>, ROOT> ancestors() {
     TaxonomyCategoryProjection<TaxonomyCategoryProjection<PARENT, ROOT>, ROOT> projection = new TaxonomyCategoryProjection<>(this, getRoot());
     getFields().put("ancestors", projection);
     return projection;
  }

  public TaxonomyCategoryProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public TaxonomyCategoryProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
