package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CollectionRuleMetafieldConditionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CollectionRuleMetafieldConditionFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionRuleMetafieldCondition"));
  }

  public CollectionRuleMetafieldConditionFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionProjection<CollectionRuleMetafieldConditionFragmentProjection<PARENT, ROOT>, ROOT> metafieldDefinition(
      ) {
     MetafieldDefinitionProjection<CollectionRuleMetafieldConditionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionProjection<>(this, getRoot());
     getFields().put("metafieldDefinition", projection);
     return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CollectionRuleMetafieldCondition {");
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
