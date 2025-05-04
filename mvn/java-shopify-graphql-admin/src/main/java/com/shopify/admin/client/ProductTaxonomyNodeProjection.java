package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductTaxonomyNodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductTaxonomyNodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductTaxonomyNode"));
  }

  public ProductTaxonomyNodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductTaxonomyNodeProjection<PARENT, ROOT> fullName() {
    getFields().put("fullName", null);
    return this;
  }

  public ProductTaxonomyNodeProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProductTaxonomyNodeProjection<PARENT, ROOT> isLeaf() {
    getFields().put("isLeaf", null);
    return this;
  }

  public ProductTaxonomyNodeProjection<PARENT, ROOT> isRoot() {
    getFields().put("isRoot", null);
    return this;
  }

  public ProductTaxonomyNodeProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
