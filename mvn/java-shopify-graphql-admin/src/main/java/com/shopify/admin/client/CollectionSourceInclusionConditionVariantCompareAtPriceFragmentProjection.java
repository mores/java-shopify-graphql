package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CollectionSourceInclusionConditionVariantCompareAtPriceFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CollectionSourceInclusionConditionVariantCompareAtPriceFragmentProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSourceInclusionConditionVariantCompareAtPrice"));
  }

  public CollectionSourceInclusionConditionVariantCompareAtPriceFragmentProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionSourceInclusionConditionVariantCompareAtPriceRelationProjection<CollectionSourceInclusionConditionVariantCompareAtPriceFragmentProjection<PARENT, ROOT>, ROOT> relation(
      ) {
     CollectionSourceInclusionConditionVariantCompareAtPriceRelationProjection<CollectionSourceInclusionConditionVariantCompareAtPriceFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionSourceInclusionConditionVariantCompareAtPriceRelationProjection<>(this, getRoot());
     getFields().put("relation", projection);
     return projection;
  }

  public MoneyV2Projection<CollectionSourceInclusionConditionVariantCompareAtPriceFragmentProjection<PARENT, ROOT>, ROOT> value(
      ) {
     MoneyV2Projection<CollectionSourceInclusionConditionVariantCompareAtPriceFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("value", projection);
     return projection;
  }

  public CollectionSourceInclusionConditionVariantCompareAtPriceFragmentProjection<PARENT, ROOT> id(
      ) {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CollectionSourceInclusionConditionVariantCompareAtPrice {");
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
