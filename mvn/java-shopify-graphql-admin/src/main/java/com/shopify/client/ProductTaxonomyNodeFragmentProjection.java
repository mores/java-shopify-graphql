package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ProductTaxonomyNodeFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ProductTaxonomyNodeFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductTaxonomyNode"));
  }

  public ProductTaxonomyNodeFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductTaxonomyNodeFragmentProjection<PARENT, ROOT> fullName() {
    getFields().put("fullName", null);
    return this;
  }

  public ProductTaxonomyNodeFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProductTaxonomyNodeFragmentProjection<PARENT, ROOT> isLeaf() {
    getFields().put("isLeaf", null);
    return this;
  }

  public ProductTaxonomyNodeFragmentProjection<PARENT, ROOT> isRoot() {
    getFields().put("isRoot", null);
    return this;
  }

  public ProductTaxonomyNodeFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ProductTaxonomyNode {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
