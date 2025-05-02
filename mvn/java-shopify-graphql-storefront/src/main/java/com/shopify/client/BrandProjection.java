package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BrandProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BrandProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Brand"));
  }

  public BrandProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BrandColorsProjection<BrandProjection<PARENT, ROOT>, ROOT> colors() {
     BrandColorsProjection<BrandProjection<PARENT, ROOT>, ROOT> projection = new BrandColorsProjection<>(this, getRoot());
     getFields().put("colors", projection);
     return projection;
  }

  public MediaImageProjection<BrandProjection<PARENT, ROOT>, ROOT> coverImage() {
     MediaImageProjection<BrandProjection<PARENT, ROOT>, ROOT> projection = new MediaImageProjection<>(this, getRoot());
     getFields().put("coverImage", projection);
     return projection;
  }

  public MediaImageProjection<BrandProjection<PARENT, ROOT>, ROOT> logo() {
     MediaImageProjection<BrandProjection<PARENT, ROOT>, ROOT> projection = new MediaImageProjection<>(this, getRoot());
     getFields().put("logo", projection);
     return projection;
  }

  public MediaImageProjection<BrandProjection<PARENT, ROOT>, ROOT> squareLogo() {
     MediaImageProjection<BrandProjection<PARENT, ROOT>, ROOT> projection = new MediaImageProjection<>(this, getRoot());
     getFields().put("squareLogo", projection);
     return projection;
  }

  public BrandProjection<PARENT, ROOT> shortDescription() {
    getFields().put("shortDescription", null);
    return this;
  }

  public BrandProjection<PARENT, ROOT> slogan() {
    getFields().put("slogan", null);
    return this;
  }
}
