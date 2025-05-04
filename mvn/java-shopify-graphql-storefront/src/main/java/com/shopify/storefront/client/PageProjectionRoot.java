package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.storefront.types.HasMetafieldsIdentifier;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class PageProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PageProjectionRoot() {
    super(null, null, java.util.Optional.of("Page"));
  }

  public PageProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldProjection<PageProjectionRoot<PARENT, ROOT>, PageProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<PageProjectionRoot<PARENT, ROOT>, PageProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<PageProjectionRoot<PARENT, ROOT>, PageProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<PageProjectionRoot<PARENT, ROOT>, PageProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<PageProjectionRoot<PARENT, ROOT>, PageProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldProjection<PageProjectionRoot<PARENT, ROOT>, PageProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldProjection<PageProjectionRoot<PARENT, ROOT>, PageProjectionRoot<PARENT, ROOT>> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<PageProjectionRoot<PARENT, ROOT>, PageProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public SEOProjection<PageProjectionRoot<PARENT, ROOT>, PageProjectionRoot<PARENT, ROOT>> seo() {
    SEOProjection<PageProjectionRoot<PARENT, ROOT>, PageProjectionRoot<PARENT, ROOT>> projection = new SEOProjection<>(this, this);    
    getFields().put("seo", projection);
    return projection;
  }

  public PageProjectionRoot<PARENT, ROOT> body() {
    getFields().put("body", null);
    return this;
  }

  public PageProjectionRoot<PARENT, ROOT> bodySummary() {
    getFields().put("bodySummary", null);
    return this;
  }

  public PageProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public PageProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public PageProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public PageProjectionRoot<PARENT, ROOT> onlineStoreUrl() {
    getFields().put("onlineStoreUrl", null);
    return this;
  }

  public PageProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public PageProjectionRoot<PARENT, ROOT> trackingParameters() {
    getFields().put("trackingParameters", null);
    return this;
  }

  public PageProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
