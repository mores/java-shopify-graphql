package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OnlineStoreThemeFileBodyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OnlineStoreThemeFileBodyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OnlineStoreThemeFileBody"));
  }

  public OnlineStoreThemeFileBodyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OnlineStoreThemeFileBodyBase64FragmentProjection<OnlineStoreThemeFileBodyProjection<PARENT, ROOT>, ROOT> onOnlineStoreThemeFileBodyBase64(
      ) {
    OnlineStoreThemeFileBodyBase64FragmentProjection<OnlineStoreThemeFileBodyProjection<PARENT, ROOT>, ROOT> fragment = new OnlineStoreThemeFileBodyBase64FragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public OnlineStoreThemeFileBodyTextFragmentProjection<OnlineStoreThemeFileBodyProjection<PARENT, ROOT>, ROOT> onOnlineStoreThemeFileBodyText(
      ) {
    OnlineStoreThemeFileBodyTextFragmentProjection<OnlineStoreThemeFileBodyProjection<PARENT, ROOT>, ROOT> fragment = new OnlineStoreThemeFileBodyTextFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public OnlineStoreThemeFileBodyUrlFragmentProjection<OnlineStoreThemeFileBodyProjection<PARENT, ROOT>, ROOT> onOnlineStoreThemeFileBodyUrl(
      ) {
    OnlineStoreThemeFileBodyUrlFragmentProjection<OnlineStoreThemeFileBodyProjection<PARENT, ROOT>, ROOT> fragment = new OnlineStoreThemeFileBodyUrlFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
