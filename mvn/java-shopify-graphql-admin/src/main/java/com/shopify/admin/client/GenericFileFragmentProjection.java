package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class GenericFileFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public GenericFileFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("GenericFile"));
  }

  public GenericFileFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FileErrorProjection<GenericFileFragmentProjection<PARENT, ROOT>, ROOT> fileErrors() {
     FileErrorProjection<GenericFileFragmentProjection<PARENT, ROOT>, ROOT> projection = new FileErrorProjection<>(this, getRoot());
     getFields().put("fileErrors", projection);
     return projection;
  }

  public FileStatusProjection<GenericFileFragmentProjection<PARENT, ROOT>, ROOT> fileStatus() {
     FileStatusProjection<GenericFileFragmentProjection<PARENT, ROOT>, ROOT> projection = new FileStatusProjection<>(this, getRoot());
     getFields().put("fileStatus", projection);
     return projection;
  }

  public MediaPreviewImageProjection<GenericFileFragmentProjection<PARENT, ROOT>, ROOT> preview() {
     MediaPreviewImageProjection<GenericFileFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaPreviewImageProjection<>(this, getRoot());
     getFields().put("preview", projection);
     return projection;
  }

  public GenericFileFragmentProjection<PARENT, ROOT> alt() {
    getFields().put("alt", null);
    return this;
  }

  public GenericFileFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public GenericFileFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public GenericFileFragmentProjection<PARENT, ROOT> mimeType() {
    getFields().put("mimeType", null);
    return this;
  }

  public GenericFileFragmentProjection<PARENT, ROOT> originalFileSize() {
    getFields().put("originalFileSize", null);
    return this;
  }

  public GenericFileFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public GenericFileFragmentProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on GenericFile {");
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
