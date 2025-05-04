package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CollectionRuleCategoryConditionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CollectionRuleCategoryConditionFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionRuleCategoryCondition"));
  }

  public CollectionRuleCategoryConditionFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TaxonomyCategoryProjection<CollectionRuleCategoryConditionFragmentProjection<PARENT, ROOT>, ROOT> value(
      ) {
     TaxonomyCategoryProjection<CollectionRuleCategoryConditionFragmentProjection<PARENT, ROOT>, ROOT> projection = new TaxonomyCategoryProjection<>(this, getRoot());
     getFields().put("value", projection);
     return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CollectionRuleCategoryCondition {");
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
