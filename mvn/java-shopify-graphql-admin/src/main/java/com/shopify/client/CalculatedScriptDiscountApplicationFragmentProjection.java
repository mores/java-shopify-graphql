package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CalculatedScriptDiscountApplicationFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CalculatedScriptDiscountApplicationFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CalculatedScriptDiscountApplication"));
  }

  public CalculatedScriptDiscountApplicationFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountApplicationAllocationMethodProjection<CalculatedScriptDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> allocationMethod(
      ) {
     DiscountApplicationAllocationMethodProjection<CalculatedScriptDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationAllocationMethodProjection<>(this, getRoot());
     getFields().put("allocationMethod", projection);
     return projection;
  }

  public DiscountApplicationLevelProjection<CalculatedScriptDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> appliedTo(
      ) {
     DiscountApplicationLevelProjection<CalculatedScriptDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationLevelProjection<>(this, getRoot());
     getFields().put("appliedTo", projection);
     return projection;
  }

  public DiscountApplicationTargetSelectionProjection<CalculatedScriptDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> targetSelection(
      ) {
     DiscountApplicationTargetSelectionProjection<CalculatedScriptDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationTargetSelectionProjection<>(this, getRoot());
     getFields().put("targetSelection", projection);
     return projection;
  }

  public DiscountApplicationTargetTypeProjection<CalculatedScriptDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> targetType(
      ) {
     DiscountApplicationTargetTypeProjection<CalculatedScriptDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationTargetTypeProjection<>(this, getRoot());
     getFields().put("targetType", projection);
     return projection;
  }

  public PricingValueProjection<CalculatedScriptDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> value(
      ) {
     PricingValueProjection<CalculatedScriptDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new PricingValueProjection<>(this, getRoot());
     getFields().put("value", projection);
     return projection;
  }

  public CalculatedScriptDiscountApplicationFragmentProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public CalculatedScriptDiscountApplicationFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CalculatedScriptDiscountApplication {");
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
