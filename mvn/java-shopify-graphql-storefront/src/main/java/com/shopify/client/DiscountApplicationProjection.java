package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountApplicationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountApplicationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountApplication"));
  }

  public DiscountApplicationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountApplicationAllocationMethodProjection<DiscountApplicationProjection<PARENT, ROOT>, ROOT> allocationMethod(
      ) {
     DiscountApplicationAllocationMethodProjection<DiscountApplicationProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationAllocationMethodProjection<>(this, getRoot());
     getFields().put("allocationMethod", projection);
     return projection;
  }

  public DiscountApplicationTargetSelectionProjection<DiscountApplicationProjection<PARENT, ROOT>, ROOT> targetSelection(
      ) {
     DiscountApplicationTargetSelectionProjection<DiscountApplicationProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationTargetSelectionProjection<>(this, getRoot());
     getFields().put("targetSelection", projection);
     return projection;
  }

  public DiscountApplicationTargetTypeProjection<DiscountApplicationProjection<PARENT, ROOT>, ROOT> targetType(
      ) {
     DiscountApplicationTargetTypeProjection<DiscountApplicationProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationTargetTypeProjection<>(this, getRoot());
     getFields().put("targetType", projection);
     return projection;
  }

  public PricingValueProjection<DiscountApplicationProjection<PARENT, ROOT>, ROOT> value() {
     PricingValueProjection<DiscountApplicationProjection<PARENT, ROOT>, ROOT> projection = new PricingValueProjection<>(this, getRoot());
     getFields().put("value", projection);
     return projection;
  }

  public AutomaticDiscountApplicationFragmentProjection<DiscountApplicationProjection<PARENT, ROOT>, ROOT> onAutomaticDiscountApplication(
      ) {
    AutomaticDiscountApplicationFragmentProjection<DiscountApplicationProjection<PARENT, ROOT>, ROOT> fragment = new AutomaticDiscountApplicationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountCodeApplicationFragmentProjection<DiscountApplicationProjection<PARENT, ROOT>, ROOT> onDiscountCodeApplication(
      ) {
    DiscountCodeApplicationFragmentProjection<DiscountApplicationProjection<PARENT, ROOT>, ROOT> fragment = new DiscountCodeApplicationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ManualDiscountApplicationFragmentProjection<DiscountApplicationProjection<PARENT, ROOT>, ROOT> onManualDiscountApplication(
      ) {
    ManualDiscountApplicationFragmentProjection<DiscountApplicationProjection<PARENT, ROOT>, ROOT> fragment = new ManualDiscountApplicationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ScriptDiscountApplicationFragmentProjection<DiscountApplicationProjection<PARENT, ROOT>, ROOT> onScriptDiscountApplication(
      ) {
    ScriptDiscountApplicationFragmentProjection<DiscountApplicationProjection<PARENT, ROOT>, ROOT> fragment = new ScriptDiscountApplicationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
