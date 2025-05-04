package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BundlesFeatureProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BundlesFeatureProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BundlesFeature"));
  }

  public BundlesFeatureProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BundlesFeatureProjection<PARENT, ROOT> eligibleForBundles() {
    getFields().put("eligibleForBundles", null);
    return this;
  }

  public BundlesFeatureProjection<PARENT, ROOT> ineligibilityReason() {
    getFields().put("ineligibilityReason", null);
    return this;
  }

  public BundlesFeatureProjection<PARENT, ROOT> sellsBundles() {
    getFields().put("sellsBundles", null);
    return this;
  }
}
