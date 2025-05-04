package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.storefront.types.HasMetafieldsIdentifier;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class PageByHandleProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PageByHandleProjectionRoot() {
    super(null, null, java.util.Optional.of("Page"));
  }

  public PageByHandleProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldProjection<PageByHandleProjectionRoot<PARENT, ROOT>, PageByHandleProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<PageByHandleProjectionRoot<PARENT, ROOT>, PageByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<PageByHandleProjectionRoot<PARENT, ROOT>, PageByHandleProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<PageByHandleProjectionRoot<PARENT, ROOT>, PageByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<PageByHandleProjectionRoot<PARENT, ROOT>, PageByHandleProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldProjection<PageByHandleProjectionRoot<PARENT, ROOT>, PageByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldProjection<PageByHandleProjectionRoot<PARENT, ROOT>, PageByHandleProjectionRoot<PARENT, ROOT>> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<PageByHandleProjectionRoot<PARENT, ROOT>, PageByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public SEOProjection<PageByHandleProjectionRoot<PARENT, ROOT>, PageByHandleProjectionRoot<PARENT, ROOT>> seo(
      ) {
    SEOProjection<PageByHandleProjectionRoot<PARENT, ROOT>, PageByHandleProjectionRoot<PARENT, ROOT>> projection = new SEOProjection<>(this, this);    
    getFields().put("seo", projection);
    return projection;
  }

  public PageByHandleProjectionRoot<PARENT, ROOT> body() {
    getFields().put("body", null);
    return this;
  }

  public PageByHandleProjectionRoot<PARENT, ROOT> bodySummary() {
    getFields().put("bodySummary", null);
    return this;
  }

  public PageByHandleProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public PageByHandleProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public PageByHandleProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public PageByHandleProjectionRoot<PARENT, ROOT> onlineStoreUrl() {
    getFields().put("onlineStoreUrl", null);
    return this;
  }

  public PageByHandleProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public PageByHandleProjectionRoot<PARENT, ROOT> trackingParameters() {
    getFields().put("trackingParameters", null);
    return this;
  }

  public PageByHandleProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
