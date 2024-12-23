package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TaxonomyCategoryAttributeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TaxonomyCategoryAttributeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TaxonomyCategoryAttribute"));
  }

  public TaxonomyCategoryAttributeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TaxonomyAttributeFragmentProjection<TaxonomyCategoryAttributeProjection<PARENT, ROOT>, ROOT> onTaxonomyAttribute(
      ) {
    TaxonomyAttributeFragmentProjection<TaxonomyCategoryAttributeProjection<PARENT, ROOT>, ROOT> fragment = new TaxonomyAttributeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public TaxonomyChoiceListAttributeFragmentProjection<TaxonomyCategoryAttributeProjection<PARENT, ROOT>, ROOT> onTaxonomyChoiceListAttribute(
      ) {
    TaxonomyChoiceListAttributeFragmentProjection<TaxonomyCategoryAttributeProjection<PARENT, ROOT>, ROOT> fragment = new TaxonomyChoiceListAttributeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public TaxonomyMeasurementAttributeFragmentProjection<TaxonomyCategoryAttributeProjection<PARENT, ROOT>, ROOT> onTaxonomyMeasurementAttribute(
      ) {
    TaxonomyMeasurementAttributeFragmentProjection<TaxonomyCategoryAttributeProjection<PARENT, ROOT>, ROOT> fragment = new TaxonomyMeasurementAttributeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
