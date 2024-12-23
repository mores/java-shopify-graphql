package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ScriptDiscountApplicationFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ScriptDiscountApplicationFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ScriptDiscountApplication"));
  }

  public ScriptDiscountApplicationFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountApplicationAllocationMethodProjection<ScriptDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> allocationMethod(
      ) {
     DiscountApplicationAllocationMethodProjection<ScriptDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationAllocationMethodProjection<>(this, getRoot());
     getFields().put("allocationMethod", projection);
     return projection;
  }

  public DiscountApplicationTargetSelectionProjection<ScriptDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> targetSelection(
      ) {
     DiscountApplicationTargetSelectionProjection<ScriptDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationTargetSelectionProjection<>(this, getRoot());
     getFields().put("targetSelection", projection);
     return projection;
  }

  public DiscountApplicationTargetTypeProjection<ScriptDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> targetType(
      ) {
     DiscountApplicationTargetTypeProjection<ScriptDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationTargetTypeProjection<>(this, getRoot());
     getFields().put("targetType", projection);
     return projection;
  }

  public PricingValueProjection<ScriptDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> value(
      ) {
     PricingValueProjection<ScriptDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new PricingValueProjection<>(this, getRoot());
     getFields().put("value", projection);
     return projection;
  }

  public ScriptDiscountApplicationFragmentProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public ScriptDiscountApplicationFragmentProjection<PARENT, ROOT> index() {
    getFields().put("index", null);
    return this;
  }

  public ScriptDiscountApplicationFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ScriptDiscountApplication {");
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
