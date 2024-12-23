package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class MediaImageProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MediaImageProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MediaImage"));
  }

  public MediaImageProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FileErrorProjection<MediaImageProjection<PARENT, ROOT>, ROOT> fileErrors() {
     FileErrorProjection<MediaImageProjection<PARENT, ROOT>, ROOT> projection = new FileErrorProjection<>(this, getRoot());
     getFields().put("fileErrors", projection);
     return projection;
  }

  public FileStatusProjection<MediaImageProjection<PARENT, ROOT>, ROOT> fileStatus() {
     FileStatusProjection<MediaImageProjection<PARENT, ROOT>, ROOT> projection = new FileStatusProjection<>(this, getRoot());
     getFields().put("fileStatus", projection);
     return projection;
  }

  public ImageProjection<MediaImageProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<MediaImageProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public MediaContentTypeProjection<MediaImageProjection<PARENT, ROOT>, ROOT> mediaContentType() {
     MediaContentTypeProjection<MediaImageProjection<PARENT, ROOT>, ROOT> projection = new MediaContentTypeProjection<>(this, getRoot());
     getFields().put("mediaContentType", projection);
     return projection;
  }

  public MediaErrorProjection<MediaImageProjection<PARENT, ROOT>, ROOT> mediaErrors() {
     MediaErrorProjection<MediaImageProjection<PARENT, ROOT>, ROOT> projection = new MediaErrorProjection<>(this, getRoot());
     getFields().put("mediaErrors", projection);
     return projection;
  }

  public MediaWarningProjection<MediaImageProjection<PARENT, ROOT>, ROOT> mediaWarnings() {
     MediaWarningProjection<MediaImageProjection<PARENT, ROOT>, ROOT> projection = new MediaWarningProjection<>(this, getRoot());
     getFields().put("mediaWarnings", projection);
     return projection;
  }

  public MetafieldProjection<MediaImageProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<MediaImageProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<MediaImageProjection<PARENT, ROOT>, ROOT> metafield(String namespace,
      String key) {
    MetafieldProjection<MediaImageProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldConnectionProjection<MediaImageProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldConnectionProjection<MediaImageProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<MediaImageProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<MediaImageProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafields").add(namespaceArg);
    InputArgument keysArg = new InputArgument("keys", keys);
    getInputArguments().get("metafields").add(keysArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafields").add(reverseArg);
    return projection;
  }

  public MediaImageOriginalSourceProjection<MediaImageProjection<PARENT, ROOT>, ROOT> originalSource(
      ) {
     MediaImageOriginalSourceProjection<MediaImageProjection<PARENT, ROOT>, ROOT> projection = new MediaImageOriginalSourceProjection<>(this, getRoot());
     getFields().put("originalSource", projection);
     return projection;
  }

  public MediaPreviewImageProjection<MediaImageProjection<PARENT, ROOT>, ROOT> preview() {
     MediaPreviewImageProjection<MediaImageProjection<PARENT, ROOT>, ROOT> projection = new MediaPreviewImageProjection<>(this, getRoot());
     getFields().put("preview", projection);
     return projection;
  }

  public PrivateMetafieldProjection<MediaImageProjection<PARENT, ROOT>, ROOT> privateMetafield() {
     PrivateMetafieldProjection<MediaImageProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldProjection<>(this, getRoot());
     getFields().put("privateMetafield", projection);
     return projection;
  }

  public PrivateMetafieldProjection<MediaImageProjection<PARENT, ROOT>, ROOT> privateMetafield(
      String namespace, String key) {
    PrivateMetafieldProjection<MediaImageProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldProjection<>(this, getRoot());    
    getFields().put("privateMetafield", projection);
    getInputArguments().computeIfAbsent("privateMetafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("privateMetafield").add(keyArg);
    return projection;
  }

  public PrivateMetafieldConnectionProjection<MediaImageProjection<PARENT, ROOT>, ROOT> privateMetafields(
      ) {
     PrivateMetafieldConnectionProjection<MediaImageProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldConnectionProjection<>(this, getRoot());
     getFields().put("privateMetafields", projection);
     return projection;
  }

  public PrivateMetafieldConnectionProjection<MediaImageProjection<PARENT, ROOT>, ROOT> privateMetafields(
      String namespace, Integer first, String after, Integer last, String before, Boolean reverse) {
    PrivateMetafieldConnectionProjection<MediaImageProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldConnectionProjection<>(this, getRoot());    
    getFields().put("privateMetafields", projection);
    getInputArguments().computeIfAbsent("privateMetafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafields").add(namespaceArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("privateMetafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("privateMetafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("privateMetafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("privateMetafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("privateMetafields").add(reverseArg);
    return projection;
  }

  public MediaStatusProjection<MediaImageProjection<PARENT, ROOT>, ROOT> status() {
     MediaStatusProjection<MediaImageProjection<PARENT, ROOT>, ROOT> projection = new MediaStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public MediaImageProjection<PARENT, ROOT> alt() {
    getFields().put("alt", null);
    return this;
  }

  public MediaImageProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public MediaImageProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MediaImageProjection<PARENT, ROOT> mimeType() {
    getFields().put("mimeType", null);
    return this;
  }

  public MediaImageProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
