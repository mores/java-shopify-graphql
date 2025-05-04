package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.CropRegion;
import com.shopify.admin.types.ImageContentType;
import com.shopify.admin.types.ImageTransformInput;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class ImageProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ImageProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Image"));
  }

  public ImageProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldProjection<ImageProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<ImageProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<ImageProjection<PARENT, ROOT>, ROOT> metafield(String namespace,
      String key) {
    MetafieldProjection<ImageProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldConnectionProjection<ImageProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldConnectionProjection<ImageProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<ImageProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<ImageProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
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

  public ImageProjection<PARENT, ROOT> altText() {
    getFields().put("altText", null);
    return this;
  }

  public ImageProjection<PARENT, ROOT> height() {
    getFields().put("height", null);
    return this;
  }

  public ImageProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ImageProjection<PARENT, ROOT> originalSrc() {
    getFields().put("originalSrc", null);
    return this;
  }

  public ImageProjection<PARENT, ROOT> src() {
    getFields().put("src", null);
    return this;
  }

  public ImageProjection<PARENT, ROOT> transformedSrc() {
    getFields().put("transformedSrc", null);
    return this;
  }

  public ImageProjection transformedSrc(Integer maxWidth, Integer maxHeight, CropRegion crop,
      Integer scale, ImageContentType preferredContentType) {
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

  public ImageProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }

  public ImageProjection url(ImageTransformInput transform) {
    getFields().put("url", null);
    getInputArguments().computeIfAbsent("url", k -> new ArrayList<>());
    InputArgument transformArg = new InputArgument("transform", transform);
    getInputArguments().get("url").add(transformArg);
    return this;
  }

  public ImageProjection<PARENT, ROOT> width() {
    getFields().put("width", null);
    return this;
  }
}
