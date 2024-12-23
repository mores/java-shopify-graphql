package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.CropRegion;
import com.shopify.types.ImageContentType;
import com.shopify.types.ImageTransformInput;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class ImageFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ImageFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Image"));
  }

  public ImageFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldProjection<ImageFragmentProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<ImageFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<ImageFragmentProjection<PARENT, ROOT>, ROOT> metafield(
      String namespace, String key) {
    MetafieldProjection<ImageFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldConnectionProjection<ImageFragmentProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldConnectionProjection<ImageFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<ImageFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<ImageFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
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

  public PrivateMetafieldProjection<ImageFragmentProjection<PARENT, ROOT>, ROOT> privateMetafield(
      ) {
     PrivateMetafieldProjection<ImageFragmentProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldProjection<>(this, getRoot());
     getFields().put("privateMetafield", projection);
     return projection;
  }

  public PrivateMetafieldProjection<ImageFragmentProjection<PARENT, ROOT>, ROOT> privateMetafield(
      String namespace, String key) {
    PrivateMetafieldProjection<ImageFragmentProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldProjection<>(this, getRoot());    
    getFields().put("privateMetafield", projection);
    getInputArguments().computeIfAbsent("privateMetafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("privateMetafield").add(keyArg);
    return projection;
  }

  public PrivateMetafieldConnectionProjection<ImageFragmentProjection<PARENT, ROOT>, ROOT> privateMetafields(
      ) {
     PrivateMetafieldConnectionProjection<ImageFragmentProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldConnectionProjection<>(this, getRoot());
     getFields().put("privateMetafields", projection);
     return projection;
  }

  public PrivateMetafieldConnectionProjection<ImageFragmentProjection<PARENT, ROOT>, ROOT> privateMetafields(
      String namespace, Integer first, String after, Integer last, String before, Boolean reverse) {
    PrivateMetafieldConnectionProjection<ImageFragmentProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldConnectionProjection<>(this, getRoot());    
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

  public ImageFragmentProjection<PARENT, ROOT> altText() {
    getFields().put("altText", null);
    return this;
  }

  public ImageFragmentProjection<PARENT, ROOT> height() {
    getFields().put("height", null);
    return this;
  }

  public ImageFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ImageFragmentProjection<PARENT, ROOT> originalSrc() {
    getFields().put("originalSrc", null);
    return this;
  }

  public ImageFragmentProjection<PARENT, ROOT> src() {
    getFields().put("src", null);
    return this;
  }

  public ImageFragmentProjection<PARENT, ROOT> transformedSrc() {
    getFields().put("transformedSrc", null);
    return this;
  }

  public ImageFragmentProjection transformedSrc(Integer maxWidth, Integer maxHeight,
      CropRegion crop, Integer scale, ImageContentType preferredContentType) {
    getFields().put("transformedSrc", null);
    getInputArguments().computeIfAbsent("transformedSrc", k -> new ArrayList<>());
    InputArgument maxWidthArg = new InputArgument("maxWidth", maxWidth);
    getInputArguments().get("transformedSrc").add(maxWidthArg);
    InputArgument maxHeightArg = new InputArgument("maxHeight", maxHeight);
    getInputArguments().get("transformedSrc").add(maxHeightArg);
    InputArgument cropArg = new InputArgument("crop", crop);
    getInputArguments().get("transformedSrc").add(cropArg);
    InputArgument scaleArg = new InputArgument("scale", scale);
    getInputArguments().get("transformedSrc").add(scaleArg);
    InputArgument preferredContentTypeArg = new InputArgument("preferredContentType", preferredContentType);
    getInputArguments().get("transformedSrc").add(preferredContentTypeArg);
    return this;
  }

  public ImageFragmentProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }

  public ImageFragmentProjection url(ImageTransformInput transform) {
    getFields().put("url", null);
    getInputArguments().computeIfAbsent("url", k -> new ArrayList<>());
    InputArgument transformArg = new InputArgument("transform", transform);
    getInputArguments().get("url").add(transformArg);
    return this;
  }

  public ImageFragmentProjection<PARENT, ROOT> width() {
    getFields().put("width", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Image {");
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
