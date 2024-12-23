package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CollectionRuleProductCategoryConditionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CollectionRuleProductCategoryConditionFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionRuleProductCategoryCondition"));
  }

  public CollectionRuleProductCategoryConditionFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductTaxonomyNodeProjection<CollectionRuleProductCategoryConditionFragmentProjection<PARENT, ROOT>, ROOT> value(
      ) {
     ProductTaxonomyNodeProjection<CollectionRuleProductCategoryConditionFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductTaxonomyNodeProjection<>(this, getRoot());
     getFields().put("value", projection);
     return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CollectionRuleProductCategoryCondition {");
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
