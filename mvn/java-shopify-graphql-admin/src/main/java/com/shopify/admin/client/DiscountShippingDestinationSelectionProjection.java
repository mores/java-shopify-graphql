package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountShippingDestinationSelectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountShippingDestinationSelectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountShippingDestinationSelection"));
  }

  public DiscountShippingDestinationSelectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountCountriesFragmentProjection<DiscountShippingDestinationSelectionProjection<PARENT, ROOT>, ROOT> onDiscountCountries(
      ) {
    DiscountCountriesFragmentProjection<DiscountShippingDestinationSelectionProjection<PARENT, ROOT>, ROOT> fragment = new DiscountCountriesFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountCountryAllFragmentProjection<DiscountShippingDestinationSelectionProjection<PARENT, ROOT>, ROOT> onDiscountCountryAll(
      ) {
    DiscountCountryAllFragmentProjection<DiscountShippingDestinationSelectionProjection<PARENT, ROOT>, ROOT> fragment = new DiscountCountryAllFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
