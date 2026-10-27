package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CollectionSourceInclusionConditionVariantPriceFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CollectionSourceInclusionConditionVariantPriceFragmentProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSourceInclusionConditionVariantPrice"));
  }

  public CollectionSourceInclusionConditionVariantPriceFragmentProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionSourceInclusionConditionVariantPriceRelationProjection<CollectionSourceInclusionConditionVariantPriceFragmentProjection<PARENT, ROOT>, ROOT> relation(
      ) {
     CollectionSourceInclusionConditionVariantPriceRelationProjection<CollectionSourceInclusionConditionVariantPriceFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionSourceInclusionConditionVariantPriceRelationProjection<>(this, getRoot());
     getFields().put("relation", projection);
     return projection;
  }

  public MoneyV2Projection<CollectionSourceInclusionConditionVariantPriceFragmentProjection<PARENT, ROOT>, ROOT> value(
      ) {
     MoneyV2Projection<CollectionSourceInclusionConditionVariantPriceFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("value", projection);
     return projection;
  }

  public CollectionSourceInclusionConditionVariantPriceFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CollectionSourceInclusionConditionVariantPrice {");
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
