package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ResourceAlertProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ResourceAlertProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ResourceAlert"));
  }

  public ResourceAlertProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ResourceAlertActionProjection<ResourceAlertProjection<PARENT, ROOT>, ROOT> actions() {
     ResourceAlertActionProjection<ResourceAlertProjection<PARENT, ROOT>, ROOT> projection = new ResourceAlertActionProjection<>(this, getRoot());
     getFields().put("actions", projection);
     return projection;
  }

  public ResourceAlertIconProjection<ResourceAlertProjection<PARENT, ROOT>, ROOT> icon() {
     ResourceAlertIconProjection<ResourceAlertProjection<PARENT, ROOT>, ROOT> projection = new ResourceAlertIconProjection<>(this, getRoot());
     getFields().put("icon", projection);
     return projection;
  }

  public ResourceAlertSeverityProjection<ResourceAlertProjection<PARENT, ROOT>, ROOT> severity() {
     ResourceAlertSeverityProjection<ResourceAlertProjection<PARENT, ROOT>, ROOT> projection = new ResourceAlertSeverityProjection<>(this, getRoot());
     getFields().put("severity", projection);
     return projection;
  }

  public ResourceAlertProjection<PARENT, ROOT> content() {
    getFields().put("content", null);
    return this;
  }

  public ResourceAlertProjection<PARENT, ROOT> dismissibleHandle() {
    getFields().put("dismissibleHandle", null);
    return this;
  }

  public ResourceAlertProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
