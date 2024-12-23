package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CalculatedDiscountApplicationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CalculatedDiscountApplicationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CalculatedDiscountApplication"));
  }

  public CalculatedDiscountApplicationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountApplicationAllocationMethodProjection<CalculatedDiscountApplicationProjection<PARENT, ROOT>, ROOT> allocationMethod(
      ) {
     DiscountApplicationAllocationMethodProjection<CalculatedDiscountApplicationProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationAllocationMethodProjection<>(this, getRoot());
     getFields().put("allocationMethod", projection);
     return projection;
  }

  public DiscountApplicationLevelProjection<CalculatedDiscountApplicationProjection<PARENT, ROOT>, ROOT> appliedTo(
      ) {
     DiscountApplicationLevelProjection<CalculatedDiscountApplicationProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationLevelProjection<>(this, getRoot());
     getFields().put("appliedTo", projection);
     return projection;
  }

  public DiscountApplicationTargetSelectionProjection<CalculatedDiscountApplicationProjection<PARENT, ROOT>, ROOT> targetSelection(
      ) {
     DiscountApplicationTargetSelectionProjection<CalculatedDiscountApplicationProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationTargetSelectionProjection<>(this, getRoot());
     getFields().put("targetSelection", projection);
     return projection;
  }

  public DiscountApplicationTargetTypeProjection<CalculatedDiscountApplicationProjection<PARENT, ROOT>, ROOT> targetType(
      ) {
     DiscountApplicationTargetTypeProjection<CalculatedDiscountApplicationProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationTargetTypeProjection<>(this, getRoot());
     getFields().put("targetType", projection);
     return projection;
  }

  public PricingValueProjection<CalculatedDiscountApplicationProjection<PARENT, ROOT>, ROOT> value(
      ) {
     PricingValueProjection<CalculatedDiscountApplicationProjection<PARENT, ROOT>, ROOT> projection = new PricingValueProjection<>(this, getRoot());
     getFields().put("value", projection);
     return projection;
  }

  public CalculatedDiscountApplicationProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public CalculatedDiscountApplicationProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CalculatedAutomaticDiscountApplicationFragmentProjection<CalculatedDiscountApplicationProjection<PARENT, ROOT>, ROOT> onCalculatedAutomaticDiscountApplication(
      ) {
    CalculatedAutomaticDiscountApplicationFragmentProjection<CalculatedDiscountApplicationProjection<PARENT, ROOT>, ROOT> fragment = new CalculatedAutomaticDiscountApplicationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CalculatedDiscountCodeApplicationFragmentProjection<CalculatedDiscountApplicationProjection<PARENT, ROOT>, ROOT> onCalculatedDiscountCodeApplication(
      ) {
    CalculatedDiscountCodeApplicationFragmentProjection<CalculatedDiscountApplicationProjection<PARENT, ROOT>, ROOT> fragment = new CalculatedDiscountCodeApplicationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CalculatedManualDiscountApplicationFragmentProjection<CalculatedDiscountApplicationProjection<PARENT, ROOT>, ROOT> onCalculatedManualDiscountApplication(
      ) {
    CalculatedManualDiscountApplicationFragmentProjection<CalculatedDiscountApplicationProjection<PARENT, ROOT>, ROOT> fragment = new CalculatedManualDiscountApplicationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CalculatedScriptDiscountApplicationFragmentProjection<CalculatedDiscountApplicationProjection<PARENT, ROOT>, ROOT> onCalculatedScriptDiscountApplication(
      ) {
    CalculatedScriptDiscountApplicationFragmentProjection<CalculatedDiscountApplicationProjection<PARENT, ROOT>, ROOT> fragment = new CalculatedScriptDiscountApplicationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
