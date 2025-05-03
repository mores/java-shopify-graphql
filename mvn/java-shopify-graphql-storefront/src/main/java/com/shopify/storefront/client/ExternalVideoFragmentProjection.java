package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ExternalVideoFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ExternalVideoFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ExternalVideo"));
  }

  public ExternalVideoFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MediaHostProjection<ExternalVideoFragmentProjection<PARENT, ROOT>, ROOT> host() {
     MediaHostProjection<ExternalVideoFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaHostProjection<>(this, getRoot());
     getFields().put("host", projection);
     return projection;
  }

  public MediaContentTypeProjection<ExternalVideoFragmentProjection<PARENT, ROOT>, ROOT> mediaContentType(
      ) {
     MediaContentTypeProjection<ExternalVideoFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaContentTypeProjection<>(this, getRoot());
     getFields().put("mediaContentType", projection);
     return projection;
  }

  public MediaPresentationProjection<ExternalVideoFragmentProjection<PARENT, ROOT>, ROOT> presentation(
      ) {
     MediaPresentationProjection<ExternalVideoFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaPresentationProjection<>(this, getRoot());
     getFields().put("presentation", projection);
     return projection;
  }

  public ImageProjection<ExternalVideoFragmentProjection<PARENT, ROOT>, ROOT> previewImage() {
     ImageProjection<ExternalVideoFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("previewImage", projection);
     return projection;
  }

  public ExternalVideoFragmentProjection<PARENT, ROOT> alt() {
    getFields().put("alt", null);
    return this;
  }

  public ExternalVideoFragmentProjection<PARENT, ROOT> embedUrl() {
    getFields().put("embedUrl", null);
    return this;
  }

  public ExternalVideoFragmentProjection<PARENT, ROOT> embeddedUrl() {
    getFields().put("embeddedUrl", null);
    return this;
  }

  public ExternalVideoFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ExternalVideoFragmentProjection<PARENT, ROOT> originUrl() {
    getFields().put("originUrl", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ExternalVideo {");
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
